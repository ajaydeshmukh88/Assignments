package constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Logic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Resource r=new ClassPathResource("applicationContextconstruc.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
          System.out.println(1);
        
        
        Employee s=(Employee)factory.getBean("e");  
        s.show();  

		
	}

}
