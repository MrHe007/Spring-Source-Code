import com.bigguy.code.bean.UserService;
import com.bigguy.code.component.Example;
import com.bigguy.code.component.UserFactoryBean;
import com.bigguy.code.config.AppConfig;
import com.bigguy.code.entity.User;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author bigguy_hc
 * @create 2020-02-02 11:06
 * @description：
 */
public class MainTest {

    @Test
    public void testFactoryBeanByBeanName(){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        String userBeanName = "userFactoryBean";
        User user = context.getBean(userBeanName, User.class);

        // 这个获取会报错，因为通过 “userFactoryBean” 获取的 User 对象，强制转换会报错
//        UserFactoryBean userFactoryBean1 = context.getBean(userBeanName, UserFactoryBean.class);

        String factoryBeanName = "&userFactoryBean";
        UserFactoryBean userFactoryBean = context.getBean(factoryBeanName, UserFactoryBean.class);
    }

    @Test
    public void testFactoryBean(){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        UserFactoryBean userFactoryBean = context.getBean(UserFactoryBean.class);

        // 调用 FactoryBean 的获取实例方法
        User user = userFactoryBean.getObject();

        // 两次获取的 实例不是相同的
        System.out.println(userFactoryBean.getObject());
        System.out.println(userFactoryBean.getObject());

    }

    @Test
    public void testBeanFactoryPostProcessor(){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Example example = context.getBean(Example.class);

        System.out.println(example);

    }


    @Test
    public void testSpringInit(){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean(UserService.class);

        userService.queryList();
    }

}
