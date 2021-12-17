
public class TemperatureService extends TemperatureDecorator {

	public TemperatureService() {
		super();
	}
	
	public TemperatureService(Temperature temperature) {
		super(temperature);
	}
	
	@Override
	public double currentTemperature() {
		return 40;
	}
}
