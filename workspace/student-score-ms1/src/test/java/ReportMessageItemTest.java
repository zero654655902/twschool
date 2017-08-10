import com.core.Report.ReportMessageItem;
import com.core.Student;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lwan on 10/08/2017.
 */
public class ReportMessageItemTest {
    @Test
    public void should_get_true_when_reportMessageItem(){
        Student ZhangSan=new Student("001","zs","2@2","11","33","xian");
        ReportMessageItem rm=new ReportMessageItem(ZhangSan);
        assertEquals(true,rm.getId().equals("001"));
        assertEquals(true,rm.getName().equals("zs"));
        assertEquals(true,rm.getEmail().equals("2@2"));
        assertEquals(true,rm.getPhone().equals("11"));
        assertEquals(true,rm.getCity().equals("xian"));

    }
}
