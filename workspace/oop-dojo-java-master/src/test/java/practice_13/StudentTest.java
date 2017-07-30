package practice_13;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


/**
 * Created by lwan on 30/07/2017.
 */
public class StudentTest {

    @Test
    public void should_get_leader_when_assignLeader() {
        //given
        Class kclass = new Class(2);
        Student Tom = new Student("03", "Tom", 21, kclass);
        //when
        kclass.assignLeader(Tom);
        //then
        String expectString = "My name is Tom, I am 21 years old. I am a student, I am the Leader of Class 2.";
        assertEquals(expectString, Tom.introduce());
    }

    @Test
    public void should_get_not_one_when_assignLeader_not_appendMenber() {
        //when
        Class kclass = new Class(2);
        Student Tom = new Student("03", "Tom", 21, kclass);
        Class kclass1 = new Class(3);
        //when
        kclass1.assignLeader(Tom);
        //then
        String expectString = "It is not one of us.";
        assertEquals(expectString, Tom.introduce());
    }

    @Test
    public void should_get_leader_when_assignLeader_and_appendMenber() {
        //given
        Class kclass = new Class(2);
        Student Tom = new Student("03", "Tom", 21, kclass);
        Class kclass1 = new Class(3);
        //when
        kclass1.appendMember(Tom);
        kclass1.assignLeader(Tom);
        //then
        String expectString = "My name is Tom, I am 21 years old. I am a student, I am the Leader of Class 3.";
        assertEquals(expectString, Tom.introduce());
    }


}
