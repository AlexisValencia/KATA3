package kata3;
import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;


public class HistogramaDisplay extends ApplicationFrame {

    public HistogramaDisplay(){
        super ("HISTOGRAMA");
        setContentPane(createPanel ());
        pack();
    }
    
    private ChartPanel createPanel() {
         ChartPanel chartPanel = new ChartPanel(createChart (createDataset()));
         chartPanel.setPreferredSize (new Dimension  (500, 450));
         return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset data){
        JFreeChart chart = ChartFactory.createBarChart(
                null,
                "DOMINIOS",
                "Nº email",
                data,
                PlotOrientation.VERTICAL,
                false, false, false);
                return chart;
                
    }
    
    private DefaultCategoryDataset createDataset() {
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10, "", "gmail.com");
        dataset.addValue(7, "", "ulpgc.es");
        dataset.addValue(4, "", "ull.es");
        dataset.addValue(8, "", "hotmail.com");
        return dataset;
                
                
    }
    
    public void execute(){
        setVisible(true);
    }
    
}



