import com.jacie.domain.CustomConfigInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by jacie on 11/5/16.
 *
 *
 */

//Problem：Can't get value of Bean is CustomConfigInfo
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CustomConfigInfo.class)
public class TestBeanConfigInfo {

    @Autowired
    private CustomConfigInfo customConfigInfo;

    @Test
    public void testCustomConfInfo(){
        System.out.println(customConfigInfo.getCompany());
    }
}
