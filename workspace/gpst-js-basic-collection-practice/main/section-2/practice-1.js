/*'use strict';

module.exports = function countSameElements(collection) {
  //return '实现练习要求，并改写该行代码。';
  //   var num= new Array(26)[0];
  //   var num=new Array(26)
    var num=new Array();
    for(var i=0;i<26;++i)
    {
      num[i]=0;
    }
    for(var i=0; i<collection.length;++i)
    {
      num[collection[i].charCodeAt()-97]++;
    }
    //return num;

    var out=[];





    for(var j=0;j<num.length;++j){
      var tmp=new Object();
      if(num[j]!=0)
      {
        tmp.key=String.fromCharCode(j+97);
        tmp.count=num[j];
        out.push(tmp);

      }
    }
    return out;

}
*/

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
