import java.util.ArrayList;
import java.util.List;

/**
 * Created by lwan on 27/07/2017.
 */
public class ScoreManage {

    public List<Student> getIdStudent(List<Student> kclass,int[] id){
        List<Student> idStudent=new ArrayList<Student>();
        for(int i=0;i<kclass.size();++i){
            for(int j=0;j<id.length;++j)
            {
                if(kclass.get(i).getId()==id[j])
                {
                    idStudent.add(kclass.get(i));
                    break;
                }

            }
        }
        return idStudent;
    }




}
