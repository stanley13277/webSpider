import com.sun.tools.javac.util.Name;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import javax.swing.text.Element;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class test {


    public static String getcontent() throws IOException {
        org.jsoup.nodes.Document doc = Jsoup.connect("http://www.bom.gov.au/places/").get();
        org.jsoup.select.Elements rows = doc.select("tr");
        for(org.jsoup.nodes.Element row :rows){
            org.jsoup.select.Elements columns = row.select("td");
            for (org.jsoup.nodes.Element column:columns){
               return column.text()+"123123";
            }
            System.out.println();
        }
        return "11";
    }



    public static String getCity() {
        Scanner in = new Scanner(System.in);
        String userCity = in.next();
        return userCity;
    }

    public static void sendEmail() {

    }

    public static void main(String[] args) throws IOException {
        System.out.println("this is .jar file");
        System.out.println(getcontent());
        System.out.println("---------------------");
        org.jsoup.nodes.Document doc = Jsoup.connect("http://www.bom.gov.au/places/").get();
        org.jsoup.select.Elements rows = doc.select("tr");
        for(org.jsoup.nodes.Element row :rows)
        {
            org.jsoup.select.Elements columns = row.select("td");
            for (org.jsoup.nodes.Element column:columns) {
                System.out.print(column.text());
            }
            System.out.println();
        }

    }


    }


/*
    org.jsoup.nodes.Document doc = Jsoup.connect("http://www.kantschule-falkensee.de/uploads/dmiadgspahw/klassen/A_Klasse_11.htm").get();
    org.jsoup.select.Elements rows = doc.select("tr");
        for(org.jsoup.nodes.Element row :rows)
                {
                org.jsoup.select.Elements columns = row.select("td");
                for (org.jsoup.nodes.Element column:columns)
                {
                System.out.print(column.text());
                }
                System.out.println();
                }

                }
        //https://stackoverflow.com/questions/31360275/parsing-extracting-a-html-table-website-in-java
                */