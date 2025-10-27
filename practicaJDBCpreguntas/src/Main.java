import util.DBConnection;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {

            DBConnection.getConnection();
            System.out.println("Te has conseguido conectar ala base de Datos.");


        } catch (SQLException e) {
            e.printStackTrace();


        }
    }
}