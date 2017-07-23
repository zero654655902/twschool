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
        return `${super.introduce()} I am a student, I am at Class ${this.classNum}.`
    }
}

class Worker extends Person{
    constructor(name,age){
        super(name,age)
    }
    introduce(){
        return `${super.introduce()} I am a Worker, I have a job.`
    }
}

class Teacher extends Person{
    constructor(name,age,classNum){
        super(name,age)
        this.classNum=classNum
    }

    introduce(){
        if(this.classNum==null)
            return `${super.introduce()} I am a teacher, I teach No Class.`

        else
            return `${super.introduce()} I am a teacher, I teach Class ${this.classNum}.`


    }

}

module.exports={
    Person,
    Student,
    Worker,
    Teacher
}