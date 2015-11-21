
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;


public class Club {
	private ArrayList<Member> memberlist; 
	private static int count=0;
	private HashMap<String,Facility> facilities; 
	private BookingRegister bookingRegister;
	
	public Club(){
		memberlist = new ArrayList<Member>();
		facilities = new HashMap<String,Facility>();
		bookingRegister = new BookingRegister();
	}
// This is for Memberlist	
	public ArrayList<Member> getMembers(){
		return memberlist;
	}
	public Member getMember(int membershipNumber){
		Member m = new Member();
		for (Member m1: memberlist){
			if (m1.getMembershipNumber() == membershipNumber)
			{
				m = m1;
			}
		}
		return m;
	}
	public Member addMember(String a, String b){
		count++;
		Member m1 = new Member(a,b,count);
		memberlist.add(m1);
		return m1;
	}
	public void showMembers(){
		for (Member member : memberlist) {
			member.Show();
		}
		
	}
	public void removeMember(int n){
		
		for (Iterator<Member> iterator = memberlist.iterator(); iterator.hasNext();) {
			Member m1 =iterator.next();
			if(m1.getMembershipNumber() == n){
				iterator.remove();
			}
			
		}

	}
	
// This is for Facilities
	public HashMap<String,Facility> getFacilities(){
		return facilities;
	}
	public Facility getFacility(String s){
		
		return facilities.get(s);
	}
	public Facility addFacility(String a, String b){
		Facility f1 = new Facility(a,b);
		facilities.put(f1.getName(), f1);
		return f1;
	}
	public void removeFacility(String s){
		facilities.remove(s);
	}
	public void showFacilities(){
		
		for (String name : facilities.keySet()) {
			getFacility(name).Show();
			
		}
	}
	public void show(){
		System.out.println("----This is MemberList----");
		showMembers();
		System.out.println("-----This is FacilityList----");
		showFacilities();
	}
	
// This is for BookingRegister
	public void addBooking(int membership, String facilityName, Date s, Date e){
		try {
			bookingRegister.addBooking(this.getMember(membership), this.getFacility(facilityName), s, e);
		} catch (BadBookingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public ArrayList<Book> getBookings(String facilityName, Date s,Date e){
		return bookingRegister.getBookings(this.getFacility(facilityName), s, e);	
	}
	public void showBookings(String facilityName, Date s,Date e){
		for (Book b1 : this.getBookings(facilityName,s,e)){
			b1.Show();
		}
	}

}
