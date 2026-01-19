
public class StringIsAnObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String Literal
		String s1 = "Hello";
		
		//String new
		String s2 = new String ("World");
		String s3 = new String ("Hi");
		
		//Using Split #1
		String s4 = "This is a test ";
		String [] splittedString1= s4.split(" ");
		System.out.println(splittedString1[0]);
		
		//Using Split #2
		String s5 = "This is a test ";
		String [] splittedString2= s5.split("a");
		System.out.print(splittedString2[0]);
		System.out.print(splittedString2[1]);
		
		//using charAT 
		String myName = "Allen James Lluvido";
		for (int i = 0; i<myName.length(); i++) {
			System.out.println(myName.charAt(i));
			
		}
		//reverse using charAt to access each character
		String revName = "Allen James Lluvido";
		for (int i = revName.length()-1; i>=0; i-- ) {
			System.out.println(revName.charAt(i));
		}
		StringIsAnObject d = new StringIsAnObject();
		
	
	}

}
