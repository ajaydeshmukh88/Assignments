package autowirebyname;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class ByNameLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Resource resource=new ClassPathResource("applicationContextAuto1.xml");  
		 BeanFactory factory = new XmlBeanFactory(resource); 
		 Address ad = (Address )factory.getBean("id1");
		
		 ad.display();

	}

}
