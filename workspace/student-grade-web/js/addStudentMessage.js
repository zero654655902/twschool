/**
 * Created by lwan on 03/08/2017.
 */

$(function () {
    $('#student_message').validate({
        rules: {
            stuName: {required: true},
            email: {required: true},
            phone_num: {required: true},
            IdCard: {required: true},
            city: {required: true}
        },
        messages:{
            stuName:"请输入学生姓名",
            email:"请输入学生的正确邮箱",
            phone_num:"请输入学生的电话号码",
            IdCard:"请输入学生的身份证号码",
            city:"请输入学生所在城市"
        }
    });

    $('#student_message').submit(function () {
        event.preventDefault();

        var all_data=$('#student_message').serializeArray();

        let data=JSON.stringify(all_data);
         console.log(data);
      localStorage.setItem("data",data);
        alert("添加成功");

    });

})

