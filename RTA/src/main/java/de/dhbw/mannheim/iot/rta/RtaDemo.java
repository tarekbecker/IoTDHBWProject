package de.dhbw.mannheim.iot.rta;
import de.dhbw.mannheim.iot.communication.TcpClient;
import de.dhbw.mannheim.iot.model.DemoModel;
import de.dhbw.mannheim.iot.mq.MQHelloWorld;
import de.dhbw.mannheim.iot.mq.MQRegistrationMessage;

/**
 * @author Tarek Auel
 * @since March 05, 2015.
 */
public class RtaDemo {
    DemoModel model;

    public static void main(String[] args)
    {
        System.out.println("client started");
        TcpClient client = new TcpClient(MQHelloWorld.MQ_PORT);
        client.sendMessage(new MQRegistrationMessage(System.currentTimeMillis(),"machine"));
        client.receiveMessage();
        client.close();
    }
}
