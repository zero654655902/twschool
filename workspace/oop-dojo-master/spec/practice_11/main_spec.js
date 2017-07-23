"use strict";
import {Person,Student,Class,Teacher} from '../../main/practice_11.js'
describe("OO入门", function(){
    it("对象之间的交互-5", function(){
        const person=new Person(11,'Tom',21)
        expect(person.introduce()).toEqual('My name is Tom, I am 21 years old.')
        const person2=new Person(12,'Tom',21)
        expect(person.isSamePerson(person2)).toEqual(false)
        let classes=[]
        const _class=new Class(2)
        classes.push(_class)
        const student=new Student(11,'Tom',21,_class)
        _class.assignLeader(student)
        expect(student.introduce()).toEqual('It is not of us.')

        const _class1=new Class(3)
        classes.push(_class1)
        const student1=new Student(11,'Tom',21,_class1)
        _class1.appendMember(student1)
        expect(student1.introduce()).toEqual('My name is Tom, I am 21 years old. I am a student, I am at Class 3.')


        const _class2=new Class(4)
        classes.push(_class2)
        const student2=new Student(11,'Tom',21,_class2)
        _class2.appendMember(student2)
        _class2.assignLeader(student2)
        expect(student2.introduce()).toEqual('My name is Tom, I am 21 years old. I am a student, I am the leader of Class 4.')

        const teacher=new Teacher(23,'Tom',21)
        expect(teacher.introduce()).toEqual('My name is Tom, I am 21 years old. I am a teacher, I teach No Class.')


        const teacher1=new Teacher(23,'Tom',21,classes)
        expect(teacher1.introduce()).toEqual('My name is Tom, I am 21 years old. I am a teacher, I teach Class 2, 3, 4.')

    });
});