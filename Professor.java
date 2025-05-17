
package pessoa;

public class Professor extends Pessoa {
    public Professor(String nome){
        super(nome);
   
    }
    
    public void verificarFaltas(Aluno aluno){
        System.out.println(" Professor " + nome + " verificou as faltas do aluno " + aluno.getNome() + 
                            ": " + aluno.getFaltas() + " faltas ");
    }
    
}
