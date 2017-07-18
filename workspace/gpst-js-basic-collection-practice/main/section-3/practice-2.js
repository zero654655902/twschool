'use strict';

module.exports = function createUpdatedCollection(collectionA, objectB) {
  // return '实现练习要求，并改写该行代码。';
    var arr=objectB.value;
    for(var i=0; i<arr.length; ++i){
        for(var j=0; j<collectionA.length; ++j)
        {
            if(arr[i]==collectionA[j].key)
            {

              var n=(collectionA[j].count%3);
              n=(collectionA[j].count-n)/3;
                collectionA[j].count-=n;

            }
        }

    }
    return collectionA;
}
