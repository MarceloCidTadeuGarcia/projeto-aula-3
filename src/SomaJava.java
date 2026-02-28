import java.util.Scanner;
public class SomaJava {
    public static void main(String[]args){

        

        System.out.println("Digite o primeiro número: ");
        Scanner entrada1 = new Scanner(System.in);
        Int n1 = entrada1.nextInt();

        System.out.println("Digite o segundo número: ");
        Scanner entrada2 = new Scanner(System.in);
        Int n2 = entrada2.nextInt();

        Int soma = n1 + n2;

        System.out.println("A soma dos números é: "+soma);

    }
    

}
