/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controleur;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import static modele.dao.M_daoRapport.selectAllPraticiens;
import modele.metier.M_praticien;
import vue.V_vueRapportsVisite;

/**
 *
 * @author btssio
 */
public class C_Rapport extends CtrlAbstrait {
    
    private int etat;
    private V_vueRapportsVisite vue;
    private List<M_praticien> lesPraticiens;
    private M_praticien unPraticien;

    public C_Rapport(V_vueRapportsVisite vue) throws SQLException {
        super(vue);
        this.vue = vue;
        this.vue.setControleur(this);
        affichagePraticiens();
    }

    private void affichagePraticiens() throws SQLException {
        lesPraticiens = selectAllPraticiens();
        for (int i = 0; i < lesPraticiens.size(); i++) {
            String nom = lesPraticiens.get(i).getPra_nom();
            String prenom = lesPraticiens.get(i).getPra_prenom();
            this.vue.getjComboBoxPraticien().addItem(nom + " " + prenom);
        }
    }

    @Override
    public V_vueRapportsVisite getVue() {
        return (V_vueRapportsVisite) vue;
    }

    public void setVue(V_vueRapportsVisite vue) {
        this.vue = vue;
    }
    
}
