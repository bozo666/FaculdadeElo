package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Cadastro;

public class Program {


	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		List<Cadastro> list = new ArrayList<>();
		
		String nome; int idade ; double peso;
		
		for(int i=0; i<=2;i++) {
			System.out.println("Nome: "); 
			nome = in.next();
			System.out.println("Idade: ");
			idade = in.nextInt(); 
			System.out.println("Peso: ");
			peso = in.nextDouble();
			Cadastro c1 = new Cadastro(nome, idade, peso);
			list.add(c1);
		}
	
			
		for(Cadastro b : list) {
			System.out.print("Nome: "+b.getNome());
			System.out.print(", "+ "Idade: "+b.getIdade());
			System.out.print(", "+"Peso: "+b.getPeso());
			System.out.println();
		}
		
		System.out.println("Media de idade: " + Cadastro.RetornaMediaIdade(list));
		System.out.printf("Media de peso: %.2f", Cadastro.RetornaMediaPeso(list));
		
		in.close();
	}

	
	
}
