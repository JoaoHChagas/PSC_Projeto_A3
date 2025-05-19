
package pessoa;

public class AbaPresenca {
    public static void main(String[] args){
        
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null); 
        
        ListaAluno Tabela = new ListaAluno();
        
        Tabela.AddAluno("Aluno1");
        
        Tabela.MudarNota("Aluno1","A1",20);
        Tabela.MudarNota("Aluno1","A2",10);
        Tabela.MudarNota("Aluno1","A3",25);
        Tabela.MudarFalta("Aluno1",5);
        
        Tabela.ListaTabela();
        
        Aluno aluno1 = new Aluno("Ezequiel", 20);
        aluno1.setFaltas(5);
        
        Aluno aluno2 = new Aluno("Enzo", 20);
        aluno2.setFaltas(3);
        
        Aluno aluno3 = new Aluno("Joao", 20);
        aluno3.setFaltas(6);
        
        Professor professor = new Professor("Hissamu");
        professor.verificarFaltas(aluno1);
        professor.verificarFaltas(aluno2);
        professor.verificarFaltas(aluno3);
        
        GraficoPresenca grafico = new GraficoPresenca();
        grafico.gerarGrafico(aluno1);// gráfico individual
        grafico.gerarGrafico(aluno2);// gráfico individual
        grafico.gerarGrafico(aluno3);// gráfico individual
                
    } 
}
    

