package practice_7;

/**
 * Created by lwan on 24/07/2017.
 */
public class Teacher extends Person {
    private Integer kclass;

    public Teacher(String name, int age, int kclass) {
        super(name,age);
        this.kclass=kclass;
    }

    public Teacher(String name, int age) {
        super(name,age);
    }

    public String introduce(){
        String str=super.introduce();
        if(this.kclass==null)
            str+=" I am a teacher, I teach No Class.";
       else
            str+=" I am a teacher, I teach Class "+this.kclass+".";
            return  str;
    }
}
