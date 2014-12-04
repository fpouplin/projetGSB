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
public class M_region {
    
    
    private int reg_code;
    private M_secteur reg_sec;
    private String reg_nom;

    
    public M_region(int reg_code, M_secteur reg_sec, String reg_nom) {
        this.reg_code = reg_code;
        this.reg_sec = reg_sec;
        this.reg_nom = reg_nom;
        
    }
    
    public int getReg_code() {
        return reg_code;
    }

    public void setReg_code(int reg_code) {
        this.reg_code = reg_code;
    }

    public M_secteur getReg_sec() {
        return reg_sec;
    }

    public void setReg_sec(M_secteur reg_sec) {
        this.reg_sec = reg_sec;
    }

    public String getReg_nom() {
        return reg_nom;
    }

    public void setReg_nom(String reg_nom) {
        this.reg_nom = reg_nom;
    }
    
}
