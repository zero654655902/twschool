"use strict";
import {Person,Student,Worker} from '../../main/practice_5'
describe("OO入门", function(){
    it("覆盖同时复用父类的方法", function(){
        const person=new Person('Tom',21)
        const student=new Student('Tom',21,2)
        const worker=new Worker('Tom',21)
        expect(person.introduce()).toEqual('My name is Tom. I am 21 years old.')
        expect(student.introduce()).toEqual('My name is Tom. I am 21 years old. I am a Student. I am at Class 2.')
        expect(worker.introduce()).toEqual('My name is Tom. I am 21 years old. I am a Worker. I have a job.')
    });
});


