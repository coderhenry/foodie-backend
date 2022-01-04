import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.foodie.backend.service.StuService;
import com.foodie.backend.service.TestTransService;

/**
 * 事务测试类
 */
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = com.foodie.backend.Application.class)
public class TransTest {

    @Autowired
    private StuService stuService;

    @Autowired
    private TestTransService testTransService;

//    @Test
    public void myTest() {
        //    stuService.testPropagationTrans();
        testTransService.testPropagationTrans();

    }

}
