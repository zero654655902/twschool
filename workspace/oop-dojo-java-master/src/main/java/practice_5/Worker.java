package practice_5;

/**
 * Created by lwan on 24/07/2017.
 */
public class Worker extends Person {
    //protected String name;
    //protected int age;

    public Worker(String name, int age) {
        super(name,age);
    }
    public String introduce(){
        String str=super.basicIntroduce();
        str+=" I am a worker, I have a job.";
        return str;
    }

}
