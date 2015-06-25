package Main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1100422815
 */
//import java.awt.*;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import com.google.common.collect.BiMap;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.table.DefaultTableModel;

 
public class FrmAdmin extends javax.swing.JFrame {

    //Create an instance of the class Queries
    //Queries query;
    //New instance of CardLayout
    CardLayout card = new CardLayout();
    PopUpMsgBox msgbox = new PopUpMsgBox();
    QueriesStefano query = new QueriesStefano();
    ResultSet rs;
    PreparedStatement st;
    //Define a var DefaultListModel to can add/remove items from the list for the user param panel
    DefaultListModel listModel = new DefaultListModel();
    FrmAdminConfig config;
    String descr = null;
   
    int capacity =0;
       Map<String, String> boia = new HashMap<String, String>(capacity, 1);
        //Here i declare two arraylists where i'm gonna import the maps and then use for the calculations
        List<HashMap<String, String>> boiaList = new ArrayList<HashMap<String, String>>();
        
      ArrayList<List<String>> arrayQuery = new ArrayList<List<String>>();
       ArrayList<String> cond = new ArrayList();
       ArrayList<String> value = new ArrayList();
    ArrayList prova= new ArrayList();
    JCheckBox[] ckb;
    ArrayList<String> params = new ArrayList();
    //String[][] conds;// = new String[][]{};
    
    Map<String, JCheckBox> ckbs = new HashMap<String, JCheckBox>(capacity, 1);
        //Here i declare two arraylists where i'm gonna import the maps and then use for the calculations
        List<HashMap<String, JCheckBox>> ckbList = new ArrayList<HashMap<String, JCheckBox>>();
    /**
     * Creates new form form
     */
    public FrmAdmin() {
        int i;
        initComponents();
        //CONNECTION PARAMETERS SETTINGS
        //db = new Database();
        query.setUser("root");
        query.setPassword("");
        query.setHost("localhost");
        query.setPort("3306");
        query.setDatabase("findmycareer");
        this.ScrlBarOption.setVisible(false);
        
        
        //DIALOG BOX
        Component parent = this.JDgChooseParams.getParent();
        this.JDgChooseParams.setLocationRelativeTo(parent);
        this.BtnDetails.setVisible(false);
        
        int totComp = this.PanelAge.getComponentCount();
        for(i=0; i<totComp; i++)
        {
            this.PanelAge.getComponent(i).setEnabled(false);
        }    
        //this.CkbAge.setEnabled(true);
        this.RBtnDefine.setSelected(true);
        GridLayout grid = new GridLayout(0,1);
        this.PanelParamCond.setLayout(grid);
        

        //SET THE LIST OF PARAMENTER IN THE DIALOG BOX
        
            String name = null;
        int l=0, j=0;
        
       
        try
        {
            st = query.colTable("findmycareer", "userView" );
            rs = query.execute(st);
            String var;
            Object[][] obj;
            System.out.println(st.toString());
            JCheckBox all = new JCheckBox("All");
            this.PanelParamCond.add(all);
            while (rs.next())
            {
                var = rs.getString("Columns");
                if (var.equalsIgnoreCase("User ID") == false)
                {
                    JCheckBox c = new JCheckBox(var);
                    this.ckbs.put(var, (JCheckBox)c);
                    this.PanelParamCond.add(c);
                    JCheckBox asdf =ckbs.get(var);
                    prova.add(var);
                    
                    System.out.println(asdf.getText());
                }
               
            }
            this.ckbList.add(0, (HashMap<String, JCheckBox>) this.ckbs);        
        }
        catch(SQLException e){System.out.println("ERRORE!!!!!!!!!!!!!!!!!!!!!!!");}
        this.PanelParamCond.repaint();
        this.PanelParamCond.revalidate();        

   

        
      
    }

   
    
    public void pane(String pane)
    {
        
        switch(pane)
        {
            case "Modify Database":
                card = (CardLayout)this.PanelMainCards_FrmAdmin.getLayout();
                card.show(this.PanelMainCards_FrmAdmin, "PanelDbUpdate");
                this.setVisible(true);
            break;
            case "Search by Personal Infos":
                card = (CardLayout)this.PanelMainCards_FrmAdmin.getLayout();
                card.show(this.PanelMainCards_FrmAdmin, "PanelUserParameters");
                int width = this.PanelUserConds.getSize().width;
                this.setSize(630, this.getSize().height);
                
                this.JDgChooseParams.setVisible(true);
            this.setVisible(true);
                break;
            case "Other Parameters":
                card = (CardLayout)this.PanelMainCards_FrmAdmin.getLayout();
                card.show(this.PanelMainCards_FrmAdmin, "PanelUserStats");
                
                
                
                
                this.setVisible(true);
            break;
        }
        
    }        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnGroupRelative = new javax.swing.ButtonGroup();
        JDgChooseParams = new javax.swing.JDialog();
        BtnExit_JDgChooseParams = new javax.swing.JButton();
        LblOverview = new javax.swing.JLabel();
        BtnDone = new javax.swing.JButton();
        ScrlPaneParamCond = new javax.swing.JScrollPane();
        PanelParamCond = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TxtRelativeDescr = new javax.swing.JTextArea();
        CbxParamCond = new javax.swing.JComboBox();
        JDgDetails = new javax.swing.JDialog();
        BtnExit_JDgChooseParams1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        BtnDone_Relative = new javax.swing.JButton();
        ScrlPaneRelative = new javax.swing.JScrollPane();
        PanelRelative = new javax.swing.JPanel();
        PanelPag1 = new javax.swing.JPanel();
        PanelPag2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TxtOverview1 = new javax.swing.JTextArea();
        CbxRelatives = new javax.swing.JComboBox();
        buttonGroup1 = new javax.swing.ButtonGroup();
        BtnExit_FrmAdmin = new javax.swing.JButton();
        PanelMainCards_FrmAdmin = new javax.swing.JPanel();
        PanelDbUpdate = new javax.swing.JPanel();
        CbxOption = new javax.swing.JComboBox();
        CbxSections = new javax.swing.JComboBox();
        LblOptions = new javax.swing.JLabel();
        LblSections = new javax.swing.JLabel();
        LblOptionName = new javax.swing.JLabel();
        LblOptionDescr = new javax.swing.JLabel();
        ScrlPaneOptionDescr = new javax.swing.JScrollPane();
        TxtOptionDescr = new javax.swing.JTextArea();
        LblAction = new javax.swing.JLabel();
        CbxAction = new javax.swing.JComboBox();
        TxtOption = new javax.swing.JTextField();
        ScrlBarOption = new javax.swing.JScrollBar();
        BtnAction = new javax.swing.JButton();
        BtnDetails = new javax.swing.JButton();
        PanelUserStats = new javax.swing.JPanel();
        BtnPrev_FrmAdmin = new javax.swing.JButton();
        BtnView_FrmAdmin = new javax.swing.JButton();
        BtnNext_FrmAdmin = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        CbxJobs = new javax.swing.JComboBox();
        CbxIndustry = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        CbxParams = new javax.swing.JComboBox();
        BtnExecute = new javax.swing.JButton();
        CbxCategory = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CbxCourses = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbUsers = new javax.swing.JTable();
        PanelUserConds = new javax.swing.JPanel();
        LblSelectedParams = new javax.swing.JLabel();
        PanelAge = new javax.swing.JPanel();
        LblAge = new javax.swing.JLabel();
        TxtAge = new javax.swing.JTextField();
        CbxAgeOptions = new javax.swing.JComboBox();
        CkbAge = new javax.swing.JCheckBox();
        BtnSeeResults = new javax.swing.JButton();
        BtnInsCond = new javax.swing.JButton();
        BtnRemoveCond = new javax.swing.JButton();
        ScrlPaneListConds = new javax.swing.JScrollPane();
        ListConds = new javax.swing.JList();
        PanelSetConds = new javax.swing.JPanel();
        CbxFields = new javax.swing.JComboBox();
        RBtnManual = new javax.swing.JRadioButton();
        RBtnDefine = new javax.swing.JRadioButton();
        PanelSetCondOptions = new javax.swing.JPanel();
        PanelDefineCond = new javax.swing.JPanel();
        TxtSearchCondOptions = new javax.swing.JTextField();
        CbxSearchCondsOptions = new javax.swing.JComboBox();
        ScrlBarSearch = new javax.swing.JScrollBar();
        PanelManualInsCond = new javax.swing.JPanel();
        LblCondValue = new javax.swing.JLabel();
        TxtCondValue = new javax.swing.JTextField();
        ScrlBarManual = new javax.swing.JScrollBar();

