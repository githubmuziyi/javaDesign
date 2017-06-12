package headFirstObserver;

/**
 * Created by muzi on 2017/6/8.
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setWeatherData(80, 90, 100);
    }
}
