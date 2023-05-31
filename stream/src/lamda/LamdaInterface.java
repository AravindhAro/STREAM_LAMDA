package lamda;

@FunctionalInterface
public interface LamdaInterface {
	
	public abstract int test(int no1,int no2);
	
	default void test2() {
		System.out.println("this is default");
	}
	
	static void test3 () {
		System.out.println("this is static ");
	}
	

}
