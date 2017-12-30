/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4;

/**
 *
 * @author Laura
 */
import kata4.Histogram;
import view.HistogramDisplay;
import view.MailHistogramBuilder;
import view.MailListReader;

public class Kata4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String fileName = "emails.txt";
        Histogram<String> histogram = MailHistogramBuilder.build(MailListReader.read(fileName));
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
    
}
