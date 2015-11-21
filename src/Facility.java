
public class Facility {
	String name;
	String description;
	
	public Facility(String a, String b){
		name =a;
		description =b;
	}
	public Facility(String a ){
		name = a;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public String toString(){
		String facilityShow = name ;
/* if want to know whether a vairable is null or not, can not use "equals"
pls use "==", because null do not have the method of equals*/
		if (description == null){
			facilityShow = name;
		}
		else{
			facilityShow = name +"("+description+")";
		}
		return facilityShow;
	}
	public void Show(){

		System.out.println(this.toString());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Facility other = (Facility) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
