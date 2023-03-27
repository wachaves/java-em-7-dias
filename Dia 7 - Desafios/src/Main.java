import java.util.*;

// DESAFIO 1 //
// PEÇA QUE SEJA DIGITADO 3 NUMEROS E PRINTAR OS 3 NUMEROS NA TELA
//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Digite o primeiro numero: ");
//        int a = scan.nextInt();
//        System.out.print("Digite o segundo numero: ");
//        int b = scan.nextInt();
//        System.out.print("Digite o terceiro numero: ");
//        int c = scan.nextInt();
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//    }
//}


// DESAFIO 2 //
// SE O NUMERO FOR IMPAR, IMPRIMIR "IMPAR", CASO PAR ENTÃO: >= 2 E <= 5, IMPRIMIR "A" // >= 6 E <= 20, IMPRIMIR "B" //
// > 20 , IMPRIMIR "C".

//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Digite um numero: ");
//        int n = scan.nextInt();
//
//        if (n % 2 == 1)
//            System.out.println("Impar");
//        else {
//            if (n >= 2 && n <= 5)
//                System.out.println("A");
//            else if (n >= 6 && n<= 20)
//                System.out.println("B");
//            else
//                System.out.println("C");
//
//            }
//    }
//}

// DESAFIO 3 //
// DIGITE UM NUMERO ESPAÇO OPERADOR ESPAÇO NUMERO (2 * 4), CALCULAR

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite o num1 op num2 (2 * 4): ");

        Scanner scan = new Scanner(System.in);
        double num1 = scan.nextDouble();
        char op = scan.next().charAt(0);
        double num2 = scan.nextDouble();

        if (op == '+')
            System.out.println((int)num1 + num2);
        else if (op == '-')
            System.out.println((int)num1 - num2);
        else if (op == '*')
            System.out.println((int)num1 * num2);
        else if (op == '/')
            System.out.println(num1 / num2);
        else
            System.out.println("Formato inválido!");

    }
}
