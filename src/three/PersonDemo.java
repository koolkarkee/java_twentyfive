package three;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

public class PersonDemo {
	
	public static void showIntrospection() {
	 try {
            // Get BeanInfo for the Person class
            BeanInfo beanInfo = Introspector.getBeanInfo(Person.class);

            System.out.println("Properties of Person bean:");
            for (PropertyDescriptor pd : beanInfo.getPropertyDescriptors()) {
                System.out.println("Property: " + pd.getName());
                System.out.println("  Type: " + pd.getPropertyType());
                System.out.println("  Read Method: " + pd.getReadMethod());
                System.out.println("  Write Method: " + pd.getWriteMethod());
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

	public static void main(String[] args) {
		Person p = new Person();
//		System.out.println(p.getAge());
//		System.out.println(p.getName());
//		
//		p.setAge(20);
//		p.setName("Bibek");
//		
//		System.out.println(p.getAge());
//		System.out.println(p.getName());
		
		//introspection
		showIntrospection();
	}

}
