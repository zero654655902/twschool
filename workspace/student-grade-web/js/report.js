// /**
//  * Created by lwan on 05/08/2017.
//  */
// let studentsMassege=[{id:"101",name:"zz",math:89,language:87,english:84,coding:86},
//     {id:"102",name:"ll",math:84,language:79,english:94,coding:85},
//     {id:"103",name:"yy",math:85,language:77,english:74,coding:76},
//     {id:"104",name:"tt",math:79,language:88,english:85,coding:96}];
//
//
// const tableHeard=`<tr>` +
//     `<th>id</th>` +
//     `<th>name</th>` +
//     `<th>math</th>` +
//     `<th>language</th>` +
//     `<th>english</th>` +
//     `<th>coding</th>` +
//     `</tr>`;
//
// $(function () {
//     var all_stu_format=show_all_stu_format(studentsMassege);
//     // console.log(all_stu_format);
//
//
//     $("table").html(tableHeard+all_stu_format);
// });
//
// getStudentFormat = function (student) {
//     console.log("hee")
//     return `<tr>` +
//         `<th>${student.id}</th>` +
//         `<th>${student.name}</th>` +
//         `<th>${student.math}</th>` +
//         `<th>${student.language}</th>` +
//         `<th>${student.english}</th>` +
//         `<th>${student.coding}</th>` +
//         `</tr>`
// }
//
// show_all_stu_format=function(students)
// {
//     var strAllStudent=``;
//     for(let i=0;i<students.length;++i){
//         strAllStudent+=getStudentFormat(students[i]);
//     }
//     return strAllStudent;
//
// }
//
// show_stu_massege=function(all_stu){
//
//      var all_stu_format=show_all_stu_format(studentsMassege);
//
//     $("table").html(tableHeard+all_stu_format);
//
// }


$(function () {
    var header={id:"id",stuName:"name",math:"math",
    chinese:"language",english:"english",coding:"coding",totalScore:"totalScore",average:"average"}

    $.ajax({
        type: 'GET',
        url: 'http://localhost:8080/students',
        data: {get_param: 'value'},
        dataType:'json',
        success: function (data) {
            // var names = data
            console.log(data)
            var studentList=data.reportScoreItemList

            console.log(studentList)
            // alert(JSON.stringify(studentList))
            studentList.splice(0,0,header);
            console.log(studentList)
            $.jsontotable(studentList,{id:'#message'});
             $("#average").html(data.average)
            $("#totalScore").html(data.totalScore)
        },


    });
});