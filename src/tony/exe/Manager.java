package tony.exe;

public class Manager extends Employee {
	private double bonus;
	
	
//	public Manager(String name, int id, double salary, double bonus) {
//		super(name, id, salary);
//		this.bonus = bonus;
//	}

	public void work(){
		System.out.println("I am manager");
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	
}
