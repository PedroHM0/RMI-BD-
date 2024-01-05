/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Coneccao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author pedro
 */
public class Conectar {

    public static Connection con;
    public static void conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            System.out.println("Driver nao encontrado: "+ e.getMessage());
        }
        String url = "jdbc:mysql://localhost:3306";
        String usuario = "root";
        String senha = "p5r4d2l9s3";
        try{
            con = DriverManager.getConnection(url, usuario, senha);
        }catch(SQLException e){
            System.out.println("Erro ao conectar com o BD: "+ e.getMessage());
        }
    }
    public static void desconectar(){
        try{
            con.close();
        }catch(SQLException e){
            System.out.println("Erro ao encerrar conexÃ£o: "+ e.getMessage());
        }
    }
    
}
