import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("MainForm");
        frame.setContentPane((new MainForm()).mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }
}
