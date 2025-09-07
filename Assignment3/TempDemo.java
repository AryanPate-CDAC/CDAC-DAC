class TemperatureSensor {
    private int temperature;

    public void setTemperature(int t) {
        if (t >= 0 && t <= 100) {
            temperature = t;
        } else {
            System.out.println("Temperature out of range");
        }
    }

    public int getTemperature() {
        return temperature;
    }
}

public class TempDemo {
    public static void main(String[] args) {
        TemperatureSensor sensor = new TemperatureSensor();

        sensor.setTemperature(-5);   // invalid
        System.out.println("Current Temperature = " + sensor.getTemperature());

        sensor.setTemperature(25);   // valid
        System.out.println("Current Temperature = " + sensor.getTemperature());
    }
}
