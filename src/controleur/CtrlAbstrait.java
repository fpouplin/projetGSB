package controleur;

import vue.VueAbstraite;

/**
 * CtrlAbstrait
 * modèle de contrôleur de base
 * chaque contrôleur possède :
 * - une vue
 * - une liaison vers le contrôleur principal
 * @author nbourgeois
 * @version octobre 2014
 */
public abstract class CtrlAbstrait {
    
    protected VueAbstraite vue = null; 

    protected CtrlAbstrait(VueAbstraite vue) {
        this.vue = vue;
        this.vue.setControleur(this);
    }
    
     
    public VueAbstraite getVue() {
        return vue;
    }

    public void setVue(VueAbstraite vue) {
        this.vue = vue;
    }
    

}
