package _Demos;

public class Demo3 {

	public static void main(String[] args) {
		
//		int[] getallen = new int[4];	
		Cat[] cats = new Cat[7];
		cats[0] = new Cat("Brown");
		cats[1] = new Cat("Brown");
		cats[2] = new Cat("Brown");
		cats[3] = new Cat("Brown");
		cats[4] = new Cat("Brown");
		cats[5] = new Cat("Brown");
		cats[6] = new Cat("Brown");

//		int[] getallen2 = {3,4,8,9};
		Cat pietje = new Cat("Brown");
		pietje.furrColor = "Blue";
		Cat[] cats2 = {pietje,new Cat(),new Cat("Brown"),new Cat("Brown"),new Cat("Brown"),new 

Cat("Brown"),new Cat("Brown")};
	


	}	

}
class Cat{
	String furrColor;
	Cat(){}
	Cat(String vacht){
		furrColor = vacht;
	}
	

}
