package practice_13;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by lwan on 30/07/2017.
 */
public class TeacherTest {
    @Test
    public void should_get_No_class() {
        //given
        List<Class> classes = new ArrayList<Class>();
        Teacher Herry = new Teacher("12", "Herry", 34, classes);
        //when then
        String expectStr = "My name is Herry, I am 34 years old. I am a teacher, I teach No Class.";
        assertEquals(expectStr, Herry.introduce());
    }

    @Test
    public void should_get_class_2_3() {
        //given
        List<Class> classes = new ArrayList<Class>();
        Class kclass1 = new Class(2);
        Class kclass2 = new Class(3);
        //when
        classes.add(kclass1);
        classes.add(kclass2);
        Teacher Herry = new Teacher("12", "Herry", 34, classes);
        //then
        String expectStr = "My name is Herry, I am 34 years old. I am a teacher, I teach Class 2, 3.";
        assertEquals(expectStr, Herry.introduce());

    }

    @Test
    public void should_get_true_when_student_in_teacher_class() {
        //given
        List<Class> classes = new ArrayList<Class>();
        Class kclass1 = new Class(2);
        Class kclass2 = new Class(3);
        //when
        classes.add(kclass1);
        classes.add(kclass2);
        Student Tom = new Student("03", "Tom", 21, kclass1);
        Teacher Herry = new Teacher("12", "Herry", 34, classes);
        //then
        assertEquals(true, Herry.isTeacheing(Tom));
    }

    @Test
    public void should_get_false_when_student_not_in_teacher_class() {
        //given
        List<Class> classes = new ArrayList<Class>();
        Class kclass1 = new Class(2);
        Class kclass2 = new Class(3);
        Class kclass3 = new Class(4);
        //when
        classes.add(kclass1);
        classes.add(kclass2);
        Student Tom = new Student("03", "Tom", 21, kclass3);
        Teacher Herry = new Teacher("12", "Herry", 34, classes);
        //then
        assertEquals(false, Herry.isTeacheing(Tom));
    }

    @Test
    public void should_notify_when_student_add_teacher_class() {
        //given
        Class kclass = new Class(2);
        Student Tom = new Student("03", "Tom", 21, kclass);
        Class kclass1 = new Class(3);
        Class kclass2 = new Class(4);
        //when
        kclass1.appendMember(Tom);
        List<Class> classes = new ArrayList<Class>();
        classes.add(kclass);
        classes.add(kclass1);
        classes.add(kclass2);
        Teacher Herry = new Teacher("12", "Herry", 34, classes);
        //then
        String expectStr = "I am Herry, I know Tom has joined Class 3.";
        assertEquals(expectStr, Herry.notifyAppendMember(Tom, kclass1));
    }


    @Test
    public void should_notify_when_student_assignleader() {
        //given
        Class kclass = new Class(2);
        Student Tom = new Student("03", "Tom", 21, kclass);
        Class kclass1 = new Class(3);
        Class kclass2 = new Class(4);
        //when
        kclass1.appendMember(Tom);
        kclass1.assignLeader(Tom);
        List<Class> classes = new ArrayList<Class>();
        classes.add(kclass);
        classes.add(kclass1);
        classes.add(kclass2);
        Teacher Herry = new Teacher("12", "Herry", 34, classes);
        //then
        String expectStr = "I am Herry, I know Tom has become Leader of Class 3.";
        assertEquals(expectStr, Herry.notifyAssignLeader(Tom, kclass1));
    }
}
