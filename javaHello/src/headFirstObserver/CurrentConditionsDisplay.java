package headFirstObserver;

/**
 * Created by muzi on 2017/6/8.
 */
public class CurrentConditionsDisplay implements DisplayElement, Observer {

    private float temperature;
    private float humidity;
    private Subject weatherdata;

    public  CurrentConditionsDisplay(Subject weatherdata) {
        this.weatherdata = weatherdata;
        weatherdata.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current temprature is : " + temperature + " humidity is : " + humidity + "%humidity");
    }
}
