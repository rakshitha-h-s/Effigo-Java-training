package java_programs;

import java.text.ParseException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTimestamp_assignment1 {
	public static void main(String[] args) throws ParseException {
		System.out.println(
				"Enter the choice 1.convert string input-->Local timestamp-->Unix timestamp\n 2.convert string input-->Local timestamp-->UTC \n 3.convert string input-->UTC timestamp-->Local timestamp ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		Scanner s = new Scanner(System.in);
		String inp = s.nextLine();
		switch (choice) {
		case 1:
			System.out.println("Enter the date and time in this format(dd-MM-yyyy HH:mm:ss");
			LocalDateTime date = localTimeStamp(inp);
			System.out.println("local timestamp-->" + date);
			long epoch = new java.text.SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse(inp).getTime() / 1000;
			System.out.println(epoch);
		case 2:
			LocalDateTime date1 = localTimeStamp(inp);
			String utctimestamp = utcTimeStamp(date1);
			System.out.println("The UTC timestamp is" + utctimestamp);
		case 3:
			long epoch1 = new java.text.SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse(inp).getTime() / 1000;
			Instant instant = Instant.ofEpochSecond(epoch1);
			LocalDateTime utcTimestamp = LocalDateTime.ofInstant(instant, ZoneOffset.UTC);
			System.out.println("UTC Timestamp: " + epoch1);
			System.out.println("Local Timestamp (Formatted): " + utcTimestamp);

		}

	}

	public static LocalDateTime localTimeStamp(String in) {
		LocalDateTime date = LocalDateTime.parse(in, DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
		return date;
	}

	public static String utcTimeStamp(LocalDateTime date) {
		ZoneId localzoneid = ZoneId.systemDefault();
		ZonedDateTime ldtwz = ZonedDateTime.of(date, localzoneid);
		ZonedDateTime utcdatetime = ldtwz.withZoneSameInstant(ZoneId.of("UTC"));
		DateTimeFormatter formtter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formatted = utcdatetime.format(formtter);
		return formatted;
	}
}
