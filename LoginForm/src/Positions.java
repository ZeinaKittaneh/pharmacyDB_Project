/**
 *
 * @author zeina
 */
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;
import javax.accessibility.AccessibleRole;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Positions extends javax.swing.JFrame {
    DefaultTableModel model;

    public Positions() {
        initComponents();        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bExit = new javax.swing.JButton();
        bLogout = new javax.swing.JButton();
        bBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tSearchBar = new javax.swing.JTextField();
        bAdd = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();
        bModify = new javax.swing.JButton();
        spPositionsList = new javax.swing.JScrollPane();
        tbPositions = new javax.swing.JTable();
        bSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(900, 400));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        bExit.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        bExit.setText("Exit");
        bExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExitActionPerformed(evt);
            }
        });

        bLogout.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        bLogout.setText("Logout");
        bLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLogoutActionPerformed(evt);
            }
        });

        bBack.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        bBack.setText("Back");
        bBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setText("Positions");

        tSearchBar.setText("Search pid...");
        tSearchBar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tSearchBarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tSearchBarFocusLost(evt);
            }
        });
        tSearchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tSearchBarActionPerformed(evt);
            }
        });

        bAdd.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        bAdd.setText("Add");
        bAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddActionPerformed(evt);
            }
        });

        bDelete.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        bDelete.setText("Delete");
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });

        bModify.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        bModify.setText("Modify");
        bModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModifyActionPerformed(evt);
            }
        });

        tbPositions.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tbPositions.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "PID", "PDESC"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        spPositionsList.setViewportView(tbPositions);

        bSearch.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        bSearch.setText("Search");
        bSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(bBack, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(108, 108, 108)
                                .addComponent(bLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bModify, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bExit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(spPositionsList, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bLogout)
                    .addComponent(bExit)
                    .addComponent(jLabel1)
                    .addComponent(bBack))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSearch)
                    .addComponent(bAdd)
                    .addComponent(bModify)
                    .addComponent(bDelete))
                .addGap(18, 18, 18)
                .addComponent(spPositionsList, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    Connection conn;
    ResultSet rs;
    String selectpositionid;
    //public String[] selectedItems = new String[6];
    
    //Exit button. Will exit the program
    private void bExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bExitActionPerformed
    //Add a new position to the positions table in database
    //A new window will appear for the user to fill
    private void bAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddActionPerformed
        createConnection();
        //create text fields and add them to panel:
        JTextField positionidField = new JTextField("");
        JTextField pdescField = new JTextField("");
        String positionid, pdesc;
        
        JPanel panel = new JPanel(new GridLayout(0, 1));
        panel.add(new JLabel("Position ID:"));
        panel.add(positionidField);
        panel.add(new JLabel("Position Description:"));
        panel.add(pdescField);
        
        //Show panel in a dialog "Add positions Form":
        int result = JOptionPane.showConfirmDialog(null, panel, "Add Positions Form",
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            positionid = positionidField.getText();
            pdesc = pdescField.getText();
            
            //insert new position:
            String sql = "INSERT INTO positions VALUES (" + positionid + ", '"+ pdesc +"')";
            try{
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.executeQuery();
                updateTable();
                closeConnection();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "invalid data");
                System.out.println(e);
            }
        } else { //if cancel button pressed
            System.out.println("Cancelled");
        }
        
    }//GEN-LAST:event_bAddActionPerformed
        //When logout button is pressed, exit current form and open the login form
    private void bLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLogoutActionPerformed
        this.setVisible(false);
        Login l1 = new Login();
        l1.setVisible(true);        
    }//GEN-LAST:event_bLogoutActionPerformed
    //When back button is pressed, exit current form and go back to main menu form
    private void bBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBackActionPerformed
        this.setVisible(false);
        mainMenu m1 = new mainMenu();
        m1.setVisible(true);
    }//GEN-LAST:event_bBackActionPerformed
    /* When search button is pressed, get text from the search text 
    field and look for it in data base and display the results in table 
    */
    private void bSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSearchActionPerformed
        createConnection();
        String sql = "select * from positions where positionid = '" + tSearchBar.getText() + "'";
        getResultSet(sql, "no positions found!");
        closeConnection();
    }//GEN-LAST:event_bSearchActionPerformed
    /* When "positions" form opened at start load table with all rows 
    from the positions column */
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        createConnection();
        updateTable();
        closeConnection();
    }//GEN-LAST:event_formWindowOpened
    //The event when search text field is changed
    private void tSearchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tSearchBarActionPerformed
        tSearchBar.addKeyListener(new KeyListener() { 
        //When user types in the search text bar start searching the positions table
        public void keyTyped(KeyEvent event) {
        //if search bar is empty load table with all rows from the positions column
            if(tSearchBar.getText().equals("")){
                createConnection();
                updateTable();
                closeConnection();
            }
            else{
            //lookfor the specified text of the search bar in the database 
            //and display the results in table
                createConnection();
                String sql = "select * from positions where positionid = '" + tSearchBar.getText() + "'";
                getResultSet(sql, "no positions found!");
                closeConnection();
            }
        }

        @Override
        public void keyReleased(KeyEvent event) {
        }

        @Override
        public void keyPressed(KeyEvent event) {
        }

           
        });
    }//GEN-LAST:event_tSearchBarActionPerformed
    // When the delete button is pressed, delete the selected row
    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed
        if(tbPositions.getSelectedRow() == -1)
            JOptionPane.showMessageDialog(null, "Please select a row to delete!");
        else{
            createConnection();
            int rowSelected = tbPositions.getSelectedRow();
            String selectpositionid = tbPositions.getValueAt(rowSelected, 0).toString();
            System.out.println(selectpositionid);
            //deletion from the positions according to the position id
            String sql = "delete from positions where positionid = '" + selectpositionid + "'";
            try{
                PreparedStatement ps = conn.prepareStatement(sql);
                rs = ps.executeQuery();
                updateTable();
                closeConnection();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "cannot delete");
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_bDeleteActionPerformed
    // When the "modify" button is pressed, modify the selected row from the table
    private void bModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModifyActionPerformed
        if(tbPositions.getSelectedRow() == -1)
            JOptionPane.showMessageDialog(null, "Please select a row to modify!");
        else{
            createConnection();
            int rowSelected = tbPositions.getSelectedRow();
            String selectpositionid = tbPositions.getValueAt(rowSelected, 0).toString();
            String selectpdesc = tbPositions.getValueAt(rowSelected, 1).toString();
            
            JTextField positionidField = new JTextField(selectpositionid);
            JTextField pdescField = new JTextField(selectpdesc);
            String positionid, pdesc;

            JPanel panel = new JPanel(new GridLayout(0, 1));
            panel.add(new JLabel("Position ID:"));
            panel.add(positionidField);
            panel.add(new JLabel("Position Description:"));
            panel.add(pdescField);
            
            //show panel in a dialog "Add positions Form":
            int result = JOptionPane.showConfirmDialog(null, panel, "Modify Positions Form",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            
            //When the user presses ok, the data on each field will be retrieved
            if (result == JOptionPane.OK_OPTION) {
                positionid = positionidField.getText();
                pdesc = pdescField.getText();

                String sql1 = "delete from positions where positionid = '" + selectpositionid + "'";
                String sql2 = "INSERT INTO positions VALUES (" + positionid + ", '" + pdesc + "')";
                try{
                    PreparedStatement ps = conn.prepareStatement(sql1);
                    PreparedStatement ps2 = conn.prepareStatement(sql2);
                    ps.executeQuery();
                    ps2.executeQuery();
                    updateTable();
                    closeConnection();
                }
                catch(Exception e){
                    try{
                    PreparedStatement ps3 = conn.prepareStatement("rollback");
                    ps3.executeQuery();
                    }
                    catch(Exception exe){
                        System.out.println(e);
                    }
                    JOptionPane.showMessageDialog(null, "invalid data");
                    System.out.println(e);
                }
            }
            else {
                System.out.println("Cancelled");
            }        
        }
    }//GEN-LAST:event_bModifyActionPerformed
    /*When the search bar gaines focus, if it has the placeholder
    replace it with empty string*/
    private void tSearchBarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tSearchBarFocusGained
        if(tSearchBar.getText().equals("Search pid..."))
            tSearchBar.setText("");
    }//GEN-LAST:event_tSearchBarFocusGained
    //When the search bar loses focus, if it is empty fill it with the placeholder
    private void tSearchBarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tSearchBarFocusLost
        if(tSearchBar.getText().equals(""))
            tSearchBar.setText("Search pid...");
    }//GEN-LAST:event_tSearchBarFocusLost
    //A method to create connection with database
    public void createConnection(){
        try{
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "ZEINAJK", "Welcome1");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "connection to database can't be esatblished!");
            System.out.println(e);
        }
    }
    //A method to close the connection with the database
    public void closeConnection(){
        try{
            conn.close();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "connection error!");
            System.out.println(e);
        }
    }
    /*
    a method to execute sql query and get results from the database
    if an error occured during execution an error message will be shown
    @para1: sql query
    @para2: errorMsg (a suitable error message associated with the sql query)
    return: result set
    */
    public ResultSet getResultSet(String sql, String errorMsg){
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            tbPositions.setModel(DbUtils.resultSetToTableModel(rs));
            conn.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, errorMsg);
            System.out.println(e);
        }
        return rs;
    }
    //A method to update the table shown in the form to keep the data
    //shown in the application in sync with the database
    public void updateTable(){
        String sql = "select * from positions";
        getResultSet(sql, "no positions found!");
    }
    
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
            java.util.logging.Logger.getLogger(Positions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Positions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Positions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Positions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Positions().setVisible(true);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAdd;
    private javax.swing.JButton bBack;
    private javax.swing.JButton bDelete;
    private javax.swing.JButton bExit;
    private javax.swing.JButton bLogout;
    private javax.swing.JButton bModify;
    private javax.swing.JButton bSearch;
    private javax.swing.JLabel jLabel1;
    private static javax.swing.JScrollPane spPositionsList;
    private javax.swing.JTextField tSearchBar;
    private static javax.swing.JTable tbPositions;
    // End of variables declaration//GEN-END:variables
}
