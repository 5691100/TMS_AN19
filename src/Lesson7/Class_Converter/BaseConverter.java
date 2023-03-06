package Lesson7.Class_Converter;

public class BaseConverter {
    Double temperature;

    public BaseConverter(Double temperature) {
        this.temperature = temperature;
    }

    public Double converterKelvin (Double temperature) {
        Double tempK = temperature + 273.15;
        return tempK;
    }

    public Double convertFahrenheit (Double temperature) {
        Double tempF = 1.8 * temperature + 32;
        return tempF;
    }

}
