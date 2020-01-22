package swing2;



import java.awt.event.ActionEvent;


public class ControleurTest2 {
	
	    UIMedia vue;
	   public StatusBar statusBar;
	public MenuHaut menuHaut;
	public MenuGauche menuGauche;
	public MenuDroit menuDroit;
	public Caracteristiques caracteristiques;
	public Artistes artistes;
	public Critiques critiques;



	    public ControleurTest2(UIMedia vue) {

	        this.vue = vue;
	        this.statusBar = new StatusBar();
	        this.vue = vue;
	        this.menuHaut = new MenuHaut();
	        this.vue = vue;
	        this.menuGauche = new MenuGauche();
	        this.vue = vue;
	        this.menuDroit = new MenuDroit();
	        this.vue = vue;
	        this.caracteristiques = new Caracteristiques();
	        this.vue = vue;
	        this.critiques = new Critiques();
	        this.vue = vue;
	        this.artistes = new Artistes();
	       
	    }

	    public void actionPerformed(ActionEvent e,String message) {

	    statusBar.show(message);
	    statusBar.revalidate();

	    }
}

	