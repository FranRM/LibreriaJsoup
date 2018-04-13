/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.libreriajsoup;

import java.io.IOException;
import static java.rmi.server.LogStream.log;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


/**
 *
 * @author femio23
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Document doc=null;
        try{
        doc = Jsoup.connect("https://weather.com/es-ES/tiempo/hoy/l/SPXX0084:1:SP").get();
        }catch(IOException ioe1){
            System.out.println("Error:"+ioe1.getMessage());
        }
        String title = doc.title();
        System.out.println(title);
        Elements e = doc.getElementsByClass("today_nowcard-temp");
        System.out.println(e);
        e = doc.getElementsByClass("today_nowcard-phrase");
        System.out.println(e);
        

    }
    
}
