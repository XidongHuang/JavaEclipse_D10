package tony.exe;
//懒汉式
public class TestSingleton1 {
	public static void main(String[] args) {
		Singleton1 s1 = Singleton1.getInstance();
		Singleton1 s2 = Singleton1.getInstance();
		
		System.out.println(s1 == s2);
	}
}

class Singleton1{
	
	private Singleton1(){
		
	}
	
	private static Singleton1 instance = null;
	public static Singleton1 getInstance(){
		if(instance == null){
			instance = new Singleton1();
		}
		return instance;
	}
	
}