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

function printTag(tags) {
let tagCollection=tagsSplit(tags);
let allItems=loadAllItems();
let tagsItem=buildItem(tagCollection,allItems);

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




function indexOfItem(element,strArr) {
    let index=-1;
    for(let i=0;i<strArr.length;++i) {
        if(element==strArr[i].barcode) {
            index=i;   //元素在数组中已经找到，跳出不在查找该元素
            break;
        }
    }
    return index;
}


function buildItem(collection,allItems){
    let tagsItem=[];

    for(let i=0;i<collection.length;++i)
    {
        let index=indexOfItem(collection[i].barcode,allItems);
        tagsItem.push(allItems[index],collection[i].count);
    }
    return tagsItem;
}
