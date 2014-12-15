/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import static modele.dao.M_daoVisiteur.rechercheVisiteurByNomPrenomVisiteurs;
import static modele.dao.M_daoVisiteur.selectAllNomPrenomVisiteurs;
import modele.metier.M_visiteur;
import vue.V_vueVisiteurs;

/**
 *
 * @author btssio
 */
public class C_Visiteur extends CtrlAbstrait {

    private int etat;
    private V_vueVisiteurs vue;
    private List<M_visiteur> lesVisiteurs;
    private M_visiteur unVisiteur;

    public C_Visiteur(V_vueVisiteurs vue) throws SQLException {
        super(vue);
        this.vue = vue;
        this.vue.setControleur(this);
        affichageVisiteurs();
    }

    private void affichageVisiteurs() throws SQLException {
        lesVisiteurs = selectAllNomPrenomVisiteurs();
        for (int i = 0; i < lesVisiteurs.size(); i++) {
            String nom = lesVisiteurs.get(i).getNom();
            String prenom = lesVisiteurs.get(i).getPrenom();
            this.vue.getjComboBoxChercher().addItem(nom + " " + prenom);
        }
    }

    /*
     @author Benjamin
     Fonction qui permet d'afficher les onformations d'un visiteur en fonction de son nom et de son prenom
     @Param 
     */
    public void rechercheVisiteur() throws SQLException {
        String nomPrenom = (String) this.vue.getjComboBoxChercher().getSelectedItem();
        String[] listNomPrenom = nomPrenom.split(" ");
        String nom = listNomPrenom[0];
        String prenom = listNomPrenom[1];
        unVisiteur = rechercheVisiteurByNomPrenomVisiteurs(nom, prenom);
        this.vue.getjTextFieldNom().setText(unVisiteur.getNom());
        this.vue.getjTextFieldPrenom().setText(unVisiteur.getPrenom());
        this.vue.getjTextFieldAdresse().setText(unVisiteur.getAdresse());
        this.vue.getjTextFieldCp().setText(unVisiteur.getCp());
        this.vue.getjTextFieldVille().setText(unVisiteur.getVille());
        this.vue.getjTextFieldSecteur().setText(unVisiteur.getSecteur());
        this.vue.getjTextFieldLabo().setText(unVisiteur.getLabo());
    }

    /*
     @author Benjamin
     Fonction qui permet d'afficher les onformations du visiteur suivant en fonction de son nom et de son prenom
     @Param 
     */
    public void suivant() throws SQLException {
        int index = this.vue.getjComboBoxChercher().getSelectedIndex();
        if (index < this.vue.getjComboBoxChercher().getItemCount()-1) {
            this.vue.getjComboBoxChercher().setSelectedIndex(index + 1);
            rechercheVisiteur();
        }
    }

    /*
     @author Benjamin
     Fonction qui permet d'afficher les onformations du visiteur precedent en fonction de son nom et de son prenom
     @Param 
     */
    public void precedent() throws SQLException {
        int index = this.vue.getjComboBoxChercher().getSelectedIndex();
        if (index > 0) {
            this.vue.getjComboBoxChercher().setSelectedIndex(index - 1);
            rechercheVisiteur();
        }
    }

    @Override
    public V_vueVisiteurs getVue() {
        return (V_vueVisiteurs) vue;
    }

    public void setVue(V_vueVisiteurs vue) {
        this.vue = vue;
    }
}
