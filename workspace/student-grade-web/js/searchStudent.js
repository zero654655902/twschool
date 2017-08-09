// /**
//  * Created by lwan on 03/08/2017.
//  */

$(function () {
    var header={id:"id",stuName:"name",email:"email",
        phone:"phone",idcard:"idCard",city:"city"}

    $.ajax({
        type: 'GET',
        url: 'http://localhost:8080/searchStudents',
        data: {get_param: 'value'},
        dataType:'json',
        success: function (data) {
            // var names = data
            console.log(data)
            var studentList=data.reportMessageItems

            console.log(studentList)
            // alert(JSON.stringify(studentList))
            studentList.splice(0,0,header);
            console.log(studentList)
            $.jsontotable(studentList,{id:'#message'});

        },


    });
});

//  $(function () {
//  //     var all_stu = get_all_stu();
//  //     show_stu_massege(all_stu);
//
//
//      //jsontotablr
//      var header={id:"id",stuName:"name",email:"email",phone:"phone",IdCard:"IdCard",city:"city"}
//
//      var all_stu=get_all_stu();
//
//      all_stu.splice(0,0,header);
//
//      console.log(all_stu);
//        $.jsontotable(all_stu,{id:'#message'});
//          $("#inquire_summit").click(function () {
//              var inquire_message = $("#inquire").val();
//              console.log(inquire_message);
//              console.log(all_stu);
//              $('#msg').html("")
//
//              for (let j = 0; j < all_stu.length; ++j) {
//                  var stu = all_stu[j];
//                  console.log(stu.stuName);
//
//                  if (inquire_message === stu.stuName ||inquire_message === stu.id ) {
//                      // show_one_sudent(stu);
//                      //  alert("查找到学生");
//                      $('#msg').html("search sucess")
//                      var student=[];
//                      // student.push(header);
//                      student.push(stu);
//                      student.splice(0,0,header);
//                      console.log(stu);
//                      console.log(student);
//                      $('#message').html("");
//                      $.jsontotable(student,{id:'#message'});
//                      return true;
//                  }
//                  $('#msg').html("not search sucess")
//              }
//
//      });
//
// })

///8-8
// get_all_stu = function () {
//     var data = localStorage.getItem("data");
//     var students = JSON.parse(data);
//     console.log(students);
//     return students;
// }


// show_one_sudent=function(student){
//     var one_student=getStudentFormat(student);
//     // console.log(all_stu_format);
//     $("table").html(tableHeard+one_student);
//
// }
//
// show_stu_massege=function(all_stu){
//
//     var all_stu_format=show_all_stu_format(all_stu);
//     console.log(all_stu_format);
//     $("table").html(tableHeard+all_stu_format);
//
// }
// const tableHeard=`<tr>` +
//         `<th>id</th>` +
//         `<th>name</th>` +
//         `<th>email</th>` +
//         `<th>phone</th>` +
//         `<th>IdCard</th>` +
//         `<th>city</th>` +
//         `</tr>`;
// getStudentFormat = function (student) {
//     console.log("hee")
//     return `<tr>` +
//         `<th>${student.id}</th>` +
//         `<th>${student.stuName}</th>` +
//         `<th>${student.email}</th>` +
//         `<th>${student.phone}</th>` +
//         `<th>${student.IdCard}</th>` +
//         `<th>${student.city}</th>` +
//         `</tr>`
// }


// show_all_stu_format=function(students)
// {
//     var strAllStudent=``;
//     for(let i=0;i<students.length;++i){
//         strAllStudent+=getStudentFormat(students[i]);
//     }
//     return strAllStudent;
//
// }






