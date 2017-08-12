/**
 * Created by lwan on 12/08/2017.
 */
var initId = 100;
$(function () {
    $("#studentMessage").validate({
        rules:{
            name: {required: true},
            email: {required: true},
            phone: {
                required: true,
                minlength: 11,
                maxlength: 11,
                digits:true
            },
            idCard: {required: true},
            city: {required: true},
          },
        messages:{
            name: "please input your name",
            email: "please input your email",
            phone: "please input your phone_num",
            idCard: "please input your Idcard",
            city: "please input the your city",


        },

        submitHandler:function (form){

            const student = get_one_student();
            // console.log(student);
            alert(JSON.stringify(student))
            $.ajax({
                type: 'POST',
                url: 'http://localhost:8080/db/students',
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
    })

    const get_one_student = function () {
        var all_data = $("#studentMessage").serializeArray();
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