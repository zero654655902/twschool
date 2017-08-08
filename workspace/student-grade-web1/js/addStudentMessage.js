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
            const students=get_stu_massege();
        }

    });

    // $('#student_message').submit(function () {
    //     event.preventDefault();
    //     get_stu_massege();
    // });

    const get_stu_massege=function(){
        var all_data = $('#student_message').serializeArray();
        initId++;
        console.log(all_data);



        let student=getStudent(initId,all_data);
        console.log(student);

        // let data=JSON.stringify(all_data);
        studentMessage.push(student);
        let data = JSON.stringify(studentMessage);
        console.log(data);
        // console.log(studentMessage);
        // localStorage.setItem("data",data);
        //   localStorage.setItem("data",studentMessage);
        localStorage.setItem("data", data);
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

