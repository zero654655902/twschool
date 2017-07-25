package practice_9;

import org.junit.Test;


import static org.junit.Assert.assertEquals;

/**
 * Created by lwan on 24/07/2017.
 */
public class testIntroduce {
    @Test
    public void testPersonIntroduce(){
        Person person1=new Person("Tom",21);
        assertEquals(person1.introduce(),"My name is Tom, I am 21 years old.");

    }




    @Test
    public void testStudentIntroduce(){
        Class kclass=new Class(2);
        Student student1=new Student("Tom",21,kclass);
        assertEquals(student1.introduce(),"My name is Tom, I am 21 years old. I am a student, I am at Class 2.");

        Student student2=new Student("Tom",21,kclass);
        kclass.assignLeader(student2);
        assertEquals(student2.introduce(),"My name is Tom, I am 21 years old. I am a student, I am the leader of Class 2.");

    }



    @Test
    public void testTeacherIntroduce(){
        Teacher teacher1 = new Teacher("Tom", 21);
        assertEquals("My name is Tom, I am 21 years old. I am a teacher, I teach No Class.", teacher1.introduce());

        Class kclass=new Class(2);
        Teacher teacher2= new Teacher("Tom", 21,kclass);
        assertEquals("My name is Tom, I am 21 years old. I am a teacher, I teach Class 2.", teacher2.introduce());

    }


}
