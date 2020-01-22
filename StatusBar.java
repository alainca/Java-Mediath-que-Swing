package swing2;



import javax.swing.*;
import java.awt.*;

public class StatusBar extends JPanel {
    JLabel lblStatusBar;
    public StatusBar(){
        super();
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        lblStatusBar = new JLabel();
        this.add(lblStatusBar);
        this.setBackground(Color.white);
        this.setPreferredSize(new Dimension(800, 80));
        
        

    }
    public void show(String message){
        lblStatusBar.setText(message);


    }

}
