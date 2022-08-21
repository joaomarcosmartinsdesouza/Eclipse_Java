package Package_Entities;

public class Student {         // Class name
	
	public String nome;        // Class attributes
	public int nota1;
	public int nota2;
	public float media;
	
public float mediaAluno() {                // Class method number 1 
	float mediaAluno = (nota1 + nota2)/2;
	return mediaAluno;
}
public void verificaAluno() {              // Class method number 2
	if (media>=60)
		System.out.println(nome+" estah aprovado");
	else
		System.out.println(nome+" estah reprovado");
	}
public String toString() {
		return "Estudante "+nome+" obteve "+nota1+" e "+nota2+" em suas notas parciais.";
	}
}
