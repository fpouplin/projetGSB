/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modele.metier;

import java.util.Date;

/**
 *
 * @author btssio
 */
public class M_travailler {
    
    private M_visiteur traVisiteur;
    private M_region traRegion;
    private Date jjmmaa;
    private String tra_role;
    
    /**
     * Constructeur avec les 4 attributs
     * @param jjmmaa : identifiant BDD de la table travailler
     * @param traVisiteur
     * @param traRegion
     * @param tra_role
     */
    
    public M_travailler(M_visiteur traVisiteur, M_region traRegion, Date jjmmaa, String tra_role) {
        this.traVisiteur = traVisiteur ;
        this.traRegion = traRegion;
        this.jjmmaa = jjmmaa;
        this.tra_role = tra_role;
    }

    public M_visiteur getTraVisiteur() {
        return traVisiteur;
    }

    public void setTraVisiteur(M_visiteur traVisiteur) {
        this.traVisiteur = traVisiteur;
    }

    public M_region getTraRegion() {
        return traRegion;
    }

    public void setTraRegion(M_region traRegion) {
        this.traRegion = traRegion;
    }

    public Date getJjmmaa() {
        return jjmmaa;
    }

    public void setJjmmaa(Date jjmmaa) {
        this.jjmmaa = jjmmaa;
    }

    public String getTra_role() {
        return tra_role;
    }

    public void setTra_role(String tra_role) {
        this.tra_role = tra_role;
    }
    
}
