"use strict";
import {Person,Student,Class} from '../../main/practice_10.js'
describe("OO入门", function(){
    it("对象之间的交互-4", function(){
        let person=new Person(11,'Tom',21)
        expect(person.introduce()).toEqual('My name is Tom, I am 21 years old.')
        let person2=new Person(12,'Tom',21)
        expect(person.isSamePerson(person2)).toEqual(false)

        let _class=new Class(2)
        let student=new Student(11,'Tom',21,_class)
        _class.assignLeader(student)
        expect(student.introduce()).toEqual('It is not of us.')

        let _class1=new Class(2)
        let student1=new Student(11,'Tom',21,_class1)
        _class1.appendMember(student1)
        expect(student1.introduce()).toEqual('My name is Tom, I am 21 years old. I am a student, I am at Class 2.')


        let _class2=new Class(2)
        let student2=new Student(11,'Tom',21,_class2)
        _class2.appendMember(student2)
        _class2.assignLeader(student2)
        expect(student2.introduce()).toEqual('My name is Tom, I am 21 years old. I am a student, I am the leader of Class 2.')

    });
});