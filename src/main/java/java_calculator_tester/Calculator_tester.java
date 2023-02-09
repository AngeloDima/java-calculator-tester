package java_calculator_tester;

import java.util.Scanner;

public class Calculator_tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		
		Calc calcolatore = new Calc();
		
	
		
		System.out.println("Quale operazione vuoi eseguire? [1]Addizione  [2]Sottrazione [3]Moltiplicazione [4]Divisione");
		int Opera = s.nextInt();
		
		System.out.print("Ok, dimmi il primo numero (INTERO): ");
		int num1 = s.nextInt();
		System.out.print("ora dimmi il secondo numero (INTERO): ");
		int num2 = s.nextInt();
		
		
		
		//PARTONO GLI IF
		
		
		
		if (Opera == 1) {
			System.out.println("il tuo risultato è: " + calcolatore.add(num1, num2));
		}
		
		else if (Opera == 2) {
			System.out.println("il tuo risultato è: " + calcolatore.subtract(num1, num2));
		}
		
		else if (Opera == 3) {
			System.out.println("il tuo risultato è: " + calcolatore.multiply(num1, num2));
		}
		
		else if (Opera == 4) {
			System.out.println("il tuo risultato è: " + calcolatore.divide(num1, num2));
		}
		
			
	}

}
