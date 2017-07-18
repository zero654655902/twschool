'use strict';

module.exports = function countSameElements(collection) {
  // return '实现练习要求，并改写该行代码。';
    var num=1;
    var out=[];
for(var i =0; i<collection.length-1;++i)
{
  if(collection[i]==collection[i+1])
  {
    num++;
    continue;
  }
  var tep=new Object();
  tep.key=collection[i];
  tep.count=num;
  out.push(tep);
  num=1;


}
return out;



}
