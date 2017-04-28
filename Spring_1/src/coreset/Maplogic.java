package coreset;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Maplogic {

	public static void main(String[] args) {
	  
		Resource res = new ClassPathResource("applicationContext1.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		
		StudentMap sm = (StudentMap )factory.getBean("stdmap");
	
		sm.display();
	
      
	}

}
