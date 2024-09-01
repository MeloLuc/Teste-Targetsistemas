//Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores 
//(exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, 
//ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

package Fibonacci;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        try{
        System.out.print("Digite um número para verificação se esse número pertence a sequencia de fibonacci: ");
        int num = sc.nextInt();

        System.out.println(fibonacciContain(num));
        }
        catch(InputMismatchException e) {
            System.out.println("caractere não permitido");
        }
        
        sc.close();
    }
    
    private static String fibonacciContain(int num) {
        int anterior = 0;
        int atual = 1;

        if(num == anterior || num == atual){
            return "Esse número pertence a sequência de fibonacci!";
        }
        while (num > atual) {
            int aux = atual;
            atual = anterior + atual;
            anterior = aux;
            if (atual == num) {
                return "Esse número pertence a sequência de fibonacci!";
            }
        }
        return "Esse número não pertence a sequência de fibonacci!";
    }
}
