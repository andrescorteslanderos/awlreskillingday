package conectar;

import java.sql.*;

public class ConectarBaseDatos {

	public static Connection conectar() {
		Connection con = null;
		String driver = "oracle.jdbc.driver.OracleDriver";
		String usuario = "usrtest2";
		String password = "1234";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, usuario, password);
			if (con != null) {
				System.out.println("Conectado");
			}
		}catch(ClassNotFoundException | SQLException e) {
			System.out.println("No se pudo conectar a la base de datos");
			e.printStackTrace();
		}
		
		return con;
		
	}
	
	
}
