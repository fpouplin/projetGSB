package test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modele.dao.Jdbc;

/**
 *
 * @author btssio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //org.apache.derby.jdbc.ClientDriver jdbc:derby://localhost:1527/agenceB_JPA
//        Jdbc.creer("oracle.jdbc.driver.OracleDriver", "jdbc:oracle:thin:", "@localhost:1521:XE", "", "btssio", "btssio");
//        Jdbc.creer("com.mysql.jdbc.Driver", "jdbc:mysql:", "//localhost/", "AGENCEB", "root", "joliverie");
        Jdbc.creer("oracle.jdbc.driver.OracleDriver", "jdbc:oracle:thin:", "@localhost:1521:XE", "", "GSB", "GSB");
        try {
            Jdbc.getInstance().connecter();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection cnx = Jdbc.getInstance().getConnexion();
    
    }
}
