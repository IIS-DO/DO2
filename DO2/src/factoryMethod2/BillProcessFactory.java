package factoryMethod2;

public class BillProcessFactory extends ProcessBill{

	@Override
	public void createBill(String type) {
		switch(type) {
		case "electricity":
			bill = new ElectricityBill();
			break;
		case "gas":
			bill = new GasBill();
			break;
		default:
			bill = null;
		}
		
	}

}
