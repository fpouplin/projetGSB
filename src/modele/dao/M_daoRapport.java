/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modele.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modele.metier.M_praticien;

/**
 *
 * @author btssio
 */
public class M_daoRapport {
    
    public static List<M_praticien> selectAllPraticiens() throws SQLException {
        List<M_praticien> lesPraticiens = new ArrayList<M_praticien>();
        M_praticien unPraticien;
        ResultSet rs;
        PreparedStatement pstmt;
        Jdbc jdbc = Jdbc.getInstance();
        // préparer la requête
        
        /*
        pra_num
     * @param pra_nom
     * @param pra_prenom
     * @param pra_adresse
     * @param pra_cp
     * @param pra_ville
     * @param pra_coefnotoriete
        */
        String requete = "SELECT PRA_NUM as num,"
                + "PRA_NOM AS nom, \n"
                + "PRA_PRENOM AS prenom, \n"
                + "PRA_ADRESSE AS adresse, \n"
                + "PRA_CP AS cp, \n"
                + "PRA_VILLE AS ville, \n"
                + "PRA_COEFNOTORIETE as coef \n"
                + "FROM PRATICIEN p";
        pstmt = jdbc.getConnexion().prepareStatement(requete);
        rs = pstmt.executeQuery();
        while (rs.next()) {
            int num = rs.getInt("num");
            String nom = rs.getString("nom");
            String prenom = rs.getString("prenom");
            String adresse = rs.getString("adresse");
            String cp = rs.getString("cp");
            String ville = rs.getString("ville");
            float coef = rs.getFloat("coef");
            unPraticien = new M_praticien( num, nom, prenom, adresse, cp, ville, coef);
            lesPraticiens.add(unPraticien);
        }
        return lesPraticiens;
    }
}
