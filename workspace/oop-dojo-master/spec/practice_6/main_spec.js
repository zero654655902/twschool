"use strict";
import {Person,Student,Worker} from '../../main/practice_6'
describe("OO入门", function(){
    it("覆盖同时复用父类被覆盖的方法", function(){
        let person=new Person('Tom',21)
        let student=new Student('Tom',21,2)
        let worker=new Worker('Jorn',32)
        expect(person.introduce()).toEqual('My name is Tom, I am 21 years old.')
        expect(person.introduce()+' '+student.introduce()).toEqual('My name is Tom, I am 21 years old. I am a student, I am at Class 2.')
        expect(person.introduce()+' '+worker.introduce()).toEqual('My name is Tom, I am 21 years old. I am a Worker, I have a job.')

    });
});