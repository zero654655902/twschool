package practice_7;

import org.junit.Test;
import practice_7.Person;
import practice_7.Student;

import static org.junit.Assert.assertEquals;

/**
 * Created by lwan on 24/07/2017.
 */


import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lwan on 24/07/2017.
 */
public class PersonTest {
    @Test
    public void testIntroduce() {
        Person person = new Person("Tom", 21);
        //assertEqauls("My name is Tom, I am 21 years old", person.introduce());
        assertEquals("My name is Tom, I am 21 years old.", person.introduce());


    }

    @Test
    public void testStudentIntroduce() {
        Student student = new Student("Tom", 21, 2);
        assertEquals("My name is Tom, I am 21 years old. I am a student, I am at Class 2", student.introduce());

    }

    @Test
    public void testTeacherIntroduce() {
         Teacher teacher = new Teacher("Tom", 21,2);
        assertEquals("My name is Tom, I am 21 years old. I am a teacher, I teach Class 2.", teacher.introduce());

        Teacher teacher1 = new Teacher("Tom", 21);
        assertEquals("My name is Tom, I am 21 years old. I am a teacher, I teach No Class.", teacher1.introduce());



    }
}


