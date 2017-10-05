package test;

public class StringTest {
	
	int rollNo;
	String name;
	String city;
	
	StringTest(int rollNo, String name, String city){
		
		this.rollNo= rollNo;
		this.name=name;
		this.city=city;
		
	}
	
	public String toString(){
		
		return rollNo+" "+ " "+name+ " "+" "+city;
		
		
	}
	

	public static void main(String[] args) {
		
		StringTest s1=new StringTest(100, " Charan "," Bengalore");
		
		StringTest s2=new StringTest(101, " Sneha "," Hyderabad");
		
		System.out.println(s1);
		
		System.out.println(s2);
		
		

	}

}
