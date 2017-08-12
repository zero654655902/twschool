/**
 * Created by lwan on 12/08/2017.
 */
const TABLE_HEADER=`<tr>`+
    `<td>id</td>`+
    `<td>name</td>`+
    `<td>math</td>`+
    `<td>language</td>`+
    `<td>english</td>`+
    `<td>coding</td>`+
    `<td>totalScore</td>`+
    `<td>average</td>`
    +`</tr>`

let studentList=null;


$(function () {

    $.ajax({
        type: 'GET',
        url: 'http://localhost:8080/db/scores',
        data: {get_param: 'value'},
        dataType:'json',
        success: function (data) {
            studentList=data.reportBuilderList
            console.log(studentList)
            console.log(data)
            displayAllStudentScore(studentList)
            $("#totalScore").html(data.totalScore)
            $("#average").html(data.average)
        },

    });
});

getStudentScoreFormat=function (studentScore) {
    return `<tr>`+
        `<td>${studentScore.id}</td>`+
        `<td>${studentScore.name}</td>`+
        `<td>${studentScore.math}</td>`+
        `<td>${studentScore.chinese}</td>`+
        `<td>${studentScore.english}</td>`+
        `<td>${studentScore.coding}</td>`+
        `<td>${studentScore.totalScore}</td>`+
        `<td>${studentScore.average}</td>`+
        `<td><a href="../../html/page/updateStudentMessage.html?id=${studentScore.id}">updateScore</a></td>` +
        +`</tr>`

}
showAllStuScore=function(studentScores)
{
    var strAllStudent=``;
    for(let i=0;i<studentScores.length;++i){
        strAllStudent+=getStudentScoreFormat(studentScores[i]);
    }
    return strAllStudent;

}

displayAllStudentScore=function (studentScore) {
    $("#scoreTable").html(TABLE_HEADER+showAllStuScore(studentScore))
}