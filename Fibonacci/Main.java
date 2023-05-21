import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Infome a quantidade de termos desejados: ");
        int n = entrada.nextInt();
        entrada.nextLine();

        for(int i = 0; i < n; i++){
            System.out.println("O "+i+" valor da sequência é "+fibo(i));
        }
    }


    public static int fibo(int n){
        if(n < 2){
            return n;
        } else {
            return fibo(n -1) + fibo(n - 2);
        }
    }
}


