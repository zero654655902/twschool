package com.menu;

import com.core.Report.Report;
import com.core.Student;
import com.service.StudentScoreService;

import java.util.List;
import java.util.Scanner;

/**
 * Created by lwan on 28/07/2017.
 */
public class Menu {
    StudentScoreService studentScoreService=new StudentScoreService();

    private strParse sp = new strParse();
//    Report.Kclass kclass = new Report.Kclass();
//    Report report = new Report();
//    private StudentScoreService studentScoreService = new StudentScoreService(kclass, report);

//    private Report sm = new Report();


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

    public void input_matches(String input)
    {
        if (input.matches("[1|2|3]"))
            changeStatus(input);
    }
    public void menu_status() {

        System.out.println(Constants.menu);
        String input = getInput();
        input_matches(input);
    }

    //yiyi,111,数学:78,语文:89,英语:77,编程:99
    //erer,112,数学:78,语文:79,英语:77,编程:89
    //san,113,数学:77,语文:89,英语:77,编程:79
    public void add_student_status() {

        System.out.println(Constants.studentPrompt);
        String strInput = getInput();
        while (!sp.isStudentMassegeFormatCorrect(strInput)) {
            System.out.println(Constants.studentWarning);
            strInput = getInput();
        }
        Student student = sp.processMassege(strInput);
        studentScoreService.addStudentMessage(student);
        System.out.println(Constants.successNotice);
        strInput = getInput();
        input_matches(strInput);
    }

    public void add_id_status() {

        System.out.println(Constants.studentIdPrompt);
//        String strInput = getInput();
        String strInput = getInput();
        while (!sp.isStudentIdFormateCorrect(strInput)) {
            System.out.println(Constants.studentIdWarning);
            strInput = getInput();
        }
        String result=get_student_transcript(strInput);

        System.out.println(result);
    }


    public String get_student_transcript(String strInput){
//        Report.Kclass kclass = studentScoreService.getkclass();
//        Report report =studentScoreService.reportAllStudentMassege();
//
////        Report report = studentScoreService.getReport().getScoreMassege(students, middleScore, totalScore);
//        return report.getScoreMassege();
        return "";
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
//
//    public static void main(String[] args) {
////        Menu com.menu = new Menu();
////        com.menu.appInterface();
//    }
}


