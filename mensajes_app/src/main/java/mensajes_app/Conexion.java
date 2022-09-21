package mensajes_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	public Connection get_connection() {
		
		Connection conection = null;
		
		try {
			
			conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/my-db","root","Annie19/");
			
			if(conection != null) {
				System.out.println("Conexion Exitosa");
			}
			
		} catch (SQLException e) {
			System.out.println(e);
		}
		
		
		return conection;
		
	}

}
