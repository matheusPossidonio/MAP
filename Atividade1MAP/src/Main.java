import java.nio.file.FileSystemAlreadyExistsException;
import java.util.ArrayList;

public class Main {
	
    public static void enroll(Disciplina dc, Aluno al){
        al.addSubject(dc);
        dc.addStudent(al);
    }
    
    public static void main(String[] args) {
    	
    	//Instanciando os nossos obejtos de classes
         Professor teacher1 = new Professor("Carlos",1);
         Professor teacher2 = new Professor("Jose",2);

         Aluno aluno1= new Aluno("Maria",1);
         Aluno aluno2 = new Aluno("Joao",2);

         Disciplina geografia = new Disciplina("Geografia","3","16:00");
         Disciplina historia = new Disciplina("História","1","15:00");
         Disciplina geologia = new Disciplina("Geologia","2","14:00");
         Disciplina etica = new Disciplina("etica","4","13:00");

         
         //relacionando os objetos entre si 
         enroll(geografia,aluno1);
         enroll(geologia, aluno2);

         teacher1.addSubject(geografia);
         teacher2.addSubject(historia);
         teacher1.addSubject(geologia);
         teacher2.addSubject(etica);

         
         //Respondendo as questões da atividade
         
         //Questão a
        System.out.println("A) Quais disciplinas um professor está ministrando");
        System.out.println("disciplinas que o professor 1 esta ministrando: " + teacher1.ShowSubjects());
        System.out.println("disciplinas que o professor 2 esta ministrando: " + teacher2.ShowSubjects());
        
         //Questão b
        System.out.println();
        System.out.println("B) Qual o horário de um professor");
        System.out.print("horarios que o professor 1 um possui: " + teacher1.ShowSchedulle());
        System.out.print("\n horarios que o professor 2 um possui: " + teacher2.ShowSchedulle());
        System.out.println();

         //questao c
        System.out.println();
        System.out.println("C) Quais os alunos de uma dada disciplina");
        System.out.print("alunos matriculados na disciplina de geologia: " + geologia.listStudents());
        System.out.println();
        
        ArrayList<Aluno> lista = geologia.getListStudents();
        for(int i=0;i<lista.size();i++) {
        	System.out.printf("aluno : %s \n",lista.get(i).getName());
        }
        
      //questao d
        System.out.println();
        System.out.println("D) Quais as disciplinas de um aluno");
        System.out.print("disciplinas em que o aluno 1 esta matriculado: " + aluno1.showSubjects());
        System.out.println();
        
        //questao e
        System.out.println();
        System.out.println("E) Qual o horário de um aluno");
        System.out.print("horarios em que o aluno 1 esta matriculado: " + aluno1.showschedule());
        System.out.println();
        
        //questao f
        System.out.println();
        System.out.println("F) Qual o número de alunos de uma disciplina.");
        System.out.println("quantidade de alunos na disciplina de geologia: " + geologia.countStudents());
        
        
        
    }

}