package practice_2;

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
        assertEquals("My name is Tom, I am 21 years old",person.introduce());

    }
}


