package my.day14.d.block;

public class MainBlock {

	public static void main(String[] args) {
		
		Child child1 = new Child();
		System.out.println(child1.name);
		System.out.println(child1.count);
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		Child child2 = new Child();
		child2.name = "전지현";
		System.out.println(child2.name);
		System.out.println(child2.count);
		
		
		
	}

}
