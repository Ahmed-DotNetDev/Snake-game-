import javax.swing.*;
import java.awt.*;

public class ProgressBar extends JFrame {
    JProgressBar ProBar;
    JLabel lbl;
    ProgressBar() {
        properties();
    }

    public void properties() {
        setTitle("Loading...");
        lbl=new JLabel("Load Mode...");
        lbl.setBounds(105,10,100,10);
        lbl.setForeground(new Color(2));
        add(lbl);
        ProBar = new JProgressBar(0, 1000);

        ProBar.setBackground(Color.black);
        ProBar.setBounds(45, 30, 200, 20);
        ProBar.setValue(0);
        ProBar.setStringPainted(true);
        add(ProBar);
        setSize(300, 100);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        ProBar.setForeground(new Color(0xFF0000));
    }

    public void test() {
        for (int i = 0; i < 1000; i += 10) {
            ProBar.setValue(i);
            try {
                Thread.sleep(50);
            } catch (Exception e) {
                System.out.println("error: " + e.getMessage());
                System.out.println("error: " + e.getCause());
            }
        }
        dispose();
        GameFrame gameFrame = new GameFrame();
        gameFrame.setVisible(true);
    }
}
