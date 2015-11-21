

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

public class BookingRegister {
	private HashMap<Facility,ArrayList<Book>> bookMap;
	
	public BookingRegister(){
		bookMap = new HashMap<Facility,ArrayList<Book>>();
	} 

	public void addBooking(Member m, Facility f, Date s, Date e) throws BadBookingException{
		try {
			Book b1 = new Book(m,f,s,e);
			int count =0;
			for(Facility f1 : bookMap.keySet()){
				if(f1.equals(f)){
					count ++;
					
				}
			}
			
			if (count == 0){
				bookMap.put(f, new ArrayList<Book>());
				bookMap.get(f).add(b1);	

			}
			else{
					for (Book book: bookMap.get(f)){
						if (book.overLaps(b1)){
							throw new BadBookingException("This booking is overlaps");
						}
					}
					bookMap.get(f).add(b1);	

				}
		/*	bookMap.get(f).add(b1);	*/
			
		} catch (BadBookingException e1) {
			// TODO Auto-generated catch block
			System.out.println("This booking is overlaps, Pls enter new booking");
		}
	}
	public ArrayList<Book> getBookings(Facility f, Date s, Date e){
		ArrayList<Book> spcBookList= new ArrayList<>();
			for (Book b1 : bookMap.get(f)){
				if (b1.getStartDate().after(s) && b1.getEndDate().before(e)){
					spcBookList.add(b1);
				}
			}			
			
		return spcBookList;
	}
	public void removeBooking(Book b){
		for (Iterator<Book> iterator = bookMap.get(b.getFacility()).iterator(); iterator.hasNext();) {
			Book b1 =iterator.next();
			if(b1.equals(b)){
				iterator.remove();
			}
		}
	}
}
