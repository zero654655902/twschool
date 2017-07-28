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
    Kclass kclass=new Kclass();
    ScoreManage scoreManage=new ScoreManage();
    private StudentScoreService studentScoreService = new StudentScoreService(kclass,scoreManage);

    private pringStudentMassege psm = new pringStudentMassege();
    private ScoreManage sm = new ScoreManage();
    //System.out.println(menu);


    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void app(String input) {
        if (input.matches("1")) {
            System.out.println(studentPrompt);
            String strInput=getInput();
            while (!sp.isStudentMassegeFormatCorrect(strInput)){
                System.out.println(studentWarning);
                strInput=getInput();
            }
            studentScoreService.getkclass().addStudentMessage(sp.processMassege(strInput));
            System.out.println(successNotice);
        }

        if(input.matches("2")){
            String strId=getInput();
            while (!sp.isStudentIdFormateCorrect(strId))
            {
                System.out.println(studentIdPrompt);
                strId=getInput();
            }
            List<Student> allStuden=studentScoreService.getkclass().getTotalStudent();
            allStuden=studentScoreService.getScoreManage().getIdStudent(allStuden,sp.processId(strId));
            psm.printStuMessage(allStuden);
        }

    }


}
