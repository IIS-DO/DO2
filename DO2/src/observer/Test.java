package observer;

public class Test {

	public static void main(String[] args) {
		CryptoCurrencyPrice crypoCurrencyPrice = new CryptoCurrencyPrice();
		CryptoCurrencyUpdateSMS cryptoCurrencyUpdateSMS = new CryptoCurrencyUpdateSMS();
		crypoCurrencyPrice.addObserver(cryptoCurrencyUpdateSMS);
		
		crypoCurrencyPrice.setBitcoinPrice(20000);

	}

}
