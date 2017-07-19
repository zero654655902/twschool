'use strict';

module.exports = function createUpdatedCollection(collectionA, objectB) {

   var arrB=objectB.value;
   for(let i=0;i<collectionA.length;++i) {
       if(isInArr(collectionA[i].key,arrB)) {
           collectionA[i].count--;
       }
   }
   return collectionA;

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
