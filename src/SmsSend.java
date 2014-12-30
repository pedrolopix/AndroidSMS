import java.io.*;
import java.net.Socket;

/**
 * Created by cg on 30/12/14.
 */
public class SmsSend {

    public void send(String host, int port, String sms) {

        try {
            Socket skt = new Socket(host, port);

            DataInputStream din=new DataInputStream(skt.getInputStream());
            DataOutputStream dout=new DataOutputStream(skt.getOutputStream());
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


            System.out.println(din.readLine());  // Android Console: type 'help' for a list of commands
            System.out.println(din.readLine());  // ok

            String aux = "sms send " + port + " \"" + sms + "\"\r\n";
            dout.writeBytes(aux);

            dout.flush();

            dout.close();
            din.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
