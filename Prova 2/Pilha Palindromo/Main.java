import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        

        System.out.println("Digite a palavra");
        String palavra = entrada.nextLine();

        Pilha pilha = new Pilha(palavra.length());


        
        pilha.palindromo(palavra);
        
    }
}
