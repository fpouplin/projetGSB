/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controleur;

import java.util.List;
import modele.metier.M_visiteur;
import vue.V_vueConnexion;

/**
 *
 * @author btssio
 */
public class C_Connexion {
    
    private int etat;
    private List<M_visiteur> lesVisiteurs;
    private V_vueConnexion vue;
    
    public C_Connexion(V_vueConnexion vue) {
        this.vue.setControleur(this);
        vue = new V_vueConnexion();
    }
}