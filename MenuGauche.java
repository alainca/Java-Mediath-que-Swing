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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MenuGauche extends JPanel {
	JLabel lblMenuGauche,nomLabel, datecrealabel, iconsupport,  iconorigine, dateinserlabel, iconinser, iconachat, dateachatlabel, iconcat,iconcrea, originelabel, iconoeu, supportlabel, catLabel;
    private JTextField nom, datecrea, dateinser, dateachat, support, origine, cat;
   
    
    public MenuGauche(){
    	super();
    	this.setLayout(new FlowLayout(FlowLayout.LEFT));
        //Je créé un label
        lblMenuGauche = new JLabel();
        //j'affiche des labels
        this.add(lblMenuGauche);
        this.setPreferredSize(new Dimension(200, 600));
        this.setBackground(Color.white);
        
        //Le nom

        JPanel panNom = new JPanel();

        panNom.setBackground(Color.white);

        panNom.setPreferredSize(new Dimension(200, 30));

        nom = new JTextField();

        nom.setPreferredSize(new Dimension(180, 25));
        
        panNom.setPreferredSize(new Dimension(200, 30));

        nomLabel = new JLabel("");

        panNom.add(nomLabel);

        panNom.add(nom);
        
        
      //La catégorie

        JPanel panCat = new JPanel();

        panCat.setBackground(Color.white);

        panCat.setPreferredSize(new Dimension(200, 30));

        cat = new JTextField();

        cat.setPreferredSize(new Dimension(180, 25));

       

        catLabel = new JLabel(":");

        panCat.add(catLabel);

        panCat.add(cat);
        
        
        
        //je rajoute un panel conteneur général
        JPanel content = new JPanel();
        content.setPreferredSize(new Dimension(200, 600));
        
        
        content.setBackground(Color.white);
      //la date de création
        
        JPanel pancrea = new JPanel();

        pancrea.setBackground(Color.white);

        pancrea.setPreferredSize(new Dimension(200, 30));
        

        datecrea = new JTextField();

        datecrea.setPreferredSize(new Dimension(100, 25));

        datecrealabel = new JLabel("                    ");
        pancrea.add(datecrealabel);
        pancrea.add(datecrea);
        
        
        
        
      //la date d'insertion
        
        JPanel paninse = new JPanel();

        paninse.setBackground(Color.white);
        paninse.setPreferredSize(new Dimension(200, 30));

        dateinser = new JTextField();
        dateinser.setPreferredSize(new Dimension(100, 25));

        dateinserlabel = new JLabel("                    ");

        paninse.add(dateinserlabel);

        paninse.add(dateinser);
        
   
        
        
      //la date d'achat
        
        JPanel panacha = new JPanel();

        panacha.setBackground(Color.white);
        panacha.setPreferredSize(new Dimension(200, 30));
        
        dateachat = new JTextField();
        dateachat.setPreferredSize(new Dimension(100, 25));

        dateachatlabel = new JLabel("                    ");

        panacha.add(dateachatlabel);

        panacha.add(dateachat);
        
//le Support
        
        JPanel panSupport = new JPanel();

        panSupport.setBackground(Color.white);
        panSupport.setPreferredSize(new Dimension(200, 30));
        
        support = new JTextField();
        support.setPreferredSize(new Dimension(100, 25));

        supportlabel = new JLabel("                    ");

        panSupport.add(supportlabel);

        panSupport.add(support);
       
        //L'Origine de l'oeuvre
        

        JPanel panOrigi = new JPanel();

        panOrigi.setBackground(Color.white);

        panOrigi.setPreferredSize(new Dimension(200, 30));
        
        origine = new JTextField();
        origine.setPreferredSize(new Dimension(100, 25));
        originelabel = new JLabel("                    ");

        panOrigi.add(originelabel);

        panOrigi.add(origine);

      //Icône

        iconcat = new JLabel(new ImageIcon("lib/cat.png"));

        JPanel panIconcat = new JPanel();

        panIconcat.setBackground(Color.white);

        panIconcat.setLayout(new BorderLayout());

        panIconcat.add(iconcat);
      //oeuvre
        
        iconoeu = new JLabel(new ImageIcon("lib/oeuvre.png"));

        JPanel panIconoeu = new JPanel();

        panIconoeu.setBackground(Color.white);

        panIconoeu.setLayout(new BorderLayout());

        panIconoeu.add(iconoeu);
        
        //creation
        iconcrea = new JLabel(new ImageIcon("lib/crea.png"));
        
        JPanel panIconcrea = new JPanel();

        panIconcrea.setBackground(Color.white);

        panIconcrea.setLayout(new BorderLayout());

        panIconcrea.add(iconcrea);
        
      //insertion
        iconinser = new JLabel(new ImageIcon("lib/insertion.png"));
        
        JPanel panIconinser = new JPanel();

        panIconinser.setBackground(Color.white);

        panIconinser.setLayout(new BorderLayout());

        panIconinser.add(iconinser);
        
        
        //achat
        iconachat = new JLabel(new ImageIcon("lib/achat.png"));
        
        JPanel panIconachat = new JPanel();

        panIconachat.setBackground(Color.white);

        panIconachat.setLayout(new BorderLayout());

        panIconachat.add(iconachat);
        
      //Support
        iconsupport = new JLabel(new ImageIcon("lib/support.png"));
        
        JPanel panIconsupport = new JPanel();

        panIconsupport.setBackground(Color.white);

        panIconsupport.setLayout(new BorderLayout());

        panIconsupport.add(iconsupport);
        
        
      //Origine
        iconorigine = new JLabel(new ImageIcon("lib/origine.png"));
        
        JPanel panIconorigine = new JPanel();

        panIconorigine.setBackground(Color.white);

        panIconorigine.setLayout(new BorderLayout());

        panIconorigine.add(iconorigine);
        
        
        this.add(content);
        content.add(iconcat);
        content.add(panCat);
        content.add(iconoeu);
        content.add(panNom);
        content.add(iconcrea);
        content.add(pancrea);
        content.add(iconachat);
        content.add(panacha);
        content.add(iconinser);
        content.add(paninse);
        content.add(iconsupport);
        content.add(panSupport);
        content.add(iconorigine);
        content.add(panOrigi);
        
        
        
    

        
        
        
        
      
}
}
