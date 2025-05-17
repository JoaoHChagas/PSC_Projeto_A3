
package pessoa;

import java.util.ArrayList;
import java.util.List;

public class ListaAluno {
   
   private List<NotaAluno> alunos;
    
public ListaAluno(){
    alunos = new ArrayList<>();
 }   

public void AddAluno(String nome){
    alunos.add(new NotaAluno(nome));
 }

public NotaAluno BuscarAluno(String nome) {
    for (NotaAluno aluno : alunos) {
     if (aluno.getNome().equalsIgnoreCase(nome)){
      return aluno;
     }
    }
    return null;
}
public void MudarNota (String nome, String avaliacao, int nota){
    NotaAluno aluno = BuscarAluno(nome);  
    if (aluno != null){
        switch (avaliacao.toUpperCase()) {
            case "A1":
                aluno.setNotaA1(nota);
                break;
            case "A2":
                aluno.setNotaA2(nota);
                break;
            case "A3":
                aluno.setNotaA3(nota);
                break;  
            default:
                System.out.println("Essa avaliação não exite, tente A1, A2 ou A3");
        }
      }
    }   
public void MudarFalta (String nome, int faltas) {
    NotaAluno aluno = BuscarAluno(nome);
    if (aluno != null) {
        aluno.setFaltas(faltas);
    }
 }
public void ListaTabela(){
    System.out.printf("%-15s%-6s%-6s%-6s%-8s%-8s%n", "Nome", "A1", "A2", "A3", "Total", "Faltas");
    
    for (NotaAluno aluno : alunos){
        System.out.printf("%-15s%-6d%-6d%-6d%-8d%-8d%n",
        aluno.getNome(),
        aluno.getNotaA1(),
        aluno.getNotaA2(),
        aluno.getNotaA3(),
        aluno.getTotalNotas(),
        aluno.getFaltas());
    }    
  }
}

