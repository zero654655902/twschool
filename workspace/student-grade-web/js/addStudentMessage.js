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
                maxlength: 11
            },
            IdCard: {required: true},
            city: {required: true}
        },
        messages: {
            stuName: "please input your name",
            email: "please input your email",
            phone: "please input your phone_num",
            IdCard: "please input your Idcard",
            city: "please input the your city"
        },

        submitHandler:function (form) {
            // const students=get_stu_massege();
             const student=get_one_student();
             console.log(student);
            alert(JSON.stringify(student))
            $.ajax({
                type:'POST',
                // headers:{
                //     'Accept':'application/json',
                //     'Content-Type':'text/plain'
                // },
                url:'http://localhost:8080/students',
                 data:JSON.stringify(student),
                contentType: "application/json; charset=utf-8",
                // data:student,
                // cache:false,
                dataType:'json',
                success:function (data) {
                    alert(data)

                },
                failure:function (errMsg) {
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

    const get_one_student=function () {
        var all_data = $('#student_message').serializeArray();
        initId++;
        console.log(all_data);
        let student=getStudent(initId,all_data);
        return student;

    }
    const getStudent = function (initId,stuData) {
       let student={};
      student["id"]=initId.toString();
        for (let attributes in stuData) {
            student[stuData[attributes].name] = stuData[attributes].value;
        }
        return student;
    }



})

