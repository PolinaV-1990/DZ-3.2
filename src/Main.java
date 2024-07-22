public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightInMeters = 1.87;
        int weightInKg = 98;
        int bmi = service.calculate(heightInMeters, weightInKg);
        System.out.println(bmi);
    }
}