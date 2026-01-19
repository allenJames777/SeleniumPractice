
public class fuckingLoops {

	public static void main(String[] args) {
		
		int[] arr = new int[3];
		arr [0] = 10;
		arr[1] = 20;
		arr[2] = 30;
	    
		int[] arr2 = {1,2,50,4,5};
		
		//loop int
		for(int i = 0; i<arr2.length; i++)
		{
			System.out.println(arr2[i]);
		}
		
		//loop string THIS METHOD IS TO REVERSE PRINT A LOOP
		String [] strArr = new String[3];
		strArr[0] = "hello";
		strArr[1] = "world";
		strArr[2] = "trash-CAN!";
		
		for(int i= strArr.length-1; i>=0; i--) {
		System.out.println(strArr[i]);
		}
		
		//simplified version: will do the int i=0 ; i<variable.length; i++'
		for(String s: strArr) {
			System.out.print(s);
		}

	}

}
