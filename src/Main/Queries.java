/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;

//IMPLEMETATIONS
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Queries extends Database
{
    //VARIABLE DECLARATION
    //
    private PreparedStatement prepStmt = null;
    //String for the query
    private String sql = null;
    //Result Set
    private ResultSet result = null; 
    
    
    
    public void execute(PreparedStatement query) throws SQLException 
    {
        try 
        {
            //Pass to the prepared statement var the prepared statement for the query
            prepStmt = query;
            // execute the query
            result = prepStmt.executeQuery();

            /****ASK TO DAVE ABOUT IT******/

            //Close the connection after the query is executed
            //c.close();
            /********Block of code to test the query********/
            //IT'S NO ESSENTIAL FOR THE FUNCTION AND CAN BE DELETED AT WILL
            while(result.next())
            {
                String name = result.getString("firstName");
                String age = result.getString("lastName");
                System.out.println("Name: " + name + "      " + "Age: " + age);
            }
            /**************************************************/
        } 
        catch (SQLException e) 
        {
            //
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
            //Make appear a popup msgbox with the exception error
            msgbox.setMessage(e.getMessage());
            msgbox.setTitle("Query Execution Error");
            msgbox.setMsgBoxType("error");
            msgbox.popUpMsgBox();
        } 
        finally 
        {
            //Discard the prepared statement
            if (prepStmt != null) { prepStmt.close(); }
        }
}//End of the program
    
    
    //
    //
    //QUERIES
    //
    //
    
    //SELECT ALL
    //
    //Method to create and return a prepared statement to select all data from the specified table
    //ready to be executed in the class constructor
    public PreparedStatement selectAll (String table) throws SQLException
    {
        
        //Declare the connection var used in the program
        Connection c = null;
        try 
        {
            //Create the connection to the database
            c = getConnection();
            //Create the prepared statement for the query
            PreparedStatement selectAll;
            sql = "SELECT * FROM " +  table + ";";
            //Pass to the prepared statement the query string
            selectAll = c.prepareStatement(sql);
            //Return the prepared statement which can now be executed by the execute method
            return selectAll;
        }
        catch (SQLException e) 
        {
            //Make appear a popup msgbox with the exception error
            String message = "Prepared Statement creation failed"
                           + "\n\n"
                           + e.getMessage();
            msgbox.setMessage(message);
            msgbox.setTitle("Prepared Statement Error");
            msgbox.setMsgBoxType("error");
            msgbox.popUpMsgBox();
            //If the connection fails closes it
            if (c != null) { c.close(); }
        } 
        return null;
    }
    
    
}