        JDgChooseParams.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        JDgChooseParams.setTitle("Choose The Parameters");
        JDgChooseParams.setMaximumSize(new java.awt.Dimension(450, 330));
        JDgChooseParams.setMinimumSize(new java.awt.Dimension(450, 330));
        JDgChooseParams.setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        JDgChooseParams.setModalityType(java.awt.Dialog.ModalityType.TOOLKIT_MODAL);
        JDgChooseParams.setPreferredSize(new java.awt.Dimension(450, 330));
        JDgChooseParams.setResizable(false);

        BtnExit_JDgChooseParams.setText("Exit");
        BtnExit_JDgChooseParams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExit_JDgChooseParamsActionPerformed(evt);
            }
        });

        LblOverview.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblOverview.setText("Overview");

        BtnDone.setText("Done");
        BtnDone.setMaximumSize(new java.awt.Dimension(80, 23));
        BtnDone.setPreferredSize(new java.awt.Dimension(80, 23));
        BtnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDoneActionPerformed(evt);
            }
        });

        ScrlPaneParamCond.setMinimumSize(new java.awt.Dimension(100, 100));

        PanelParamCond.setBackground(new java.awt.Color(255, 255, 255));
        PanelParamCond.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        PanelParamCond.setMinimumSize(new java.awt.Dimension(102, 121));
        PanelParamCond.setLayout(new java.awt.GridBagLayout());
        ScrlPaneParamCond.setViewportView(PanelParamCond);

        jScrollPane2.setMaximumSize(new java.awt.Dimension(177, 166));
        jScrollPane2.setMinimumSize(new java.awt.Dimension(177, 166));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(177, 166));

        TxtRelativeDescr.setColumns(20);
        TxtRelativeDescr.setRows(5);
        TxtRelativeDescr.setMinimumSize(new java.awt.Dimension(130, 22));
        TxtRelativeDescr.setPreferredSize(new java.awt.Dimension(164, 142));
        jScrollPane2.setViewportView(TxtRelativeDescr);

        CbxParamCond.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Parameters", "Conditions" }));
        CbxParamCond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbxParamCondActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JDgChooseParamsLayout = new javax.swing.GroupLayout(JDgChooseParams.getContentPane());
        JDgChooseParams.getContentPane().setLayout(JDgChooseParamsLayout);
        JDgChooseParamsLayout.setHorizontalGroup(
            JDgChooseParamsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JDgChooseParamsLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(JDgChooseParamsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ScrlPaneParamCond, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(JDgChooseParamsLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(BtnDone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CbxParamCond, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(JDgChooseParamsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblOverview, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JDgChooseParamsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnExit_JDgChooseParams, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        JDgChooseParamsLayout.setVerticalGroup(
            JDgChooseParamsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JDgChooseParamsLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(JDgChooseParamsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JDgChooseParamsLayout.createSequentialGroup()
                        .addComponent(LblOverview)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JDgChooseParamsLayout.createSequentialGroup()
                        .addComponent(CbxParamCond, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ScrlPaneParamCond, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnDone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(BtnExit_JDgChooseParams)
                .addGap(32, 32, 32))
        );

        JDgChooseParams.getAccessibleContext().setAccessibleParent(this);

        JDgDetails.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        JDgDetails.setTitle("Choose The Parameters");
        JDgDetails.setMinimumSize(new java.awt.Dimension(450, 330));
        JDgDetails.setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        JDgDetails.setModalityType(java.awt.Dialog.ModalityType.TOOLKIT_MODAL);
        JDgDetails.setResizable(false);

        BtnExit_JDgChooseParams1.setText("Exit");
        BtnExit_JDgChooseParams1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExit_JDgChooseParams1ActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Search Parameters Overview");

        BtnDone_Relative.setText("Done");
        BtnDone_Relative.setMaximumSize(new java.awt.Dimension(80, 23));
        BtnDone_Relative.setPreferredSize(new java.awt.Dimension(80, 23));
        BtnDone_Relative.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDone_RelativeActionPerformed(evt);
            }
        });

        ScrlPaneRelative.setMinimumSize(new java.awt.Dimension(100, 100));

        PanelRelative.setBackground(new java.awt.Color(255, 255, 255));
        PanelRelative.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        PanelRelative.setMinimumSize(new java.awt.Dimension(102, 121));
        PanelRelative.setLayout(new java.awt.CardLayout());

        PanelPag1.setBackground(new java.awt.Color(255, 255, 51));
        PanelPag1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        PanelPag1.setMinimumSize(new java.awt.Dimension(102, 121));
        PanelPag1.setLayout(new java.awt.GridBagLayout());
        PanelRelative.add(PanelPag1, "pag1");

        PanelPag2.setBackground(new java.awt.Color(0, 0, 255));
        PanelPag2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        PanelPag2.setMinimumSize(new java.awt.Dimension(102, 121));
        PanelPag2.setLayout(new java.awt.GridBagLayout());
        PanelRelative.add(PanelPag2, "pag2");

        ScrlPaneRelative.setViewportView(PanelRelative);

        jScrollPane4.setMaximumSize(new java.awt.Dimension(177, 166));
        jScrollPane4.setMinimumSize(new java.awt.Dimension(177, 166));
        jScrollPane4.setPreferredSize(new java.awt.Dimension(177, 166));

        TxtOverview1.setColumns(20);
        TxtOverview1.setRows(5);
        TxtOverview1.setMinimumSize(new java.awt.Dimension(130, 22));
        TxtOverview1.setPreferredSize(new java.awt.Dimension(164, 142));
        jScrollPane4.setViewportView(TxtOverview1);

        CbxRelatives.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Skills", "Sol" }));
        CbxRelatives.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbxRelativesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JDgDetailsLayout = new javax.swing.GroupLayout(JDgDetails.getContentPane());
        JDgDetails.getContentPane().setLayout(JDgDetailsLayout);
        JDgDetailsLayout.setHorizontalGroup(
            JDgDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JDgDetailsLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(JDgDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ScrlPaneRelative, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(JDgDetailsLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(BtnDone_Relative, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CbxRelatives, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(JDgDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JDgDetailsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnExit_JDgChooseParams1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        JDgDetailsLayout.setVerticalGroup(
            JDgDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JDgDetailsLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(JDgDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JDgDetailsLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JDgDetailsLayout.createSequentialGroup()
                        .addComponent(CbxRelatives, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ScrlPaneRelative, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnDone_Relative, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(BtnExit_JDgChooseParams1)
                .addGap(32, 32, 32))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FIND MY CAREER");
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(595, 485));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        BtnExit_FrmAdmin.setText("Exit");
        BtnExit_FrmAdmin.setName(""); // NOI18N
        BtnExit_FrmAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExit_FrmAdminActionPerformed(evt);
            }
        });

        PanelMainCards_FrmAdmin.setPreferredSize(new java.awt.Dimension(595, 410));
        PanelMainCards_FrmAdmin.setLayout(new java.awt.CardLayout());

        PanelDbUpdate.setMaximumSize(new java.awt.Dimension(595, 410));
        PanelDbUpdate.setMinimumSize(new java.awt.Dimension(595, 410));

        CbxOption.setAutoscrolls(true);
        CbxOption.setEnabled(false);
        CbxOption.setMaximumSize(new java.awt.Dimension(169, 20));
        CbxOption.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                CbxOptionPopupMenuWillBecomeVisible(evt);
            }
        });
        CbxOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbxOptionActionPerformed(evt);
            }
        });

        CbxSections.setMaximumRowCount(6);
        CbxSections.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Category", "Courses", "Industry", "Jobs", "Skills" }));
        CbxSections.setEnabled(false);
        CbxSections.setMaximumSize(new java.awt.Dimension(130, 20));
        CbxSections.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbxSectionsActionPerformed(evt);
            }
        });

        LblOptions.setText("Options");

        LblSections.setText("Sections");

        LblOptionName.setText("Name");

        LblOptionDescr.setText("Description");

        TxtOptionDescr.setEditable(false);
        TxtOptionDescr.setColumns(20);
        TxtOptionDescr.setLineWrap(true);
        TxtOptionDescr.setRows(5);
        TxtOptionDescr.setWrapStyleWord(true);
        TxtOptionDescr.setFocusable(false);
        ScrlPaneOptionDescr.setViewportView(TxtOptionDescr);

        LblAction.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LblAction.setText("Action");

        CbxAction.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Delete", "Insert", "Update" }));
        CbxAction.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                CbxActionPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        CbxAction.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CbxActionMouseClicked(evt);
            }
        });
        CbxAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbxActionActionPerformed(evt);
            }
        });

        TxtOption.setEditable(false);
        TxtOption.setFocusable(false);
        TxtOption.setMaximumSize(new java.awt.Dimension(143, 23));
        TxtOption.setMinimumSize(new java.awt.Dimension(143, 23));
        TxtOption.setPreferredSize(new java.awt.Dimension(143, 23));
        TxtOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtOptionActionPerformed(evt);
            }
        });
        TxtOption.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                TxtOptionPropertyChange(evt);
            }
        });
        TxtOption.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtOptionKeyReleased(evt);
            }
        });

        ScrlBarOption.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        ScrlBarOption.setModel(TxtOption.getHorizontalVisibility());

        BtnAction.setText("Get Data");
        BtnAction.setEnabled(false);
        BtnAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActionActionPerformed(evt);
            }
        });

        BtnDetails.setText("Set Details");
        BtnDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelDbUpdateLayout = new javax.swing.GroupLayout(PanelDbUpdate);
        PanelDbUpdate.setLayout(PanelDbUpdateLayout);
        PanelDbUpdateLayout.setHorizontalGroup(
            PanelDbUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDbUpdateLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(PanelDbUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDbUpdateLayout.createSequentialGroup()
                        .addGroup(PanelDbUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PanelDbUpdateLayout.createSequentialGroup()
                                .addComponent(LblSections)
                                .addGap(18, 18, 18)
                                .addComponent(CbxSections, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(PanelDbUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(PanelDbUpdateLayout.createSequentialGroup()
                                    .addComponent(LblOptionName)
                                    .addGap(18, 18, 18)
                                    .addComponent(TxtOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(ScrlBarOption, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelDbUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDbUpdateLayout.createSequentialGroup()
                                .addComponent(LblOptions)
                                .addGap(18, 18, 18)
                                .addComponent(CbxOption, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDbUpdateLayout.createSequentialGroup()
                                .addComponent(LblAction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(CbxAction, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(ScrlPaneOptionDescr, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblOptionDescr))
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(PanelDbUpdateLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(BtnAction, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnDetails)
                .addGap(41, 41, 41))
        );
        PanelDbUpdateLayout.setVerticalGroup(
            PanelDbUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDbUpdateLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(PanelDbUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CbxSections, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblSections)
                    .addComponent(CbxOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblOptions))
                .addGap(39, 39, 39)
                .addGroup(PanelDbUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDbUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LblOptionName)
                        .addComponent(TxtOption, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelDbUpdateLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(ScrlBarOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelDbUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CbxAction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LblAction)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(LblOptionDescr)
                .addGap(19, 19, 19)
                .addComponent(ScrlPaneOptionDescr, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(PanelDbUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAction)
                    .addComponent(BtnDetails))
                .addGap(28, 28, 28))
        );

        PanelMainCards_FrmAdmin.add(PanelDbUpdate, "PanelDbUpdate");

        PanelUserStats.setMinimumSize(new java.awt.Dimension(595, 410));
        PanelUserStats.setPreferredSize(new java.awt.Dimension(595, 410));

        BtnPrev_FrmAdmin.setText("Prev.");
        BtnPrev_FrmAdmin.setName(""); // NOI18N

        BtnView_FrmAdmin.setText("View Statistics");
        BtnView_FrmAdmin.setName(""); // NOI18N
        BtnView_FrmAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnView_FrmAdminActionPerformed(evt);
            }
        });

        BtnNext_FrmAdmin.setText("Next");
        BtnNext_FrmAdmin.setName(""); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Parameters", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        CbxJobs.setEnabled(false);
        CbxJobs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbxJobsActionPerformed(evt);
            }
        });

        CbxIndustry.setEnabled(false);

        jLabel3.setText("Industry");

        CbxParams.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Category", "Courses", "Jobs", "Industry", " " }));
        CbxParams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbxParamsActionPerformed(evt);
            }
        });

        BtnExecute.setText("Execute");
        BtnExecute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExecuteActionPerformed(evt);
            }
        });

        CbxCategory.setEnabled(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Search User By ");

        jLabel4.setText("Category");

        jLabel5.setText("Jobs");

        jLabel6.setText("Courses");

        CbxCourses.setEnabled(false);
        CbxCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbxCoursesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(CbxParams, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(BtnExecute)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(CbxJobs, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(CbxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(CbxIndustry, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(CbxCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CbxIndustry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CbxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CbxCourses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CbxParams, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CbxJobs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(BtnExecute)
                        .addGap(27, 27, 27))))
        );

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        TbUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TbUsers.setAutoscrolls(false);
        TbUsers.setDropMode(javax.swing.DropMode.ON);
        TbUsers.setMinimumSize(new java.awt.Dimension(195, 64));
        TbUsers.setName(""); // NOI18N
        TbUsers.setPreferredSize(new java.awt.Dimension(195, 64));
        jScrollPane1.setViewportView(TbUsers);

        javax.swing.GroupLayout PanelUserStatsLayout = new javax.swing.GroupLayout(PanelUserStats);
        PanelUserStats.setLayout(PanelUserStatsLayout);
        PanelUserStatsLayout.setHorizontalGroup(
            PanelUserStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelUserStatsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
            .addGroup(PanelUserStatsLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(PanelUserStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelUserStatsLayout.createSequentialGroup()
                        .addComponent(BtnPrev_FrmAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(BtnView_FrmAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(BtnNext_FrmAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        PanelUserStatsLayout.setVerticalGroup(
            PanelUserStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelUserStatsLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelUserStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnPrev_FrmAdmin)
                    .addComponent(BtnView_FrmAdmin)
                    .addComponent(BtnNext_FrmAdmin))
                .addGap(40, 40, 40))
        );

        PanelMainCards_FrmAdmin.add(PanelUserStats, "PanelUserStats");

        PanelUserConds.setMinimumSize(new java.awt.Dimension(595, 410));
        PanelUserConds.setPreferredSize(new java.awt.Dimension(595, 410));

        LblSelectedParams.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblSelectedParams.setText("Selected Fields");

        PanelAge.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Set Age", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        LblAge.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LblAge.setText("Equal to:");
        LblAge.setMaximumSize(new java.awt.Dimension(67, 14));
        LblAge.setMinimumSize(new java.awt.Dimension(67, 14));
        LblAge.setPreferredSize(new java.awt.Dimension(67, 14));

        TxtAge.setPreferredSize(new java.awt.Dimension(50, 25));
        TxtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtAgeActionPerformed(evt);
            }
        });
        TxtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtAgeKeyReleased(evt);
            }
        });

        CbxAgeOptions.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Equal to", "Greater than", "Lesser than" }));
        CbxAgeOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbxAgeOptionsActionPerformed(evt);
            }
        });

        CkbAge.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CkbAge.setText("Done");
        CkbAge.setEnabled(false);
        CkbAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CkbAgeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelAgeLayout = new javax.swing.GroupLayout(PanelAge);
        PanelAge.setLayout(PanelAgeLayout);
        PanelAgeLayout.setHorizontalGroup(
            PanelAgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAgeLayout.createSequentialGroup()
                .addGroup(PanelAgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAgeLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CkbAge))
                    .addGroup(PanelAgeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LblAge, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelAgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CbxAgeOptions, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TxtAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        PanelAgeLayout.setVerticalGroup(
            PanelAgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAgeLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(PanelAgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CbxAgeOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CkbAge))
                .addGap(19, 19, 19)
                .addGroup(PanelAgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        BtnSeeResults.setText("See Results");
        BtnSeeResults.setToolTipText("Set the search parameters for the user's details manually");
        BtnSeeResults.setOpaque(false);
        BtnSeeResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSeeResultsActionPerformed(evt);
            }
        });

        BtnInsCond.setText("Condition Set");
        BtnInsCond.setToolTipText("<none>");
        BtnInsCond.setEnabled(false);
        BtnInsCond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInsCondActionPerformed(evt);
            }
        });

        BtnRemoveCond.setText("Remove");
        BtnRemoveCond.setToolTipText("Set the search parameters for the user's details manually");
        BtnRemoveCond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRemoveCondActionPerformed(evt);
            }
        });

        ListConds.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "First Name", "Second Name", "..." };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        ScrlPaneListConds.setViewportView(ListConds);

        PanelSetConds.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Set Conditions", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        CbxFields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbxFieldsActionPerformed(evt);
            }
        });

        BtnGroupRelative.add(RBtnManual);
        RBtnManual.setText("Manual Set");
        RBtnManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBtnManualActionPerformed(evt);
            }
        });

        BtnGroupRelative.add(RBtnDefine);
        RBtnDefine.setText("Search Set");
        RBtnDefine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBtnDefineActionPerformed(evt);
            }
        });

        PanelSetCondOptions.setLayout(new java.awt.CardLayout());

        PanelDefineCond.setMinimumSize(new java.awt.Dimension(173, 121));
        PanelDefineCond.setPreferredSize(new java.awt.Dimension(173, 121));

        TxtSearchCondOptions.setEnabled(false);
        TxtSearchCondOptions.setMinimumSize(new java.awt.Dimension(117, 25));
        TxtSearchCondOptions.setPreferredSize(new java.awt.Dimension(117, 25));
        TxtSearchCondOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtSearchCondOptionsActionPerformed(evt);
            }
        });
        TxtSearchCondOptions.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtSearchCondOptionsKeyReleased(evt);
            }
        });

        CbxSearchCondsOptions.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Search Option", "Begin with", "Contain", "End with" }));
        CbxSearchCondsOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbxSearchCondsOptionsActionPerformed(evt);
            }
        });

        ScrlBarSearch.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        ScrlBarSearch.setModel(TxtSearchCondOptions.getHorizontalVisibility());

        javax.swing.GroupLayout PanelDefineCondLayout = new javax.swing.GroupLayout(PanelDefineCond);
        PanelDefineCond.setLayout(PanelDefineCondLayout);
        PanelDefineCondLayout.setHorizontalGroup(
            PanelDefineCondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDefineCondLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(PanelDefineCondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CbxSearchCondsOptions, 0, 120, Short.MAX_VALUE)
                    .addComponent(ScrlBarSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TxtSearchCondOptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        PanelDefineCondLayout.setVerticalGroup(
            PanelDefineCondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDefineCondLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(CbxSearchCondsOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TxtSearchCondOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrlBarSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        PanelSetCondOptions.add(PanelDefineCond, "PanelDefineParam");

        PanelManualInsCond.setMinimumSize(new java.awt.Dimension(173, 121));

        LblCondValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblCondValue.setText("Inset Value");

        TxtCondValue.setMinimumSize(new java.awt.Dimension(6, 25));
        TxtCondValue.setPreferredSize(new java.awt.Dimension(117, 25));
        TxtCondValue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtCondValueKeyReleased(evt);
            }
        });

        ScrlBarManual.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        ScrlBarManual.setModel(TxtCondValue.getHorizontalVisibility());

        javax.swing.GroupLayout PanelManualInsCondLayout = new javax.swing.GroupLayout(PanelManualInsCond);
        PanelManualInsCond.setLayout(PanelManualInsCondLayout);
        PanelManualInsCondLayout.setHorizontalGroup(
            PanelManualInsCondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelManualInsCondLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(PanelManualInsCondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(LblCondValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TxtCondValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ScrlBarManual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        PanelManualInsCondLayout.setVerticalGroup(
            PanelManualInsCondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelManualInsCondLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(LblCondValue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtCondValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ScrlBarManual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        PanelSetCondOptions.add(PanelManualInsCond, "PanelManualParam");

        javax.swing.GroupLayout PanelSetCondsLayout = new javax.swing.GroupLayout(PanelSetConds);
        PanelSetConds.setLayout(PanelSetCondsLayout);
        PanelSetCondsLayout.setHorizontalGroup(
            PanelSetCondsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSetCondsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PanelSetCondOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PanelSetCondsLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(PanelSetCondsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RBtnManual)
                    .addComponent(RBtnDefine)
                    .addComponent(CbxFields, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelSetCondsLayout.setVerticalGroup(
            PanelSetCondsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSetCondsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(CbxFields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RBtnManual)
                .addGap(5, 5, 5)
                .addComponent(RBtnDefine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelSetCondOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelUserCondsLayout = new javax.swing.GroupLayout(PanelUserConds);
        PanelUserConds.setLayout(PanelUserCondsLayout);
        PanelUserCondsLayout.setHorizontalGroup(
            PanelUserCondsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUserCondsLayout.createSequentialGroup()
                .addGroup(PanelUserCondsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelUserCondsLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(BtnInsCond))
                    .addGroup(PanelUserCondsLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(PanelSetConds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PanelUserCondsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelUserCondsLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(PanelAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelUserCondsLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(PanelUserCondsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BtnRemoveCond)
                                    .addComponent(LblSelectedParams, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                    .addComponent(ScrlPaneListConds, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addGap(24, 24, 24)
                .addComponent(BtnSeeResults)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        PanelUserCondsLayout.setVerticalGroup(
            PanelUserCondsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelUserCondsLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(PanelUserCondsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelUserCondsLayout.createSequentialGroup()
                        .addComponent(PanelSetConds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(PanelUserCondsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnSeeResults)
                            .addComponent(BtnInsCond))
                        .addGap(32, 32, 32))
                    .addGroup(PanelUserCondsLayout.createSequentialGroup()
                        .addComponent(PanelAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LblSelectedParams)
                        .addGap(18, 18, 18)
                        .addComponent(ScrlPaneListConds, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnRemoveCond)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        PanelMainCards_FrmAdmin.add(PanelUserConds, "PanelUserParameters");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelMainCards_FrmAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnExit_FrmAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelMainCards_FrmAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(BtnExit_FrmAdmin)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleParent(JDgChooseParams);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    


    //BUTTON EXIT
    //
    private void BtnExit_FrmAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExit_FrmAdminActionPerformed
        config = new FrmAdminConfig();
        config.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_BtnExit_FrmAdminActionPerformed

    private void CbxSearchCondsOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbxSearchCondsOptionsActionPerformed
        this.TxtSearchCondOptions.setEnabled(true);
    }//GEN-LAST:event_CbxSearchCondsOptionsActionPerformed

    private void CbxFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbxFieldsActionPerformed
        if(this.CbxFields.isPopupVisible() == true && this.CbxFields.getItemCount() !=0)
        {    
      String item = this.CbxFields.getSelectedItem().toString();
        switch(item)
        {
            case "age":
                //this.CkbAge.setEnabled(true);
                this.CbxAgeOptions.setEnabled(true);
                break;
                    
        
        
        }
        }
        this.TxtCondValue.setText(null);
        this.TxtSearchCondOptions.setText(null);
    }//GEN-LAST:event_CbxFieldsActionPerformed

    private void CbxAgeOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbxAgeOptionsActionPerformed
        


        
        
        String text = this.CbxAgeOptions.getSelectedItem().toString();
        this.LblAge.setText(text);
        this.TxtAge.setEnabled(true);
        this.LblAge.setEnabled(true);
        
    }//GEN-LAST:event_CbxAgeOptionsActionPerformed

    private void TxtSearchCondOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtSearchCondOptionsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtSearchCondOptionsActionPerformed

    
    
    private void BtnInsCondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInsCondActionPerformed
        
        String field, search, text, value= null;
        int index = this.CbxFields.getSelectedIndex();
        int tot = this.CbxFields.getItemCount();
        field = this.CbxFields.getSelectedItem().toString();
        
        
        this.ListConds.setModel(listModel);
        listModel.addElement(field);
        if(RBtnDefine.isSelected() == true)
        {    
            search = this.CbxSearchCondsOptions.getSelectedItem().toString();
            text = this.TxtSearchCondOptions.getText();
            switch (search)
            {
                case "Begin with":
                    value =  text + "%";
                    break;
                case "Contain":
                    
                    value =  "%" + text + "%";
                    break;
                case "End with":
                    value =  "%" + text;
                    break;
            }
            
        }
        else if(RBtnManual.isSelected() == true)
        {
            
           value =  this.TxtCondValue.getText();
           
        }///****************************BUG QUI************************************
        this.cond.add(field);
        this.value.add(value);
        
        System.out.println(cond.toString());
        this.CbxFields.removeItem(field);
        this.BtnInsCond.setEnabled(false);
    }//GEN-LAST:event_BtnInsCondActionPerformed

    private void BtnView_FrmAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnView_FrmAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnView_FrmAdminActionPerformed


    //COMBOBOX AZIONE
    //
    private void CbxActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbxActionActionPerformed
        
        if(this.CbxAction.isPopupVisible() == true)
        {
            String caption = this.CbxAction.getSelectedItem().toString();
            String section = this.CbxSections.getSelectedItem().toString();
            if(this.CbxOption.getItemCount() != 0)
            {this.BtnAction.setText(caption);}
            
            this.CbxSections.setEnabled(true);
            
            switch(caption)
            {
                case "Delete":
                    this.LblOptions.setText("Options");
                            this.BtnDetails.setVisible(false);
                    break;
                case "Insert":
                    this.CbxOption.removeAll();
                    this.LblOptions.setText("Set " + section);
                    this.TxtOption.setEditable(true);
                    this.TxtOptionDescr.setEditable(true);
                    this.TxtOption.setFocusable(true);
                    this.TxtOptionDescr.setFocusable(true);
                    this.TxtOption.setText("");
                    this.TxtOptionDescr.setText("");
                    
                    this.CbxOption.setEnabled(false);
                    this.BtnAction.setText(this.CbxAction.getSelectedItem().toString());
                    this.BtnAction.setEnabled(false);
                    this.BtnDetails.setVisible(true);
                    
                    
                    
//                    
//                    
//                    if(section.equalsIgnoreCase("industry"))
//                    {
//                        
//                    
//                    
//                    
//                    }
//                    else if(section.equalsIgnoreCase("category"))
//                    {
////                        String join = "industry";
////                        String table = this.CbxSections.getSelectedItem().toString();;
////                        String option = this.CbxOption.getSelectedItem().toString();
////                        "SELECT * FROM category as c"+
////                       "join  industry as i on i.codIndustry = c.codIndustry;";         
////                    
////                        
////                        "SELECT * FROM " + table + "as tb"
////                       "join "  + join + "as join on join.codIndustry = tb.codIndustry;";         
////                       
//            
//                    }
//                    else if(section.equalsIgnoreCase("courses")){}
//                    else if(section.equalsIgnoreCase("jobs")){}
//                    //this.CbxAction.
                    
                    
                    break;
                case "Update":
                    this.LblOptions.setText("Options");
                            this.BtnDetails.setVisible(false);
                    break;
                default:
                            
                            break;    
            
            }
            
        }
    }//GEN-LAST:event_CbxActionActionPerformed

    private void CbxActionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CbxActionMouseClicked

    }//GEN-LAST:event_CbxActionMouseClicked

    private void CbxActionPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_CbxActionPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_CbxActionPopupMenuWillBecomeInvisible

    private void CbxSectionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbxSectionsActionPerformed
    
            
         
    //  this.BtnAction.setEnabled(true);
        this.CbxAction.setEnabled(true);
        //this.CbxAction.setSelectedIndex(0);
        this.CbxOption.removeAllItems();
       // this.CbxOption.setEnabled(false);
        //this.CbxAction.removeAllItems();
        //this.CbxAction.setEnabled(false);
        this.BtnAction.setText("Get Data");
        this.TxtOption.setText(null);
        if(this.CbxAction.getSelectedItem().toString().equalsIgnoreCase("Insert") == false)
        {this.BtnAction.setEnabled(true);}
        this.TxtOptionDescr.setText(null);
        if(this.ScrlBarOption.isVisible() == true){this.ScrlBarOption.setVisible(false);}
        
    
    }//GEN-LAST:event_CbxSectionsActionPerformed

    //COMBOBOX OPTIONS
    //
    private void CbxOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbxOptionActionPerformed
        if(this.CbxOption.isPopupVisible() == true)
        {
            this.BtnAction.setEnabled(true);
            ///this.BtnAction.setText("Action");
            this.TxtOption.setText(this.CbxOption.getSelectedItem().toString());
            descr = boiaList.get(0).get(this.CbxOption.getSelectedItem().toString());
            this.TxtOptionDescr.setText(descr);
           
            
            int vista = 22;
        int count = this.TxtOption.getText().length();
       if (count>vista){this.ScrlBarOption.setVisible(true);}
        else { if (count<vista){this.ScrlBarOption.setVisible(false);}}
            //this.CbxAction.setEnabled(true);
            //Sets the combobox with the list of the possible actions
//            this.CbxAction.removeAllItems();
//            this.CbxAction.addItem("Select an Action");
//            
//            this.CbxAction.addItem("Delete");
//            this.CbxAction.addItem("Insert");
//            this.CbxAction.addItem("Update");

            
            
            
        }
    }//GEN-LAST:event_CbxOptionActionPerformed

    private void CbxOptionPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_CbxOptionPopupMenuWillBecomeVisible
        // TODO add your handling code here:
    }//GEN-LAST:event_CbxOptionPopupMenuWillBecomeVisible

    private void TxtOptionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtOptionKeyReleased
         
    }//GEN-LAST:event_TxtOptionKeyReleased

    private void TxtOptionPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_TxtOptionPropertyChange
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TxtOptionPropertyChange
ArrayList primary = new ArrayList();
Array array;
    private void BtnActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActionActionPerformed
        String action = this.CbxAction.getSelectedItem().toString();
        String section = this.CbxSections.getSelectedItem().toString();
        try
        {
                    
            String text = this.BtnAction.getText();
            String table = this.CbxSections.getSelectedItem().toString();
            int ind = this.CbxOption.getSelectedIndex();
            switch (text)
            {
                case "Get Data":
                    this.CbxOption.removeAllItems();
                    st = query.selectAll(table);
                    rs = query.execute(st);
                    //          this.CbxOption.setEnabled(true);
                     
                    while(rs.next())
                    {

                        String option = rs.getString(2);
                        this.descr = rs.getString("descr");
                        boia.put(option, descr);
                        primary.add(rs.getString(1));
                        // + "    " + primary.listIterator().nextIndex());
                        this.CbxOption.addItem(option);
                    }
                   int count = this.CbxOption.getItemCount();
                    
                    rs.close();
                    this.CbxOption.setEnabled(true);
                    boiaList.add(0, (HashMap<String, String>) boia);
                    this.CbxOption.setSelectedIndex(-1);
                    this.CbxOption.showPopup();
                   
                    System.out.println();
                    String caption = this.CbxAction.getSelectedItem().toString();
            this.BtnAction.setText(caption);
            this.BtnAction.setEnabled(false);
                    for(int i=0; i<boiaList.size(); i++)
                    {//sectionList.get(i).get(this.CbxOption.getSelectedItem().toString());
                        }
        System.out.println();
                    break;
                
                case "Delete":
                  //  primary.get(ind); //INDICE CBK OPTION
                    
                    st = query.colTable("findmycareer", table );
                    st.setMaxRows(1);
                    
                    rs = query.execute(st);
                    
                    String pk= null;
                    while(rs.next())
                    {
                    pk = rs.getString(1);
                    System.out.println(primary.get(ind).toString() + "     " + (ind));
                    }
                    
                    /*
                    COLONNA = 
                    VALORE = PRIMARY.GET(INDICE)
                    TIPO = STRING
                    CONGIUNZIONE
                    */
                    
                    
                    
                    String[][] del = new String[][]
                    {
                        {pk, primary.get(ind).toString(), "String", ""},
                        
                    };
                    String asdf = del[0][0].toString();
                    String asdf1 =del[0][1].toString();
                    String asdf2=del[0][2].toString();
                    String asdf3 =del[0][3].toString();
                    System.out.println(asdf+  "  "+ asdf1 +  "  "+   asdf2 +  "  "+   asdf3);
                    int gone = query.delete(table, del);
                    if(gone >0)
                    {
                        String message = "Operation succefull!!"
                                       + "\n\n"
                                       + "N° " + gone + "records deleted." ;
                        msgbox.setMessage(message);
                        msgbox.setTitle("");
                        msgbox.setMsgBoxType("info");
                        msgbox.popUpMsgBox();
                    }
                    else
                    {
                        String message = "Operation failed!!"
                                       + "\n\n"
                                       + "No records affected." ;
                        msgbox.setMessage(message);
                        msgbox.setTitle("");
                        msgbox.setMsgBoxType("info");
                        msgbox.popUpMsgBox();
                    }
                    
                    break;
                
                case "Insert":
           // ArrayList prova= new ArrayList();
            int i=0;
            try
            {
                st = query.colTable("findmycareer", "user" );
                rs = query.execute(st);
                String var=null;
                System.out.println(st.toString());
                while (rs.next())
                {
                    //System.out.println(rs.getString("Columns"));
                     //var = rs.getString("Columns");
                    prova.add(var);
                    System.out.println(prova.get(i++).toString());
                    
                    
                    
                    
                    
                    
                    
                    
                }
//                
            }
            catch(SQLException e){System.out.println("ERRORE!!!!!!!!!!!!!!!!!!!!!!!");}
                    
            
                    break;
                
                case "Update":
                    
                    break;
            }
            
            
            
        }
        catch (SQLException ex)
        {
            Logger.getLogger(FrmAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }//GEN-LAST:event_BtnActionActionPerformed

    private void RBtnManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBtnManualActionPerformed
        card = (CardLayout)this.PanelSetCondOptions.getLayout();
        card.show(this.PanelSetCondOptions, "PanelManualParam");
        this.TxtSearchCondOptions.setText(null);
    }//GEN-LAST:event_RBtnManualActionPerformed

    private void RBtnDefineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBtnDefineActionPerformed
        card = (CardLayout)this.PanelSetCondOptions.getLayout();
        card.show(this.PanelSetCondOptions, "PanelDefineParam");
        this.TxtCondValue.setText(null);
    }//GEN-LAST:event_RBtnDefineActionPerformed

    private void BtnRemoveCondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRemoveCondActionPerformed
        
        int index = this.ListConds.getSelectedIndex();
        System.out.println(this.ListConds.getModel().getElementAt(index));
        this.ListConds.remove(index);
                //remove(this.listParams.getModel().getElementAt(index).);
        //
    }//GEN-LAST:event_BtnRemoveCondActionPerformed

    private void BtnSeeResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSeeResultsActionPerformed
        int y=0;
        
//        ArrayList<List<String>> arrayQuery = new ArrayList<List<String>>();
//       ArrayList<String> list1 = new ArrayList();
//       list1.add("prova 1");
//       list1.add("prova 2");
//       list1.add("prova 3");
//       ArrayList<String> list2 = new ArrayList();
//       list1.add("vedi 1");
//       list1.add("vedi 2");
//       list1.add("vedi 3");
        arrayQuery.add(new ArrayList<String>(cond));
        arrayQuery.add(new ArrayList<String>(value));
        for(int b =0; b<arrayQuery.size(); b++)
        {
            for(int n=0; n<arrayQuery.get(b).size(); n++)
            {
                String asdf = arrayQuery.get(b).get(n);
                System.out.println(asdf);
            }
        }
        
        
//        condList.add(0, (HashMap<String, String>) cond);
//        String[][] conds;// = new String[][]{};
//        for(y=0; y<condList.size(); y++)
//        {
//        System.out.println(condList.get(y).get(0).toString());
//        
//        }
       // card = (CardLayout)this.PanelMainCards_FrmAdmin.getLayout();
            //card.show(this.PanelMainCards_FrmAdmin, "PanelUserStats");
    }//GEN-LAST:event_BtnSeeResultsActionPerformed

    private void CkbAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CkbAgeActionPerformed
      //  int index = this.CbxFields.getSelectedIndex();
        String field = this.CbxFields.getSelectedItem().toString();
        if(this.CkbAge.isSelected() == false)
        {
            this.CbxAgeOptions.setEnabled(true);}
        
        else if(this.CkbAge.isSelected() == true)
        {
            //AGGIUNGE L'ETA' ALL'ARRAY DELLE CONDIZIONI
            
        String  search = this.CbxAgeOptions.getSelectedItem().toString();
           //String text = this.TxtAge.getText();
           String sign = null;
            switch (search)
        {
            case "Equal to":
                this.TxtAge.setEnabled(true);
                sign = "=";
                this.LblAge.setEnabled(true);
               
                break;
            case "Greater than":
                 sign = ">";
                this.TxtAge.setEnabled(false);
                
                break;
            case "Lesser than":
                sign = "<";
        
                this.LblAge.setEnabled(false);
               
                
                this.TxtAge.setEnabled(false);
               
                break;
            
        }
             String  value= sign + this.TxtAge.getText();
         this.cond.add(field);
        this.value.add(value);
          if(field.equalsIgnoreCase("age")== true){this.CbxFields.removeItem(field);}
            
            //this.CbxAgeOptions.setSelectedIndex(-1);
            this.CbxAgeOptions.setEnabled(false);
            
            this.TxtAge.setEnabled(false);
                
                this.LblAge.setEnabled(false);
                
        //    this.TxtAge.setText(null);
            
        }
    }//GEN-LAST:event_CkbAgeActionPerformed

    private void TxtCondValueKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCondValueKeyReleased
        if(this.TxtCondValue.getText().length()>0)
        {this.BtnInsCond.setEnabled(true);}
        else if(this.TxtCondValue.getText().length()==0)
        {this.BtnInsCond.setEnabled(false);}
    }//GEN-LAST:event_TxtCondValueKeyReleased

    private void TxtSearchCondOptionsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtSearchCondOptionsKeyReleased
        if(this.TxtSearchCondOptions.getText().length()>0)
        {this.BtnInsCond.setEnabled(true);}
        else if(this.TxtSearchCondOptions.getText().length()== 0)
        {this.BtnInsCond.setEnabled(false);}
    }//GEN-LAST:event_TxtSearchCondOptionsKeyReleased

    private void TxtAgeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtAgeKeyReleased
        if(this.TxtAge.getText().length()>0)
        {
            //this.BtnInsCond.setEnabled(true);
            this.CkbAge.setEnabled(true);
        }
        else if(this.TxtAge.getText().length()== 0)
        {
           // this.BtnInsCond.setEnabled(false);
            this.CkbAge.setEnabled(false);
        }
    }//GEN-LAST:event_TxtAgeKeyReleased

    private void TxtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAgeActionPerformed

    private void BtnExit_JDgChooseParamsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExit_JDgChooseParamsActionPerformed
        this.JDgChooseParams.dispose();
    }//GEN-LAST:event_BtnExit_JDgChooseParamsActionPerformed

    private void BtnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDoneActionPerformed
       Object[] a =  this.PanelParamCond.getComponents();
        JCheckBox asdf; int x=0;
        params.removeAll(prova);
        if(this.CbxParamCond.getSelectedItem().toString().equalsIgnoreCase("Parameters") == true)
        {    
            this.TxtRelativeDescr.append("PARAMETERS: \n\n");
            for(int u=0; u<a.length; u++)
            {   
                asdf = (JCheckBox) a[u];
                if(asdf.isSelected() == true)
                {
                    params.add(asdf.getText());
                    this.TxtRelativeDescr.append(asdf.getText() + "\n\n");
                    System.out.println(params);

                   //System.out.println(prova.get(u).toString());
    //           // System.out.println(ckb[u].getText());//(this.ckbList.get(0).get(0));
                }
            }
        }
        else if(this.CbxParamCond.getSelectedItem().toString() == "Conditions")
        {
            this.TxtRelativeDescr.append("CONDITIONS: \n\n");
            
            for(int u=0; u<a.length; u++)
            {   
                asdf = (JCheckBox) a[u];
                if(asdf.isSelected() == true)
                {
                    this.TxtRelativeDescr.append(asdf.getText() + "\n\n");
                    System.out.println(asdf.getText());
                    
                    this.CbxFields.addItem(asdf.getText());
                   //System.out.println(prova.get(u).toString());
    //           // System.out.println(ckb[u].getText());//(this.ckbList.get(0).get(0));
                }
            }
        
        }
        this.BtnDone.setEnabled(false);
    }//GEN-LAST:event_BtnDoneActionPerformed

    private void CbxParamCondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbxParamCondActionPerformed
            int i=0;
            this.BtnDone.setEnabled(true);
            Object[] a =  this.PanelParamCond.getComponents();
            for(i=0; i<a.length; i++)
            {
                JCheckBox asdf = (JCheckBox) a[i];
                asdf.setSelected(false);
            }
            if(this.CbxParamCond.getSelectedItem().toString()== "Parameters")
            {this.PanelParamCond.getComponent(0).setEnabled(true);}
            else {this.PanelParamCond.getComponent(0).setEnabled(false);}
    }//GEN-LAST:event_CbxParamCondActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        config = new FrmAdminConfig();
        config.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void TxtOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtOptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtOptionActionPerformed

    private void BtnExit_JDgChooseParams1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExit_JDgChooseParams1ActionPerformed
        this.JDgDetails.dispose();
    }//GEN-LAST:event_BtnExit_JDgChooseParams1ActionPerformed

    private void BtnDone_RelativeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDone_RelativeActionPerformed
        String name = this.CbxRelatives.getSelectedItem().toString();
        Object[] rbtnArray =  this.PanelPag1.getComponents();
        Object[] ckbArray =  this.PanelPag2.getComponents();
        JCheckBox ckb; JRadioButton rbtn; int x=0;
        params.removeAll(prova);
        if(name == "industry")
        {    
            this.TxtRelativeDescr.append("PARAMETERS: \n\n");
            for(int u=0; u<rbtnArray.length; u++)
            {   
                rbtn = (JRadioButton) rbtnArray[u];
                if(rbtn.isSelected() == true)
                {
                    params.add(rbtn.getText());
                    this.TxtRelativeDescr.append(rbtn.getText() + "\n\n");
                    System.out.println(params);

                   //System.out.println(prova.get(u).toString());
    //           // System.out.println(ckb[u].getText());//(this.ckbList.get(0).get(0));
                }
            }
        }
        else if(this.CbxParamCond.getSelectedItem().toString() == "Skills")
        {
            this.TxtRelativeDescr.append("CONDITIONS: \n\n");
            
            for(int u=0; u<ckbArray.length; u++)
            {   
                ckb = (JCheckBox) ckbArray[u];
                if(ckb.isSelected() == true)
                {
                    this.TxtRelativeDescr.append(ckb.getText() + "\n\n");
                    System.out.println(ckb.getText());
                    
                  //  this.CbxFields.addItem(ckb.getText());
                   //System.out.println(prova.get(u).toString());
    //           // System.out.println(ckb[u].getText());//(this.ckbList.get(0).get(0));
                }
            }
        
        }
    }//GEN-LAST:event_BtnDone_RelativeActionPerformed

    private void CbxRelativesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbxRelativesActionPerformed
        String caption1= null;
        String caption2 = null;
        
        String str = this.CbxSections.getSelectedItem().toString();
        switch(str)
        {
            case "Category":
                caption1= "Industry";
                caption2 = "Skills";
                break;
        }
        if(this.CbxRelatives.getSelectedItem().toString().equalsIgnoreCase(caption1) == true)
        {
            card = (CardLayout)this.PanelRelative.getLayout();
                card.show(this.PanelRelative, "pag1");
        }
        else if(this.CbxRelatives.getSelectedItem().toString().equalsIgnoreCase(caption2) == true)
        {
            card = (CardLayout)this.PanelRelative.getLayout();
                card.show(this.PanelRelative, "pag2");
        } 
    }//GEN-LAST:event_CbxRelativesActionPerformed

    private void BtnDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDetailsActionPerformed
        String txtcount = this.TxtOption.getText();
        String txtcount1 = this.TxtOptionDescr.getText();
        String section = this.CbxSections.getSelectedItem().toString();
        if(txtcount.equalsIgnoreCase("") == true | txtcount1.equalsIgnoreCase("")== true)
        {
            String message = "Name and Description of the new entry required!"
                                       + "\n\n";
                        msgbox.setMessage(message);
                        msgbox.setTitle("Wrong Procedure");
                        msgbox.setMsgBoxType("warning");
                        msgbox.popUpMsgBox();
                        
        }
        else if(txtcount.length()>0 && txtcount1.length()>0)
        {
             try
        {
            String table, table1;
            switch(section)
                    {
                        case "Category":
                            
                            table = "industry";
                            table1 = "skills";
                            this.CbxRelatives.addItem("Industry");
                            this.CbxRelatives.addItem("Skills");
                            
                            PreparedStatement industry = query.selectAll(table);
                            PreparedStatement skills = query.selectAll(table1);
                            rs = query.execute(industry);
                            String[][] ind=null;// = new String[][]{};
                            int x=0;
                            while(rs.next())
                            {
                                ind= new String[][]
                                {
                                    {rs.getString(1), rs.getString(2), rs.getString(3)}
                                };       
                            }
                            rs.close();
                           
                            rs = query.execute(skills);
                            String[][] skill=null;// = new String[][]{};
                            int l=0;
                            while(rs.next())
                            {
                                skill= new String[][]
                                {
                                    {rs.getString(1), rs.getString(2), rs.getString(3)}
                                };       
                            }
                            rs.close();
                            String var = null;
                            for(int i=0; i<ind.length; i++)
                            {
                                    var = ind[i][1];
                                    JRadioButton c = new JRadioButton(var);
                                    //this.ckbs.put(var, (JCheckBox)c);
                                    this.PanelPag1.add(c);
                                    //JCheckBox asdf =ckbs.get(var);
                                    //prova.add(var);

                                   // System.out.println(asdf.getText());

                            }
                            var = null;
                            for(int s=0; s<ind.length; s++)
                            {
                                    var = skill[s][1];
                                    JCheckBox ck = new JCheckBox(var);
                                    //this.ckbs.put(var, (JCheckBox)c);
                                    this.PanelPag2.add(ck);
                                    //JCheckBox asdf =ckbs.get(var);
                                    //prova.add(var);

                                   // System.out.println(asdf.getText());

                            }
                            
                            
                            
                            
                            
                            
                            
                            break;
//                        case "Courses":
//                            "SELECT * FROM CATEGORY"
//                        case "industry":
//                            "SELECT * FROM sol;"  
//                            memorizzi in industry_sol
//                            break;
//                            
//                        case "Jobs":
//                            "SELECT * FROM courses"
//                             break;
//                        case "Skills":
//                            "select * from category"
//                            break;
                    }
            
            
            
//            
//            st = query.selectAll(descr)
//            rs = query.execute(st);
//            String var;
//            Object[][] obj;
//            System.out.println(st.toString());
//            JCheckBox all = new JCheckBox("All");
//            this.PanelParamCond.add(all);
//            while (rs.next())
//            {
//                var = rs.getString("Columns");
//                if (var.equalsIgnoreCase("User ID") == false)
//                {
//                    JCheckBox c = new JCheckBox(var);
//                    this.ckbs.put(var, (JCheckBox)c);
//                    this.PanelParamCond.add(c);
//                    JCheckBox asdf =ckbs.get(var);
//                    prova.add(var);
//                    
//                    System.out.println(asdf.getText());
//                }
//               
//            }
//            this.ckbList.add(0, (HashMap<String, JCheckBox>) this.ckbs);        
        }
        catch(SQLException e){System.out.println("ERRORE!!!!!!!!!!!!!!!!!!!!!!!");}
        this.PanelParamCond.repaint();
        this.PanelParamCond.revalidate();        

            this.JDgDetails.setLocationRelativeTo(this.JDgDetails.getParent());
            this.JDgDetails.setVisible(true);
        
        }
    }//GEN-LAST:event_BtnDetailsActionPerformed

    private void BtnExecuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExecuteActionPerformed
        String sql = "select u.firstName, u.lastName, u.age, u.email, j.job, co.course \n" +
                     "from career as c\n" +
                     "\n" +
                     "join jobs as j on j.codJob = c.codJob\n" +
                    "\n" +
                     "join courses as co on co.codCourse = c.codCourse\n" +
                     "join\n" +
                     "(\n" +
                     "	select cat.codCategory, cat.category, ind.codIndustry, ind.industry\n" +
                     "	from category as cat\n" +
                     "	join industry as ind on ind.codIndustry = cat.codIndustry\n" +
                     ") as cc on cc.codCategory = co.codCategory\n" +
                     "join userview as u on u.userID = c.userID\n" +
                     "where ";  
        String cond = null;
        String table = this.CbxParams.getSelectedItem().toString(); 
        String value = null;
        
        switch(table)
        {
            case "Category":
                value = this.CbxCategory.getSelectedItem().toString();
                cond ="cc.category = '" + value + "';";
                
                break;
            case "Courses":
                value =this.CbxCourses.getSelectedItem().toString();
                cond ="co.course = '" + value + "';";
                break;
            case "Jobs":
                value = this.CbxJobs.getSelectedItem().toString();
                cond ="j.job = '" + value + "';";
                break;
            case "Industry":
                value = this.CbxIndustry.getSelectedItem().toString();
                cond ="cc.codIndustry= '" + value + "';";
                break;
        
        }
        sql += cond;
        try {
            st = query.wtfQuery(sql);
             rs = query.execute(st);
             ResultSetMetaData rsmd = rs.getMetaData();
        
             rs.last();
int rows = rs.getRow();
rs.beforeFirst();
             
             int columnSize = rsmd.getColumnCount();
             String[][] cols = new String[rows][columnSize];
            String[] colLbl = {"firstName", "lastName","age","email","job","course"};
             
             int r=0;
            DefaultTableModel model = (DefaultTableModel) this.TbUsers.getModel();
            model.setColumnIdentifiers(colLbl);
            
            while(rs.next() )
            {
                String[] str = new String[]{
                    
                        rs.getString("firstName"), 
                        rs.getString("lastName"), 
                        rs.getString("age"), 
                        rs.getString("email"), 
                        rs.getString("job"), 
                        rs.getString("course")
                    
                };
                cols [r++]= str;
                model.insertRow(r, str);//.addRow(str);//.addRow(cols [r++]);.insertRow(r, str);//
                
            }
            this.TbUsers.setModel(model);
//             int i=0, y=0;
//               for(i=0; i<cols[i].length; i++)
//               {
//                   //for(y=0; y<cols[i][y].length(); i++)
//                   // {
//                        System.out.println(cols[i]);
//
//                   // }
//               
//               }
        } catch (SQLException ex) {
            Logger.getLogger(FrmAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
    }//GEN-LAST:event_BtnExecuteActionPerformed

    private void CbxJobsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbxJobsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbxJobsActionPerformed

    private void CbxCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbxCoursesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbxCoursesActionPerformed

    private void CbxParamsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbxParamsActionPerformed
          String table = this.CbxParams.getSelectedItem().toString();
       
        
        

        try {
            st = query.selectAll(table);
                 rs = query.execute(st);
                    //          this.CbxOption.setEnabled(true);
                     
                    while(rs.next())
                    {

                        String option = rs.getString(2);
        switch(table)
        {
            case "Category":
                this.CbxCategory.addItem(option);
                this.CbxCategory.setEnabled(true);
                break;
            case "Courses":
                this.CbxCourses.addItem(option);
                this.CbxCourses.setEnabled(true);
                break;
            case "Jobs":
                this.CbxJobs.addItem(option);
                this.CbxJobs.setEnabled(true);
                break;
            case "Industry":
                this.CbxIndustry.addItem(option);
                this.CbxIndustry.setEnabled(true);
                break;
        
        }
                        
                    }
                    } catch (SQLException ex) {
            Logger.getLogger(FrmAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }//GEN-LAST:event_CbxParamsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(FrmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAdmin().setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAction;
    private javax.swing.JButton BtnDetails;
    private javax.swing.JButton BtnDone;
    private javax.swing.JButton BtnDone_Relative;
    private javax.swing.JButton BtnExecute;
    private javax.swing.JButton BtnExit_FrmAdmin;
    private javax.swing.JButton BtnExit_JDgChooseParams;
    private javax.swing.JButton BtnExit_JDgChooseParams1;
    private javax.swing.ButtonGroup BtnGroupRelative;
    private javax.swing.JButton BtnInsCond;
    private javax.swing.JButton BtnNext_FrmAdmin;
    private javax.swing.JButton BtnPrev_FrmAdmin;
    private javax.swing.JButton BtnRemoveCond;
    private javax.swing.JButton BtnSeeResults;
    private javax.swing.JButton BtnView_FrmAdmin;
    private javax.swing.JComboBox CbxAction;
    private javax.swing.JComboBox CbxAgeOptions;
    private javax.swing.JComboBox CbxCategory;
    private javax.swing.JComboBox CbxCourses;
    private javax.swing.JComboBox CbxFields;
    private javax.swing.JComboBox CbxIndustry;
    private javax.swing.JComboBox CbxJobs;
    private javax.swing.JComboBox CbxOption;
    private javax.swing.JComboBox CbxParamCond;
    private javax.swing.JComboBox CbxParams;
    private javax.swing.JComboBox CbxRelatives;
    private javax.swing.JComboBox CbxSearchCondsOptions;
    private javax.swing.JComboBox CbxSections;
    private javax.swing.JCheckBox CkbAge;
    private javax.swing.JDialog JDgChooseParams;
    private javax.swing.JDialog JDgDetails;
    private javax.swing.JLabel LblAction;
    private javax.swing.JLabel LblAge;
    private javax.swing.JLabel LblCondValue;
    private javax.swing.JLabel LblOptionDescr;
    private javax.swing.JLabel LblOptionName;
    private javax.swing.JLabel LblOptions;
    private javax.swing.JLabel LblOverview;
    private javax.swing.JLabel LblSections;
    private javax.swing.JLabel LblSelectedParams;
    private javax.swing.JList ListConds;
    private javax.swing.JPanel PanelAge;
    private javax.swing.JPanel PanelDbUpdate;
    private javax.swing.JPanel PanelDefineCond;
    private javax.swing.JPanel PanelMainCards_FrmAdmin;
    private javax.swing.JPanel PanelManualInsCond;
    private javax.swing.JPanel PanelPag1;
    private javax.swing.JPanel PanelPag2;
    private javax.swing.JPanel PanelParamCond;
    private javax.swing.JPanel PanelRelative;
    private javax.swing.JPanel PanelSetCondOptions;
    private javax.swing.JPanel PanelSetConds;
    private javax.swing.JPanel PanelUserConds;
    private javax.swing.JPanel PanelUserStats;
    private javax.swing.JRadioButton RBtnDefine;
    private javax.swing.JRadioButton RBtnManual;
    private javax.swing.JScrollBar ScrlBarManual;
    private javax.swing.JScrollBar ScrlBarOption;
    private javax.swing.JScrollBar ScrlBarSearch;
    private javax.swing.JScrollPane ScrlPaneListConds;
    private javax.swing.JScrollPane ScrlPaneOptionDescr;
    private javax.swing.JScrollPane ScrlPaneParamCond;
    private javax.swing.JScrollPane ScrlPaneRelative;
    private javax.swing.JScrollPane ScrlPaneTbUsers;
    private javax.swing.JTable TbUsers;
    private javax.swing.JTextField TxtAge;
    private javax.swing.JTextField TxtCondValue;
    private javax.swing.JTextField TxtOption;
    private javax.swing.JTextArea TxtOptionDescr;
    private javax.swing.JTextArea TxtOverview1;
    private javax.swing.JTextArea TxtRelativeDescr;
    private javax.swing.JTextField TxtSearchCondOptions;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
