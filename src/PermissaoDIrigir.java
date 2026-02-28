import java.util.Scanner;
public class PermissaoDIrigir {
    public static void main(String[] args){

        System.out.print("Digite sua idade: ");

        System.out.println(System.in);
        Scanner entrada = new Scanner(System.in);
        int idade = entrada.nextInt();

        if(idade > 17){
            System.out.println("Você já pode dirigir");
        } else {
            System.out.println("Vai de busão");
        }
    }
}
