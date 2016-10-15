import javax.swing.*;
import java.awt.*;

public class gamePanel extends JFrame {
    public gamePanel(String title) {

        this.setSize(500, 800);
        setLocationRelativeTo(null);
        this.setTitle(title);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
        this.setBackground(Color.BLACK);

        Container contentPane = this.getContentPane();
        contentPane.setLayout(new FlowLayout());
    }



}
