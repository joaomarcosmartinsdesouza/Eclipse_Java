package Entidades;

public class Aluno {
	// Criando atributos da classe alunos:
	public String nome;
	public int Nota1;
	public int Nota2;
	
	public double mediaAluno(int x, int y) {
		
		double resultado = (x+y)/2;  // ou, otimizando o codigo, eu poderia ter escrito
		return resultado;            // somente return (x+y)/2; (em uma unica linha)
	}
	// criando metodo se verifica o status do aluno, ou seja, se aprovado ou reprovado
	public String verificaAluno(double z) {
		
		String situacao;
		if (z>60)
			situacao = "Aprovado";      // ou, otimizando, return "Aprovado"
		else                           //                  else 
			situacao = "Reprovado";   //                   return "Reprovado"
		return situacao;
	}
}
