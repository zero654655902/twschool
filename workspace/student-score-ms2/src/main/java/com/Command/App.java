package com.Command;

import com.core.Student;
import com.core.StudentScore;
import com.service.StudentScoreService;

import java.util.Scanner;

/**
 * Created by lwan on 12/08/2017.
 */
public class App {

    private inputStrParse sp = new inputStrParse();
    StudentScoreService studentScoreService=new StudentScoreService();


    private String status = Global.MAIN_MENU_STATUS;

    public String getStatus() {
        return this.status;
    }


    private void changeStatus(String statusCommand) {
        if (statusCommand.equals("1")) {
            this.status = Global.ADD_STUDENT_STATUS;
        } else if (statusCommand.equals("2")) {
            this.status = Global.ADD_STUDENT_ID_STATUS;
        } else if (statusCommand.equals("3")) {
            this.status = Global.EXIT_APP_STATUS;
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

        System.out.println(Global.menu);
        String input = getInput();
        input_matches(input);
    }

    public void add_student_status() {

        System.out.println(Global.studentPrompt);
        String strInput = getInput();
        while (!sp.isStudentMassegeFormatCorrect(strInput)) {
            System.out.println(Global.studentWarning);
            strInput = getInput();
        }
        StudentScore studentScore = sp.processMassege(strInput);
        studentScoreService.reportStudentScore(studentScore);
        System.out.println(Global.successNotice);
        strInput = getInput();
        input_matches(strInput);
    }

    public void add_id_status() {

        System.out.println(Global.studentIdPrompt);
//        String strInput = getInput();
        String strInput = getInput();
        while (!sp.isStudentIdFormateCorrect(strInput)) {
            System.out.println(Global.studentIdWarning);
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

        while (!this.status.equals(Global.EXIT_APP_STATUS)) {

            if (this.status.equals(Global.MAIN_MENU_STATUS)) {
                menu_status();
            }
            if (this.status.equals(Global.ADD_STUDENT_STATUS)) {
                add_student_status();

            }
            if (this.status.equals(Global.ADD_STUDENT_ID_STATUS)) {
                add_id_status();
            }
        }

        System.exit(0);
    }
}
