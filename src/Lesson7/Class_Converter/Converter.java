package Lesson7.Class_Converter;

//Напишите класс BaseConverter для конвертации из градусов по Цельсию в Кельвины , Фаренгейты , и так далее.
//У класса должен быть метод convert, который и делает
//конвертацию.
//Соотношения температур:
//• <Температура по Цельсию>
//• <Температура по Цельсию> + 273.15 —-> по Кельвину
//• 1.8 * <Температура по Цельсию> + 32 —-> по Френгейт

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, insert the temperature in C: ");
        Double temp = sc.nextDouble();
        BaseConverter temperature = new BaseConverter(temp);
        System.out.println("Kelvin temperature: " + temperature.converterKelvin(temp));
        System.out.println("Fahrenheit temperature: " + temperature.convertFahrenheit(temp));
    }
}
