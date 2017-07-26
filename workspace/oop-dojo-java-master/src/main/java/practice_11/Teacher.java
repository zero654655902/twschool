package practice_11;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by lwan on 24/07/2017.
 */
public class Teacher extends Person {

    private ArrayList<Class> classList;

    public Teacher(int id,String name, int age) {
        super(id,name, age);
    }

    public Teacher(int id,String name, int age, ArrayList<Class> classList) {
        super(id,name, age);
        this.classList=classList;
    }

    @Override
    public String introduce() {
        String str = super.introduce();

        if (this.classList == null) {
            str += " I am a teacher, I teach No Class.";
        } else
        {
            str += " I am a teacher, I teach Class ";
            for(int i=0;i<classList.size()-1;++i)
                str+=classList.get(i).getNumber()+", ";

            str+=classList.get(classList.size()-1).getNumber()+". ";
        }

        //str+=".";

        return str;
    }


}