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
public class M_labo {
    
    private String code;
    private String nom;
    private String chefVente;
    
    /**
     * Constructeur avec les 3 attributs
     * @param code : identifiant BDD de la table famille
     * @param nom
     * @param chefVente
     */
    
   public M_labo(String code, String nom, String chefVente) {
        this.code = code ;
        this.nom = nom;
        this.chefVente = chefVente;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getChefVente() {
        return chefVente;
    }

    public void setChefVente(String chefVente) {
        this.chefVente = chefVente;
    }
}
