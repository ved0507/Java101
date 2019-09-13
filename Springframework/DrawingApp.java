package org.darth.vedar;
//import xml bean factory
import org.springframework.beans.factory.BeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  

import org.springframework.beans.factory.xml.XmlBeanFactory;
public class DrawingApp{
	public static void main(String args[]){
	
		//Trinagle triangle=new Triangle();
		ApplicationContext context = new ClassPathXmlApplicationContext("springxml.xml");
		//BeanFactory factory =new XmlBeanFactory(new FileSystemResource("springxml.xml"));
		Triangle triangle=(Triangle) context.getBean("triangle");
			
		triangle.draw();
	}
	
}