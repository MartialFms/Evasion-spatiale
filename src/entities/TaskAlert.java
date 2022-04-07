package entities;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class TaskAlert extends TimerTask{
	
		private Timer timer = new Timer();
	
        @Override
        public void run() {
            int delay = (5 + new Random().nextInt(5)) * 1000;
			timer.schedule(new TaskAlert(), delay);
            AlertWindow window = new AlertWindow();
            window.displayAlertWindow();
        }

    }
