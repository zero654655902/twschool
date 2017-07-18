'use strict';

module.exports = function collectSameElements(collectionA, collectionB) {

    var same=[];
    var tmp=collectionB[0];
    for(var i =0;i<collectionA.length;++i){
        var temp=collectionA[i];
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
