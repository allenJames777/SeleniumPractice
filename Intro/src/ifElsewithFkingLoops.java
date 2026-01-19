
public class ifElsewithFkingLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0; i<arr.length; i++) 
		{
			if (arr[i] % 2 == 0) {
				System.out.println("even: "+arr[i] + " ");
				break;
			}else {
				System.out.println("odds: "+arr[i]+" ");
			}
		}
		
		System.out.println(arr[0] + arr[1]);
		
		
	     System.out.println("total"+arr.length);
	     
	     
	     // 1. Create an Array
	        double[] numbers = {2.5, 9.0, 17.2, 5.0, 3.14};
	 
	        // 2. Access and Print
	        System.out.println("First element: " + numbers[0]);
	        System.out.println("Last element: " + numbers[numbers.length - 1]); 
	 
	        // 3. Reverse Order
	        System.out.println("Elements in reverse order: ");
	        for (int i = numbers.length - 1; i >= 0; i--) {
	            System.out.println(numbers[i]);
	        }
	 
	        // 4. Bonus: Element Count
	        System.out.println("Total elements in the array: " + numbers.length);

	}

}
