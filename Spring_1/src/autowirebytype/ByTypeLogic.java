package autowirebytype;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import autowirebyname.Address;

public class ByTypeLogic {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
				 Resource resource=new ClassPathResource("applicationContextByType.xml");  
				 BeanFactory factory = new XmlBeanFactory(resource); 
				 Department dt = (Department)factory.getBean("id1");
				
				 dt.show();


	}

}
