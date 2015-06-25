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

public class QueriesStefano extends Database
{
    //VARIABLE DECLARATION
    //
    private PreparedStatement prepStmt = null;
    //String for the query
    private String sql = null;
    //Result Set
    private ResultSet result = null; 
    //Declare the connection var used in the class
    private Connection c = null;
    
    
    //EXECUTE
    //
    //Main method of the class.
    //Receives the prepared statement setted up by the query method and executes it
    public ResultSet execute(PreparedStatement query) throws SQLException 
    {
        try 
        {
            //Pass to the prepared statement var the prepared statement for the query
            prepStmt = query;
            //Execute the query
            result = prepStmt.executeQuery();
            //Return the result set ready to be processed 
            return result;
        } 
        catch (SQLException | NullPointerException e) 
        {
            //
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
            //Make appear a popup msgbox with the exception error
            String message = "Query execution failed!!"
                           + "\n\n"
                           + "QUERY STRING: " + "\n"
                           + query 
                           + "\n\n"
                           + "ERROR MESSAGE: " + "\n"
                           + e.getMessage();
            msgbox.setMessage(message);
            msgbox.setTitle("Query Execution Error");
            msgbox.setMsgBoxType("error");
            msgbox.popUpMsgBox();
            //If the connection fails closes it
            if (c != null) { c.close(); }
            //if the prepared statement is still open it closes it
            if (prepStmt != null) { prepStmt.close(); }
        }
//        finally 
//        {
//            //If the connection fails closes it
//            if (c != null) { c.close(); }
//            //After the error has been handled if the prepared statement is not null it closes it
//            if (prepStmt != null) { prepStmt.close(); }
//        }
        //If anything goes wrong it returns a null value
        return null;
    }
    
    
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
        try 
        {
            //Create the connection to the database
            c = getConnection();
            //Create the prepared statement for the query
            PreparedStatement selectAll;
            //Stores the actual MySql code for the query in the string var
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
    
    
    //WTF QUERY
    //
    //Method that plainly executes the query specified as parameter and returns the result set
    
    //<editor-fold defaultstate="collapsed" desc="METHOD CODE DEMO">
    /*
    
    ***This is a sample code about how to invoke and use this method***
    
    try
    {
        //New result set
        ResultSet r;
        //New prepared statement
        PreparedStatement st;
        //Instance of my class where the method is defined
        QueriesStefano ste = new QueriesStefano();
        //STRING SQL
        String query = "SELECT * FROM category;";
        //Simply execute the query specified 
        st = ste.wtfQuery(query);
        //Execute the query
        r = ste.execute(st);
        //Print out to screen the result of the query
        while(r.next())
        {
            System.out.println(r.getString(1));
        }
    }
    catch(NullPointerException e)
    {
        System.out.println();
        System.out.println();
        System.out.println("ERROR!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
     
 */   
//</editor-fold>
    
    public PreparedStatement wtfQuery (String query) throws SQLException
    {
        try 
        {
            //Create the connection to the database
            c = getConnection();
            //Just execute the query passed as parameter and pass it to the result set var
            prepStmt = c.prepareStatement(query);
            //Return the result set obtained from the execution of the query
            return prepStmt;
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
    
    
    //COL TABLE
    //
    //Method that retrieves all the columns from the specified table and database and returns them in a 
    //String array
    
    //<editor-fold defaultstate="collapsed" desc="METHOD CODE DEMO">
    /*
    
    ***This is a sample code about how to invoke and use this method***
    
    //String array for the columns
    String[] prova = null;
    //Define both table and database
    String tab = "user";
    String database = "findmycareer";
    //New instance for the class with the query
    QueriesStefano ste = new QueriesStefano();
    //New instance of this class for the error msgbox 
    PopUpMsgBox msgbox = new PopUpMsgBox();
    try
    {
        //Call the method which returns the string array with all the columns listed
        prova = ste.ColTable(tab, database);
        //For cicle to print the string array to screen
        for(int i=0; i<prova.length; i++)
        {
            System.out.println(prova[i]);
        }
    }
    //This exception is thrown in case of an error in the query
    catch(NullPointerException e)
    {
        String message = "The parameter specified for the method are not correct!!"
                       + "\n\n"
                       + "Database: " + database + "\n"
                       + "Table: " + tab
                       + "\n\n"
                       + "ERROR MESSAGE:" +"\n"
                       + e.getMessage();
        msgbox.setMessage(message);
        msgbox.setTitle("Query Execution Error");
        msgbox.setMsgBoxType("error");
        msgbox.popUpMsgBox();
    }
     
 */   
//</editor-fold>
    
    public PreparedStatement colTable (String database, String table) throws SQLException
    {
        try
        {
            //Create the connection to the database
            c = getConnection();
            //This particular query retrieve from the information schema of the database
            //the column name of the table specified in the function parameters
            sql = "SELECT column_name AS Columns " 
                + "FROM information_schema.columns " 
                + "WHERE table_schema = '" + database + "' "
                + "AND table_name = '" + table + "';";
            //Prepare the statement 
            prepStmt = c.prepareStatement(sql);
            //Set the vars
            //prepStmt.setString(1, database); //database
            //prepStmt.setString(2, table); //table
            System.out.println(sql);
            //Return the prepared statement
            return prepStmt;
        }
        catch (SQLException | NullPointerException e) 
        {
            //Make appear a popup msgbox with the exception error
            String message = "Query execution failed!!"
                           + "\n\n"
                           + "QUERY STRING: " + "\n"
                           + sql  + "\n"
                           + "PARAMETERS: DATABASE " + database  + "AND TABLE "  + table
                           + "\n\n"
                           + "ERROR MESSAGE: " + "\n"
                           + e.getMessage();
            msgbox.setMessage(message);
            msgbox.setTitle("Query Execution Error");
            msgbox.setMsgBoxType("error");
            msgbox.popUpMsgBox();
            //If the connection fails closes it
            if (c != null) { c.close(); }
        }
        return null;    
    }


    //SELECT PARAMS
    //
    //Method to create and return a prepared statement to select data from the specified table
//    //specifing parameters ready to be executed in the class constructor
//    public PreparedStatement selectParams (String table, String[] params, String[] conds, String allFields) throws SQLException
//    {
//        int i, k;
//        try 
//        {
//            //Create the connection to the database
//            c = getConnection();
//            //Create the prepared statement for the query
//            PreparedStatement selectParams;
//            //If the "*", meaning select all the fields, is not set:
//            if(allFields == null)
//            {
//                sql = "SELECT ";
//                //If the string array for the parameters got more than one parameter
//                //Adds as many "?" as for paramters are stored in the parameter string array
//                for(i=0; i<params.length; i++)
//                {
//                   sql += params[i] + ","; 
//                }
//                //Delete the "," after the last ? to avoid erorrs during the execution of the query
//                //NB: the -2 at the end is because there is a white space too at the end of the string
//                //to consider
//                sql = sql.substring(0, sql.length()-2);
//                //Add the table value and the "WHERE" clause to the string
//                sql += " " + table + " WHERE ";
//                for(k=0; k<conds.length; k++)
//                {
//                   sql += conds[k] + " AND " + "\n"; 
//                }
//                //Delete the last "AND" from the string
//                sql = sql.substring(0, sql.length()-4);
//            }
//            else { sql = "SELECT * FROM " +  table + " "; }        
//            
//            
//            
//            
//            //Stores the actual MySql code for the query in the string var
//            sql = "SELECT ? FROM " +  table 
//                + "WHERE ? = ?"    
//                + ";";
//            //selectAll.
//            //Pass to the prepared statement the query string
//            //selectAll = c.prepareStatement(sql);
//            //Return the prepared statement which can now be executed by the execute method
//            //return selectParams;
//        }
//        catch (SQLException e) 
//        {
//            //Make appear a popup msgbox with the exception error
//            String message = "Prepared Statement creation failed"
//                           + "\n\n"
//                           + e.getMessage();
//            msgbox.setMessage(message);
//            msgbox.setTitle("Prepared Statement Error");
//            msgbox.setMsgBoxType("error");
//            msgbox.popUpMsgBox();
//            //If the connection fails closes it
//            if (c != null) { c.close(); }
//        } 
//        return null;
//    }
//     
    
    //DELETE
    //
    //Method to delete records from the specified table
    public int delete (String table, String[][] params) throws SQLException
    {
        int i, k=1, end = params.length-1, deleted=0;
        try 
        {
            //Create the connection to the database
            c = getConnection();
            //Stores the MySql code for the query in the string var
            sql = "DELETE FROM " +  table + " WHERE ";
            for(i=0; i<params.length; i++)
            {
                sql += params[i][0] + " = ? " +  params[i][3] + " ";
            
            }
            //Delete the last conjunction and also the white space after it
            sql = sql.substring(0, sql.length()-(params[end][3].length()+1));
            sql+= ";";
            
            System.out.println(sql);
            
            //Pass to the prepared statement the query string
            prepStmt = c.prepareStatement(sql);
            for(i=0; i<params.length; i++)
            {
                switch(params[i][2])
                {
                    case "String":
                        prepStmt.setString(k, params[i][1]);
                        break;
                    case "int":
                        prepStmt.setInt(k, Integer.parseInt(params[i][1]));
                        break;
                    case "date":
                        break;
                }
            
            }
            deleted = prepStmt.executeUpdate();
            //Return the prepared statement which can now be executed by the execute method
            return deleted;
        }
        catch (SQLException | NullPointerException e) 
        {
            //Make appear a popup msgbox with the exception error
            String message = "Query execution failed!!"
                           + "\n\n"
                           + "QUERY STRING: " + "\n"
                           + sql 
                           + "\n\n"
                           + "ERROR MESSAGE: " + "\n"
                           + e.getMessage();
            msgbox.setMessage(message);
            msgbox.setTitle("Query Execution Error");
            msgbox.setMsgBoxType("error");
            msgbox.popUpMsgBox();
            //If the connection fails closes it
            if (c != null) { c.close(); }
            //if the prepared statement is still open it closes it
            if (prepStmt != null) { prepStmt.close(); }
        } 
        return deleted;
    }
    
    
    //INSERT
    //
    //Method to delete records from the specified table
    public int insert (String table, String[][] params) throws SQLException
    {
        int i, k=1, end = params.length-1, inserted=0;
        try 
        {
            //Create the connection to the database
            c = getConnection();
            //Stores the MySql code for the query in the string var
            sql = "INSERT INTO " + table + " (";
            for(i=0; i<params.length; i++)
            {
                sql += "`" + params[i][0] + "`, ";
            
            }
            //Delete the ", " at the end of the string
            sql = sql.substring(0, sql.length()-2);
            sql += ") VALUES(";
            for(i=0; i<params.length; i++)
            {
                sql += "'?', ";
            
            }
            //Delete the ", " at the end of the string
            sql = sql.substring(0, sql.length()-2);
            sql += "');";
            //Pass to the prepared statement the query string
            prepStmt = c.prepareStatement(sql);
            for(i=0; i<params.length; i++)
            {
                switch(params[i][2])
                {
                    case "String":
                        prepStmt.setString(k, params[i][1]);
                        break;
                    case "int":
                        prepStmt.setInt(k, Integer.parseInt(params[i][1]));
                        break;
                    case "date":
                        break;
                }
            
            }
            inserted = prepStmt.executeUpdate();
            //Return the prepared statement which can now be executed by the execute method
            return inserted;
        }
        catch (SQLException | NullPointerException e) 
        {
            //Make appear a popup msgbox with the exception error
            String message = "Query execution failed!!"
                           + "\n\n"
                           + "QUERY STRING: " + "\n"
                           + sql 
                           + "\n\n"
                           + "ERROR MESSAGE: " + "\n"
                           + e.getMessage();
            msgbox.setMessage(message);
            msgbox.setTitle("Query Execution Error");
            msgbox.setMsgBoxType("error");
            msgbox.popUpMsgBox();
            //If the connection fails closes it
            if (c != null) { c.close(); }
            //if the prepared statement is still open it closes it
            if (prepStmt != null) { prepStmt.close(); }
        } 
        return inserted;
    }
}
