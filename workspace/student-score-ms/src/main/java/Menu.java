import java.util.Scanner;

/**
 * Created by lwan on 28/07/2017.
 */
public class Menu
{
    private final static String menu = "1. 添加学生 \n2. 生成成绩单 \n3. 退出\n请输入你的选择（1～3）：";
    private final static String studentPrompt = "请输入学生信息（格式：姓名, 学号，数学：分数，语文：分数，英语：分数，编程：分数），按回车提交：";
    private final static String studnetWarning = "请按正确的格式输入（格式：姓名, 学号，数学：分数，语文：分数，英语：分数，编程：分数）：";
    private final static String studentIdPrompt = "请输入要打印的学生的学号（格式： 学号, 学号,...），按回车提交：";
    private final static String studnetIdWarning = "请按正确的格式输入要打印的学生的学号（格式： 学号, 学号,...），按回车提交：";

    private static String successNotice = "学生xxx的成绩被添加\n" + menu;


    private final int inputCase1 = 1;
    private final int inputCase2 = 2;
    private final int inputCase3 = 3;


     private strParse sp=new strParse();
     private pringStudentMassege psm=new pringStudentMassege();
     private ScoreManage sm=new ScoreManage();








}
