package _Demos;

public class Demo8 {

	public static void main(String[] args) {
		
		System.out.println("ff checken");
		int age = 20;    // Veranderlijk
		if(age < 16){
			System.out.println("You can have no alcohol");
		}else if(age == 16 || age == 17){
			System.out.println("You can only have beer or wine");
		}else if(age > 17){
			System.out.println("You can have any alcohol");
		}
		

	}
}
