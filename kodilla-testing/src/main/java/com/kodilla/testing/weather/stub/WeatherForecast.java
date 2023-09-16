package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double avarageTemperature(){
        double result = 0.0;
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            result = result + temperature.getValue();
        }
        result = result / temperatures.getTemperatures().size();
        return result;
    }

    public double temperatureMedian(){
        ArrayList<Double> list = new ArrayList<>();
        double result =0.0;
        for (Map.Entry<String, Double> entry : temperatures.getTemperatures().entrySet()) {
            list.add(entry.getValue());
        }
        Collections.sort(list);
        if(list.size() % 2 == 0){
            Double temp1 = list.get(list.size() / 2 - 1);
            Double temp2 = list.get(list.size() / 2);
            result = (temp1 + temp2) / 2;
        }else{
            return list.get((list.size() + 1) / 2 - 1);
        }
        return result;
    }
}
