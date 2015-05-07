/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.metier;

/**
 *
 * @author btssio
 */
public class M_praticien {

    private int pra_num;
    private String pra_nom;
    private String pra_prenom;
    private String pra_adresse;
    private String pra_cp;
    private String pra_ville;
    private float pra_coefnotoriete;

    /**
     * Constructeur avec les 8 attributs
     *
     * @param pra_num
     * @param pra_nom
     * @param pra_prenom
     * @param pra_adresse
     * @param pra_cp
     * @param pra_ville
     * @param pra_coefnotoriete
     */
    public M_praticien(int pra_num, String pra_nom, String pra_prenom, String pra_adresse, String pra_cp, String pra_ville, float pra_coefnotoriete) {
        this.pra_num = pra_num;
        this.pra_nom = pra_nom;
        this.pra_prenom = pra_prenom;
        this.pra_adresse = pra_adresse;
        this.pra_cp = pra_cp;
        this.pra_ville = pra_ville;
        this.pra_coefnotoriete = pra_coefnotoriete;

    }

    public int getPra_num() {
        return pra_num;
    }

    public void setPra_num(int pra_num) {
        this.pra_num = pra_num;
    }

    public String getPra_nom() {
        return pra_nom;
    }

    public void setPra_nom(String pra_nom) {
        this.pra_nom = pra_nom;
    }

    public String getPra_prenom() {
        return pra_prenom;
    }

    public void setPra_prenom(String pra_prenom) {
        this.pra_prenom = pra_prenom;
    }

    public String getPra_adresse() {
        return pra_adresse;
    }

    public void setPra_adresse(String pra_adresse) {
        this.pra_adresse = pra_adresse;
    }

    public String getPra_cp() {
        return pra_cp;
    }

    public void setPra_cp(String pra_cp) {
        this.pra_cp = pra_cp;
    }

    public String getPra_ville() {
        return pra_ville;
    }

    public void setPra_ville(String pra_ville) {
        this.pra_ville = pra_ville;
    }

    public float getPra_coefnotoriete() {
        return pra_coefnotoriete;
    }

    public void setPra_coefnotoriete(float pra_coefnotoriete) {
        this.pra_coefnotoriete = pra_coefnotoriete;
    }
}
