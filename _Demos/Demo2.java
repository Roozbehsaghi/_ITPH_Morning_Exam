package _Demos;

public class Demo2 {

	public static void main(String[] args) {
		
		int[] getallen = new int[4];
		int[] getallen2 = {3,4,8,9};
		int[] getallen3 = new int[]{2,3};

		String[] woorden = new String[3];

		woorden[0] = "Monday"; // writing to it
		System.out.println(woorden[0]);  // reading from it

// EXTREMELY WRONG DUE TO PRINTING THE COLLECTION
		System.out.println(woorden);  // It prints an memory address

		String aword = woorden[0];  	// reading from it

		woorden[1] = "Tuesday";
		woorden[2] = "Wednesday";

		String[] woorden2 = {"Monday","Tuesday","Wednesday"};
		
	}	

}
