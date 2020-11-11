package lab3;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Clock {
	public static void main(String[] args) throws InterruptedException { //Did some research with threading and I found a useful util.concurrent.TimeUnit; InterruptedException is needed for the thread to wait.
		Calendar cal = Calendar.getInstance();
		Time t = new Time (cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE), cal.get(Calendar.SECOND));
		
		
		while(t.getSecond() != 00)
		{
			TimeUnit.SECONDS.sleep(1); //A method of the TimeUnit util , sleeps for one second.
			t.tick();
			System.out.println(t.toString());
		}
	}
}
