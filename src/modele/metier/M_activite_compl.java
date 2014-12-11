/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modele.metier;

import java.sql.Date;

/**
 *
 * @author btssio
 */
public class M_activite_compl {
    
    private int ac_num;
    private java.sql.Date ac_date;
    private String ac_lieu;
    private String ac_theme;
    private String motif;
    
    
    /**
     * Constructeur avec les 5 attributs
     * @param ac_num : identifiant BDD de la table activite_compl
     * @param ac_date
     * @param ac_lieu
     * @param ac_theme
     * @param motif
    **/
    public M_activite_compl(int ac_num, java.sql.Date ac_date, String ac_lieu, String ac_theme, String motif) {
        this.ac_num = ac_num;
        this.ac_date = ac_date;
        this.ac_lieu = ac_lieu;
        this.ac_theme = ac_theme;
        this.motif = motif;
    }

    public int getAc_num() {
        return ac_num;
    }

    public void setAc_num(int ac_num) {
        this.ac_num = ac_num;
    }

    public Date getAc_date() {
        return ac_date;
    }

    public void setAc_date(Date ac_date) {
        this.ac_date = ac_date;
    }

    public String getAc_lieu() {
        return ac_lieu;
    }

    public void setAc_lieu(String ac_lieu) {
        this.ac_lieu = ac_lieu;
    }

    public String getAc_theme() {
        return ac_theme;
    }

    public void setAc_theme(String ac_theme) {
        this.ac_theme = ac_theme;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }
    
}
