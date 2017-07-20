'use strict';

//TODO: 请在该文件中实现练习要求并删除此注释
/*
 'use strict';


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
    let promotion=loadPromotions();
    let tagsItemMassege=calculateItemCount(tagsItem);
    let discount=discountItem(tagsItemMassege,promotion[0].barcodes);
    let lastPrice=priceMassege(discount);
    let str=printMassege(discount,lastPrice);

}


function isContainSpecialStr(element)
{
    if(-1!==element.indexOf('-')){
        return true;
    }
    return false;
}
function tagsSplit(collection) {
    let newTags=[];
    for(let i=0;i<collection.length;++i) {
        if(isContainSpecialStr(collection[i])){
            let key_count = collection[i].split('-');
            newTags.push({barcode: key_count[0], count: parseFloat(key_count[1])});
        }else
        {
            newTags.push({barcode: collection[i], count: 1});
        }
    }
    return newTags;
}

function buildItem(collection,allItems){
    let tagsItem=[];

    for(let i=0;i<collection.length;++i)
    {
        let index=indexOfItem(collection[i].barcode,allItems);
        // allItems[index].count=collection[i].count;

        tagsItem.push({barcode:allItems[index].barcode,name:allItems[index].name,
            unit:allItems[index].unit,price:allItems[index].price,count:collection[i].count});
    }
    return tagsItem;
}

function getIndexOfCollection(element,Collection) {
    for(let i=0; i<Collection.length;++i){
        if(element===Collection[i].barcode)
        {
            return i;
        }
    }
    return -1;

}

function calculateItemCount(collection) {
    let itemMassege=[];
    for(let i=0;i<collection.length; ++i)
    {
        let index=getIndexOfCollection(collection[i].barcode,itemMassege);
        if(-1===index)
        {

            itemMassege.push(collection[i]);

        }
        else
            itemMassege[index].count+=collection[i].count;

    }
    return itemMassege;
}

function isDiscount(element,promotion) {
    if(isInArr(element.barcode,promotion)&&element.count>=3)
    {
        return true;
    }

    return false;
}

function discountItem(item,promotion)
{
    let itemDiscount=[];
    for(let i=0;i<item.length;++i){
        if(isDiscount(item[i],promotion)){
            item[i].totalPrice=(item[i].count-1)*item[i].price;
        }
        else
        {
            item[i].totalPrice=item[i].count*item[i].price;
        }
        itemDiscount.push({barcode:item[i].barcode,name:item[i].name,unit:item[i].unit,price:item[i].price,count:item[i].count,totalPrice:item[i].totalPrice});
    }
    return itemDiscount;
}

function priceMassege(allItemsMassege)
{
    let lastPrice=[];
    let totalPrice=0;
    let diffPrice=0;
    for(let i=0;i<allItemsMassege.length;++i)
    {
        totalPrice+=allItemsMassege[i].totalPrice;
        diffPrice+=(allItemsMassege[i].price*allItemsMassege[i].count-allItemsMassege[i].totalPrice);
    }
    lastPrice.push({总计:totalPrice.toFixed(2),节省:diffPrice.toFixed(2)});
    return lastPrice;
}




