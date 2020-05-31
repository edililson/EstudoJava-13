package classe;

public class AteaCircTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AreaCirc a1 = new AreaCirc(10);
		//a1.pi = 1000000;
		AreaCirc a2 = new AreaCirc(5);
		//a2.pi = 0;
		
		//AreaCirc.PI = 3.142;
		System.out.println(a1.area());
		System.out.println(a2.area());
		System.out.println(AreaCirc.PI);
		System.out.println(Math.PI);
		
		
		System.out.println(AreaCirc.area(100));
	}

}
