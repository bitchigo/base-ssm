import icu.bitchigo.service.seri;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class test {

    @Test
    public void test1() {
        ApplicationContext acc=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        seri s=(seri) acc.getBean("seri");
        System.out.println(s.ser().get(0).getName());
        System.out.println(s.ser().get(1).getName());
    }
}
