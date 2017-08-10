// /**
//  * Created by lwan on 05/08/2017.
//  */

$(function () {
    var header = {
        id: "id", stuName: "name", math: "math",
        chinese: "language", english: "english", coding: "coding", totalScore: "totalScore", average: "average"
    }



    $.ajax({
        type: 'GET',
        url: 'http://localhost:8080/students',
        data: {get_param: 'value'},
        dataType: 'json',
        success: function (data) {
            console.log(data)
            var studentList = data.reportScoreItemList
            console.log(studentList)
            studentList.splice(0, 0, header);
            console.log(studentList)
            $.jsontotable(studentList, {id: '#message'});
            $("#average").html(data.average)
            $("#totalScore").html(data.totalScore)

             $("#inquire_summit").click(function () {
                 var inquire_message = $("#inquire").val();
                 searchStudent(studentList,inquire_message)
             })
        },
    });

    $('#modifyStudentScore').validate({
        rules: {
            math: {required: true, digits: true},
            chinese: {
                required: true,
                digits: true
            },
            english: {
                required: true,
                digits: true
            },
            coding: {
                required: true,
                digits: true
            }
        },
        messages: {
            math: "please input your math score",
            chinese: "please input your language score",
            english: "please input your english score",
            coding: "please input the your coding score"
        },


        submitHandler: function (form) {
            // const students=get_stu_massege();
            const student = get_one_student();
            console.log(student);
            alert(JSON.stringify(student))
            $.ajax({
                type: 'PUT',
                url: 'http://localhost:8080/students/{id}',
                data: JSON.stringify(student),
                contentType: "application/json; charset=utf-8",
                dataType: 'json',
                success: function (data) {
                    alert(data)

                },
                failure: function (errMsg) {
                    alert(errMsg)
                }
            });

        }
    });


    const searchStudent=function (studentList,inquire_message) {
        for (let j = 0; j <studentList.length; ++j) {
            var stu = studentList[j];
            console.log(stu.name);
            if (inquire_message === stu.name ||inquire_message === stu.id ) {
                // show_one_sudent(stu);
                //  alert("查找到学生");
                $('#msg').html("search sucess")
                return true;
            }
            $('#msg').html("not search sucess")
        }
    }
    const get_one_student = function () {
        var all_data = $('#modifyStudentScore').serializeArray();
        // initId++;
        console.log(all_data);
        let student = getStudent(all_data);
        return student;

    }
    const getStudent = function (stuData) {
        let student = {};
        for (let attributes in stuData) {
            student[stuData[attributes].name] = stuData[attributes].value;
        }
        return student;
    }
});