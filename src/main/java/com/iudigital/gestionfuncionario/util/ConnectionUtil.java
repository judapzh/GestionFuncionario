
package com.iudigital.gestionfuncionario.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {   
    private static final String URL = "jdbc:sqlserver://localhost:1433/GESTION DE FUNCIONARIOS";
    private static final String USER = "sa";
    private static final String PASSWORD ="8154779";
   
public static Connection getConnection() throws SQLException {
    return DriverManager.getConnection(URL, USER, PASSWORD);
   }
}
