/**
 * Created by lwan on 03/08/2017.
 */
$(document).ready(function () {



    $("#commentForm").validate({
        rules: {
            classNum: "required",
            stuId: "required",
            stuName: "required",
            email: "required",
            idCard: "required",

        },

        messages: {
            classNum: "请输入班级号",
            stuId: "请输入学号",
            stuName: "请输入姓名",
            email: "请输入邮箱",
            idCard: "请输入身份证号"
        }


    })

    $("#commentForm").submit(function () {
        event.preventDefault();
        var all_data = $('form').serializeArray();
        let data = JSON.stringify(all_data);
        console.log(data);
        localStorage.setItem("data", data);


//console.log(all_data);
//console.log(all_data[1]);
//console.log(all_data[1].name);
//console.log(all_data[1].value);
//console.log(all_data.length);

        location.href = "result.html";


    });

})



