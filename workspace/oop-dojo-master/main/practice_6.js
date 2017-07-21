class Person{
    constructor(name,age)
    {
        this.name=name
        this.age=age
    }
    introduce()
    {
        return 'My name is '+this.name+', I am '+this.age+' years old.'
    }
}

class Student extends Person{
    constructor(name,age,classNum){
        super(name,age)
        this.classNum=classNum
    }
    introduce(){
        return 'I am a student, I am at Class '+this.classNum+'.'
    }
}

class Worker extends Person{
    constructor(name,age){
        super(name,age)
    }
    introduce(){
        return 'I am a Worker, I have a job.'
    }
}

module.exports={
    Person,
    Student,
    Worker
}