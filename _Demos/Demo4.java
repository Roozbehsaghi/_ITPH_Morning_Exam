package _Demos;

public class Demo4 {

	public static void main(String[] args) {
		
		for(  int a = 2000, b = 17  ; a > 100 ; a-- ){
			System.out.println(a--);
		}
		for(int x = 0 ; x < 10 ; x++){
			System.out.println(x);
		}


	}
	static boolean giveBoolean(){
		int x = 24;

		x = x + 5;

		x += 5;
	
		x = x + 1;

		x += 1;

		x++;		
	
		return true;
	}	
}

for loop

		for(;;){
			System.out.println("x");
		}

		for(  int a = 0, b = 17  ; a < 100 ; a += 2 ){
			System.out.println(a);
		}

		for(int x = 0 ; x < 10 ; x++){
			System.out.println(x);
		}
