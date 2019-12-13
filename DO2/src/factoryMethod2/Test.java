package factoryMethod2;

public class Test {
	
	public static void main(String[] args) {
		BillProcessFactory billProcessFactory = new BillProcessFactory();
		billProcessFactory.storeBill("gas");
	}

}
