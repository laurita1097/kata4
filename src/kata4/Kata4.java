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
import kata4.Mail;
import view.HistogramDisplay;
import view.MailHistogramBuilder;
import view.MailListReader;
import java.util.List;

public class Kata4 {

    private String fileName;
    private List<Mail> mailList;
    private Histogram<String> histogram;
    private HistogramDisplay histogramDisplay;
    
    public static void main(String[] args) {
        Kata4 kata = new Kata4();
        kata.execute();
    }
    
    private void execute(){
        input();
        proccess();
        output();
    }
    
    private void input(){
        fileName = "emails.txt";
        mailList = MailListReader.read(fileName);
    }
    
    private void proccess(){
        histogram = MailHistogramBuilder.build(mailList);
    }
    
    private void output(){
        histogramDisplay = new HistogramDisplay(histogram);
        histogramDisplay.execute();
    }
}
