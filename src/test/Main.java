package test;

import controleur.C_Visiteur;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modele.dao.Jdbc;
import vue.V_vueVisiteurs;


/**
 *
 * @author btssio
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        //org.apache.derby.jdbc.ClientDriver jdbc:derby://localhost:1527/agenceB_JPA
//        Jdbc.creer("oracle.jdbc.driver.OracleDriver", "jdbc:oracle:thin:", "@localhost:1521:XE", "", "btssio", "btssio");
//        Jdbc.creer("com.mysql.jdbc.Driver", "jdbc:mysql:", "//localhost/", "AGENCEB", "root", "joliverie");
        Jdbc.creer("oracle.jdbc.driver.OracleDriver", "jdbc:oracle:thin:", "@172.15.11.102:1521:orcl", "", "ora_2slamppe_eq6", "equipe06");
        //Jdbc.creer("oracle.jdbc.driver.OracleDriver", "jdbc:oracle:thin:", "@localhost:1521:XE", "", "GSB", "GSB");
        try {
            Jdbc.getInstance().connecter();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection cnx = Jdbc.getInstance().getConnexion();
        V_vueVisiteurs vueVisiteurs = new V_vueVisiteurs();
        C_Visiteur unControleur = new C_Visiteur(vueVisiteurs);
        vueVisiteurs.setControleur(unControleur);
        // afficher la vue
        vueVisiteurs.setVisible(true);
    }
}