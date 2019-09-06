package mypackage;

import org.apache.log4j.varia.NullAppender;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

public class Main {
    public static void main(String[] args) {
        org.apache.log4j.BasicConfigurator.configure(new NullAppender());
        try {
            //Öppna förbindelsen
            HelloEndpointService helloService = new HelloEndpointServiceLocator();
            //Etablerar förbindelsen
            HelloEndpoint helloEndpoint = helloService.getHelloEndpointPort();
            HelloRequest request = new HelloRequest();
            request.setName("Kamran");
            HelloResponse result = helloEndpoint.sayHello(request);
            System.out.println(result.getMessage());
            System.out.println("Hej");
        } catch (ServiceException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
