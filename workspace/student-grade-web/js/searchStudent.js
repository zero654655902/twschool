// /**
//  * Created by lwan on 03/08/2017.
//  */

$(function () {

    var all_stu=get_all_stu();

    $("#inquire_summit").click(function () {
      var inquire_message=$("#inquire").val();
      console.log(inquire_message);
      console.log(all_stu);

        for(let j=0;j<all_stu.length;++j)
        {
            var stu=all_stu[j];
           if(inquire_message==stu[0].value)
           {
               alert("查找到学生");
           }
        }


    })


});

get_all_stu=function () {
    var data = localStorage.getItem("data");
    var result = JSON.parse(data);

    console.log(result);

    for(let j=0;j<result.length;++j)
    {
        var stu=result[j];
        var Id="stuId";
        for (let i = 0; i < stu.length; ++i) {

            var id = '' + "#" + stu[i].name+j;
            var stuId =  "#"+Id+j;
            var idNum="10"+j;
            $(stuId).html(idNum);
            $(id).html(stu[i].value);
        }
}
return result;
}

