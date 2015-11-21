
//person Class
public class Person {

	private String surName;
	private String firstName;
	private String secondName;
	
	public Person(){
		surName="";
		firstName="";
		secondName="";
	}
	public Person(String a, String b, String c){
		surName=a;
		firstName=b;
		secondName=c;
	}
	public Person(String a, String b){
		surName=a;
		firstName=b;
		secondName="";
	}
	public String getSurName(){
		return surName;
	}
	public String getFirstName(){
		return firstName;
	}
	public String getSecondName(){
		return secondName;
	}
	public void Show(){
		System.out.println(this.toString()); 
	}
	public String toString(){
		return surName+" "+firstName+" "+secondName;
	}
	
}
