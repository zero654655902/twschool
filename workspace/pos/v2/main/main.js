'use strict';

//TODO: 请在该文件中实现练习要求并删除此注释

function printReceipt(tags) {
    let tagCollection=tagsSplit(tags);
    let allItems=Item.all();
    let tagsItem=buildItem(tagCollection,allItems);
    let promotion=Promotion.all();
    let tagsItemMassege=calculateItemCount(tagsItem);
    let discount=discountItem(tagsItemMassege,promotion[0].barcodes);
    let lastPrice=priceMassege(discount);
    let str=printMassege(discount,lastPrice);
    console.log(str);
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
        let index=getIndexOfCollection(collection[i].barcode,allItems);
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

function isInArr(element,strArr){
    for(let i=0;i<strArr.length;++i){
        if(element===strArr[i])
        {
            return true;
        }
    }
    return false;
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

function getCurrentDate() {
    const dateDigitToString = num => (num < 10 ? `0${num}` : num);
    let currentDate = new Date(),
        year = dateDigitToString(currentDate.getFullYear()),
        month = dateDigitToString(currentDate.getMonth() + 1),
        date = dateDigitToString(currentDate.getDate()),
        hour = dateDigitToString(currentDate.getHours()),
        minute = dateDigitToString(currentDate.getMinutes()),
        second = dateDigitToString(currentDate.getSeconds());
        return `${year}年${month}月${date}日 ${hour}:${minute}:${second}`;

}

function printMassege(allItemsMassege,lastPrice) {
    let storeName=`***<没钱赚商店>收据***
`;
    let printTime=`打印时间：${getCurrentDate()}\n`
    let itemsMassege="";
    for(let i=0;i<allItemsMassege.length;++i){
        itemsMassege+='名称：'+(allItemsMassege[i].name)
            +'，数量：'+(allItemsMassege[i].count)+(allItemsMassege[i].unit)
            +'，单价：'+(allItemsMassege[i].price.toFixed(2))+'(元)'
            +'，小计：'+(allItemsMassege[i].totalPrice.toFixed(2))+'(元)\n';
    }
    let totalPriceText='总计：'+lastPrice[0].总计+'(元)\n';

    let diffPriceText='节省：'+lastPrice[0].节省+'(元)\n';
    let result=storeName+printTime+'----------------------\n'+itemsMassege+'----------------------\n'+totalPriceText+diffPriceText+'**********************';
    return result;

}



