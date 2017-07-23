"use strict";
import {Person,Student,Class,Teacher} from '../../main/practice_9'
describe("OO入门", function(){
    it("对象之间的交互-3", function(){
        const person=new Person(11,'Tom',21)
        expect(person.introduce()).toEqual('My name is Tom, I am 21 years old.')
        const person2=new Person(12,'Tom',21)
        expect(person.isSamePerson(person2)).toEqual(false)

        const _class=new Class(2)
        const _class2=new Class(2)
        const student=new Student(11,'Tom',21,_class)
        const student2=new Student(12,'Tom',21,_class2)
        _class2.assignLeader(student2)
        expect(student.introduce()).toEqual('My name is Tom, I am 21 years old. I am a student, I am at class 2')
        expect(student2.introduce()).toEqual('My name is Tom, I am 21 years old. I am a student, I am the leader of class 2')

        const teacher=new Teacher(23,'Tom',21)
        const teacher2=new Teacher(23,'Tom',21,_class)
        expect(teacher.introduce()).toEqual('My name is Tom, I am 21 years old. I am a teacher, I teach No Class.')
        expect(teacher2.introduce()).toEqual('My name is Tom, I am 21 years old. I am a teacher, I teach Class 2.')

    });
});