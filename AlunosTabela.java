
package tabelagui_a3;

public class AlunosTabela {
     private int id;
     private String nome;
     private int nota_a1;
     private int nota_a2;
     private int nota_a3;
     private int faltas;
     private String data_falta;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota_a1() {
        return nota_a1;
    }

    public void setNota_a1(int nota_a1) {
        this.nota_a1 = nota_a1;
    }

    public int getNota_a2() {
        return nota_a2;
    }

    public void setNota_a2(int nota_a2) {
        this.nota_a2 = nota_a2;
    }

    public int getNota_a3() {
        return nota_a3;
    }

    public void setNota_a3(int nota_a3) {
        this.nota_a3 = nota_a3;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public String getData_falta() {
        return data_falta;
    }

    public void setData_falta(String data_falta) {
        this.data_falta = data_falta;
    }
    @Override
public String toString() {
    return nome;
}
}
