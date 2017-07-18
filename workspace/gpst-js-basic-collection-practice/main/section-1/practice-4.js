'use strict';

module.exports = function collectSameElements(collectionA, objectB) {
  //return '实现练习要求，并改写该行代码。';
    var same=[];
    var tmp=objectB['value'];
    for(var i =0;i<collectionA.length;++i){
        var temp=collectionA[i].key;
        for(var j=0;j<tmp.length;++j){
            if(temp==tmp[j])
            {
                same.push(temp);
                break;
            }

        }
    }

    return same;
}
