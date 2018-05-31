package _Demos;

public class Demo5 {

	public static void main(String[] args) {
		
		Cat2[] cats = new Cat2[4];
		cats[0]  = new Cat2();
		cats[0].furrColor = "Red";
		cats[1]  = new Cat2();
		cats[1].furrColor = "Blue";
		cats[2]  = new Cat2();
		cats[2].furrColor = "Brown";
		cats[3]  = new Cat2();
		cats[3].furrColor = "Black";
		for( Cat2 c : cats ){
			System.out.println(c.furrColor);
		}
	}
}





class Cat2{
	String furrColor;
}
