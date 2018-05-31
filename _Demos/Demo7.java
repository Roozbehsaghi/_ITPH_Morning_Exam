package _Demos;

public class Demo7 {

	public static void main(String[] args) {
		
		LeidenMath2 pietje = new LeidenMath2();
		int a = pietje.multiply(7,8);  
		System.out.println(pietje.multiply(6,3));  
	}
}

class LeidenMath2{
	int multiply(int x, int y){
		System.out.println("You want to multiply");
		return x*y;
	}

}
