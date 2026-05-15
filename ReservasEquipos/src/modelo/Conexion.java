package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Clase Conexion
 * Esta clase se encarga de establecer la conexión entre la aplicación Java y la base de datos MySQL.
 * Aplica el principio de Responsabilidad Única.
 */
public class Conexion {
    
    // Credenciales de la base de datos local
    private final String bd = "bd_reservas";
    private final String url = "jdbc:mysql://localhost:3306/" + bd;
    private final String user = "root";
    private final String password = "";

    /**
     * Método para conectar a la BD.
     * @return Connection Devuelve el estado de la conexión.
     */
    public Connection conectar() {
        Connection link = null;
        try {
            // Se carga el driver de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Se establece la conexión con la URL, usuario y contraseña
            link = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
        return link;
    }
}
