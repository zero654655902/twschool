'use strict';

//TODO: 请在该文件中实现练习要求并删除此注释
function printReceipt(tags){
    let allItems=loadAllItems();
    let promotion=loadPromotions();
    let tagAddCount=tagSplit(tags);
    let tagAndCount=getSameTag(tagAddCount);
    let hasDiscountTag=getDiscount(tagAndCount,promotion[0].barcodes);
    let hasDiscountItemAddPrice=calculatePrice(hasDiscountTag,allItems);
    let allItemMassege=saveItemMassege(hasDiscountItemAddPrice,hasDiscountTag,allItems);
    let totalPrice=calculateTotalPrice(hasDiscountItemAddPrice);
    let diffPrice=calculateDiffPrice(tagAndCount,hasDiscountTag,allItems);

}
function isContainSpecialStr(element)
{
    if(-1!=element.indexOf('-')){
        return true;
    }
    return false;

}
function tagSplit(collection) {
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

function getSameTag(collection) {
    let newCollection =[];
    for (let i = 0; i < collection.length; ++i) {
        let index = IndexofItem(collection[i].barcode, newCollection);
        if (index == -1) {
            newCollection.push({barcode: collection[i].barcode,count: collection[i].count});
        }
        else {
            newCollection[index].count+=collection[i].count;
        }
    }
    return newCollection;

}


function IndexofItem(element,strArr) {
    let index=-1;
    for(let i=0;i<strArr.length;++i) {
        if(element==strArr[i].barcode) {
            index=i;   //元素在数组中已经找到，跳出不在查找该元素
            break;
        }
    }
    return index;
}

function isDiscount(element,discountCollection) {

    for(let i=0;i<discountCollection.length;++i) {
        if(element===discountCollection[i]) {
            //元素在数组中已经找到，并返回下标
            return true
        }
    }
    return false;
}

function getDiscount(collection,discountCollection) {
    let hasDiscountCollection=[];
    for (let i=0;i<collection.length;++i) {
        let countTep=collection[i].count;
        if(isDiscount(collection[i].barcode,discountCollection) && collection[i].count>=3)
        {
            countTep--;

        }
        hasDiscountCollection.push({barcode:collection[i].barcode,count :countTep});

    }
    return hasDiscountCollection;
}


function calculatePrice(collection,allItemsCollection) {
    let discountCollectionAddPrice=[];
    for(let i=0; i<collection.length; ++i) {
        let index=IndexofItem(collection[i].barcode,allItemsCollection);
        let price=collection[i].count*allItemsCollection[index].price;
        discountCollectionAddPrice.push({barcode:collection[i].barcode,count:collection[i].count,price:price.toFixed(2)});
    }
    return discountCollectionAddPrice;
}



function saveItemMassege(collectionA,collectionB,allItemsCollection) {
    let massage=[];
    for (let i = 0; i < collectionA.length; ++i) {
        let index = IndexofItem(collectionA[i].barcode, allItemsCollection);
        massage.push({
            "名称": allItemsCollection[index].name,
            "数量": collectionB[i].count,
            "单价": allItemsCollection[index].price.toFixed(2),
            "小计": collectionA[i].price
        });
    }
    return massage;

}

function calculateTotalPrice(collection) {
    let totalPrice=0;
    for(let i=0;i<collection.length;++i){
        totalPrice+=parseFloat(collection[i].price);
    }
    return totalPrice;
}
function calculateDiffPrice(collectionA,collectionB,allItemsCollection)
{
    let diffPrice=0;
    let oldPrice=calculatePrice(collectionA,allItemsCollection);
    let newPrice=calculatePrice(collectionB,allItemsCollection);
    diffPrice=(calculateTotalPrice(oldPrice)-calculateTotalPrice(newPrice)).toFixed(2);
    return diffPrice;
}



