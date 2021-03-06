import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.Date;
import javax.swing.*;
import javax.swing.Timer;

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
	
		// Either this test, 
		new TalkingClock(5000, true).start();

		// Or this test, concurrently!
		TickingClock clock = new TickingClock();
		clock.kickStart(1000, true);
		
		/* Keep program running until user click "OK" */
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
	}

}

class TickingClock {

	public void kickStart (int interval, final boolean beep)
	{
		ActionListener listener = new 
				ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (beep) {
					Date now = new Date();
					System.out.println("Ticking Clock time now is " + now);
				}
			}
		};
		
		Timer t = new Timer(interval, listener);
		t.start();
		
	}

}