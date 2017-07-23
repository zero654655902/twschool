
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
    isIn(student){
        return student._class.number===number

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
  //  isTeaching(student){
   //     return student._class.isIn()
   // }
}

/*
 再写一个Teacher类继承Person类，除了id，name，age属性，也有classes属性。也有一个introduce方法，
 introduce方法返回一个字符串形如：

 My name is Tom. I am 21 years old. I am a Teacher. I teach Class 2, 3.

 如果classes的长度为0，就会返回

 My name is Tom. I am 21 years old. I am a Teacher. I teach No Class.

 Teacher还有一个isTeaching方法，传入一个学生，返回true/false。只要学生在classes中的任一个class中，就是在教他。
 而学生是否在class中这件事情，应该是Class有一个方法isIn来判断。




*/
module.exports={
    Person,
    Student,
    Class,
    Teacher
}