/**
 * Created by lwan on 27/07/2017.
 */
public class StudentScoreService {
//
    private static Kclass kclass = new Kclass();
    private ScoreManage scoreManage = new ScoreManage();


   public StudentScoreService(Kclass kclass, ScoreManage scoreManage) {
       this.kclass = kclass;
       this.scoreManage = scoreManage;
   }
   public Kclass getkclass(){
       return this.kclass;
   }
   public ScoreManage getScoreManage(){
       return this.scoreManage;
   }

}
