import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.Timer;

public class TalkingClock {

	
	public TalkingClock(int interval, boolean beep)
	{
		this.interval = interval;
		this.beep = beep;
	}
	
	public void start()
	{
		ActionListener listener = new TimePrinter();
		new Timer(interval, listener).start();
	}
	
	private int interval;
	private boolean beep;
	
	private class TimePrinter implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Date now = new Date();
			System.out.println("At the tone, the time is " + now);
			Toolkit.getDefaultToolkit().beep();
			
		}
	}
	
}