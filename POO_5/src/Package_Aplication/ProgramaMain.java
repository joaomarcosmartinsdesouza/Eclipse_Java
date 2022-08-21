package Package_Aplication;

import java.util.Scanner;  // importacaoo do scanner para leitura de dados inseridos

import Entities.ClassProduto;  // importada a classe Classproduto (Ctrl+Shift+O)

public class ProgramaMain {

	public static void main(String[] args) {
		
		// Criar scanner digitando a instanciacao abaixo e clicando (Ctrl+Shift+O)
		
		Scanner sc = new Scanner(System.in);
		
		ClassProduto A = new ClassProduto();
		
		System.out.print("Digite o nome do Produto: ");
		A.nome = sc.nextLine();
		System.out.print("Digite o preco do produto: ");
		A.preco = sc.nextDouble();
		System.out.print("Digite a quantidade: ");
		A.quantidade = sc.nextInt();
		
		System.out.println(A);
		
		
		
		
		

	}

}
