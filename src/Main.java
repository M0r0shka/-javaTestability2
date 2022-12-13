public class Main {
    public static void main(String[] args) {
        double weight = 58;
        double growth = 1.64;
        BmiService service = new BmiService();
        double bmi = service.calculate(weight, growth);
        System.out.println("Индекс массы тела: " + bmi);
    }
}