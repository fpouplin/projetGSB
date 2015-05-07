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
public class M_famille {
    private String code; 
    private String libelle;
    
    
     /**
     * Constructeur avec les 2 attributs
     * @param code : identifiant BDD de la table famille
     * @param libelle
     */
    
    public M_famille(String code, String libelle) {
        this.code = code ;
        this.libelle = libelle;

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
