import javax.management.monitor.Monitor;

public class Casting {
    public static void main(String[] args) {
        // En un año ubicar 30 perritos
        // Cuántos perritos ubique al mes

        double monthlyDogs = 30.0 / 12.0;
        System.out.println(monthlyDogs);

        // Estimación
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);

        // Exactitud
        int a = 30;
        int b = 12;
        System.out.println((double) a / b);
    }
}