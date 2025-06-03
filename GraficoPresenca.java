
package pessoa;


import javax.swing.JPanel;
import java.awt.Color;
import java.text.DecimalFormat;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

public class GraficoPresenca {

    public JPanel gerarGrafico(int presencas, int faltas) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        int total = presencas + faltas;

        // Adicionando os dados
        dataset.addValue(presencas, "Presença", "Presença");
        dataset.addValue(faltas, "Falta", "Falta");

        // Criar gráfico
        JFreeChart chart = ChartFactory.createBarChart(
                "Presença x Faltas",  // Título
                "Categoria",          // Eixo X
                "Quantidade",         // Eixo Y
                dataset               // Dados
        );

        // Personalizar o gráfico
        CategoryPlot plot = chart.getCategoryPlot();
        BarRenderer renderer = (BarRenderer) plot.getRenderer();

        // Cor das barras
        renderer.setSeriesPaint(0, Color.BLUE);
        renderer.setSeriesPaint(1, Color.RED);

        // Mostrar rótulos com porcentagem
        DecimalFormat format = new DecimalFormat("0.0%");

        renderer.setDefaultItemLabelGenerator(new StandardCategoryItemLabelGenerator(
                "{2} ({3})", format));
        renderer.setDefaultItemLabelsVisible(true);

        // Alternativamente, mostrar quantidade + percentual manual:
        renderer.setDefaultItemLabelGenerator(new StandardCategoryItemLabelGenerator() {
            @Override
            public String generateLabel(
                    org.jfree.data.category.CategoryDataset dataset, int row, int column) {
                Number value = dataset.getValue(row, column);
                double percentual = value.doubleValue() / total;
                return value.intValue() + " (" + new DecimalFormat("0.0%").format(percentual) + ")";
            }
        });
        renderer.setDefaultItemLabelsVisible(true);

        // Retornar painel
        ChartPanel panel = new ChartPanel(chart);
        return panel;
    }
}
