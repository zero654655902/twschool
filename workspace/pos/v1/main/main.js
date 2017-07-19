'use strict';

//TODO: 请在该文件中实现练习要求并删除此注释

/*function printReceipt(tags){
    let collectionA=collectSameElements(tags);
    let collectionB=processingDate(collectionA);
    let allItemLoads=loadAllItems();
    let discountCollection=caclulatePrice(collectionB,allItemLoads);
    let eveMassege=saveEveMassege(collectionA,discountCollection,allItemCollection);
    let result=addTotal(eveMassege,collectionA,discountCollection);
    return result;

}


function collectSameElements(collection) {
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
    var flag=false;
    for(let i=0;i<strArr.length;++i) {
        if(element===strArr[i]) {
            flag=true;
            break;        //元素在数组中已经找到，跳出不在查找该元素
        }
    }
    return flag;
}



function isDiscount(element,discountCollection) {

    for(let i=0;i<discountCollection.length;++i) {
        if(element===discountCollection[i].key) {
            //元素在数组中已经找到，并返回下标
            return true
        }
    }
    return false;
}

function IndexofItem(element,allItemCollection){

    let index=-1;
    for(let i=0;i<allItemCollection.length;++i) {
        if(element===allItemCollection[i].barcode) {
            //元素在数组中已经找到，并返回下标
            index=i;
        }
    }
    return index;
}
function processingDate(collectionA,discountCollection) {
    let collectionB=[];
    for (let i=0;i<collectionA.length;++i) {
        let countTep=collectionA[i].count;
        if(isDiscount(collectionA[i],discountCollection) && collectionA[i].count>=3)
        {
            countTep--;
        }
        collectionB.push(collectionA[i].border,countTep);
    }
    return collectionB;
}

function caclulatePrice(collectionB,allItemsCollection) {
    let discountCollection=[];
    for(let i=0; i<collectionB.length; ++i) {
       let index=IndexofItem(collectionB[i].key,allItemsCollection);
       let price=collectionB[i].count*allItemsCollection[index].price;
       discountCollection.push({border:collectionB[i].border,count:collectionB[i].count,price:price});
    }
    return discountCollection;
}


function caclulateTotalPrice(collection) {
    let totalPrice=0;
    for(let i=0;i<collection.length;++i){
        totalPrice+=collection[i].price;
    }
    return totalPrice;
}

function saveEveMassege(collectionA,collectionB,allItemsCollection) {
    let result = [];
    for (let i = 0; i < collectionA.length; ++i) {
        let index = IndexofItem(collectionA[i], allItemsCollection);
        result.push({
            "名称": allItemsCollection[index].name,
            "数量": collectionA[i],
            "单价": allItemsCollection[index].price,
            "小计": collectionB[i]
        });

    }
    return result;
    
}

function addTotal(eveMassge,collectionA,collectionB)
{
    let oldPrice=caclulateTotalPrice(collectionA);
    let newPrice=caclulateTotalPrice(collectionB);
    eveMassge.push({"总计":newPrice});
    eveMassge.push({"节省":(oldPrice-newPrice)});


}
*/
function isContainSpecialStr(element)
{
    if(-1!=element.indexOf('-')){
        return true;
    }
    return false;

}
function creatNewCollection(collection) {
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

function collectSameElements(collection) {
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

function afterDiscount(collection,discountCollection) {
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


function caclulatePrice(collection,allItemsCollection) {
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

function caclulateTotalPrice(collection) {
    let totalPrice=0;
    for(let i=0;i<collection.length;++i){
        totalPrice+=parseFloat(collection[i].price);
    }
    return totalPrice;
}
function caclulateDiffPrice(collectionA,collectionB,allItemsCollection)
{
    let diffprice=0;
    let oldPrice=caclulatePrice(collectionA,allItemsCollection);
    let newPrice=caclulatePrice(collectionB,allItemsCollection);
    diffprice=(caclulateTotalPrice(oldPrice)-caclulateTotalPrice(newPrice)).toFixed(2);
    return diffprice;
}



