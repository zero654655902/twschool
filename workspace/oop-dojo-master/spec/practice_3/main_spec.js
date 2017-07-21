"use strict";
import Student from '../../main/practice_3.js'
describe("OO入门", function(){
    it("覆盖父类的方法-1", function(){
        let student=new Student('Tom',21,2)
        expect(student.introduce()).toEqual('I am a Student. I am at Class 2.')
    });
});