// Represents the hh:mm time format using an AM/PM format.
public class TimeFormat {
    public static void main(String[] args) {
        // In Java, the command-line arguments args[0], args[1], ... are represented
        // each by a string. In this program, the single "hh:mm" input is represented
        // by the single command-line string argument args[0].
        
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        
        String period = "AM";
        if (hours >= 12) {
            period = "PM";
            if (hours > 12) {
                hours -= 12;
            }
        } else if (hours == 0) {
            hours = 12;
        }

        String formattedHours = Integer.toString(hours);
        String formattedMinutes = Integer.toString(minutes);

        if (hours < 10) {
            formattedHours = "0" + hours;
        }
        if (minutes < 10) {
            formattedMinutes = "0" + minutes;
        }

        System.out.println(formattedHours + ":" + formattedMinutes + " " + period);
    }
}
