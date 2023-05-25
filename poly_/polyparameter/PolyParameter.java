package poly_.polyparameter;

public class PolyParameter {
	public static void main(String[] args) {
		
		Worker tom = new Worker("tom", 2500);
		Manager milan = new Manager("silan", 5000,200000);
		PolyParameter polyparameter = new PolyParameter();
		polyparameter.showEmpAnnual(tom);
		polyparameter.showEmpAnnual(milan);
		
		polyparameter.testWork(tom);
		polyparameter.testWork(milan);
		
		}
	

	
	public void showEmpAnnual(Employee e) {
		System.out.println(e.getAnnual());
	}
	
	public void testWork(Employee e) {
		if(e instanceof Worker ) { 
			((Worker) e).work();//向下转型
		}else if (e instanceof Manager) {
			((Manager) e).manage();
		}else {
			System.out.println("不做处理");
		}
	}
}






