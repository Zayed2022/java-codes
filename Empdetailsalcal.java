import java.util.Scanner;

public class Employee {
    private String name;
    private int id;
    private double basic;
    private double net;
    
    public void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter ID: ");
        this.id = scanner.nextInt();
        System.out.print("Enter basic salary: ");
        this.basic = scanner.nextDouble();
    }
    
    public void calcNet() {
        double pf = 0.12 * this.basic;
        double tax = 0.1 * this.basic;
        this.net = this.basic - pf - tax;
    }
    
    public void printDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Basic Salary: " + this.basic);
        System.out.println("Net Salary: " + this.net);
    }
    
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.read();
        emp.calcNet();
        emp.printDetails();
    }
}
