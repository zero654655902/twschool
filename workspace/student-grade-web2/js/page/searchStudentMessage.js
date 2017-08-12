/**
 * Created by lwan on 12/08/2017.
 */
const TABLE_HEADER = `<tr>` +
    `<td>id</td>` +
    `<td>name</td>` +
    `<td>email</td>` +
    `<td>phone</td>` +
    `<td>idCard</td>` +
    `<td>city</td>`
    + `</tr>`

let studentList = null;

$(function () {
    $.ajax({
        type: 'GET',
        url: 'http://localhost:8080/db/students',
        data: {get_param: 'value'},
        dataType: 'json',
        success: function (data) {
            studentList = data
            console.log(studentList)
            displayAllStudentScore(studentList)
            getSearchStudent(studentList)
        },

    });
});

getStudentScoreFormat = function (student) {
    return `<tr>` +
        `<td>${student.id}</td>` +
        `<td>${student.name}</td>` +
        `<td>${student.email}</td>` +
        `<td>${student.phone}</td>` +
        `<td>${student.idCard}</td>` +
        `<td>${student.city}</td>` +
        `<td><a href="../../html/page/addStudentScore.html?id=${student.id}">addScore</a>` +
        `</tr>`

}
showAllStuScore = function (students) {
    var strAllStudent = ``;
    for (let i = 0; i < students.length; ++i) {
        strAllStudent += getStudentScoreFormat(students[i]);
    }
    return strAllStudent;

}

displayAllStudentScore = function (students) {
    $("#messageTable").html(TABLE_HEADER + showAllStuScore(students))
}

displayOneStudentMessage=function(student){
    $("#messageTable").html(TABLE_HEADER + getStudentScoreFormat(student))
    $('#msg').html("search sucess")
}

displayNoStudentMessage=function(student){
    $("#messageTable").html(TABLE_HEADER )
    $('#msg').html("not search sucess")
}

getSearchStudent=function(studentList){
    $("#search").click(function () {
        var inquire_message = $("#inquire").val();
        console.log(inquire_message);

        for (let j = 0; j <studentList.length; ++j) {
            var stu = studentList[j];
            console.log(stu.name);
            if (inquire_message === stu.name ||inquire_message === stu.id ) {

                console.log(stu);
                displayOneStudentMessage(stu)
                return true;
            }
              displayNoStudentMessage()
        }

    });
}