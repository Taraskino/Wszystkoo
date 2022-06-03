package Spotkanie4.Wyjątki;

import java.net.MalformedURLException;
import java.net.URL;

public class CheckExceptionDemo {
    public static void main(String[] args) throws MalformedURLException {
        CheckExceptionDemo checkExceptionDemo = new CheckExceptionDemo();
        //checkExceptionDemo.urlTesterByTryCatch("ttps://onet.pl");
        checkExceptionDemo.urlTesterByThrows("htts://wszib.edu.pl");

    }
    public void urlTesterByTryCatch(String urlStr){
        try {
            URL url = new URL(urlStr);
            System.out.println("Protokól: " + url.getProtocol());
            System.out.println("Host " + url.getHost());
        } catch (MalformedURLException e) {
            System.out.println("Niepoprawny url: " + e.getMessage());
        }
    }
    public void urlTesterByThrows(String urlStr) throws MalformedURLException{
        URL url = new URL(urlStr);
        System.out.println("Protokól: " + url.getProtocol());
        System.out.println("Host " + url.getHost());
    }
}
