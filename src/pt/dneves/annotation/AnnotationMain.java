package pt.dneves.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationMain {

	public static void main(String[] args) throws Exception {
		
		Method m = RuleTest.class.getMethod("test_one_success");  
		  
		Annotation[] annotations = m.getAnnotations();

		for (Annotation annotation : annotations) {
			
			if(annotation instanceof Rule) {
				System.out.println("id is: " + ((Rule) annotation).id());  
				System.out.println("author is: " + ((Rule) annotation).author());  
			}
			
		}
		
	}
	
}
