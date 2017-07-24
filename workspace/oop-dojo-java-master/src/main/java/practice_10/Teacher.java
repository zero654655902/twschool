package practice_10;

/**
 * Created by lwan on 24/07/2017.
 */
public class Teacher extends Person {

    private Class kclass = null;

    public Teacher(int id,String name, int age) {
        super(id,name, age);
    }

    public Teacher(int id,String name, int age, Class kclass) {
        super(id,name, age);
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

    public String introducewith(Student student1) {
        String str=super.introduce();
        str+=" I am a teacher, I teach Jerry.";
        return str;
    }
}