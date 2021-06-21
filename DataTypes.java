public class DataTypes {
    public static void main(String[] args) {
        // int n = 1234567890;
        // long nl = 12345678901L;

        // double nD = 123.456;
        // float nF = 123.456F;

        var salary = 1000; // int
        // pension 3%
        var pension = salary * 0.03; // double
        var totalSalary = salary - pension;

        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName = "Anahí Salgado";
        System.out.println("Employee: " + employeeName + " SALARY: " + totalSalary);
    }
}