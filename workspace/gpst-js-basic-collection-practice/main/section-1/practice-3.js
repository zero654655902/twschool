'use strict';

module.exports = function collectSameElements(collectionA, objectB) {
  //return '实现练习要求，并改写该行代码。';
    var sameArr=[];
    for(var i =0;i<collectionA.length;++i) {
        if(isInArr(collectionA[i],objectB.value)) {
            sameArr.push(collectionA[i])
        }
    }
    return sameArr;
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


