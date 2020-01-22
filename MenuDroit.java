package swing2;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MenuDroit extends JPanel {
	
	JLabel lblMenuDroit,collectionLabel, icontitre;
	
    private JTextField collection;
    
    public MenuDroit(){
    	super();
    	this.setLayout(new FlowLayout(FlowLayout.RIGHT));
        //Je créé un label
        lblMenuDroit = new JLabel("");
        //j'affiche des labels
        this.add(lblMenuDroit);
        this.setBackground(Color.white);
        this.setPreferredSize(new Dimension(200, 600));
        
      //titres
        icontitre = new JLabel(new ImageIcon("lib/titres.png"));
        
        JPanel panIcontitre = new JPanel();

        panIcontitre.setBackground(Color.white);

        panIcontitre.setLayout(new BorderLayout());

        panIcontitre.add(icontitre);
        
       
        //la date de création
          
          JPanel pancollection = new JPanel();

          pancollection.setBackground(Color.white);

          pancollection.setPreferredSize(new Dimension(200, 60));
          

          collection = new JTextField();

          collection.setPreferredSize(new Dimension(150, 25));

          collectionLabel = new JLabel("titre:");

         

          pancollection.add(collection);
        
        
        
        
        this.add(icontitre);
        this.add(pancollection);
        
}
}
