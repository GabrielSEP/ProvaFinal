
public class TemperatureServiceFahrenheit extends TemperatureDecorator {

	public TemperatureServiceFahrenheit() {
		super();
	}
	
	public TemperatureServiceFahrenheit(Temperature temperature) {
		super(temperature);
	}
	
	@Override
	public double currentTemperature() {
		return 70;
	}
}
