package practice_9;

/**
 * Created by lwan on 24/07/2017.
 */
public class Class {
    private int number=-1;
    private Student leader=null;

    public Class(int number) {
        this.number=number;
    }
    public int getNumber() {
        return number;
    }

    public void assignLeader(Student student) {
        this.leader=student;
    }
    boolean isLeader(Student student){
        return this.leader==student;
    }
}
