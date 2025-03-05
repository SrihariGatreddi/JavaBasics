package Advanced.JavaNetworking;
import java.net.*;
public class URLclass {
    public static void main(String[] args) throws MalformedURLException {
        URL url=new URL("https://swayam.gov.in/");
        System.out.println("Protocol:"+url.getProtocol());

        System.out.println("Hostname:"+url.getProtocol());
        System.out.println("Port Number:"+url.getHost());
        System.out.println("File name:"+url.getFile());



    }
}

