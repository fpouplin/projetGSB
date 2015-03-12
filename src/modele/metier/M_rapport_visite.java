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
public class M_rapport_visite {
    
    private int rap_num;
    private String rap_nom_praticien;
    private String rap_prenom_praticien;
    private java.util.Date rap_date;
    private String rap_bilan;
    private String rap_motif;

    /**
     * Constructeur avec les 6 attributs
     *
     * @param rap_num
     * @param rap_nom_praticien;
     * @param rap_prenom_praticien;
     * @param rap_date
     * @param rap_bilan
     * @param rap_motif
     */    
    public M_rapport_visite(int rap_num, String rap_nom_praticien, String rap_prenom_praticien, Date rap_date, String rap_bilan, String rap_motif) {
        this.rap_num = rap_num;
        this.rap_nom_praticien = rap_nom_praticien;
        this.rap_prenom_praticien = rap_prenom_praticien;
        this.rap_date = rap_date;
        this.rap_bilan = rap_bilan;
        this.rap_motif = rap_motif;
    }

    public int getRap_num() {
        return rap_num;
    }

    public void setRap_num(int rap_num) {
        this.rap_num = rap_num;
    }

    public String getRap_nom_praticien() {
        return rap_nom_praticien;
    }

    public void setRap_nom_praticien(String rap_nom_praticien) {
        this.rap_nom_praticien = rap_nom_praticien;
    }

    public String getRap_prenom_praticien() {
        return rap_prenom_praticien;
    }

    public void setRap_prenom_praticien(String rap_prenom_praticien) {
        this.rap_prenom_praticien = rap_prenom_praticien;
    }

    public Date getRap_date() {
        return rap_date;
    }

    public void setRap_date(Date rap_date) {
        this.rap_date = rap_date;
    }

    public String getRap_bilan() {
        return rap_bilan;
    }

    public void setRap_bilan(String rap_bilan) {
        this.rap_bilan = rap_bilan;
    }

    public String getRap_motif() {
        return rap_motif;
    }

    public void setRap_motif(String rap_motif) {
        this.rap_motif = rap_motif;
    }


}
