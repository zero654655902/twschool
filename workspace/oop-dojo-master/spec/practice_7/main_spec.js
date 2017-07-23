"use strict";

import {Person,Student,Worker,Teacher} from '../../main/practice_7'
describe("OO入门", function(){
    it("对象之间的交互-1", function(){
        const person=new Person('Tom',21)
        const student=new Student('Tom',21,2)
        const worker=new Worker('Jorn',32)
        const teacher=new Teacher('Lina',28)
        const teacher2=new Teacher('Lina',28,2)
        expect(person.introduce()).toEqual('My name is Tom, I am 21 years old.')
        expect(student.introduce()).toEqual('My name is Tom, I am 21 years old. I am a student, I am at Class 2.')
        expect(worker.introduce()).toEqual('My name is Jorn, I am 32 years old. I am a Worker, I have a job.')
        expect(teacher.introduce()).toEqual('My name is Lina, I am 28 years old. I am a teacher, I teach No Class.')
        expect(teacher2.introduce()).toEqual('My name is Lina, I am 28 years old. I am a teacher, I teach Class 2.')
    });
});