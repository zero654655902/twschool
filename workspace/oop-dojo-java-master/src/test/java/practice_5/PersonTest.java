package practice_5;

import org.junit.Test;
import practice_5.Person;
import practice_5.Student;

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
    public void testWorkerIntroduce() {
        Worker worker = new Worker("Tom", 21);
        assertEquals("My name is Tom, I am 21 years old. I am a worker, I have a job.", worker.introduce());
    }
}


