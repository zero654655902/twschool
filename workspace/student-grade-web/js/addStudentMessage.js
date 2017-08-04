/**
 * Created by lwan on 03/08/2017.
 */

var studentMessage = [];
$(function () {
    $('#student_message').validate({
        rules: {
            stuName: {required: true},
            email: {required: true},
            phone_num: {
                required: true,
                minlength: 11,
                maxlength: 11
            },
            IdCard: {required: true},
            city: {required: true}
        },
        messages: {
            stuName: "请输入学生姓名",
            email: "请输入学生的正确邮箱",
            phone_num: "请输入学生的电话号码",
            IdCard: "请输入学生的身份证号码",
            city: "请输入学生所在城市"
        }
    });

    $('#student_message').submit(function () {
        event.preventDefault();

        var all_data = $('#student_message').serializeArray();

        // let data=JSON.stringify(all_data);
        studentMessage.push(all_data);
        let data = JSON.stringify(studentMessage);
        console.log(data);
        // console.log(studentMessage);
        // localStorage.setItem("data",data);
        //   localStorage.setItem("data",studentMessage);
        localStorage.setItem("data", data);
        alert("添加成功");

    });

})

