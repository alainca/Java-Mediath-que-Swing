package swing2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;


public class MenuHaut extends JPanel {
    JLabel lblMenuHaut,nomLabel, menuLabel;
    JTextField recherche;
    
    
    
    private JButton bouton = new JButton(new ImageIcon("lib/ajouter.png"));
    private JButton bouton2 = new JButton(new ImageIcon("lib/modifier.png"));
    private JButton bouton3 = new JButton(new ImageIcon("lib/supprimer.png"));
    private JButton bouton4 = new JButton(new ImageIcon("lib/valider.png"));
    private JButton bouton5 = new JButton(new ImageIcon("lib/annuler.png"));
    private Color fondBouton = Color.white;
    
    public MenuHaut(){
    	super();
    	
    	
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        //Je créé un label
        lblMenuHaut = new JLabel();
        //j'affiche des labels
        this.add(lblMenuHaut);
        //Je créé les panels
        this.setBackground(Color.white);
       
       
       
       //panel menuhaut
        JPanel menuhaut = new JPanel();
        menuhaut.setBackground(Color.white);
        recherche = new JTextField();
        menuhaut.setPreferredSize(new Dimension(1000, 80));

        recherche.setPreferredSize(new Dimension(180, 25));
        
        this.add(menuhaut);
        menuhaut.add(recherche);
       
        menuhaut.add(bouton);
        menuhaut.add(bouton2);
        menuhaut.add(bouton3);
        menuhaut.add(bouton4);
        menuhaut.add(bouton5);
        menuhaut.add(recherche);
       
        
    

       
        
       
        

      

    		    

    		  
    }


	private void initToolBar() {
		// TODO Auto-generated method stub
		
	}
   
}

