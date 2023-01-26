import java.util.Scanner;

public class Erastones {

    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Programa que exibe o numero de primos entre dois numeros:");

        System.out.println("Digite o numero inicial");
        
        int primeironumero = entrada.nextInt();

        System.out.println("Digite o numero final");
        int segundonumero = entrada.nextInt();

        int[] numeros = new int [segundonumero - primeironumero];

        for( int i = primeironumero, indice = 0; i < segundonumero;i++, indice++){

            numeros[indice] = i;

        }

        for ( int i = 0 ; i < segundonumero - primeironumero; i++){

            if (numeros[i] > 2 && numeros[i]% 2 == 0 || numeros[i] > 3 && numeros[i] % 3 == 0 || numeros[i] > 5 && numeros[i] % 5 == 0 || numeros[i] > 7 && numeros[i] % 7 == 0 || Math.sqrt(numeros[i]) % (int)Math.sqrt(numeros[i]) == 0 ){

                numeros[i] = 0;
            }


        }

        for( int i = 0; i < segundonumero - primeironumero ; i++){

            if(numeros[i] > 0){

                System.out.println(numeros[i]);
            }

        }
    }
}
