/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basedatos;

/**
 *
 * @author LESH
 */
public class BaseDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        SQL db = new SQL();
        db.SQLConnection("root", "", "usuarios");
        /*db.createDB("usuarios");
        db.createTable("users");
        db.insertData("users", "1", "kike", "sosa", "10", "M");
        db.getValues("users");*/
        db.deleteRecord("users", "1");
        db.closeConnection();
    }
    
}
