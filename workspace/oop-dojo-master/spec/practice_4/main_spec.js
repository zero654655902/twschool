"use strict";

import {Person,Student,Worker} from '../../main/practice_4'
describe("OO入门", function(){
    it("覆盖父类的方法-2", function(){
        let person=new Person('Tom',21)
        let student=new Student('Tom',21,2)
        let worker=new Worker('Jorn',32)
        expect(person.introduce()).toEqual('My name is Tom. I am 21 years old')
        expect(student.introduce()).toEqual('I am a Student. I am at Class 2.')
        expect(worker.introduce()).toEqual('I am a Worker. I have a job.')

    });
});
