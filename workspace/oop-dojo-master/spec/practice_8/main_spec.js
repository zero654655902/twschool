"use strict";
import {Person,Student,Worker,Teacher,Class} from '../../main/practice_8'
describe("OO入门", function(){
    it("对象之间的交互-2", function(){
        let person=new Person('Tom',21)
        let classNum=new Class(2)
        let classNum2=new Class(3)
        let student=new Student('Jerry',21,classNum.number)
        let student1=new Student('Jerry',21,classNum2.number)
        let worker=new Worker('Jorn',32)
        let teacher=new Teacher('Lina',28)
        let teacher2=new Teacher('Lina',28,2)
        expect(person.introduce()).toEqual('My name is Tom, I am 21 years old.')
        expect(student.introduce()).toEqual('My name is Jerry, I am 21 years old. I am a student, I am at Class 2.')
        expect(worker.introduce()).toEqual('My name is Jorn, I am 32 years old. I am a Worker, I have a job.')
        expect(teacher.introduce()).toEqual('My name is Lina, I am 28 years old. I am a teacher, I teach No Class.')
        expect(teacher2.introduce()).toEqual('My name is Lina, I am 28 years old. I am a teacher, I teach Class 2.')
        expect(teacher2.introduceWith(student)).toEqual('My name is Lina, I am 28 years old. I am a teacher. I teach Jerry.')
        expect(teacher2.introduceWith(student1)).toEqual('My name is Lina, I am 28 years old. I am a teacher. I don\'t teach Jerry.')
    });
});