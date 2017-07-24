
package practice_11;

import org.junit.Test;


import static org.junit.Assert.assertEquals;

/**
 * Created by lwan on 24/07/2017.
 */
public class testIntroduce {
    @Test
    public void testPersonIntroduce(){
        Person person1=new Person(11,"Tom",21);
        assertEquals(person1.introduce(),"My name is Tom, I am 21 years old.");

        Person person2=new Person(12,"Tom",21);
        assertEquals(person1.isSameTo(person2),false);

    }

    @Test
    public void testStudentIntroduce(){
        Class kclass=new Class(2);
        Student student2=new Student(13,"Tom",21,kclass);
        kclass.assignLeader(student2);
        assertEquals("It is not one of us.",student2.introduce());

        Student student3=new Student(13,"Tom",21,kclass);
        kclass.appendMenber(student3);
        kclass.assignLeader(student3);
        assertEquals("My name is Tom, I am 21 years old. I am a student, I am the leader of Class 2.",student3.introduce());

    }


    @Test
    public void testTeacherIntroduce(){
        Teacher teacher1 = new Teacher(11,"Tom", 21);
        assertEquals("My name is Tom, I am 21 years old. I am a teacher, I teach No Class.", teacher1.introduce());

        Class kclass=new Class(2);
        Teacher teacher2= new Teacher(12,"Tom", 21,kclass);
        assertEquals("My name is Tom, I am 21 years old. I am a teacher, I teach Class 2.", teacher2.introduce());

    }


}




