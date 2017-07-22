'use strict';

describe('pos', () => {



  it('should print text', () => {

    const tags = [
      'ITEM000001',
      'ITEM000001',
      'ITEM000001',
      'ITEM000001',
      'ITEM000001',
      'ITEM000003-2.5',
      'ITEM000005',
      'ITEM000005-2',
    ];

    const dateDigitToString = num => (num < 10 ? `0${num}` : num);

    spyOn(console, 'log');

    printReceipt(tags);

    const currentDate = new Date(),
      year = dateDigitToString(currentDate.getFullYear()),
      month = dateDigitToString(currentDate.getMonth() + 1),
      date = dateDigitToString(currentDate.getDate()),
      hour = dateDigitToString(currentDate.getHours()),
      minute = dateDigitToString(currentDate.getMinutes()),
      second = dateDigitToString(currentDate.getSeconds()),
      formattedDateString = `${year}年${month}月${date}日 ${hour}:${minute}:${second}`;

    const expectText = `***<没钱赚商店>收据***
打印时间：${formattedDateString}
----------------------
名称：雪碧，数量：5瓶，单价：3.00(元)，小计：12.00(元)
名称：荔枝，数量：2.5斤，单价：15.00(元)，小计：37.50(元)
名称：方便面，数量：3袋，单价：4.50(元)，小计：9.00(元)
----------------------
总计：58.50(元)
节省：7.50(元)
**********************`;

    expect(console.log).toHaveBeenCalledWith(expectText);
  });
});

describe('unit test',() =>{
    it('tagsSplit() should print text',() =>{
        const tags = [
            'ITEM000001',
            'ITEM000001',
            'ITEM000001',
            'ITEM000001',
            'ITEM000001',
            'ITEM000003-2.5',
            'ITEM000005',
            'ITEM000005-2',
        ];

        const tagsSplitResult=tagsSplit(tags)
        const expectText=[ { barcode: 'ITEM000001', count: 1 },
            { barcode: 'ITEM000001', count: 1 },
            { barcode: 'ITEM000001', count: 1 },
            { barcode: 'ITEM000001', count: 1 },
            { barcode: 'ITEM000001', count: 1 },
            { barcode: 'ITEM000003', count: 2.5 },
            { barcode: 'ITEM000005', count: 1 },
            { barcode: 'ITEM000005', count: 2 } ];
        expect(tagsSplitResult).toEqual(expectText);

    });
})

describe('unit test',() =>{
  it('buildItem() should print text',() =>{
      const tags = [
          'ITEM000001',
          'ITEM000001',
          'ITEM000001',
          'ITEM000001',
          'ITEM000001',
          'ITEM000003-2.5',
          'ITEM000005',
          'ITEM000005-2',
      ];

      const tagsSplitResult=tagsSplit(tags)
      let allItems=Item.all();
      let tagsItem=buildItem(tagsSplitResult,allItems)
      const expectText=[ { barcode: 'ITEM000001',
          name: '雪碧',
          unit: '瓶',
          price: 3,
          count: 1 },
          { barcode: 'ITEM000001',
              name: '雪碧',
              unit: '瓶',
              price: 3,
              count: 1 },
          { barcode: 'ITEM000001',
              name: '雪碧',
              unit: '瓶',
              price: 3,
              count: 1 },
          { barcode: 'ITEM000001',
              name: '雪碧',
              unit: '瓶',
              price: 3,
              count: 1 },
          { barcode: 'ITEM000001',
              name: '雪碧',
              unit: '瓶',
              price: 3,
              count: 1 },
          { barcode: 'ITEM000003',
              name: '荔枝',
              unit: '斤',
              price: 15,
              count: 2.5 },
          { barcode: 'ITEM000005',
              name: '方便面',
              unit: '袋',
              price: 4.5,
              count: 1 },
          { barcode: 'ITEM000005',
              name: '方便面',
              unit: '袋',
              price: 4.5,
              count: 2 } ]
      expect(tagsItem).toEqual(expectText);

  })

})
describe('unit test',() =>{
    it('calculateItemCount() should print text',() =>{
        const tags = [
            'ITEM000001',
            'ITEM000001',
            'ITEM000001',
            'ITEM000001',
            'ITEM000001',
            'ITEM000003-2.5',
            'ITEM000005',
            'ITEM000005-2',
        ];

        const tagsSplitResult=tagsSplit(tags)
        let allItems=Item.all();
        let tagsItem=buildItem(tagsSplitResult,allItems)
        let tagsItemMassege=calculateItemCount(tagsItem);
        const expectText=[ { barcode: 'ITEM000001',
            name: '雪碧',
            unit: '瓶',
            price: 3,
            count: 5 },
            { barcode: 'ITEM000003',
                name: '荔枝',
                unit: '斤',
                price: 15,
                count: 2.5 },
            { barcode: 'ITEM000005',
                name: '方便面',
                unit: '袋',
                price: 4.5,
                count: 3 } ]
        expect(tagsItemMassege).toEqual(expectText);

    })

})











/*describe ('tagsSplit',() =>{
    const tags = [
        'ITEM000001',
        'ITEM000001',
        'ITEM000001',
        'ITEM000001',
        'ITEM000001',
        'ITEM000003-2.5',
        'ITEM000005',
        'ITEM000005-2',
    ];
    const expectText=[ { barcode: 'ITEM000001', count: 1 },
    { barcode: 'ITEM000001', count: 1 },
    { barcode: 'ITEM000001', count: 1 },
    { barcode: 'ITEM000001', count: 1 },
    { barcode: 'ITEM000001', count: 1 },
    { barcode: 'ITEM000003', count: 2.5 },
    { barcode: 'ITEM000005', count: 1 },
    { barcode: 'ITEM000005', count: 2 } ];
  expect(console.log).toHaveBeenCalledWith(expectText);
});*/