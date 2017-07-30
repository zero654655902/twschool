package practice_13;

import org.junit.Test;


import static junit.framework.TestCase.assertEquals;

/**
 * Created by lwan on 30/07/2017.
 */
public class ComputerTest {
    @Test
    public void should_print_student_when_student_add_class() {
        //given
        Class kclass = new Class(2);
        Student Tom = new Student("03", "Tom", 21, kclass);
        Class kclass1 = new Class(3);
        //when
        kclass1.appendMember(Tom);
        Computer computer = new Computer("machine");
        //then
        String expectStr = "I am the machine, I know Tom has joined Class 3.";
        assertEquals(expectStr, computer.notifyAppendMember(Tom, kclass1));
    }

    @Test
    public void should_print_leader_when_student_assigin_leader() {
        //given
        Class kclass = new Class(2);
        Student Tom = new Student("03", "Tom", 21, kclass);
        Class kclass1 = new Class(3);
        //when
        kclass1.appendMember(Tom);
        kclass1.assignLeader(Tom);
        Computer computer = new Computer("machine");
        //then
        String expectStr = "I am the machine, I know Tom has become Leader of Class 3.";
        assertEquals(expectStr, computer.notifyAssignLeader(Tom, kclass1));
    }
}
