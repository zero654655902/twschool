package core;

import core.Kclass;
import core.Report;

/**
 * Created by lwan on 27/07/2017.
 */
public class StudentScoreService {
//
    private static Kclass kclass = new Kclass();
    private Report report = new Report();


   public StudentScoreService(Kclass kclass, Report report) {
       this.kclass = kclass;
       this.report = report;
   }
   public Kclass getkclass(){
       return this.kclass;
   }
   public Report getReport(){
       return this.report;
   }

}
