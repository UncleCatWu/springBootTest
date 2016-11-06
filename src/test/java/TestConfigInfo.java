import com.Application;
import com.jacie.domain.CustomConfigInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by jacie on 11/4/16.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestConfigInfo.class)
public class TestConfigInfo {

    @Value("${test.msg}")
    private String msg;

    @Test
    public void testMsg(){
        System.out.println(msg);
    }

    @Autowired
    private Environment environment;

    @Test
    public void testEnv(){
        System.out.println(environment.getProperty("test.msg"));
    }

}
