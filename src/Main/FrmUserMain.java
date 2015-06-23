/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Jak Revai
 */
public class FrmUserMain extends javax.swing.JFrame 
{
    //  TODO
    // SETUP PROFILE BUTTON WITH USERTYPE FROM DATABASE, NEED LOGIN FORM AND USERTYPE VARIABLE IN THAT
    // SETUP SAVE TO PROFILE BUTTON, UPDATE QUERY TO USERPROFILE ON DATABASE, NEED LOGIN FOR THAT?
    // SETUP COURSES, SKILLS, OUTCOMES
    // SETUP LOGOUT, CODE INVALID FOR JDIALOG, NEED NEW LOGIN FORM
    
    CardLayout card; //Creates the layout the form will use - Jak
    FrmLogin frmLogin;
    
    FrmEditProfile frmUserProfile;
    FrmAdmin frmAdminProfile;
    
    //OLD DB CONNECTION !WORKING! - Jak
//    private static final String user = "root";
//    private static final String password = "";
//    private static final String CONN_STRING = "jdbc:mysql://localhost:3306/findmycareer";
     
    //Sets up variables for query execution - Jak
    Connection conn = null;
    PreparedStatement statement;
    ResultSet rs;

    Database db = new Database(); //Creates a database object - Jak
    FrmLogin login = new FrmLogin(); //Creates a login object - Jak
   
    String userType; //Creates a string variable - Jak
    String id;
    
