/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;
import java.sql.*;
import Interface.login;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class Main {
    
    public static void main(String args[]){
        
        
        Connection conn = null;
String url = "jdbc:mysql://localhost:3306/magasin_peinture";
String username = "root";
String password = "";
try {
    conn = DriverManager.getConnection(url, username, password);
    System.out.println("Connected to the database");
} catch (SQLException ex) {
    System.out.println("An error occurred while connecting to the database: " + ex.getMessage());
}  
   login inputForm = new login();
        inputForm.setVisible(true);
        
        String user = inputForm.getUsername();
        System.out.println("User input: " + user);
        String pass = inputForm.getPassword();
        System.out.println("User input: " + pass); }
    
    public void afficher(JTable1 tab) {

        String column[] = { "Code", "Name", "Prix", "Quantity", "description", "category_id" };
        DefaultTableModel model = new DefaultTableModel(null, column);
        try {
       Statement stmt=conn.createStatement;
        
            ResultSet resultat = stmt.executeQuery("SELECT * FROM products");
            
            while (resultat.next()) {
             
                String c = resultat.getString("code");
                String n = resultat.getString("name");
                String p = resultat.getString("prix");
                String q = resultat.getString("quantity");
                String d = resultat.getString("description");
                String ct = resultat.getString("category_id");

                String[] s = { c, n, p, q, d, ct };

                model.addRow(s);

            }
            tab.setModel(model);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }   

    private static class JTable1 {

        public JTable1() {
        }

        private void setModel(DefaultTableModel model) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

    private static class stmt {

        private static ResultSet executeQuery(String select__from_products) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public stmt() {
        }
    }

    private static class conn {

        private static Statement createStatement;

        public conn() {
        }
    }
}
