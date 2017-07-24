package practice_2;

/**
 * Created by lwan on 24/07/2017.
 */
public class Student extends Person {
    private String name;
    private int age;
    private int klass;

    public Student(String name, int age, int klass) {
        super(name,age);
        this.klass = klass;
    }
    public String introduce(){
        String str=super.introduce();
        str+=" I am a student, I am at Class "+this.klass;
        return str;
    }



}
