import java.util.List;
import java.util.Scanner;

/**
 * Created by lwan on 28/07/2017.
 */
public class Menu {

    private strParse sp = new strParse();
    Kclass kclass = new Kclass();
    ScoreManage scoreManage = new ScoreManage();
    private StudentScoreService studentScoreService = new StudentScoreService(kclass, scoreManage);

    private ScoreManage sm = new ScoreManage();



    private String status = Constants.MAIN_MENU_STATUS;

    public String getStatus() {
        return this.status;
    }


    private void changeStatus(String statusCommand) {
        if (statusCommand.equals("1")) {
            this.status = Constants.ADD_STUDENT_STATUS;
        } else if (statusCommand.equals("2")) {
            this.status = Constants.ADD_STUDENT_ID_STATUS;
        } else if (statusCommand.equals("3")) {
            this.status = Constants.EXIT_APP_STATUS;
        }
    }


    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void menu_status(){

        System.out.println(Constants.menu);
       String input=getInput();
        if(input.matches("[1|2|3]"))
            changeStatus(input);
    }
//yiyi,111,数学:78,语文:89,英语:77,编程:99
    //erer,112,数学:78,语文:79,英语:77,编程:89
    //san,113,数学:77,语文:89,英语:77,编程:79
    public void add_student_status(){

        System.out.println(Constants.studentPrompt);
        String strInput = getInput();
        while ( !sp.isStudentMassegeFormatCorrect(strInput)) {
            System.out.println(Constants.studentWarning);
            strInput = getInput();
        }
        Student student = sp.processMassege(strInput);
        studentScoreService.getkclass().addStudentMessage(student);
        System.out.println(Constants.successNotice);
        strInput = getInput();
        if(strInput.matches("[1|2|3]"))
            changeStatus(strInput);
    }

    public void add_id_status(){

        System.out.println(Constants.studentIdPrompt);
//        String strInput = getInput();
        String strInput = getInput();
        while (!sp.isStudentIdFormateCorrect(strInput)) {
            System.out.println(Constants.studentIdWarning);
            strInput = getInput();
        }

        Kclass kclass = studentScoreService.getkclass();
        List<Student> students = kclass.getTotalStudent();
        String[] ids = sp.processId(strInput);
        students=studentScoreService.getkclass().getStudentById(ids);
        int middleScore=studentScoreService.getkclass().getStudentTotalScore(students);
        int totalScore=studentScoreService.getkclass().getStudentTotalScore(students);
        String result=studentScoreService.getScoreManage().getScoreMassege(students,middleScore,totalScore);
System.out.println(result);
    }

    public void appInterface() {

        while (!this.status.equals(Constants.EXIT_APP_STATUS)) {

            if (this.status.equals(Constants.MAIN_MENU_STATUS)) {
               menu_status();
            }
            if (this.status.equals(Constants.ADD_STUDENT_STATUS)) {
                add_student_status();

            }
            if (this.status.equals(Constants.ADD_STUDENT_ID_STATUS)) {
                add_id_status();
            }
        }

        System.exit(0);
    }

    public static void main(String[] args){
        Menu menu=new Menu();
        menu.appInterface();
    }
}


