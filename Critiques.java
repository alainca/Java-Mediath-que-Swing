package swing2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Critiques extends JPanel {
	JLabel lblCritiques;
    public Critiques(){
        super();
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        lblCritiques = new JLabel("critiques");
        this.add(lblCritiques);
        this.setBackground(Color.red);
        this.setPreferredSize(new Dimension(800, 80));
    }
}
