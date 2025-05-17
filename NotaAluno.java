
package pessoa;

public class NotaAluno {
 
    private String nome;
    private int notaA1;
    private int notaA2;
    private int notaA3; 
    private int faltas;


public NotaAluno(String nome){
    this.nome = nome;
    notaA1 = 0;
    notaA2 = 0;
    notaA3 = 0;
    faltas = 0;
 }

public String getNome(){
    return nome;
 }

public int getNotaA1(){
    return notaA1;
 }

public void setNotaA1(int notaA1){
    this.notaA1 = notaA1;
 }

public int getNotaA2(){
    return notaA2;
 }

public void setNotaA2(int notaA2){
    this.notaA2 = notaA2;
 }

public int getNotaA3(){
    return notaA3;
 }

public void setNotaA3(int notaA3){
    this.notaA3 = notaA3;
 }

public int getFaltas(){
    return faltas;
 }

public void setFaltas(int faltas){
    this.faltas = faltas;
 }

public int getTotalNotas(){
    return notaA1 + notaA2 + notaA3;
 }
}

