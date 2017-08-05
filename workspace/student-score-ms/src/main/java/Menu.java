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

//    private pringStudentMassege psm = new pringStudentMassege();
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


    public void appInterface() {
        String strInput = "";
        while (!this.status.equals(Constants.EXIT_APP_STATUS)) {
            if (this.status.equals(Constants.MAIN_MENU_STATUS)) {
                System.out.println(Constants.menu);
                strInput = getInput();
                if(strInput.matches("[1|2|3]"))
                    changeStatus(strInput);
            }
            if (this.status.equals(Constants.ADD_STUDENT_STATUS)) {
                System.out.println(Constants.studentPrompt);
                strInput = getInput();
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
            if (this.status.equals(Constants.ADD_STUDENT_ID_STATUS)) {
                System.out.println(Constants.studentIdPrompt);
                strInput = getInput();
                while (!sp.isStudentIdFormateCorrect(strInput)) {
                    System.out.println(Constants.studentIdWarning);
                    strInput = getInput();
                }
                Kclass kclass = studentScoreService.getkclass();
                List<Student> students = kclass.getTotalStudent();
                String[] ids = sp.processId(strInput);
//                students=studentScoreService.getScoreManage().getIdStudent(students, ids);
//                String result=psm.printStuMessage(students);
//                int totalScore=studentScoreService.getScoreManage().calculateTotal(students);
//                int middleScore=studentScoreService.getScoreManage().calculateMiddleScore(students);
//                System.out.println(result);
//                System.out.println("全班总分平均分"+totalScore);
//                System.out.println("全部总分中位数"+middleScore);

            }
        }

        System.exit(0);
    }

    public static void main(String[] args){
        Menu menu=new Menu();
        menu.appInterface();
    }
}


