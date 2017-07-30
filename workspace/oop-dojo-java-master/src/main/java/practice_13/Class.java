package practice_13;

/**
 * Created by lwan on 30/07/2017.
 */
public class Class {
    private int number;
    private Student leader=null;

    public Class(int number) {
        this.number=number;
    }
    public void assignLeader(Student leader){
        if(leader.kclass.equals(this))
        this.leader=leader;
        else
            System.out.println("it is not one of us.");
    }

    public boolean isLeader(Student leader){
        return this.leader==leader;
    }

    public int getNumber() {
        return this.number;
    }

    public void appendMember(Student student){
        student.kclass=this;
    }


    public boolean isMember(Student student){
        return student.kclass==this;
    }
    public boolean isIn(Student student){
        return student.getKClass()==this;
    }
}
