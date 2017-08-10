/**
 * Created by lwan on 03/08/2017.
 */
var initId = 100;
var studentMessage = [];
$(function () {
    $('#student_message').validate({
        rules: {
            stuName: {required: true},
            email: {required: true},
            phone: {
                required: true,
                minlength: 11,
                maxlength: 11,
                digits:true
            },
            idCard: {required: true},
            city: {required: true},
            math:{required:true,digits:true},
            chinese:{required:true,
            digits:true},
            english:{required:true,
                digits:true},
            coding:{required:true,
                digits:true}
        },
        messages: {
            stuName: "please input your name",
            email: "please input your email",
            phone: "please input your phone_num",
            idCard: "please input your Idcard",
            city: "please input the your city",
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
                type: 'POST',
                url: 'http://localhost:8080/students',
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

    // $('#student_message').submit(function () {
    //     event.preventDefault();
    //     // get_stu_massege();
    //
    // });
//8-8
    // const get_stu_massege=function(){
    //     var all_data = $('#student_message').serializeArray();
    //     initId++;
    //     console.log(all_data);
    //     let student=getStudent(initId,all_data);
    //     console.log(student);
    //     studentMessage.push(student);
    //     let data = JSON.stringify(studentMessage);
    //     console.log(data);
    //     localStorage.setItem("data", data);
    // }

    const get_one_student = function () {
        var all_data = $('#student_message').serializeArray();
        initId++;
        console.log(all_data);
        let student = getStudent(initId, all_data);
        return student;

    }
    const getStudent = function (initId, stuData) {
        let student = {};
        student["id"] = initId.toString();
        for (let attributes in stuData) {
            student[stuData[attributes].name] = stuData[attributes].value;
        }
        return student;
    }

})

