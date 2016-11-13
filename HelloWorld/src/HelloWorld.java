import java.util.*;
import javax.swing.*;

public class HelloWorld {
	
	public static void main(String[] args) {
		
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("John", 150000, 1995, 5, 15);
		staff[1] = new Employee("Peter", 60000, 1996, 5, 15);
		staff[2] = new Employee("Matt", 70000, 1997, 5, 15);
		
		Arrays.sort(staff);
		
		for (Employee e:staff) {
			System.out.println("name = " + e.getName() + ", salary = " 
									+ e.getSalary() + ", hire day = " + e.getHireDay());
		}
		
		new TalkingClock(1000, true).start();

		/* Keep program running until user click "OK" */
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
	}
	

}
