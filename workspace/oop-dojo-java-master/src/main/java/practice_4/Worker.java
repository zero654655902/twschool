package practice_4;

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
        return "My name is "+this.name+", I am "+this.age+" years old."+" I am a worker, I have a job.";
    }

}
