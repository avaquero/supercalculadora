import java.util.Scanner;


public class Calculadora {

	public static void main(String[] args) {
		
		String numero ="";
		
		Scanner llegir = new Scanner(System.in);
        System.out.println("Entra numeros:");
        numero = llegir.nextLine();
        
        while (numero == "="){
        	numero += numero;
        	numero = llegir.nextLine();
        }
        
        //Imprimirnumero
        System.out.println(numero);
	}

}
