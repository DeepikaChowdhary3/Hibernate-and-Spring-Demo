import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringMain1 {
public static void main(String args[])
{
	Resource resource=new ClassPathResource("SpringConf1.xml");
	BeanFactory factory =new XmlBeanFactory(resource);
	com.MyBean1 object=(com.MyBean1)factory.getBean("BeanObject");
	object.display();
}
}
