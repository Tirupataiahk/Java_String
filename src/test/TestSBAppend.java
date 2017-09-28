package test;

public class TestSBAppend {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer();
		
		System.out.println(sb.capacity());
		
		sb.append("Hello");
		System.out.println(sb.capacity());
		
		sb.append("This is java program and perl combination");
		
		System.out.println(sb.capacity());

	}

}
