
package pessoa;

public class Aluno extends Pessoa {
    private int faltas;
    private int totalAulas;
    
    public Aluno(String nome, int totalAulas){
        super(nome);
        
        this.totalAulas = totalAulas;
        this.faltas = 0;
    }
    
    public void setFaltas(int faltas){
    this.faltas = faltas;
    }
    public int getFaltas(){
        return faltas; 
    }
    public int getPresencas() {
        return totalAulas - faltas; 
    }
    
    public double getPorcentagemPresenca(){
        return(getPresencas() * 100.0) / totalAulas;
    }
    
    public double getPorcentagemFaltas(){
        return (faltas * 100.0) / totalAulas;
    }
    
}
