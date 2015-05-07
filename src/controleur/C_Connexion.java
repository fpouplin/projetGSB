/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import modele.dao.Jdbc;
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
        this.vue = vue;
        this.getVue().setControleur(this);
    }

    // ACCESSEURS et MUTATEURS
    public V_vueConnexion getVue() {
        return (V_vueConnexion) vue;
    }

    public void setVue(V_vueConnexion vue) {
        this.vue = vue;
    }

}
