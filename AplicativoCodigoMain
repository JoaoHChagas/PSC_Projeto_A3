
package pessoa;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AbaPresenca {
    public static void main(String[] args){
        
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null); 
        
        ListaAluno Tabela = new ListaAluno();
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameTabelaA3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameTabelaA3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameTabelaA3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameTabelaA3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameTabelaA3().setVisible(true);
            }
        });
    
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
    

