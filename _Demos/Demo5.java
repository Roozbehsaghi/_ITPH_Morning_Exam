package _Demos;

public class Demo5 {

	public static void main(String[] args) {
		
		Cat[] cats = new Cat[4];
		cats[0]  = new Cat();
		cats[0].furrColor = "Red";
		cats[1]  = new Cat();
		cats[1].furrColor = "Blue";
		cats[2]  = new Cat();
		cats[2].furrColor = "Brown";
		cats[3]  = new Cat();
		cats[3].furrColor = "Black";
		for( Cat c : cats ){
			System.out.println(c.furrColor);
		}
	}
}





class Cat{
	String furrColor;
}

		
	}

}
