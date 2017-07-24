package practice_4;

/**
 * Created by lwan on 24/07/2017.
 */
public class Worker extends Person {
    private String name;

    public Worker(String name, int age) {
        super(name,age);
    }
    public String introduce(){
        return super.introduce()+" I am a worker, I have a job.";
    }

}
