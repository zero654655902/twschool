// /**
//  * Created by lwan on 03/08/2017.
//  */

$(function () {

    var all_stu = get_all_stu();
    // var all_stu_format=getStudentFormat(all_stu);
    var all_stu_format=show_all_stu_format(all_stu);
    console.log(all_stu_format);
    $("table").html(tableHeard+all_stu_format);
    // $("").html(all_stu_format);

    $("#inquire_summit").click(function () {
        var inquire_message = $("#inquire").val();
        console.log(inquire_message);
        console.log(all_stu);

        for (let j = 0; j < all_stu.size(); ++j) {
            var stu = all_stu[j];
            if (inquire_message == stu[0].value) {
                alert("查找到学生");
            }
        }
    })


});
const tableHeard=`<tr>` +
        `<th>id</th>` +
        `<th>name</th>` +
        `<th>email</th>` +
        `<th>phone</th>` +
        `<th>IdCard</th>` +
        `<th>city</th>` +
        `</tr>`;
getStudentFormat = function (student) {
    console.log("hee")
    return `<tr>` +
        `<th>${student.id}</th>` +
        `<th>${student.stuName}</th>` +
        `<th>${student.email}</th>` +
        `<th>${student.phone}</th>` +
        `<th>${student.IdCard}</th>` +
        `<th>${student.city}</th>` +
        `</tr>`
}

get_all_stu = function () {
    var data = localStorage.getItem("data");
    var students = JSON.parse(data);
    console.log(students);
    return students;
}


show_all_stu_format=function(students)
{
    // console.log('2222');
    var strAllStudent=``;
    for(let i=0;i<students.length;++i){
        strAllStudent+=getStudentFormat(students[i]);
    }
    return strAllStudent;

}






