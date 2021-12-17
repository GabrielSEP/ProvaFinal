
public abstract class TemperatureDecorator implements Temperature {

	private Temperature temperature;

	public TemperatureDecorator() {
		super();
	}

	public TemperatureDecorator(Temperature temperature) {
		this.temperature = temperature;
	}

	public double currentTemperature() {
		if (temperature == null) {
			return 0.0;
		}
		return temperature.currentTemperature();
	}
}
