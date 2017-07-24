package practice_3;

import org.junit.Test;
import practice_2.Person;
import practice_2.Student;

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
            assertEquals("My name is Tom, I am 21 years old.",person.introduce());



        }
        @Test
        public void testStudentIntroduce(){
            Student student=new Student("Tom",21,2);
            assertEquals("My name is Tom, I am 21 years old. I am a student, I am at Class 2",student.introduce());

        }
    }




