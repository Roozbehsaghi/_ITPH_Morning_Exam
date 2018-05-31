package _Demos;

public class Demo6 {

	public static void main(String[] args) {
		
		LeidenMath pietje = new LeidenMath();
		int a = pietje.multiply(7,8);  
		System.out.println(pietje.multiply(6,3));  
		pietje.multiply(4,4);  
		pietje.multiply(5,5);  
		pietje.multiply(7,6); 
		System.out.println(a); 
	}
}





class LeidenMath{
	int multiply(int x, int y){
		System.out.println("You want to multiply");
		return x*y;
	}

}

