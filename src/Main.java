public class Main {
    public static void main(String[] args) {

        float weight = 70; // вес указать в кг.
        float height = 1.70f; //рост указать в метрах.

        BmiService service = new BmiService();
        float myCalculate = service.calculate(weight, height);


        System.out.println("индекс массы тела равен: " + myCalculate + " кг/м²");

    }
}
