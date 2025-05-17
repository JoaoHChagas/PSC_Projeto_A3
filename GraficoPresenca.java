
package pessoa;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class GraficoPresenca {
    public void gerarGrafico(Aluno aluno){
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Presenças", aluno.getPresencas());
        dataset.setValue("Faltas", aluno.getFaltas());
        
       JFreeChart chart = ChartFactory.createPieChart("presença de " + aluno.getNome(),
                              dataset, true, true,false);
       
       ChartFrame frame = new ChartFrame("Gráfico de Presença", chart);
       frame.setSize(500, 400);
       frame.setVisible(true);
    }
    
}
