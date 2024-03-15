import java.util.Scanner;
        
public class Motorphworkhour {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter clock in time(HH:MM):");
        String clockInTime = scanner.nextLine();
        
        System.out.print("Enter clock out time(HH:MM):");
        String clockOutTime = scanner.nextLine();
        
        int hoursIn = Integer.parseInt(clockInTime.substring(0,2));
        int minutesIn = Integer.parseInt(clockInTime.substring(3,5));
        
        int hoursOut = Integer.parseInt(clockOutTime.substring(0,2));
        int minutesOut = Integer.parseInt(clockOutTime.substring(3,5));
        
        int totalMinutes = (hoursOut * 60 + minutesOut)- (hoursIn * 60+ minutesIn);
        
        int workHours = totalMinutes / 60;
        int remainingMinutes = totalMinutes % 60;
        
        System.out.println("Total work hours rendered today:" + workHours + "hours and" + remainingMinutes + "minutes");
    }
}
