/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package piniatascecy_mysql;
import java.sql.*;

public class ConexionMySQL
{
    Connection conn;
    
    public Connection open() throws ClassNotFoundException, SQLException{
        //Dario: aquí cambié el user y password para acceder con mi base de datos
        /*Ale: Hagan un usuario en sql server con las caracteristicas en este archivo, para que no
               la estemos cambiando a cada rato que subamos cambios al repo */

        String user = "ucchfu7nw2tdhiji";
        String password = "KFXeTCa2evMDSRdEdEQi";
        String url = "jdbc:mysql://ucchfu7nw2tdhiji:KFXeTCa2evMDSRdEdEQi@bq8gbfxvyemas3uv8zxj-mysql.services.clever-cloud.com:3306/bq8gbfxvyemas3uv8zxj";
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        conn = DriverManager.getConnection(url, user, password);
        
        return conn;
    } 
    
    public void close() throws Exception{
        
        if(conn != null){
            
            conn.close();
            System.out.println("Cerrado");
        }
        else{
            System.out.println("Something have been happened");
        }
    }
}
