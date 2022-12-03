public class Main {
    public static void main(String[] args) {

        float a = 70; // вес указать в кг.
        float b = 1.70f; //рост указать в метрах.

        BmiService service = new BmiService();
        float myCalculate = service.calculate(a, b);


        System.out.println("индекс массы тела равен: " + myCalculate + " кг/м²");

    }
}
