package main;

import java.util.List;
import view.HistogramDisplay;
import model.Histogram;
import model.Mail;
import view.MailHistogramBuilder;
import view.MailListReader;

public class Kata5P2 {

    public static void main(String[] args) {

        List<Mail> mailList = MailListReader.read("email.txt");
        Histogram histogram = MailHistogramBuilder.build(mailList);
        HistogramDisplay display = new HistogramDisplay(histogram);
        display.execute();
    }
    
}
