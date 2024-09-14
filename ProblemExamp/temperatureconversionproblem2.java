package ProblemExamp;

/**
 * Soal 2: Membuat Program Konversi Suhu
 * 
 * Deskripsi: Buatlah sebuah program yang menerima input berupa suhu dalam skala
 * Celsius dari pengguna, kemudian mengonversinya ke dalam skala Fahrenheit dan
 * Kelvin. Rumus konversi yang digunakan adalah:
 * 
 * Fahrenheit = (Celsius × 9/5) + 32
 * Kelvin = Celsius + 273.15
 * 
 * Contoh:
 * 
 * Input: 25
 * Output: Fahrenheit: 77.0, Kelvin: 298.15
 */

public class temperatureconversionproblem2 {

    public static Double fahrenheit(double celcsius) {

        return (celcsius * 9 / 5) + 32;
    }

    public static Double calvin(double celcsius) {
        return celcsius + 273.15;
    }

    public static void main(String[] args) {
        double celcsius = 25;
        System.out.println("Temperature in Fahrenheit : " + fahrenheit(celcsius));
        System.out.println("Temperature in Calvin : " + calvin(celcsius));

    }
}
