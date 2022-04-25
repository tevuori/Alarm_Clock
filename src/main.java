import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        System.out.println("When will the alarm hit? (Hours:Minutes)");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        String[] inputsplitted = input.split(":");
        int hours = Integer.parseInt(inputsplitted[0]);
        int minutes = Integer.parseInt(inputsplitted[1]);
        Boolean alarm = false;
        while (alarm==false){
            LocalDateTime timeanddate = LocalDateTime.now();
            if(timeanddate.getHour() == hours && timeanddate.getMinute() == minutes){
                alarm = true;
            }
        }
        if(alarm = true){
            System.out.println("RINGING!");
        }
    }
}
