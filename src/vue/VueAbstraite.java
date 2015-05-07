package vue;

import controleur.CtrlAbstrait;
import javax.swing.JFrame;

/**
 * VueAbstraite
 * modèle de vue
 * - un lien vers le contrôleur
 * chaque contrôleur a un lien vers une vue
 * @author nbourgeois
 * @version  octobre 2014
 */

public abstract class VueAbstraite extends JFrame{
    // associations
    protected CtrlAbstrait controleur=null;
    
    public VueAbstraite() {
    }     

    public CtrlAbstrait getControleur() {
        return controleur;
    }

    public void setControleur(CtrlAbstrait controleur) {
        this.controleur = controleur;
    }
    
    
    
    
}
