import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cg on 30/12/14.
 */
public class MainForm {
    private JTextField edHost;
    private JTextField edPort;
    private JTextPane edSMS;
    private JButton btSend;
    public JPanel mainPanel;


    public MainForm() {
        btSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendSms(edHost.getText(), edPort.getText(), edSMS.getText());
            }
        });
    }

    private void sendSms(String host, String port, String sms) {
       SmsSend s= new SmsSend();
        s.send(host, Integer.parseInt(port), sms);
    }
}
