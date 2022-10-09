import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // Pedir 4 notas
        System.out.println("Insira a primeira nota: ");
        double n1 = sc.nextDouble();
        System.out.println("Insira a segunda nota: ");
        double n2 = sc.nextDouble();
        System.out.println("Insira a terceira nota: ");
        double n3 = sc.nextDouble();
        System.out.println("Insira a quarta nota: ");
        double n4 = sc.nextDouble();
        sc.close();
        // Mostrar média
        double media = (n1 + n2 + n3 + n4) / 4;
        System.out.println("A média das 4 notas inseridas é: " + media);
    }
}
