
public class Main {

	public static void main(String[] args) {
		Temperature temperatureFahrenheit = new TemperatureServiceFahrenheit();
		double fahrenheit = temperatureFahrenheit.currentTemperature();
		System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
		Temperature temperatureCelsius = new TemperatureService();
		double celsius = temperatureCelsius.currentTemperature();
		System.out.println("Temperatura em Celsius: " + celsius);
	    
	}

}
