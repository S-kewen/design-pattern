package observer;

public class Run {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        weatherData.setData(Float.parseFloat("1.0"), Float.parseFloat("2.0"), Float.parseFloat("3.0"));


        CurrentConditions currentConditions = new CurrentConditions();

        weatherData.addObserver(currentConditions);


        //baidu.display();
        //天气改变了
        weatherData.setData(Float.parseFloat("1.1"), Float.parseFloat("2.2"), Float.parseFloat("3.3"));


        Baidu baidu = new Baidu();

        baidu.update(weatherData.getTemperatrue(), weatherData.getPressure(), weatherData.getHumidity());

        baidu.display();


        // baidu.display();
    }
}
