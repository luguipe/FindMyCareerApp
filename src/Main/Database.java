/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;

//IMPLEMETATIONS
import java.sql.*;


public class Database {

    
    //
    //
    //VARIABLE DECLARATION
    //
    //
    
    
    //CONNECTION STRING VARS
    //
    //User
    private String user = null;     
    //Password
    private String password = null;
    
    public String test = "test";
    
    
    //SQL ELEMENTS
    //
    //Connection
    private Connection conn = null; 
    //Database Driver
    private static final String driver = "com.mysql.jdbc.Driver";
    //Port
    private String port = null;
    //Host
    private String host = null;;
    //Database
    private String database = null;;
    //Database URL
    private String url = null;
    
    
    //Create a new instance of the PopUpMsgBox class to can be able to use msgboxes
    PopUpMsgBox msgbox = new PopUpMsgBox();
    
    
    
    //
    //
    //CLASS MAIN METHOD
    //
    //
    public void dbConnect()
    {
        
        //Declare the connection var used in the program
        Connection c = null;
        //Create the connection to the database
        c = getConnection();
    }
    

    
    //
    //
    //SETTERS AND GETTERS
    //
    //
        
    
    //USER
    //
    //SET
    public void setUser(String user) { 
        this.user = user; 
    }
    //GET
    public String getUser() {
        return user;
    }

    //PASSWORD
    //
    //SET
    public void setPassword(String password) {
        this.password = password;
    }
    //GET
    public String getPassword() {
        return password;
    }

    //PORT
    //
    //SET
    public void setPort(String port) {
        this.port = port;
    }
    //GET
    public String getPort() {
        return port;
    }

    //HOST
    //
    //SET
    public void setHost(String host) {
        this.host = host;
    }
    //GET
    public String getHost() {
        return host;
    }

    //DATABASE
    //
    //SET
    public void setDatabase(String database) {
        this.database = database;
    }
    //GET
    public String getDatabase() {
        return database;
    }
    
    
    //CONNECTION TO THE DATABASE
    //
    //Return the connection
    public Connection getConnection() 
    {
        //Try Catch block to avoid problems in case the class for the driver is not found
        try 
        {
            //Returns the Class object associated with the class or interface with the given string name
            Class.forName(driver);
        } 
        catch (ClassNotFoundException e) 
        {
            //Utilize the class msgbox to show up a popup msgbox with the text of the exception
            msgbox.setMessage(e.getMessage());
            msgbox.setTitle("Class Not Found");
            msgbox.setMsgBoxType("error");
            msgbox.popUpMsgBox();
        }
        //Second try catch block to take care of the connection in case of failure
        try
        {
            //Set the parameters for the connection 
            //
            this.user = this.getUser();         //User
            this.password = this.getPassword(); //Password
            this.host = this.getHost();         //Host
            this.port = this.getPort();         //Port
            this.database = this.getDatabase(); //Database
            //Call the method to create the url string
            this.url = this.createUrl();
            //Create the connection to the database
            conn = DriverManager.getConnection(this.url, this.user, this.password);
            //Make appear a popup msgbox with the exception error
            String message = "The connecton to the database: " + this.database + "\n"
                           + "at host: " + this.host + " on port: " + this.port  + "\n"
                           + "for the user: " + this.user  + "\n"
                           + "identified by password: " + this.password
                           + "\n\n"
                           + "has been succefull!!";
            msgbox.setMessage(message);
            msgbox.setTitle("Connection Successfull");
            msgbox.setMsgBoxType("info");
            //msgbox.popUpMsgBox();
            //Return the connection ready to be used for queries
            return this.conn;
        }
        catch(SQLException e)
        {
            //Make appear a popup msgbox with the exception error
            msgbox.setMessage(e.getMessage());
            msgbox.setTitle("Connection Failed");
            msgbox.setMsgBoxType("error");
            msgbox.popUpMsgBox();
        }
        //Return null after the error has been handled
        return null;
    }
    
        
    //CREATE URL
    //
    //Method to create and return a prepared statement to select all data from the specified table
    //ready to be executed in the class constructor
    private String createUrl()
    {
        
        
        this.host = this.getHost();
        this.database = this.getDatabase();
        this.port = this.getPort();
        
        String urls ="jdbc:mysql://" + this.host + ":" + this.port + "/" + this.database;
        
        return urls;
        
        
    }
}
