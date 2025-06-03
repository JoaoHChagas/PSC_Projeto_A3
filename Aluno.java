
package pessoa;

public class Aluno extends Pessoa {
    
    private int faltas;
    private int presencas;
    private double getTotalAulas;
    
    public Aluno(String nome, int presencas, int faltas ){
        super(nome);
        this.presencas = presencas;
        this.faltas = faltas;
    }

    public void setPresencas(int presencas) {
        this.presencas = presencas;
    }
    public void setFaltas(int faltas){
    this.faltas = faltas;
    }
    public int getFaltas(){
        return faltas; 
    }
    
    public int getTotalAulas(){
        return presencas + faltas;
    }
    public int getPresencas() {
        return presencas; 
    }
 
    public double getPorcentagemPresenca(){
        int total = presencas + faltas;
        return total == 0  ? 0 : (faltas * 100.0) / total;
    }
    
    public double getPorcentagemFaltas(){
        int total = presencas + faltas;
        return total == 0 ? 0 : (faltas * 100.0) / total;
    }
    
}

    public double getPorcentagemFaltas(){
        return (faltas * 100.0) / totalAulas;
    }
    
}
