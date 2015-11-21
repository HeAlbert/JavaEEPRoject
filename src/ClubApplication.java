
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

// this main method
public class ClubApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person1 = new Person("Tan", "Ah", "Beng");
		person1.Show();
		Person person2 = new Person("Stan","Laurel");
		person2.Show();
		Person person3 = new Member("Albert","Ho",1000);
		person3.Show();
		
		Facility f1 = new Facility("Table");
		f1.Show();
		Facility f2 = new Facility("Basketball","Good Luck, Have Fun");
		f2.Show();
		
		Club c1 = new Club();
		c1.addMember("Good", "Man");
		c1.addMember("Albert", "Ho");
		c1.addMember("Chen", "Di");
		c1.showMembers();
		c1.removeMember(1);
		c1.showMembers();
		c1.addMember("Bad", "This");
		c1.showMembers();
		c1.addFacility("Table","I like it");
		c1.addFacility("Basketball","Good Luck, Have Fun");
		c1.showFacilities();
		c1.getFacility("Table").Show();
		/*c1.removeFacility("Table");*/
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
	/*	try {
			Book b1 = new Book(c1.getMember(3),c1.getFacility("Table"),sdf.parse("21/11/2012"),sdf.parse("22/11/2012"));
			b1.Show();
			
		} catch (BadBookingException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		try {
			c1.addBooking(3, "Table",sdf.parse("21/11/2012"),sdf.parse("22/11/2012"));
			c1.addBooking(2, "Basketball",sdf.parse("18/11/2012"),sdf.parse("19/11/2012"));
			c1.addBooking(4, "Table", sdf.parse("23/11/2012"),sdf.parse("24/11/2012"));
		} catch (ParseException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			c1.showBookings("Table",sdf.parse("19/11/2012"),sdf.parse("27/11/2012"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("Bad Happen");
		}
		
	
	
	}


	

}
