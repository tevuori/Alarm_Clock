import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class main {
    public static void main(String[] args) throws InterruptedException {

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
            File alarmsound = new File("resources/alarm.WAV");


            try{
                Clip clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(alarmsound));
                clip.start();
            } catch (Exception e){
                e.printStackTrace();
            }
            TimeUnit.SECONDS.sleep(2);
        }
    }
}
