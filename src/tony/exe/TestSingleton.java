package tony.exe;
//饿汉式
public class TestSingleton {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getSingleton();
		Singleton s2 = Singleton.getSingleton();
		
		System.out.println(s1 == s2);
	}
}


class Singleton{
	
	private Singleton(){
		
	}
	
	private static Singleton instance = new Singleton();
	
	public static Singleton getSingleton(){
		return instance;
	}
	
}