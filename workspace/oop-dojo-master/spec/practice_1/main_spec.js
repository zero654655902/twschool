"use strict";
import Person from '../../main/practice_1.js'
describe("OO入门", function() {
    it("写一个类-1", function () {

        let person = new Person('Tom', 21)

        expect(person.introduce()).toEqual('My name is Tom. I am 21 years old.')

    });
});
