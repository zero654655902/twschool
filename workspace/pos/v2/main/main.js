'use strict';

//TODO: 请在该文件中实现练习要求并删除此注释
/*
 'use strict';

 function loadAllItems() {
 return [
 {
 barcode: 'ITEM000000',
 name: '可口可乐',
 unit: '瓶',
 price: 3.00
 },
 {
 barcode: 'ITEM000001',
 name: '雪碧',
 unit: '瓶',
 price: 3.00
 },
 {
 barcode: 'ITEM000002',
 name: '苹果',
 unit: '斤',
 price: 5.50
 },
 {
 barcode: 'ITEM000003',
 name: '荔枝',
 unit: '斤',
 price: 15.00
 },
 {
 barcode: 'ITEM000004',
 name: '电池',
 unit: '个',
 price: 2.00
 },
 {
 barcode: 'ITEM000005',
 name: '方便面',
 unit: '袋',
 price: 4.50
 }
 ];
 }

 function loadPromotions() {
 return [
 {
 type: 'BUY_TWO_GET_ONE_FREE',
 barcodes: [
 'ITEM000000',
 'ITEM000001',
 'ITEM000005'
 ]
 }
 ];
 }

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

*/

function printTag(tag) {
let tagCollection=tagsSplit(tags);

}


function isContainSpecialStr(element)
{
    if(-1!=element.indexOf('-')){
        return true;
    }
    return false;

}
function tagsSplit(collection) {
    let newTags=[];
    for(let i=0;i<collection.length;++i) {
        if(isContainSpecialStr(collection[i])){
            var key_count = collection[i].split('-');
            newTags.push({barcode: key_count[0], count: parseFloat(key_count[1])});
        }else
        {
            newTags.push({barcode: collection[i], count: 1});
        }
    }
    return newTags;
}