    public FrmUserMain() 
    {
      initComponents();
      //DATABASE CONNECTION       
      db.setUser("root"); //Sets the Username to log in to the database with - Jak
      db.setPassword(""); //Sets the password to log in to the database with - Jak
      db.setHost("localhost"); //Sets the host of the database - Jak
      db.setPort("3306"); //Sets the port that the database server will use - Jak
      db.setDatabase("findmycareer"); //Sets the Database that you will be connecting to - Jak

      //Attempts to connect to the database - Jak
        try 
        {
            conn = db.getConnection();
            //System.out.println("CONNECTED!"); //Testing connection - Jak
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
     //END DATABASE CONNECTION - Jak

    //Assigns userType to the userType in FrmLogin - Jak
    userType = login.getUserType(); //This accesses a private static field, may need to access through class reference - Jak
    id = login.getUserID();
    
     //METHODS
      selectIndustries(); //Runs the selectIndustries Method - Jak
      selectName();
     //END METHODS   
        
    }//END FrmUserMain
    
    //SELECT method for initial Industries combo box - Jak
    private void selectIndustries()
    {       
        ArrayList<String> industries = new ArrayList<>(); //Creates an array - Jak
        String query = "SELECT industry FROM industry"; //Creates a query to fill the industries combo box - Jak        

        //<editor-fold desc="Try-Catch Block">
        try
        {
            statement = conn.prepareStatement(query); //Setup a prepared statement - Jak
            rs = statement.executeQuery();
         
            while (rs.next())
            {     
                String industryName = rs.getString("industry"); //Add items from the industry column into the Array - Jak
//                CbxIndustries_FrmUserMain.addItem(rs.getString("industry")); //This works too
                industries.add(industryName);
            }
            statement.close();
            rs.close();
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        //BUGGY
//        finally //Closes the statement when complete - Jak
//        {
//            try
//            {
//                rs.close();
//                statement.close();
//                conn.close(); //Attempts to close the connection - Jak
//            }
//            catch(Exception e)
//            {
//                JOptionPane.showMessageDialog(null, e);
//            }                 
//        }
//        //</editor-fold>
        
        CbxIndustries_FrmUserMain.setModel(new javax.swing.DefaultComboBoxModel(industries.toArray())); //Sets the Array to the Model of the Combobox - Jak
    }
    
    private void selectName()
    {
        String query = "SELECT firstName FROM user WHERE userID ='"+id+"'";
        
        //<editor-fold desc="Try-Catch for user firstName and lastName">
        try 
        {
            statement = conn.prepareStatement(query);
            rs = statement.executeQuery();
            
            while(rs.next())
            {
                lblName.setText(rs.getString("firstName"));
            }
        } 
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        //</editor-fold>
    }
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TlbCardsLbl = new javax.swing.JToolBar();
        BtnCategory = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        BtnCourses = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        BtnSkills = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        BtnJobs = new javax.swing.JButton();
        CbxCategories_FrmUserMain = new javax.swing.JComboBox();
        LblCategories_FrmUserMain = new javax.swing.JLabel();
        LblIndustry_FrmUserMain = new javax.swing.JLabel();
        CbxIndustries_FrmUserMain = new javax.swing.JComboBox();
        BtnLogOut = new javax.swing.JButton();
        BtnSaveCareer = new javax.swing.JButton();
        main = new javax.swing.JPanel();
        PanelIndustry = new javax.swing.JPanel();
        LblIndustry_PaneIndustry = new javax.swing.JLabel();
        ScrlPaneIndDescr_PanelIndustry = new javax.swing.JScrollPane();
        TxtDescrIndustry_PaneIndustry = new javax.swing.JTextArea();
        PanelCategory = new javax.swing.JPanel();
        ScrlPaneCatDescr_PanelCategory = new javax.swing.JScrollPane();
        TxtDescrCategory_PanelCategory = new javax.swing.JTextArea();
        LblCategoryDescr_PanelCategory = new javax.swing.JLabel();
        PanelCourses = new javax.swing.JPanel();
        CbxCourses_PanelCourses = new javax.swing.JComboBox();
        LblCourses_PanelCourses = new javax.swing.JLabel();
        LblCourseDescr_PanelCourses = new javax.swing.JLabel();
        ScrlPaneCourseDescr_PanelCourses = new javax.swing.JScrollPane();
        TxtCourseDescr_PanelCourse = new javax.swing.JTextArea();
        PanelSkills = new javax.swing.JPanel();
        CbxSkills_PanelSkills = new javax.swing.JComboBox();
        ScrlPaneSkilListl_PanelSkills = new javax.swing.JScrollPane();
        ListSkills_PanelSkills = new javax.swing.JList();
        LblSkillDescr_PanelSkills = new javax.swing.JLabel();
        ScrlPaneSkillDescr_PanelSkills = new javax.swing.JScrollPane();
        TxtSkillDescr_FrmUserMain = new javax.swing.JTextArea();
        PanelJobs = new javax.swing.JPanel();
        CbxJobs_PanelJobs = new javax.swing.JComboBox();
        LblJobs_PanelJobs = new javax.swing.JLabel();
        LblJobDescr_PanelJobs = new javax.swing.JLabel();
        ScrlPaneJobDescr_PanelJobs = new javax.swing.JScrollPane();
        TxtJobDescr_PanelJobs = new javax.swing.JTextArea();
        BtnProfile = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(580, 530));

        TlbCardsLbl.setFloatable(false);
        TlbCardsLbl.setRollover(true);

        BtnCategory.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnCategory.setText("Category Description");
        BtnCategory.setFocusable(false);
        BtnCategory.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnCategory.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCategoryActionPerformed(evt);
            }
        });
        TlbCardsLbl.add(BtnCategory);

        jLabel2.setText("           ");
        TlbCardsLbl.add(jLabel2);

        BtnCourses.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnCourses.setText("Courses");
        BtnCourses.setFocusable(false);
        BtnCourses.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnCourses.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCoursesActionPerformed(evt);
            }
        });
        TlbCardsLbl.add(BtnCourses);

        jLabel3.setText("            ");
        TlbCardsLbl.add(jLabel3);

        BtnSkills.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnSkills.setText("Skills");
        BtnSkills.setFocusable(false);
        BtnSkills.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnSkills.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnSkills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSkillsActionPerformed(evt);
            }
        });
        TlbCardsLbl.add(BtnSkills);

        jLabel4.setText("            ");
        TlbCardsLbl.add(jLabel4);

        BtnJobs.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnJobs.setText("Outcomes");
        BtnJobs.setFocusable(false);
        BtnJobs.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnJobs.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnJobs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnJobsActionPerformed(evt);
            }
        });
        TlbCardsLbl.add(BtnJobs);

        CbxCategories_FrmUserMain.setEnabled(false);
        CbxCategories_FrmUserMain.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CbxCategories_FrmUserMainItemStateChanged(evt);
            }
        });
        CbxCategories_FrmUserMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbxCategories_FrmUserMainActionPerformed(evt);
            }
        });

        LblCategories_FrmUserMain.setText("Categories");

        LblIndustry_FrmUserMain.setText("Industries");

        CbxIndustries_FrmUserMain.setMaximumRowCount(6);
        CbxIndustries_FrmUserMain.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CbxIndustries_FrmUserMainItemStateChanged(evt);
            }
        });
        CbxIndustries_FrmUserMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbxIndustries_FrmUserMainActionPerformed(evt);
            }
        });

        BtnLogOut.setText("Logout");
        BtnLogOut.setBorder(null);
        BtnLogOut.setMaximumSize(new java.awt.Dimension(33, 23));
        BtnLogOut.setMinimumSize(new java.awt.Dimension(63, 23));
        BtnLogOut.setOpaque(false);
        BtnLogOut.setPreferredSize(new java.awt.Dimension(63, 23));
        BtnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLogOutActionPerformed(evt);
            }
        });

        BtnSaveCareer.setText("Save to profile");
        BtnSaveCareer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSaveCareerActionPerformed(evt);
            }
        });

        main.setMinimumSize(new java.awt.Dimension(500, 300));
        main.setPreferredSize(new java.awt.Dimension(500, 300));
        main.setLayout(new java.awt.CardLayout());

        LblIndustry_PaneIndustry.setText("Industry Description");

        TxtDescrIndustry_PaneIndustry.setColumns(20);
        TxtDescrIndustry_PaneIndustry.setRows(5);
        ScrlPaneIndDescr_PanelIndustry.setViewportView(TxtDescrIndustry_PaneIndustry);

        javax.swing.GroupLayout PanelIndustryLayout = new javax.swing.GroupLayout(PanelIndustry);
        PanelIndustry.setLayout(PanelIndustryLayout);
        PanelIndustryLayout.setHorizontalGroup(
            PanelIndustryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelIndustryLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(PanelIndustryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrlPaneIndDescr_PanelIndustry, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblIndustry_PaneIndustry))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        PanelIndustryLayout.setVerticalGroup(
            PanelIndustryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelIndustryLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(LblIndustry_PaneIndustry)
                .addGap(18, 18, 18)
                .addComponent(ScrlPaneIndDescr_PanelIndustry, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        main.add(PanelIndustry, "industry");

        PanelCategory.setMinimumSize(new java.awt.Dimension(500, 300));
        PanelCategory.setPreferredSize(new java.awt.Dimension(500, 300));

        TxtDescrCategory_PanelCategory.setColumns(20);
        TxtDescrCategory_PanelCategory.setRows(5);
        ScrlPaneCatDescr_PanelCategory.setViewportView(TxtDescrCategory_PanelCategory);

        LblCategoryDescr_PanelCategory.setText("Category Description");

        javax.swing.GroupLayout PanelCategoryLayout = new javax.swing.GroupLayout(PanelCategory);
        PanelCategory.setLayout(PanelCategoryLayout);
        PanelCategoryLayout.setHorizontalGroup(
            PanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCategoryLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(PanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrlPaneCatDescr_PanelCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblCategoryDescr_PanelCategory))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        PanelCategoryLayout.setVerticalGroup(
            PanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCategoryLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(LblCategoryDescr_PanelCategory)
                .addGap(18, 18, 18)
                .addComponent(ScrlPaneCatDescr_PanelCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        main.add(PanelCategory, "category");

        PanelCourses.setMinimumSize(new java.awt.Dimension(500, 300));
        PanelCourses.setName(""); // NOI18N
        PanelCourses.setPreferredSize(new java.awt.Dimension(500, 300));

        CbxCourses_PanelCourses.setEnabled(false);
        CbxCourses_PanelCourses.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CbxCourses_PanelCoursesItemStateChanged(evt);
            }
        });
        CbxCourses_PanelCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbxCourses_PanelCoursesActionPerformed(evt);
            }
        });

        LblCourses_PanelCourses.setText("Courses");

        LblCourseDescr_PanelCourses.setText("Description");

        TxtCourseDescr_PanelCourse.setColumns(20);
        TxtCourseDescr_PanelCourse.setRows(5);
        ScrlPaneCourseDescr_PanelCourses.setViewportView(TxtCourseDescr_PanelCourse);

        javax.swing.GroupLayout PanelCoursesLayout = new javax.swing.GroupLayout(PanelCourses);
        PanelCourses.setLayout(PanelCoursesLayout);
        PanelCoursesLayout.setHorizontalGroup(
            PanelCoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCoursesLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(PanelCoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrlPaneCourseDescr_PanelCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblCourseDescr_PanelCourses)
                    .addGroup(PanelCoursesLayout.createSequentialGroup()
                        .addComponent(LblCourses_PanelCourses)
                        .addGap(18, 18, 18)
                        .addComponent(CbxCourses_PanelCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        PanelCoursesLayout.setVerticalGroup(
            PanelCoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCoursesLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(PanelCoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CbxCourses_PanelCourses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblCourses_PanelCourses))
                .addGap(42, 42, 42)
                .addGroup(PanelCoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCoursesLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(ScrlPaneCourseDescr_PanelCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LblCourseDescr_PanelCourses))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        main.add(PanelCourses, "courses");

        PanelSkills.setMinimumSize(new java.awt.Dimension(500, 300));
        PanelSkills.setPreferredSize(new java.awt.Dimension(500, 300));

        CbxSkills_PanelSkills.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Skills in Demand", "Essential Employablity Skills" }));
        CbxSkills_PanelSkills.setToolTipText("Choose the kind of skills you want to see");
        CbxSkills_PanelSkills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbxSkills_PanelSkillsActionPerformed(evt);
            }
        });

        ScrlPaneSkilListl_PanelSkills.setViewportView(ListSkills_PanelSkills);

        LblSkillDescr_PanelSkills.setText("Description");

        TxtSkillDescr_FrmUserMain.setColumns(20);
        TxtSkillDescr_FrmUserMain.setRows(5);
        ScrlPaneSkillDescr_PanelSkills.setViewportView(TxtSkillDescr_FrmUserMain);

        javax.swing.GroupLayout PanelSkillsLayout = new javax.swing.GroupLayout(PanelSkills);
        PanelSkills.setLayout(PanelSkillsLayout);
        PanelSkillsLayout.setHorizontalGroup(
            PanelSkillsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSkillsLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(PanelSkillsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrlPaneSkilListl_PanelSkills, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CbxSkills_PanelSkills, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(PanelSkillsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelSkillsLayout.createSequentialGroup()
                        .addComponent(LblSkillDescr_PanelSkills)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelSkillsLayout.createSequentialGroup()
                        .addComponent(ScrlPaneSkillDescr_PanelSkills, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                        .addGap(24, 24, 24))))
        );
        PanelSkillsLayout.setVerticalGroup(
            PanelSkillsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSkillsLayout.createSequentialGroup()
                .addGroup(PanelSkillsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelSkillsLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(LblSkillDescr_PanelSkills))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSkillsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CbxSkills_PanelSkills, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(PanelSkillsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ScrlPaneSkilListl_PanelSkills, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ScrlPaneSkillDescr_PanelSkills, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        main.add(PanelSkills, "skills");

        PanelJobs.setMinimumSize(new java.awt.Dimension(500, 300));
        PanelJobs.setPreferredSize(new java.awt.Dimension(500, 300));

        CbxJobs_PanelJobs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbxJobs_PanelJobsActionPerformed(evt);
            }
        });

        LblJobs_PanelJobs.setText("Jobs");

        LblJobDescr_PanelJobs.setText("Description");

        TxtJobDescr_PanelJobs.setColumns(20);
        TxtJobDescr_PanelJobs.setRows(5);
        ScrlPaneJobDescr_PanelJobs.setViewportView(TxtJobDescr_PanelJobs);

        javax.swing.GroupLayout PanelJobsLayout = new javax.swing.GroupLayout(PanelJobs);
        PanelJobs.setLayout(PanelJobsLayout);
        PanelJobsLayout.setHorizontalGroup(
            PanelJobsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelJobsLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(PanelJobsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrlPaneJobDescr_PanelJobs, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblJobDescr_PanelJobs)
                    .addGroup(PanelJobsLayout.createSequentialGroup()
                        .addComponent(LblJobs_PanelJobs)
                        .addGap(18, 18, 18)
                        .addComponent(CbxJobs_PanelJobs, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        PanelJobsLayout.setVerticalGroup(
            PanelJobsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelJobsLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(PanelJobsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CbxJobs_PanelJobs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblJobs_PanelJobs))
                .addGap(42, 42, 42)
                .addGroup(PanelJobsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelJobsLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(ScrlPaneJobDescr_PanelJobs, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LblJobDescr_PanelJobs))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        main.add(PanelJobs, "jobs");

        BtnProfile.setText("Profile");
        BtnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnProfileActionPerformed(evt);
            }
        });

        jLabel1.setText("Welcome: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(BtnSaveCareer, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(BtnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(LblIndustry_FrmUserMain)
                        .addGap(22, 22, 22)
                        .addComponent(CbxIndustries_FrmUserMain, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LblCategories_FrmUserMain)
                        .addGap(18, 18, 18)
                        .addComponent(CbxCategories_FrmUserMain, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 51, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(TlbCardsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblName)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CbxIndustries_FrmUserMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblIndustry_FrmUserMain)
                    .addComponent(CbxCategories_FrmUserMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblCategories_FrmUserMain))
                .addGap(35, 35, 35)
                .addComponent(TlbCardsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSaveCareer)
                    .addComponent(BtnLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnProfile))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CbxCourses_PanelCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbxCourses_PanelCoursesActionPerformed

        
    }//GEN-LAST:event_CbxCourses_PanelCoursesActionPerformed

    private void CbxCategories_FrmUserMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbxCategories_FrmUserMainActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_CbxCategories_FrmUserMainActionPerformed

    private void CbxIndustries_FrmUserMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbxIndustries_FrmUserMainActionPerformed
    
    }//GEN-LAST:event_CbxIndustries_FrmUserMainActionPerformed

    private void BtnSaveCareerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSaveCareerActionPerformed
        
    }//GEN-LAST:event_BtnSaveCareerActionPerformed

    private void CbxSkills_PanelSkillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbxSkills_PanelSkillsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbxSkills_PanelSkillsActionPerformed

    private void BtnCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCategoryActionPerformed
        card = (CardLayout)main.getLayout();
        card.show(main, "category"); //Displays the panel named "category"
    }//GEN-LAST:event_BtnCategoryActionPerformed

    private void BtnCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCoursesActionPerformed
        card = (CardLayout)main.getLayout();
        card.show(main, "courses"); //Displays the panel named "courses"
    }//GEN-LAST:event_BtnCoursesActionPerformed

    private void BtnSkillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSkillsActionPerformed
        card = (CardLayout)main.getLayout();
        card.show(main, "skills"); //Displays the panel named "skills"
    }//GEN-LAST:event_BtnSkillsActionPerformed

    private void BtnJobsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnJobsActionPerformed
        card = (CardLayout)main.getLayout();
        card.show(main, "jobs");  //Displays the panel named "jobs"
    }//GEN-LAST:event_BtnJobsActionPerformed

    private void CbxJobs_PanelJobsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbxJobs_PanelJobsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbxJobs_PanelJobsActionPerformed

    private void BtnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnProfileActionPerformed
        // TODO add your handling code here:
 
        if (userType.equals("TYPE02")) //If the user logged in matches this account type, then takes the user to the correct profile - Jak
        {
            this.setVisible(false);
            
            if(frmUserProfile == null)
            {
                frmUserProfile = new FrmEditProfile();
            }     
                frmUserProfile.setVisible(true);
        }
        
        else if(userType.equals("TYPE01")) //If the Admin is logged in, takes the Admin to his profile - Jak
        {
            this.setVisible(false);
            
            if(frmAdminProfile == null)
            {
                frmAdminProfile = new FrmAdmin();
            }
                frmAdminProfile.setVisible(true);
        }       
    }//GEN-LAST:event_BtnProfileActionPerformed

    private void BtnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLogOutActionPerformed
        System.exit(0); //TO DO - Jak
        //takes the user back to the login screen, Makes sure logged out?

        //this.setVisible(false);
        
        //frmLogin.setVisible(true);
    }//GEN-LAST:event_BtnLogOutActionPerformed

    private void CbxIndustries_FrmUserMainItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CbxIndustries_FrmUserMainItemStateChanged
        // TODO add your handling code here:
        
        //Changes back to default, when user picks a new item in the industry combo box - Jak
        card = (CardLayout)main.getLayout();
        card.show(main, "industry"); //Displays the panel named "industry"
       
        //Resets the Combobox - Jak
        CbxCourses_PanelCourses.removeAllItems(); //Removes all previous items in the combobox - Jak
        CbxCourses_PanelCourses.setEnabled(false); //Disables the Course selection combobox - Jak
        CbxSkills_PanelSkills.setEnabled(false); //Disables the Skills selection combobox - Jak
        CbxJobs_PanelJobs.setEnabled(false); //Disables the Jobs selection combobox - Jak
        
        //Resets the description boxes - Jak
        TxtDescrCategory_PanelCategory.setText(""); //Removes any text from the description boxes - Jak
        TxtCourseDescr_PanelCourse.setText("");
        TxtSkillDescr_FrmUserMain.setText("");
        TxtJobDescr_PanelJobs.setText("");
        
        //Resets the employability skills textfield - Jak
        //ListSkills_PanelSkills.removeAll(); //Removes any items in the list - Jak

        CbxCategories_FrmUserMain.setEnabled(true); //Sets the categories combo box to true - Jak   
   
        String query = "SELECT category FROM `category`"; //Categories combobox query - Jak
               
        ArrayList<String> categories = new ArrayList<>(); //Creates an arraylist - Jak
        
        //Fills the categories combobox - Jak
        //<editor-fold desc="Try-Catch for Categories">
        try 
        {
            statement = conn.prepareStatement(query); //setsup statement - Jak
            rs = statement.executeQuery(); //resultset - Jak
            
            while (rs.next())
            {
                String categoryName = rs.getString("category");
                categories.add(categoryName);
                
                CbxCategories_FrmUserMain.setModel(new javax.swing.DefaultComboBoxModel(categories.toArray()));
            }
            statement.close();
            rs.close();
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e);
        }       
        //</editor-fold>
        
        //Fills the description box for Industries Panel
        //<editor-fold desc="Try-Catch for Description in Industries">
        String selectedItem = CbxIndustries_FrmUserMain.getSelectedItem().toString(); //Grabs the selected item in the industries combobox - Jak
        String queryDesc = "SELECT descr FROM industry WHERE industry = '"+selectedItem+"'"; //Description box query - Jak

        try 
        {
            statement = conn.prepareStatement(queryDesc);
            rs = statement.executeQuery();
            
            while(rs.next())
            {
                TxtDescrIndustry_PaneIndustry.setText(rs.getString("descr"));
            }
            statement.close();
            rs.close();
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e);
        }
        //</editor-fold>
        
    }//GEN-LAST:event_CbxIndustries_FrmUserMainItemStateChanged

    private void CbxCategories_FrmUserMainItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CbxCategories_FrmUserMainItemStateChanged
        // TODO add your handling code here:
        
        CbxCourses_PanelCourses.removeAllItems(); //Removes all previous items stored in the Courses combo box - Jak        
        CbxCourses_PanelCourses.setEnabled(true); //Enables the combobox - Jak
        
        String selectedItem = CbxCategories_FrmUserMain.getSelectedItem().toString(); //Grabs the selected item in the categories combobox - Jak
        String selectedItemID = null; //Creates a string variable - Jak
 
        //<editor-fold desc="Gets the selectedItemID">
        try 
        {
            String queryID = "SELECT codCategory FROM category WHERE category = '"+selectedItem+"'"; //Creates a query to grab the category ID based on the selected item in the combobox - Jak
            statement = conn.prepareStatement(queryID);
            rs = statement.executeQuery();
            
            while(rs.next())
            {
                selectedItemID = rs.getString("codCategory"); //Assigns the categoryID column to the selectedItemID string - Jak
            }
            statement.close(); //Close the connections - Jak
            rs.close();
        } 
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        //</editor-fold>
        
        //<editor-fold desc="Try-Catch for Description in Categories Panel">
        try 
        {            
            String queryDesc = "SELECT descr FROM category WHERE category = '"+selectedItem+"'"; //Description box query - Jak
            
            statement = conn.prepareStatement(queryDesc);
            rs = statement.executeQuery();
            
            while(rs.next())
            {
                TxtDescrCategory_PanelCategory.setText(rs.getString("descr"));
            }
            statement.close(); //Close the connections - Jak
            rs.close();
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e);
        }
        //</editor-fold>
        
        //<editor-fold desc="Try-Catch for Courses Panel">
        ArrayList<String> courses = new ArrayList<>(); //Creates an array to store the data for the courses - Jak
        
        try 
        {
            String queryCourse = "SELECT course FROM courses WHERE codCategory = '"+selectedItemID+"'"; //Sets up a query to grab a course based on the category selected in the category combobox - Jak
            statement = conn.prepareStatement(queryCourse);
            rs = statement.executeQuery();
            
            while(rs.next())
            {
                String courseName = rs.getString("course");
                courses.add(courseName); //Adds it to the Array - Jak
                CbxCourses_PanelCourses.setModel(new javax.swing.DefaultComboBoxModel(courses.toArray())); //Sets the Array to the model of the ComboBox - Jak
            }
            statement.close(); //Close the connections - Jak
            rs.close();
        }
        catch (Exception e)
        {
           JOptionPane.showMessageDialog(null, e); 
        }
        //</editor-fold>
        
                //<editor-fold desc="Try-Catch for Courses Description">
        try
        {
            String queryDesc = "SELECT descr FROM courses WHERE codCategory = '"+selectedItemID+"'";
            statement = conn.prepareStatement(queryDesc);
            rs = statement.executeQuery();
            
            while(rs.next())
            {
                TxtCourseDescr_PanelCourse.setText(rs.getString("descr"));
            }
            statement.close();
            rs.close();
        } 
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
        //</editor-fold>
        
    }//GEN-LAST:event_CbxCategories_FrmUserMainItemStateChanged

    private void CbxCourses_PanelCoursesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CbxCourses_PanelCoursesItemStateChanged
