
class Person{
    constructor(id,name,age)
    {
        this.id=id
        this.name=name
        this.age=age

    }
    introduce()
    {
        return `My name is ${this.name}, I am ${this.age} years old.`
    }
    isSamePerson(person){
        return (this.id===person.id)
    }
}

class Class{
    constructor(number)
    {
        this.number=number
    }
    getClassNum()
    {
        return this.number
    }
    assignLeader(student)
    {
        if(this.student==student)
            this.leader=student

    }
    isLeader(){
        return this.leader
    }
    appendMember(student){
         this.student=student
    }
    isClassMember()
    {
        return this.student
    }

}

class Student extends Person{
    constructor(id,name,age,_class)
    {
        super(id,name,age)
        this._class=_class
    }

    introduce()
    {

        if(!this._class.isClassMember())
        {
            return `It is not of us.`

        }
        else if(this._class.isLeader())
        {
            return `${super.introduce()} I am a student, I am the leader of class ${this._class.number}`

        }
        else
            return `${super.introduce()} I am a student, I am at Class ${this._class.number}`

    }
}

module.exports={
    Person,
    Student,
    Class
}