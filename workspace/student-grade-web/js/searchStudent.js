// /**
//  * Created by lwan on 03/08/2017.
//  */

$(function () {
    var header={id:"id",stuName:"name",email:"email",
        phone:"phone",idcard:"idCard",city:"city"}
        var studentList=[]
    $.ajax({
        type: 'GET',
        url: 'http://localhost:8080/searchStudents',
        data: {get_param: 'value'},
        dataType:'json',
        success: function (data) {
            // var names = data
            console.log(data.reportMessageItems)
            studentList=data.reportMessageItems
            console.log(studentList)
            // alert(JSON.stringify(studentList))
            studentList.splice(0,0,header);
            // console.log(students)
            $.jsontotable(studentList,{id:'#message'});
            getSearchStudent(studentList,header)
        },

    });
    // var students=studentList[0];


});

getSearchStudent=function(studentList,header){
             $("#inquire_summit").click(function () {
             var inquire_message = $("#inquire").val();
             console.log(inquire_message);
             // console.log(all_stu);
             $('#msg').html("")

             for (let j = 0; j <studentList.length; ++j) {
                 var stu = studentList[j];
                 console.log(stu.name);

                 if (inquire_message === stu.name ||inquire_message === stu.id ) {
                     // show_one_sudent(stu);
                     //  alert("查找到学生");
                     $('#msg').html("search sucess")
                     var student=[];
                     // student.push(header);
                     student.push(stu);
                     student.splice(0,0,header);
                     console.log(stu);
                     console.log(student);
                     $('#message').html("");
                     $.jsontotable(student,{id:'#message'});
                     return true;
                 }
                 $('#msg').html("not search sucess")
             }

     });
}


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






