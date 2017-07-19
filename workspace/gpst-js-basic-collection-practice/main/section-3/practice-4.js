'use strict';

module.exports = function createUpdatedCollection(collectionA, objectB) {
  //return '实现练习要求，并改写该行代码。';
    var object=createObject(collectionA);
    var arrB=objectB.value;
    for(let i=0;i<object.length;++i) {
        if(isInArr(object[i].key,arrB)) {
            var n=(object[i].count%3);
            n=(object[i].count-n)/3;
            object[i].count-=n;
        }
    }
    return object;



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

function isInArr1(element,strArr) {
    var index=-1;
    for(let i=0;i<strArr.length;++i) {
        if(element===strArr[i].key) {
            //元素在数组中已经找到，并返回下标
            index=i;
        }
    }
    return index;
}

function createObject(collection) {   //统计A中元素形成集合
    var result = [];
    for (let i = 0; i < collection.length; ++i) {
        var regx=/[A-Za-z][-][0-9]+/;
        if(collection[i].match(regx)){
            var key_count=collection[i].split('-');
            result.push({key:key_count[0],count:eval(key_count[1])});
        }
        else
        {
            var index = isInArr1(collection[i], result);
            if (index == -1) {
                result.push({key: collection[i], count: 1});
            }
            else {
                result[index].count++;
            }
        }
    }
    return result;


}
