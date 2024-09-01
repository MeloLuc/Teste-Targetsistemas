//Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula,
//além de informar a quantidade de vezes em que ela ocorre.

package contarA;

import java.util.Scanner;

public class Program {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma String para verificar a existência da letra 'a': ");
        String string = sc.next().toLowerCase(); 

        //verificando se existe "a"
        int countA = 0;
        for(int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == 'a'){
                countA++;
            }
        }

        //imprimindo a existencia de "a"
        if (countA > 0) {
            System.out.println("A string contém a letra 'a'!");
            System.out.println("Quantidade de ocorrência: " + countA);
        }
        else{
            System.out.println("A string não contém a letra 'a'!");
        }

        sc.close();
    }
}
