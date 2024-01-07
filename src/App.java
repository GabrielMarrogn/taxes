import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        double resto = 0;
        double renda = 0;
        sc.close();

        if(salary >0 && salary <= 2000){
            System.out.println("Isento");
        }else if(salary > 4500){
            renda = salary - 4500;
            resto = renda * 0.28;
            salary = salary - renda;
        }if(salary > 3000){
            renda = salary - 3000;
            resto = resto + renda * 0.18;
            salary = salary - renda;
        }if(salary > 2000){
            renda = salary - 2000;
            resto = resto + renda * 0.08;
            System.out.printf("R$ %.2f\n",resto);
        }
    }
}
