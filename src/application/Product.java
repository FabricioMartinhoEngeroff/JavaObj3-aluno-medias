package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Product {

	public static void main(String[] args) {
		Locale.setDefault ( Locale.US);
		Scanner sc = new  Scanner (System.in);
		
		Student stud = new Student();
		
		System.out.print("Entre com o nome: ");
		stud.name = sc.nextLine();
		System.out.print("Entre com a primeira nota: ");
		stud.note1 = sc.nextDouble();
		System.out.print("Entre com a segunda nota: ");
		stud.note2 = sc.nextDouble();
		System.out.print("Entre com a terceira nota: ");
		stud.note3 = sc.nextDouble();
	
		 
		 System.out.printf("NOTA FINAL: %.2f%n", stud.finalGrade());
		 if (stud.finalGrade() < 60.0) {
		 System.out.println("REPROVADO");
		 System.out.printf("FALTARAM %.2f PONTOS%n", stud.missingPoints());
		 }
		 else {
		 System.out.println("APROVADO");
		 }
		 
		
		
		
		sc.close();

	}

}
