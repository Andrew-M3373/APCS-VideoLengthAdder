import java.util.Scanner;
public class VideoLengthAdder {

	public static void main(String[] args) {
		
		Scanner timeInput = new Scanner(System.in);
		
		System.out.println("How many hours is video 1?");
		int hoursVideo1 = timeInput.nextInt();
		
		System.out.println("How many minutes is video 1?");
		int minutesVideo1 = timeInput.nextInt();
		
		System.out.println("How many seconds is video 1?");
		int secondsVideo1 = timeInput.nextInt();
		
		System.out.println("How many hours is video 2?");
		int hoursVideo2 = timeInput.nextInt();
		
		System.out.println("How many minutes is video 2?");
		int minutesVideo2 = timeInput.nextInt();
		
		System.out.println("How many seconds is video 2?");
		int secondsVideo2 = timeInput.nextInt();
		
		
		int seconds = secondsVideo1 + secondsVideo2;
		int minutes = minutesVideo1 + minutesVideo2;
		int hours = hoursVideo1 + hoursVideo2;
		
		if (seconds >= 60) {
			minutes ++;
			seconds = seconds % 60;
		}
		if (minutes >= 60) {
			hours ++;
			minutes = minutes % 60;
		}
		
		System.out.printf("The total length of both videos is %d:%d:%d.",hours,minutes,seconds);
		
		
	}

}
