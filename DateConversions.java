package java_programs;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateConversions {
	public static void main(String[] args) throws ParseException {
		Scanner s = new Scanner(System.in);
		String in = s.nextLine();
		LocalDateTime date = LocalDateTime.parse(in, DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
		long epoch = new java.text.SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse(in).getTime() / 1000;
		System.out.println("The unix timestamp is" + date);
		System.out.println(epoch);
		ZoneId localzoneid = ZoneId.systemDefault();
		ZonedDateTime ldtwz = ZonedDateTime.of(date, localzoneid);
		ZonedDateTime utcdatetime = ldtwz.withZoneSameInstant(ZoneId.of("UTC"));
		DateTimeFormatter formtter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formatted = utcdatetime.format(formtter);
		System.out.println("The UTC timestamp is" + formatted);
	}
}
