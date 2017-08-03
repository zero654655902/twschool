// /**
//  * Created by lwan on 03/08/2017.
//  */
function FormatStudentMessageToTable(student) {
    const str=`<tr><td>${student.id}</td><td>${student.name}</td><td>${student.phone}</td><td>${student.IdCard}</td><td>${student.city}</td></tr>`;
    return str;
}