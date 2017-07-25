package practice_9;

/**
 * Created by lwan on 24/07/2017.
 */
public class Teacher extends Person {

    private Class kclass = null;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, Class kclass) {
        super(name, age);
        this.kclass = kclass;
    }

    @Override
    public String introduce() {
        String str = super.introduce();
        if (this.kclass == null) {
            str += " I am a teacher, I teach No Class.";
        } else
            str += " I am a teacher, I teach Class " + this.kclass.getNumber() + ".";

        return str;
    }

}