package Package_Aplication_Main;

import Package_Entities.Student;   // I used (Crtl+Shift+O) to import Package_Entities.Student

public class Program_Main {

	public static void main(String[] args) {
		// 
		
		Student x = new Student();   // I instantiated the "student object"
		
		x.nome = "Horacio";
		x.nota1 = 60;
		x.nota2 = 50;
		x.media = x.mediaAluno(); //The "media" attribute of the student class, instantiated by the object x, 
		x.verificaAluno();        //was filled through the return of the media-student method
		
		Student y = new Student();
		
		y.nome = "Mary";
		y.nota1 = 80;
		y.nota2 = 90;
		y.media = y.mediaAluno();
		y.verificaAluno();

	}

}
