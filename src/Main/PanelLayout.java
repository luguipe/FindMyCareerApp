package Main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Donati
 */
public class PanelLayout 
{
    
    //PARAMETERS DECLARATION
    private static JFrame form;
    private static CardLayout cardLayout;
    private static JPanel card;
    private static JPanel contentPane;
    private static JButton action;


    /**
    * PARAMETERS SETS
    * 
    */

    //FORM
    public static void setForm(JFrame aForm) { form = aForm; }
    //CARD
    public static void setCard(JPanel aCard) { card = aCard; }
    // CONTENT PANE
    public static void setContentPane(JPanel aContentPane) { contentPane = aContentPane; }
    // ACTION
    public static void setAction(JButton aAction) { action = aAction; }

    /**
    * PARAMETERS GETS
    * 
    */

    // FORM
    public static JFrame getForm() { return form; }
    // CARD
    public static JPanel getCard() { return card; }
    //CONTENT PANE
    public static JPanel getContentPane() { return contentPane; }
    // ACTION
    public static JButton getAction() { return action; }



    public void addCard(JFrame frm, JPanel tank, JPanel layer)
    {
        frm = getForm();
        tank = getContentPane();
        layer = getCard();
        //Gets the content of each thing and then it passes it to the form. because the cards are gonna be JPanels
        //i casted the content it will get to JPanel
        tank = (JPanel)frm.getContentPane();
        //This sais that the card JPanel layout will be a CardLayout instance allowing us to add as many cards as we want
        layer.setLayout(cardLayout= new CardLayout());
        //Adds the card to the contentPane which adds it to the form
        tank.add(layer);
    }        


    public static void main(String[] args)
    {





    }






















}
