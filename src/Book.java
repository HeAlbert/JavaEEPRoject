

import java.text.SimpleDateFormat;
import java.util.Date;

public class Book {
	private Member member;
	private Facility facility;
	private Date startDate;
	private Date endDate;
	
	Book (Member m, Facility f, Date s, Date e)throws BadBookingException{
		if (m ==null || f == null || s ==null || e == null || (s.after(e)))
			throw new BadBookingException("unvalid booking");
		member = m;
		facility = f;
		startDate = s;
		endDate =e;
	}

	public Member getMember() {
		return member;
	}

	public Facility getFacility() {
		return facility;
	}

	public Date getStartDate() {
		return startDate;
	}

	public Date getEndDate() {
		return endDate;
	}
	
	public Boolean overLaps(Book b){
		Boolean isOverlaps = false ;
		if(this.facility == b.facility){
			if((this.endDate.before(b.startDate) || this.startDate.after(b.endDate))){
				
				return isOverlaps;
			}
			else
				return !isOverlaps;
		}
		else
			return isOverlaps;
	}
	public String toString(){
		SimpleDateFormat sdf = new SimpleDateFormat("d-MMM-yyyy H:mm");
		return this.member.toString()+this.facility.toString()+":"+sdf.format(this.startDate)+"--"+sdf.format(this.endDate);
	}
	public void Show(){
		System.out.println(this.toString());
	}

}
