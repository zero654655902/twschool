"use strict";
import {Person,Student,Teacher,Class} from '../../main/practice_9'
describe("OO入门", function(){
    it("对象之间的交互-3", function(){
        let person=new Person('Tom',21)
        expect(person.introduce()).toEqual('My name is Tom, I am 21 years old.')
        //let teacher=new Teahcer('Jorn',32)


    });
});