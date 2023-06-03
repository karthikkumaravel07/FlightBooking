package FLBook;


import java.util.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat; 
public class Booking {
	String passengerName;
	int FlightNo;
	Date date;
	
	Booking(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name of passenger: ");
		passengerName = scanner.next();
		System.out.println("Enter flight no: ");
		FlightNo = scanner.nextInt();
		System.out.println("Enter date dd-mm-yyyy");
		String dateInput = scanner.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		
		try {
			date = dateFormat.parse(dateInput);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}

	}
	
	public boolean isAvailable()  throws SQLException{
		
		FlightDAO Flightdao = new FlightDAO();
		BookingDAO bookingDao = new BookingDAO();
		int capacity = Flightdao.getCapacity(FlightNo);

		int booked = bookingDao.getBookedCount(FlightNo,date);
		
		return booked<capacity;
		
	}
}
