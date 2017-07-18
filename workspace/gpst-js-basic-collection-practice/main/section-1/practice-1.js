'use strict';

module.exports = function collectSameElements(collectionA, collectionB) {

  var same=[];
  for(var i =0;i<collectionA.length;++i){
    var temp=collectionA[i];
    for(var j=0;j<collectionB.length;++j){
      if(temp==collectionB[j])
      {
        same.push(temp);
        break;
      }

    }
  }

  return same;

  //return '实现练习要求，并改写该行代码。';
}
