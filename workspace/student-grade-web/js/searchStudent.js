// /**
//  * Created by lwan on 03/08/2017.
//  */

$(function () {



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



});





function FormatStudentMessageToTable(student) {
    const str=`<tr><td>${student.id}</td><td>${student.name}</td><td>${student.phone}</td><td>${student.IdCard}</td><td>${student.city}</td></tr>`;
    return str;
}