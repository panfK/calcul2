import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, x, A;
        System.out.println("Вы хотите начать вычисления ?");
        System.out.println("1-да 2-нет");
        A = scanner.nextDouble();
        while (A == 1) {
            System.out.println("Выберете действие");
            System.out.println("1-сложение");
            System.out.println("2-умножение");
            System.out.println("3-вычитание");
            System.out.println("4-деление");
            System.out.println("5-вычисление квадратного корня");
            System.out.println("выберите цифру ");
            x = scanner.nextDouble();
            if (x == 1) {
                System.out.println("введите первое число");
                a = scanner.nextDouble();
                System.out.println("введите второе число");
                b = scanner.nextDouble();
                System.out.println( summa(a, b));
            } else if (x == 2) {
                System.out.println("введите первое число");
                a = scanner.nextDouble();
                System.out.println("введите второе число");
                b = scanner.nextDouble();
                System.out.println( umng(a, b));
            } else if (x == 3) {
                System.out.println("введите первое число");
                a = scanner.nextDouble();
                System.out.println("введите второе число");
                b = scanner.nextDouble();
                System.out.println( minus(a, b));
            } else if (x == 4) {
                System.out.println("введите первое число");
                a = scanner.nextDouble();
                System.out.println("введите второе число");
                b = scanner.nextDouble();
                System.out.println( del(a, b));
            } else if (x == 5) {
                System.out.println("введите первое число");
                a = scanner.nextDouble();
                System.out.println("введите второе число");
                b = scanner.nextDouble();
                System.out.println("введите третье число");
                c = scanner.nextDouble();
                System.out.println(sqvrr(a, b, c));
            } else
                System.out.println("вы неправильно ввели значение");
            System.out.println("Хотите продолжить?");
            System.out.println("1-да 2-нет");
            A = scanner.nextDouble();
        }
    }
    public static double summa ( double c, double v){
        return (c + v);
    }
    public static double minus ( double a, double b){
        return (a - b);
    }
    public static double umng ( double a, double b){
        return (a * b);
    }
    public static double del ( double a, double b){
        return (a / b);
    }
    public static String sqvrr ( double a, double b, double c){
        String S = " ";
        double D = Math.sqrt(b * b - 4 * a * c);
        if (D > 0) {
            double x1 = (-b + D) / (a * 2);
            double x2 = (-b - D) / (a * 2);
            System.out.println("x1 =" + " " + x1);
            System.out.println("x2 =" + " " + x2);
        } else if (D == 0) {
            double x1 = (-b) / (a * 2);
            System.out.println( "x1 =" + " " +x1);
        } else
            System.out.println("корней нет");
        return S;
    }
}