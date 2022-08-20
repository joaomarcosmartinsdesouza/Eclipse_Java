package Aplicacao;

import Entidades.Aluno;

public class Programa_Main {

	public static void main(String[] args) {
		// Instanciando o objeto aluno:
		// Usar atalho (teclas Ctrl+Shift+O) para importar entidades alunos
		// Em seguida a este comando, aparecerá acima "import entities.Aluno;"
		
		Aluno x;               // ou, Aluno x = new Aluno( );
		x = new Aluno();
		
		x.nome = "Joao";
		x.Nota1 = 85;
		x.Nota2 = 95;
		
		double resultado = x.mediaAluno(x.Nota1, x.Nota2);
		
		System.out.println(x.nome+" "+x.verificaAluno(resultado)+" com a media "+resultado);
	}

}
