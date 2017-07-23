
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
        if(this.student===student)
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
    isIn(student){
        return student._class.number===this.number

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
            return `${super.introduce()} I am a student, I am the leader of Class ${this._class.number}.`

        }
        else
            return `${super.introduce()} I am a student, I am at Class ${this._class.number}.`

    }
}

class Teacher extends Person{
    constructor(id,name,age,classes)
    {
        super(id,name,age)
        this.classes=classes
    }
    introduce(){
        if(this.classes==null)
            return `${super.introduce()} I am a teacher, I teach No Class.`

        else
        {
            let str=`${super.introduce()} I am a teacher, I teach Class`

            for(let i=0;i<this.classes.length-1;++i)

                str+=` ${this.classes[i].number},`

            str+=` ${this.classes[this.classes.length-1].number}.`
            return str
        }

    }
    isTeaching(student){
        for(let i=0;i<this.classes.length;++i){
            if(this.classes[i].isIn(student))
                return true
        }
        return false
    }
    printStudendtMassege()
    {
        let str=`I am Tom, I know`
        for(let i=0;i<this.classes.length;++i)
        {
            if(typeof (this.classes[i].student)!=='undefined')
            {
                str+=` ${this.classes[i].student.name} has joined Class ${this.classes[i].number}.`
            }
        }
        return str
    }
    printLeadertMassege()
    {
        let str=`I am Tom, I know`
        for(let i=0;i<this.classes.length;++i)
        {
            if(typeof (this.classes[i].student)!=='undefined'&& typeof (this.classes[i].leader)!=='undefined')
            {
                str+=` ${this.classes[i].student.name} become Leader of Class ${this.classes[i].number}.`
            }
        }
        return str
    }

}




/*
 学生加入Teacher教的班级的时候，Teacher会打印一个句话,形如：

 I am Tom. I know Jerry has joined Class 2.

 当学生成为Teacher教的班级的班长的时候，Teacher会打印一个句话,形如：

 I am Tom. I know Jerry become Leader of Class 2.

 */
module.exports={
    Person,
    Student,
    Class,
    Teacher
}