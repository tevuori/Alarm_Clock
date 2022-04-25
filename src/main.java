import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        LocalDateTime timeanddate = LocalDateTime.now();
        System.out.println("When will the alarm hit? (Hours:Minutes)");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        String[] inputsplitted = input.split(":");
        String hours = inputsplitted[0];
        String minutes = inputsplitted[1];

    }
}
