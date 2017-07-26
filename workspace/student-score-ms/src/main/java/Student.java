/**
 * Created by lwan on 26/07/2017.
 */
public class Student {
    private final int math;
    private final int chinese;
    private final int english;
    private final int coding;
    private final String name;
    private final int id;
    private double average=0;
    private int totalScore=0;



    public Student(String name, int id, int math, int chinese , int english, int coding) {
        this.name=name;
        this.id=id;
        this.math=math;
        this.chinese=chinese;
        this.english=english;
        this.coding=coding;

    }

    public void calculateScore()
    {
        this.totalScore=this.chinese+this.math+this.coding+this.english;
        this.average=(this.chinese+this.math+this.coding+this.english)/4.0;

    }

    public Student(String name, int id, int math, int chinese , int english, int coding, double average, int totalScore) {
        this.name=name;
        this.id=id;
        this.math=math;
        this.chinese=chinese;
        this.english=english;
        this.coding=coding;
        this.average=average;
        this.totalScore=totalScore;

    }
    public int getMath() {
        return this.math;
    }

    public int getChinese() {
        return this.chinese;
    }

    public int getEnglish() {
        return this.english;
    }

    public int getCoding() {
        return this.coding;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public double getAverage() {
        return this.average;
    }

    public int getTotalScore() {
        return this.totalScore;
    }
}
