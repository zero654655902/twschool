package com.Command;

/**
 * Created by lwan on 12/08/2017.
 */
public class Global {
    public static final String regex = "(\\w+),([^,]+),数学:(\\d+),语文:(\\d+),英语:(\\d+),编程:(\\d+)";

    public static final String infoStart = "成绩单\n学号|姓名|邮箱|身份证|电话|城市|数学|语文|英语|编程|平均分|总分\n========================\n";
    public static final String infoStudentScore = "%s|%s|%d|%d|%d|%.2f|%d\n";
    public static final String totalScoreById="全班总平均分:%d\n";
    public static final String middleScoreById="全班总分中位数:%d\n";

    public static final String menu = "1. 添加学生 \n2. 生成成绩单 \n3. 退出\n请输入你的选择（1～3）：";
    public static final String studentPrompt = "请输入学生信息（格式：姓名, 学号，数学：分数，语文：分数，英语：分数，编程：分数），按回车提交：";
    public static final String studentWarning = "请按正确的格式输入（格式：姓名, 学号，数学：分数，语文：分数，英语：分数，编程：分数）：";
    public static final String studentIdPrompt = "请输入要打印的学生的学号（格式： 学号, 学号,...），按回车提交：";
    public static final String studentIdWarning = "请按正确的格式输入要打印的学生的学号（格式： 学号, 学号,...），按回车提交：";

    public static final String successNotice = "学生xxx的成绩被添加\n" + menu;


    public static final String MAIN_MENU_STATUS = "MAIN_MENU_STATUS";
    public static final String ADD_STUDENT_STATUS = "ADD_STUDENT_STATUS";
    public static final String ADD_STUDENT_ID_STATUS = "ADD_STUDENT_ID_STATUS";
    public static final String EXIT_APP_STATUS = "EXIT_APP_STATUS";
}