//        Remove any text from the description box - Jak
       // TxtCourseDescr_PanelCourse.setText("");
        
//        String selectedItem = CbxCourses_PanelCourses.getSelectedItem().toString(); //Grabs the selected item in the categories combobox - Jak
//        String selectedItemID = null; //Creates a string variable - Jak
//        
        //        //<editor-fold desc="Gets the selectedItemID">
//        try 
//        {
//            String queryID = "SELECT codCategory FROM category WHERE category = '"+selectedItem+"'"; //Creates a query to grab the category ID based on the selected item in the combobox - Jak
//            statement = conn.prepareStatement(queryID);
//            rs = statement.executeQuery();
//            
//            while(rs.next())
//            {
//                selectedItemID = rs.getString("codCategory"); //Assigns the categoryID column to the selectedItemID string - Jak
//            }
//            statement.close(); //Close the connections - Jak
//            rs.close();
//        } 
//        catch (Exception e)
//        {
//            JOptionPane.showMessageDialog(null, e);
//        }
//        //</editor-fold>
        
        //<editor-fold desc="Try-Catch for Courses Description">
//        try
//        {
//            String queryDesc = "SELECT descr FROM courses WHERE course = '"+selectedItem+"'";
//            statement = conn.prepareStatement(queryDesc);
//            rs = statement.executeQuery();
//            
//            while(rs.next())
//            {
//                TxtCourseDescr_PanelCourse.setText(rs.getString("descr"));
//            }
//            statement.close();
//            rs.close();
//        } 
//        catch (Exception e)
//        {
//            JOptionPane.showMessageDialog(null, e);
//        }
        
        //</editor-fold>
    }//GEN-LAST:event_CbxCourses_PanelCoursesItemStateChanged

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String args[]) throws Exception{
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmUserMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmUserMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmUserMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmUserMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmUserMain().setVisible(true);
            }
        });        
        //Code for main

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCategory;
    private javax.swing.JButton BtnCourses;
    private javax.swing.JButton BtnJobs;
    private javax.swing.JButton BtnLogOut;
    private javax.swing.JButton BtnProfile;
    private javax.swing.JButton BtnSaveCareer;
    private javax.swing.JButton BtnSkills;
    private javax.swing.JComboBox CbxCategories_FrmUserMain;
    private javax.swing.JComboBox CbxCourses_PanelCourses;
    private javax.swing.JComboBox CbxIndustries_FrmUserMain;
    private javax.swing.JComboBox CbxJobs_PanelJobs;
    private javax.swing.JComboBox CbxSkills_PanelSkills;
    private javax.swing.JLabel LblCategories_FrmUserMain;
    private javax.swing.JLabel LblCategoryDescr_PanelCategory;
    private javax.swing.JLabel LblCourseDescr_PanelCourses;
    private javax.swing.JLabel LblCourses_PanelCourses;
    private javax.swing.JLabel LblIndustry_FrmUserMain;
    private javax.swing.JLabel LblIndustry_PaneIndustry;
    private javax.swing.JLabel LblJobDescr_PanelJobs;
    private javax.swing.JLabel LblJobs_PanelJobs;
    private javax.swing.JLabel LblSkillDescr_PanelSkills;
    private javax.swing.JList ListSkills_PanelSkills;
    private javax.swing.JPanel PanelCategory;
    private javax.swing.JPanel PanelCourses;
    private javax.swing.JPanel PanelIndustry;
    private javax.swing.JPanel PanelJobs;
    private javax.swing.JPanel PanelSkills;
    private javax.swing.JScrollPane ScrlPaneCatDescr_PanelCategory;
    private javax.swing.JScrollPane ScrlPaneCourseDescr_PanelCourses;
    private javax.swing.JScrollPane ScrlPaneIndDescr_PanelIndustry;
    private javax.swing.JScrollPane ScrlPaneJobDescr_PanelJobs;
    private javax.swing.JScrollPane ScrlPaneSkilListl_PanelSkills;
    private javax.swing.JScrollPane ScrlPaneSkillDescr_PanelSkills;
    private javax.swing.JToolBar TlbCardsLbl;
    private javax.swing.JTextArea TxtCourseDescr_PanelCourse;
    private javax.swing.JTextArea TxtDescrCategory_PanelCategory;
    private javax.swing.JTextArea TxtDescrIndustry_PaneIndustry;
    private javax.swing.JTextArea TxtJobDescr_PanelJobs;
    private javax.swing.JTextArea TxtSkillDescr_FrmUserMain;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblName;
    private javax.swing.JPanel main;
    // End of variables declaration//GEN-END:variables
}
