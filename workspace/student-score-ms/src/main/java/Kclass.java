import java.util.ArrayList;
import java.util.List;

/**
 * Created by lwan on 27/07/2017.
 */
public class Kclass {
    private List<Student> kclass = new ArrayList<Student>();


    public void setKclass(List<Student> kclass) {
        this.kclass = kclass;

    }

    public void addStudentMessage(Student stu) {
        this.kclass.add(stu);
    }

    public List<Student> getTotalStudent() {

        return this.kclass;
    }




}
