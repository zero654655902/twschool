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

    });
});