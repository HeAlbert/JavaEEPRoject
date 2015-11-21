



public class Member extends Person{
	private int membershipNumber;
	
	public Member(){
		
	}
	public Member(int a){
		membershipNumber =a;
	}
	public Member(String a, String b, String c,int d){
		super(a,b,c);
		membershipNumber =d;
	}
	public Member(String a,String b,int d){
		super(a,b);
		membershipNumber =d;
	}
	public int getMembershipNumber(){
		return membershipNumber;
	}
	public String toString(){
		return super.toString()+" "+membershipNumber;
	}

}
