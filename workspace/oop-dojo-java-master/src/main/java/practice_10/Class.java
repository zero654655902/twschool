package practice_10;

/**
 * Created by lwan on 24/07/2017.
 */
public class Class {
    private int number=-1;
    private Student leader=null;
    private Student menber=null;

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
        if(isMember(student))
            return this.leader==student;
        else
            return false;
    }

    public void appendMenber(Student student) {
           this.menber=student;
    }
    boolean isMember(Student student){
        return this.menber==student;
        //return true;
    }
}
