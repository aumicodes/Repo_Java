/**
 *
 * Due: Wed (Apr 6)
 *
 * Create a method that will print timeline for given input data-points
 *
 * Timeline should be (hour am/pm) with 2 hour interval from the current time.
 *
 * generateTimeline(5)
 * Now 11pm 1am 3am 5am
 *
 * generateTimeline(2)
 * Now 11pm
 *
 * generateTimeline(8)      // running code at 4:30am
 * Now 6am 8am 10am 12pm 2pm 4pm 6pm
 *
 * generateTimeline(11)      // running code at 10:15am
 * Now 12pm 2pm 4pm 6pm 8pm 10pm 12am 2am 4am 6am
 *
 */

package src;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

    public class Homework8 {
        public static void main(String[] args) {
            timeLine1(11);
        }

        public static void timeLine1(int timeInput) {
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("ha");
            System.out.println("Now");
            for (int i = 0; i < timeInput; i++) {
                cal.add(Calendar.HOUR, 2);
                Date dtFormat = cal.getTime();
                System.out.print(" " + sdf.format(dtFormat).toLowerCase());
            }
        }


    }