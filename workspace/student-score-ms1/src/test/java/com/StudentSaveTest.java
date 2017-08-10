package com;

import com.core.Student;
import com.core.User;
import com.repository.StudentRepository;
import com.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

/**
 * Created by lwan on 10/08/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentSaveTest {
    @Autowired
    public StudentRepository studentRepository;

    @Test
    public void should_get_3() throws Exception {
        // 创建10条记录
        studentRepository.save(new Student("001", "w1","22@22","11111111111","33","xian"));
        studentRepository.save(new Student("002", "w1","22@22","11111111111","33","xian"));
        studentRepository.save(new Student("003", "w1","22@22","11111111111","33","xian"));


        // 测试findAll, 查询所有记录
        Assert.assertEquals(3, studentRepository.findAll().size());
    }

    @Test
    public void should_get_Message_when_search_by_id() throws Exception{
        studentRepository.save(new Student("001", "w1","22@22","11111111111","33","xian"));
        studentRepository.save(new Student("002", "w1","22@22","11111111111","33","xian"));
        studentRepository.save(new Student("003", "w1","22@22","11111111111","33","xian"));


        Student s=new Student("001", "w1","22@22","11111111111","33","xian");
        Assert.assertEquals("w1",studentRepository.findById("001").getName());

    }

}
