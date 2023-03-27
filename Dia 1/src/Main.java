import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
//            // Meus dados
//            byte minhaIdade = 36;
//            int salarioMensal = 5000;
//            long idadeMilisegundos = 1135296000000L;
//            double altura = 1.71;
//            char inicial = 'W';
//            boolean eMaiorDeIdade = true;
//            // Imprimir meus dados
//            // sout = System.out.println()
//            // \n = nova linha     \t = tab
//            String nomeSobrenome = "William " + "Chaves";
//            System.out.println(minhaIdade);
//            System.out.println(salarioMensal);
//            System.out.println(idadeMilisegundos);
//            System.out.println(altura);
//            System.out.println(inicial);
//            System.out.println(eMaiorDeIdade);
//            System.out.println(nomeSobrenome);
//            System.out.println(nomeSobrenome.toLowerCase());
//            System.out.println(nomeSobrenome.toUpperCase());

            Scanner idadeScanner = new Scanner(System.in);
            System.out.println("Digite a sua idade: ");
            byte idadeCliente = idadeScanner.nextByte();
            System.out.println(idadeCliente);
    }
}