/*
 * Little class to take care of showing popup message boxes
 */
package Main;

import javax.swing.*;


public class PopUpMsgBox 
{
    //VARIABLE DECLARATION
    private String msgBoxType = null;
    private String message = null;
    private String title = null;
    private int typeMsgBox = 0;
    
    //
    //
    //CLASS CONSTRUCTOR
    //
    //
    public String confMsgBox()
    {
        String result = null;
        //Get the kind of msgbox wanted
        this.msgBoxType = this.getMsgBoxType();
        //Get the message to be dispalayed
        this.message = this.getMessage();
        //Get the title for the msgbox
        this.title = this.getTitle();
        int dialogChoice = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, this.message, this.msgBoxType, dialogChoice);   
        //int dialogResult = JOptionPane.showConfirmDialog (null, "Would You Like to Save your Previous Note First?","Warning",dialogButton);
    if(dialogResult == JOptionPane.YES_OPTION){
        result = "yes";
        
    }
    else if(dialogResult == JOptionPane.NO_OPTION){
        result = "no";}
    return result;
    }
    
    public void popUpMsgBox()
    {
        //Get the kind of msgbox wanted
        this.msgBoxType = this.getMsgBoxType();
        //Get the message to be dispalayed
        this.message = this.getMessage();
        //Get the title for the msgbox
        this.title = this.getTitle();
        //Switch case to define the msgbox int var type according the input given
        switch(this.msgBoxType)
        {
            case "error":
                this.typeMsgBox = 0;
                break;
            case "info":
                this.typeMsgBox = 1;
                break;
            case "warning":
                this.typeMsgBox = 2;
                break;
            case "question":
                this.typeMsgBox = 3;
                break;
            case "plain":
                this.typeMsgBox = 4;
                break;
            //In any other case than the other options an error msg is shown
            default:
                this.typeMsgBox = 0;
                title = "Wrong Input";
                this.message = "You have inserted a wrong msgbox type!!"  
                    + "\n\n"  
                    + "The available types are:" + "\n\n" 
                    + "- error" + "\n"
                    + "- info" + "\n"
                    + "- warning" + "\n"
                    + "- question" + "\n"
                    + "- plain";
                break;
        }
        //Display the message box
        //SYNTAX: (COMPONENT, MESSAGE, TITLE, INT TYPE)
        //**The component parameter can be left on null without problems
        JOptionPane.showMessageDialog(null, this.message, title, this.typeMsgBox);
    
    }
    
    
    //MESSAGE BOX TYPE
    //
    //SET
    public void setMsgBoxType(String msgBoxType) {
        this.msgBoxType = msgBoxType;
    }
    //GET
    public String getMsgBoxType() {
        return msgBoxType;
    }
    
    //MESSAGE
    //
    //SET
    public void setMessage(String message) {
        this.message = message;
    }
    //GET
    public String getMessage() {
        return message;
    }

    //MESSAGE BOX TITLE
    //
    //SET
    public void setTitle(String title) {
        this.title = title;
    }
    //GET
    public String getTitle() {
        return title;
    }
     
}
