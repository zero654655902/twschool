class Person{
    constructor(id,name,age)
    {
        this.id=id
        this.name=name
        this.age=age

    }
    introduce()
    {
        return 'My name is '+this.name+', I am '+this.age+' years old.'
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
        this.leader=student
    }
    isLeader(){
        return this.leader
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
        let str=`${super.introduce()}`
        if(this._class.isLeader())
        {
            str+=` I am a student, I am the leader of class ${this._class.number}`
            return str
        }
        else
        {
            str+=` I am a student, I am at class ${this._class.number}`
            return str
        }
    }
}

class Teacher extends Person{
    constructor(id,name,age,_class)
    {
        super(id,name,age)
        this._class=_class
    }
    introduce(){
        if(this._class==null)
            return `${super.introduce()} I am a teacher, I teach No Class.`

        else
            return `${super.introduce()} I am a teacher, I teach Class ${this._class.number}.`

    }
}


module.exports={
    Person,
    Student,
    Class,
    Teacher
}
