import java.util.*;

public class EntradaSimples {
    public static void main(String[] args){
        
        String nome;
        
        System.out.print("Digite seu nome: ");
        
        Scanner entrada = new Scanner(System.in);
        nome = entrada.nextLine();

        System.out.println("Olá meu amigo, "+ nome);

    }
}
