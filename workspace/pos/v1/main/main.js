'use strict';

//TODO: 请在该文件中实现练习要求并删除此注释
module.exports = function collectSameElements(collection) {
    let result = [];
    for (let i = 0; i < collection.length; ++i) {
        let index = isInArr(collection[i], result);
        if (index == -1) {
            result.push({key: collection[i], count: 1});
        }
        else {
            result[index].count++;
        }
    }
    return result;

}

function isInArr(element,strArr) {
    let index=-1;
    for(let i=0;i<strArr.length;++i) {
        if(element===strArr[i].key) {
            //元素在数组中已经找到，并返回下标
            index=i;
        }
    }
    return index;
}

function isInItem(element,allItemCollection){
    for(let i=0;i<allItemCollection[i].length;++i){
        if(element===allItemCollection[i].barcode)
        {
            return true;
        }

    }
    return false;
}
function processingDate(collectionA,collectionB) {
    for (let i=0;i<collectionA.length;++i) {
        let tmpNum=collectionA[i].count;
        let prom=(tmp-tmp%3)/3;
        collectionB.push(collectionB[i].key,prom);
    }
}

function caclulatePrice(collectionB,allItemsCollection) {

    for(let i=0; i<collectionB.length; ++i) {


    }
}


