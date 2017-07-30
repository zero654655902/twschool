package practice_13;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by lwan on 30/07/2017.
 */
public class PersonTest {

    @Test
    public void should_get_person_introduce() {
        //given
        Person Tom = new Person("03", "Tom", 21);
        //when then
        String expectString = "My name is Tom, I am 21 years old.";
        assertEquals(expectString, Tom.introduce());
    }

    @Test
    public void should_false_when_id_different() {
        //given
        Person Tom = new Person("03", "Tom", 21);
        Person Tom1 = new Person("04", "Tom", 21);
        //when then
        assertEquals(false, Tom.isSameTo(Tom1));
    }
}
