/*
 * Daovisiteur
 * @author btssio
 * @version 11/12/2014
 */
package modele.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modele.metier.M_visiteur;
import java.util.List;

/**
 *
 * @author nicolas
 */
public class M_daoVisiteur {

    public static M_visiteur selectOne(int matriculeVisiteur) throws SQLException {
        M_visiteur unVisiteur = null;
        ResultSet rs;
        PreparedStatement pstmt;
        Jdbc jdbc = Jdbc.getInstance();
        // préparer la requête
        String requete = "SELECT v.VIS_MATRICULE as mat,"
                      + "VIS_NOM AS nom, \n" +
                        "VIS_PRENOM AS prenom, \n" +
                        "VIS_ADRESSE AS adresse, \n" +
                        "VIS_CP AS cp, \n" +
                        "VIS_VILLE AS ville, \n" +
                        "v.VIS_DATEEMBAUCHE as dateEmb,"+
                        "SEC_LIBELLE AS secteur, \n" +
                        "LAB_NOM AS labo\n" +
                        "FROM VISITEUR v \n" +
                        "INNER JOIN SECTEUR s ON s.SEC_CODE = v.SEC_CODE\n" +
                        "INNER JOIN LABO l ON l.LAB_CODE = v.LAB_CODE "
                 + "     WHERE v.VIS_MATRICULE = '"+ matriculeVisiteur + "' ;";
        pstmt = jdbc.getConnexion().prepareStatement(requete);
        pstmt.setInt(1, matriculeVisiteur);
        rs = pstmt.executeQuery();
        if (rs.next()) {
            String mat = rs.getString("mat");
            String nom = rs.getString("nom");
            String prenom = rs.getString("prenom");
            String adresse = rs.getString("adresse");
            String cp = rs.getString("cp");
            String ville = rs.getString("ville");
            java.util.Date dateEmb = rs.getDate("dateEmb") ;
            String secteur = rs.getString("secteur");
            String labo = rs.getString("labo");
            unVisiteur = new M_visiteur( mat , nom, prenom, adresse, cp, ville, dateEmb, secteur, labo);
        }
        return unVisiteur;
    }

    public static List<M_visiteur> selectAll() throws SQLException {
        List<M_visiteur> lesVisiteurs = new ArrayList<M_visiteur>();
        M_visiteur unVisiteur;
        ResultSet rs;
        PreparedStatement pstmt;
        Jdbc jdbc = Jdbc.getInstance();
        // préparer la requête
        String requete = "SELECT v.VIS_MATRICULE as mat,"
                      + "VIS_NOM AS nom, \n" +
                        "VIS_PRENOM AS prenom, \n" +
                        "VIS_ADRESSE AS adresse, \n" +
                        "VIS_CP AS cp, \n" +
                        "VIS_VILLE AS ville, \n" +
                        "v.VIS_DATEEMBAUCHE as dateEmb,"+
                        "SEC_LIBELLE AS secteur, \n" +
                        "LAB_NOM AS labo\n" +
                        "FROM VISITEUR v \n" +
                        "INNER JOIN SECTEUR s ON s.SEC_CODE = v.SEC_CODE\n" +
                        "INNER JOIN LABO l ON l.LAB_CODE = v.LAB_CODE ;";
        pstmt = jdbc.getConnexion().prepareStatement(requete);
        rs = pstmt.executeQuery();
        while (rs.next()) {
            String mat = rs.getString("mat");
            String nom = rs.getString("nom");
            String prenom = rs.getString("prenom");
            String adresse = rs.getString("adresse");
            String cp = rs.getString("cp");
            String ville = rs.getString("ville");
            java.util.Date dateEmb = rs.getDate("dateEmb") ;
            String secteur = rs.getString("secteur");
            String labo = rs.getString("labo");
            unVisiteur = new M_visiteur( mat , nom, prenom, adresse, cp, ville, dateEmb, secteur, labo);
            lesVisiteurs.add(unVisiteur);
        }
        return lesVisiteurs;
    }
/*
    public static int insert(int idAdresse, Adresse uneAdresse) throws SQLException {
        int nb;
        Jdbc jdbc = Jdbc.getInstance();
        String requete;
        ResultSet rs;
        PreparedStatement pstmt;
        requete = "INSERT INTO ADRESSE (ID, RUE, CDP , VILLE) VALUES (?, ?, ?, ?)";
        pstmt = jdbc.getConnexion().prepareStatement(requete);
        pstmt.setInt(1, idAdresse);
        pstmt.setString(2, uneAdresse.getRue());
        pstmt.setString(3, uneAdresse.getCp());
        pstmt.setString(4, uneAdresse.getVille());
        nb = pstmt.executeUpdate();
        return nb;
    }

    public static int update(int idAdresse, Adresse uneAdresse) throws SQLException {
        int nb;
        Jdbc jdbc = Jdbc.getInstance();
        String requete;
        ResultSet rs;
        PreparedStatement pstmt;
        requete = "UPDATE ADRESSE SET RUE = ? , CDP = ? , VILLE = ? WHERE ID = ?";
        pstmt = jdbc.getConnexion().prepareStatement(requete);
        pstmt.setString(1, uneAdresse.getRue());
        pstmt.setString(2, uneAdresse.getCp());
        pstmt.setString(3, uneAdresse.getVille());
        pstmt.setInt(4, idAdresse);
        nb = pstmt.executeUpdate();
        return nb;
    }

    public static int delete(int idAdresse) throws SQLException {
        int nb;
        Jdbc jdbc = Jdbc.getInstance();
        String requete;
        ResultSet rs;
        PreparedStatement pstmt;
        requete = "DELETE  FROM ADRESSE WHERE ID = ?";
        pstmt = jdbc.getConnexion().prepareStatement(requete);
        pstmt.setInt(1, idAdresse);
        nb = pstmt.executeUpdate();
        return nb;
    }
    
    */
}
