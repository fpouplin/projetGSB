/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controleur;

import java.util.List;
import modele.metier.M_visiteur;
import vue.V_vueVisiteurs;

/**
 *
 * @author btssio
 */
public class C_Visiteur {
    
    private int etat;
    private List<M_visiteur> lesVisiteurs;
    private V_vueVisiteurs vue;
    
    public C_Visiteur(V_vueVisiteurs vue) {
        vue = new V_vueVisiteurs();
    }
    
    public void affichageVisiteurs() {
        this.vue.getjComboBoxChercher().setSelectedItem("coucou");
    }
}