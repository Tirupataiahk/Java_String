package test;

public class SplitExample {

	public static void main(String[] args) {
		
		String s1="Java string split method by Tirupataiah";
		
		String[] words=s1.split("\\S");
		
		for(String w: words){
						
			System.out.println(w);
			
		}

	}

}
