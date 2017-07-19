'use strict';

module.exports = function countSameElements(collection) {
    var result = [];
    for (let i = 0; i < collection.length; ++i) {
        var regx=/[A-Za-z][-][0-9]+/;
        if(collection[i].match(regx)){
            var key_count=collection[i].split('-');
            result.push({key:key_count[0],count:eval(key_count[1])});
        }
        else
            {
                var index = isInArr(collection[i], result);
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

function isInArr(element,strArr) {
    var index=-1;
    for(let i=0;i<strArr.length;++i) {
        if(element===strArr[i].key) {
            //元素在数组中已经找到，并返回下标
            index=i;
        }
    }
    return index;

}
