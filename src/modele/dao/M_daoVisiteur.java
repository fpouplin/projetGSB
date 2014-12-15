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
import java.util.Date;
import java.util.List;
import modele.metier.M_visiteur;

/**
 *
 * @author nicolas
 */
public class M_daoVisiteur {

    /*
     @author Florian
     Fonction qui crée un objet visiteur en fonction du matricule du visiteur.
     @Param String matriculeVIsiteur
     */
    
    /*
    public static M_visiteur selectOne(String matriculeVisiteur) throws SQLException {
        M_visiteur unVisiteur = null;
        ResultSet rs;
        PreparedStatement pstmt;
        Jdbc jdbc = Jdbc.getInstance();
        // préparer la requête
        String requete = "SELECT v.VIS_MATRICULE as mat,"
                + "VIS_NOM AS nom, \n"
                + "VIS_PRENOM AS prenom, \n"
                + "VIS_ADRESSE AS adresse, \n"
                + "VIS_CP AS cp, \n"
                + "VIS_VILLE AS ville, \n"
                + "v.VIS_DATEEMBAUCHE as dateEmb,"
                + "SEC_LIBELLE AS secteur, \n"
                + "LAB_NOM AS labo\n"
                + "FROM VISITEUR v \n"
                + "INNER JOIN SECTEUR s ON s.SEC_CODE = v.SEC_CODE\n"
                + "INNER JOIN LABO l ON l.LAB_CODE = v.LAB_CODE "
                + "     WHERE v.VIS_MATRICULE = '" + matriculeVisiteur + "' ";
        pstmt = jdbc.getConnexion().prepareStatement(requete);
        pstmt.setString(1, matriculeVisiteur);
        rs = pstmt.executeQuery();
        if (rs.next()) {
            String mat = rs.getString("mat");
            String nom = rs.getString("nom");
            String prenom = rs.getString("prenom");
            String adresse = rs.getString("adresse");
            String cp = rs.getString("cp");
            String ville = rs.getString("ville");
            java.util.Date dateEmb = rs.getDate("dateEmb");
            String secteur = rs.getString("secteur");
            String labo = rs.getString("labo");
            unVisiteur = new M_visiteur(mat, nom, prenom, adresse, cp, ville, dateEmb, secteur, labo);
        }
        return unVisiteur;
    }
    */

    /*
     @author Florian
     Fonction qui crée une liste d'objet de tous les visiteurs de la base de donnée
     *
     */
    public static List<M_visiteur> selectAll() throws SQLException {
        List<M_visiteur> lesVisiteurs = new ArrayList<M_visiteur>();
        M_visiteur unVisiteur;
        ResultSet rs;
        PreparedStatement pstmt;
        Jdbc jdbc = Jdbc.getInstance();
        // préparer la requête
        String requete = "SELECT v.VIS_MATRICULE as mat,"
                + "VIS_NOM AS nom, \n"
                + "VIS_PRENOM AS prenom, \n"
                + "VIS_ADRESSE AS adresse, \n"
                + "VIS_CP AS cp, \n"
                + "VIS_VILLE AS ville, \n"
                + "v.VIS_DATEEMBAUCHE as dateEmb,"
                + "SEC_LIBELLE AS secteur, \n"
                + "LAB_NOM AS labo\n"
                + "FROM VISITEUR v \n"
                + "INNER JOIN SECTEUR s ON s.SEC_CODE = v.SEC_CODE\n"
                + "INNER JOIN LABO l ON l.LAB_CODE = v.LAB_CODE ";
        pstmt = jdbc.getConnexion().prepareStatement(requete);
        rs = pstmt.executeQuery();
        while (rs.next()) {
            String mat = rs.getString("mat");
            String nom = rs.getString("nom");
            String prenom = rs.getString("prenom");
            String adresse = rs.getString("adresse");
            String cp = rs.getString("cp");
            String ville = rs.getString("ville");
            java.util.Date dateEmb = rs.getDate("dateEmb");
            String secteur = rs.getString("secteur");
            String labo = rs.getString("labo");
            unVisiteur = new M_visiteur(mat, nom, prenom, adresse, cp, ville, dateEmb, secteur, labo);
            lesVisiteurs.add(unVisiteur);
        }
        return lesVisiteurs;
    }

    /*
     @author Benjamin
     Fonction retourne la liste des noms et des prénoms de tous les visiteurs
     *
     */
    public static List<M_visiteur> selectAllNomPrenomVisiteurs() throws SQLException {
        List<M_visiteur> lesVisiteurs = new ArrayList<M_visiteur>();
        M_visiteur unVisiteur;
        ResultSet rs;
        PreparedStatement pstmt;
        Jdbc jdbc = Jdbc.getInstance();
        // préparer la requête
        String requete = "SELECT VIS_NOM as nom, VIS_PRENOM as prenom FROM VISITEUR";
        pstmt = jdbc.getConnexion().prepareStatement(requete);
        rs = pstmt.executeQuery();
        while (rs.next()) {
            String mat=null;
            String adresse=null;
            String cp=null;
            String ville=null;
            Date dateEmb=null;
            String secteur=null;
            String labo=null;
            String nom = rs.getString("nom");
            String prenom = rs.getString("prenom");
            unVisiteur = new M_visiteur(mat, nom, prenom, adresse, cp, ville, dateEmb, secteur, labo);
            lesVisiteurs.add(unVisiteur);
        }
        return lesVisiteurs;
    }

    
    /*
     @author Benjamin
     Fonction qui retourne les informations d'un visiteur en fonction de son nom et de son prenom
     *
     */
    public static M_visiteur rechercheVisiteurByNomPrenomVisiteurs(String nom, String prenom) throws SQLException {
        M_visiteur unVisiteur = null;
        ResultSet rs;
        PreparedStatement pstmt;
        Jdbc jdbc = Jdbc.getInstance();
        // préparer la requête
        String requete = "SELECT VIS_NOM AS nom,VIS_PRENOM AS prenom,VIS_ADRESSE AS adresse,VIS_CP AS cp,VIS_VILLE AS ville,SEC_CODE AS secteur,LAB_CODE AS labo FROM VISITEUR v WHERE VIS_NOM=? AND VIS_PRENOM=?";
        pstmt = jdbc.getConnexion().prepareStatement(requete);
        pstmt.setString(1, nom);
        pstmt.setString(2, prenom);
        rs = pstmt.executeQuery();

        if (rs.next()) {
            String mat = null;
            String adresse = rs.getString("adresse");
            String cp = rs.getString("cp");
            String ville = rs.getString("ville");
            java.util.Date dateEmb = null;
            String secteur = rs.getString("secteur");
            String labo = rs.getString("labo");
            unVisiteur = new M_visiteur(mat, nom, prenom, adresse, cp, ville, dateEmb, secteur, labo);
        }
        return unVisiteur;
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
