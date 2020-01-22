package swing2;
import javax.swing.*;
import java.awt.*;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class UIMedia extends JFrame {
    ControleurTest2 cc = new ControleurTest2(this);
    public  UIMedia() {
        super("Ma Mediathèque");
        JPanel container = (JPanel) this.getContentPane();

        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setSize(1024, 768);
        this.setLocationRelativeTo(null);
        container.add(containerWest(),BorderLayout.WEST);
        container.add(containerEast(),BorderLayout.EAST);
        container.add(containerCenter(),BorderLayout.CENTER);
     
        container.add(containerNorth(),BorderLayout.NORTH);
        container.add(containerSouth(),BorderLayout.SOUTH);
        
        this.setVisible(true);

    }
    public Container containerWest(){
    	Container container = cc.menuGauche;
        container.setLayout(new FlowLayout());
        return container;
    }
    public Container containerSouth(){
        Container container = cc.statusBar;
        container.setLayout(new FlowLayout());
        return container;
    }
    public Container containerEast(){
    	Container container = cc.menuDroit;
        container.setLayout(new FlowLayout());
        return container;
    }
    public Container containerNorth(){
    	Container container = cc.menuHaut;
        container.setLayout(new FlowLayout());
        return container;
    }
    public Container containerCenter(){
    	Container container = cc.caracteristiques;
        container.setLayout(new FlowLayout());
        return container;
        
    }
  
}
