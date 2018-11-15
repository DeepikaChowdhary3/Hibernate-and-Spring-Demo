import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringImpl2 {
public static void main(String args[])
{
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	context.scan("com");
	context.refresh();
	com.Student2 student2=(com.Student2)context.getBean("student");
	student2.setRollno("s1001");
	student2.setName("Deep");
	student2.setPercentage(87.8);
	System.out.println("RollNo: "+student2.getRollno());
	System.out.println("Name: "+student2.getName());
	System.out.println("Percentage: "+student2.getPercentage());
	
}
}
