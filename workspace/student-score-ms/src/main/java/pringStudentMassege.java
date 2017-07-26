import java.util.ArrayList;

import static java.lang.Integer.*;

/**
 * Created by lwan on 26/07/2017.
 */
public class pringStudentMassege {

    public void printStudentMassege(String input){
        if(input.equals("1")){


        }

    }


    public Student processMassege(String input) {
        String regex=",";
        String regex2=":";
        String[] messages=input.split(regex);
        for(int i=2;i<messages.length;++i){
            String[] tmpMessage=messages[i].split(regex2);
            messages[i]=tmpMessage[1];
        }
        Student ZhangSan=new Student(messages[0], parseInt(messages[1]),parseInt(messages[2]),
                parseInt(messages[3]),parseInt(messages[4]),parseInt(messages[5]));
        return  ZhangSan;

    }

    public boolean isStudentMassegeFormatCorrect(String studentMessage){
        //String regex1="";
       if(studentMessage.contains("数学:")&&studentMessage.contains("语文:")&& studentMessage.contains("英语:")&&studentMessage.contains("编程:"))
       {
           String regex=",";
           String regex2=":";
           String[] messages=studentMessage.split(regex);
           if(messages.length<6)
               return false;
           else
           {for(int i=2;i<messages.length;++i){
               String[] tmpMessage=messages[i].split(regex2);
               if(tmpMessage.length<2)
                   return false;
               messages[i]=tmpMessage[1];
               if(parseInt(messages[i])<0||parseInt(messages[i])>100){
                   return  false;
               }
           }

       }
       return true;
       }
            return  false;
   }

    public void addStudentMassege(ArrayList<Student> _class,String input){
        if(isStudentMassegeFormatCorrect(input)){
            Student ZhangSan=processMassege(input);
            _class.add(ZhangSan);
        }
    }

    public String[] processStudentId(String input) {
        String regex=",";
        String[] ids=input.split(regex);
        return ids;
}


//public ArrayList<Student> savePrintStudentMessage(ArrayList<Student> stu,String[] ids){
//    for(int i=0;i<stu.size();++i)
//    {
//        for(int j=0;j<ids.length;++j){
//            //if(stu[i].)
//
//        }
//    }
//
//
//
//}



}
