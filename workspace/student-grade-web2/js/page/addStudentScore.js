/**
 * Created by lwan on 12/08/2017.
 */
$.urlParam = function (key) {
    const regex = new RegExp(`[\?&]${key}=([^&]*)`);
    const result = regex.exec(window.location.href);
    return (result ? decodeURIComponent(result[1]) : "")
}

const id = $.urlParam("id");
console.log(id)

$(function () {
    $("#studentScore").validate({
        rules: {
            id: {required: true},
            math: {
                required: true,
                digits: true,
                range: [0, 100]
            },
            chinese: {
                required: true,
                digits: true,
                range: [0, 100]
            },
            english: {
                required: true,
                digits: true,
                range: [0, 100]
            },
            coding: {
                required: true,
                digits: true,
                range: [0, 100]
            }
        },
        messages: {
            id: "please input the your id",
            math: "please input your math score",
            chinese: "please input your language score",
            english: "please input your english score",
            coding: "please input the your coding score"

        },

        submitHandler: function (form) {
            const studentScore = get_one_student_score();
            console.log(studentScore);
            alert(JSON.stringify(studentScore))
            $.ajax({
                type: 'POST',
                url: 'http://localhost:8080/db/scores',
                data: JSON.stringify(studentScore),
                contentType: "application/json; charset=utf-8",
                dataType: 'json',
                success: function (data) {
                    alert(data)
                    console.log(JSON.stringify(data))
                },
                failure: function (errMsg) {
                    alert(errMsg)
                }

            });

        }
    })

    const get_one_student_score = function () {
        var all_data = $("#studentScore").serializeArray();
        console.log(all_data);
        let studentScore = getStudentScore(all_data);
        return studentScore;

    }
    const getStudentScore = function (scoreData) {
        let studentScore = {};
        studentScore["id"] = id;
        for (let attributes in scoreData) {
            studentScore[scoreData[attributes].name] = scoreData[attributes].value;
        }
        return studentScore;
    }
})