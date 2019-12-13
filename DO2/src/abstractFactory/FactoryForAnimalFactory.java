package abstractFactory;

public abstract class FactoryForAnimalFactory {
	
	public static AnimalFactory createAnimalFactory(String type) {
		if(type.equals("domestic")) {
			return new DomesticAnimalFactory();
		} else if (type.equals("wild")) {
			return new WildAnimalFactory();
		} else {
			return null;
		}
	}

}
