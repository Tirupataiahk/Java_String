package test;

import java.util.StringTokenizer;

public class TestStrToken {

	public static void main(String[] args) {
		
		StringTokenizer st= new StringTokenizer("my name is Tirupataiah");
		System.out.print("Splited string is:  ");
		while(st.hasMoreTokens()){
			
			System.out.println(" "+st.nextToken());
		}

	}

}
