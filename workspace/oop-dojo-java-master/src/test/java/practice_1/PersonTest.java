package practice_1;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static sun.nio.cs.Surrogate.is;


/**
 * Created by lwan on 24/07/2017.
 */
public class PersonTest {
    @Test public void testPersonName(){
        Person person=new Person("Tom",21);
        assertEquals("My name is Tom, I am 21 years old", person.introuce());
        person.name="Tom Wu";
        assertEquals("My name is Tom Wu, I am 21 years old",person.introuce());

    }




}
