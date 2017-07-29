import java.util.List;
import java.util.Scanner;

/**
 * Created by lwan on 28/07/2017.
 */
public class Menu {
    private final static String menu = "1. 添加学生 \n2. 生成成绩单 \n3. 退出\n请输入你的选择（1～3）：";
    private final static String studentPrompt = "请输入学生信息（格式：姓名, 学号，数学：分数，语文：分数，英语：分数，编程：分数），按回车提交：";
    private final static String studentWarning = "请按正确的格式输入（格式：姓名, 学号，数学：分数，语文：分数，英语：分数，编程：分数）：";
    private final static String studentIdPrompt = "请输入要打印的学生的学号（格式： 学号, 学号,...），按回车提交：";
    private final static String studentIdWarning = "请按正确的格式输入要打印的学生的学号（格式： 学号, 学号,...），按回车提交：";

    private static String successNotice = "学生xxx的成绩被添加\n" + menu;


    private strParse sp = new strParse();
    Kclass kclass = new Kclass();
    ScoreManage scoreManage = new ScoreManage();
    private StudentScoreService studentScoreService = new StudentScoreService(kclass, scoreManage);

    private pringStudentMassege psm = new pringStudentMassege();
    private ScoreManage sm = new ScoreManage();


    private static final String MAIN_MENU_STATUS = "MAIN_MENU_STATUS";
    private static final String ADD_STUDENT_STATUS = "ADD_STUDENT_STATUS";
    private static final String ADD_STUDENT_ID_STATUS = "ADD_STUDENT_ID_STATUS";
    private static final String EXIT_APP_STATUS = "EXIT_APP_STATUS";


    private String status = MAIN_MENU_STATUS;

    public String getStatus() {
        return this.status;
    }


    private void changeStatus(String statusCommand) {
        if (statusCommand.equals("1")) {
            this.status = ADD_STUDENT_STATUS;
        } else if (statusCommand.equals("2")) {
            this.status = ADD_STUDENT_ID_STATUS;
        } else if (statusCommand.equals("3")) {
            this.status = EXIT_APP_STATUS;
        }
    }


    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }


    public void appInterface() {
        String strInput = "";
        while (!this.status.equals(EXIT_APP_STATUS)) {
            if (this.status.equals(MAIN_MENU_STATUS)) {
                System.out.println(menu);
                strInput = getInput();
                if(strInput.matches("[1|2|3]"))
                    changeStatus(strInput);
            }
            if (this.status.equals(ADD_STUDENT_STATUS)) {
                System.out.println(studentPrompt);
                strInput = getInput();
                while ( !sp.isStudentMassegeFormatCorrect(strInput)) {
                    System.out.println(studentWarning);
                    strInput = getInput();
                }
                Student student = sp.processMassege(strInput);
                studentScoreService.getkclass().addStudentMessage(student);
                System.out.println(successNotice);
                strInput = getInput();
                if(strInput.matches("[1|2|3]"))
                    changeStatus(strInput);
            }
            if (this.status.equals(ADD_STUDENT_ID_STATUS)) {
                System.out.println(studentIdPrompt);
                strInput = getInput();
                while (!sp.isStudentIdFormateCorrect(strInput)) {
                    System.out.println(studentIdWarning);
                    strInput = getInput();
                }
                Kclass kclass = studentScoreService.getkclass();
                List<Student> students = kclass.getTotalStudent();
                String[] ids = sp.processId(strInput);
                students=studentScoreService.getScoreManage().getIdStudent(students, ids);
                String result=psm.printStuMessage(students);
                System.out.println(result);
            }
        }

        System.exit(0);
    }

    public static void main(String[] args){
        Menu menu=new Menu();
        menu.appInterface();
    }
}


