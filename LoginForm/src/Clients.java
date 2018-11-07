/**
 *
 * @author zeina
 */
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;
import javax.swing.*;

public class Clients extends javax.swing.JFrame {

    public Clients() {
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
        spClientsList = new javax.swing.JScrollPane();
        tbClients = new javax.swing.JTable();
        bSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(900, 400));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        bExit.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        bExit.setText("Exit");
        bExit.setPreferredSize(new java.awt.Dimension(90, 27));
        bExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExitActionPerformed(evt);
            }
        });

        bLogout.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        bLogout.setText("Logout");
        bLogout.setPreferredSize(new java.awt.Dimension(90, 25));
        bLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLogoutActionPerformed(evt);
            }
        });

        bBack.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        bBack.setText("Back");
        bBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setText("Clients");

        tSearchBar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tSearchBar.setText("Search last name...");
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

        bAdd.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        bAdd.setText("Add");
        bAdd.setPreferredSize(new java.awt.Dimension(90, 27));
        bAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddActionPerformed(evt);
            }
        });

        bDelete.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        bDelete.setText("Delete");
        bDelete.setPreferredSize(new java.awt.Dimension(90, 27));
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });

        bModify.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        bModify.setText("Modify");
        bModify.setPreferredSize(new java.awt.Dimension(90, 27));
        bModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModifyActionPerformed(evt);
            }
        });

        tbClients.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbClients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "HCN", "CLNAME", "CFNAME", "DOB", "CELL", "ADDRESS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        spClientsList.setViewportView(tbClients);

        bSearch.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        bSearch.setText("Search");
        bSearch.setPreferredSize(new java.awt.Dimension(90, 27));
        bSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spClientsList, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bBack)
                                .addGap(284, 284, 284)
                                .addComponent(jLabel1))
                            .addComponent(tSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                                .addComponent(bAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bModify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(bLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(bLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBack))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bModify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(spClientsList, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Connection conn;
    ResultSet rs;
    String selectHCN;
    private void bExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bExitActionPerformed

    //Add a client to the database
    //A new window will appear for the user to fill
    private void bAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddActionPerformed
        createConnection();
        //Fields to fill by the user
        JTextField hcnField = new JTextField("");
        JTextField clnameField = new JTextField("");
        JTextField cfnameField = new JTextField("");
        JTextField dobField = new JTextField("");
        JTextField cellField = new JTextField("");
        JTextField addressField = new JTextField("");
        String hcn, lname, fname, dob, cell, address;
        
        //Creating a panel
        JPanel panel = new JPanel(new GridLayout(0, 1));
        panel.add(new JLabel("HCN:"));
        panel.add(hcnField);
        panel.add(new JLabel("Client Last Name:"));
        panel.add(clnameField);
        panel.add(new JLabel("Client First Name:"));
        panel.add(cfnameField);
        panel.add(new JLabel("Date Of Birth:"));
        panel.add(dobField);
        panel.add(new JLabel("Cellphone :"));
        panel.add(cellField);
        panel.add(new JLabel("Address:"));
        panel.add(addressField);
        
        int result = JOptionPane.showConfirmDialog(null, panel, "Add Client Form",
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        //When the user presses OK, get every text value and store each in a variable
        if (result == JOptionPane.OK_OPTION) {
            hcn = hcnField.getText();
            lname = clnameField.getText();
            fname = cfnameField.getText();
            dob = dobField.getText();
            cell = cellField.getText();
            address = addressField.getText();
            
            //Insert statement for the database
            String sql = "INSERT INTO clients VALUES ('" + hcn + "', '"+ lname +"', '" + fname + 
                "', TO_DATE('" + dob + "','yyyy/mm/dd'), " + cell + "," + "'" + address + "')";
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
        } else {
            System.out.println("Cancelled");
        }
        
    }//GEN-LAST:event_bAddActionPerformed

    private void bLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLogoutActionPerformed
        this.setVisible(false);
        Login l1 = new Login();
        l1.setVisible(true);        
    }//GEN-LAST:event_bLogoutActionPerformed

    private void bBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBackActionPerformed
        this.setVisible(false);
        mainMenu m1 = new mainMenu();
        m1.setVisible(true);
    }//GEN-LAST:event_bBackActionPerformed

    private void bSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSearchActionPerformed
        createConnection();
        String sql = "select * from clients where lower(CLNAME) = '" + tSearchBar.getText().toLowerCase() + "'";
        getResultSet(sql, "no clients found!");
        closeConnection();
    }//GEN-LAST:event_bSearchActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        createConnection();
        updateTable();
        closeConnection();
    }//GEN-LAST:event_formWindowOpened

    //Search bar function
    private void tSearchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tSearchBarActionPerformed
        //The tables get updated everytime the user enters a letter in the search bar
        tSearchBar.addKeyListener(new KeyListener() { 
        public void keyTyped(KeyEvent event) {
            if(tSearchBar.getText().equals("")){
                createConnection();
                updateTable();
                closeConnection();
            }
            else{
                createConnection();
                String sql = "select * from clients where lower(CLNAME) LIKE '" 
                        + tSearchBar.getText().toLowerCase() + '%' + "'";
                getResultSet(sql, "no clients found!");
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

    //Deletes a row in the table
    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed
        if(tbClients.getSelectedRow() == -1)
            JOptionPane.showMessageDialog(null, "Please select a row to delete!");
        else{
            createConnection();
            //Will only delete the row selected by the client
            int rowSelected = tbClients.getSelectedRow();
            String selectHCN = tbClients.getValueAt(rowSelected, 0).toString();
            System.out.println(selectHCN);
            //Delete statement for the database
            String sql = "delete from clients where HCN = '" + selectHCN + "'";
            try{
                PreparedStatement ps = conn.prepareStatement(sql);
                rs = ps.executeQuery();
                updateTable();
                closeConnection();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "can not delete");
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_bDeleteActionPerformed

    //When the user clicks the modify function, a new window appears for the user to change data on a client
    private void bModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModifyActionPerformed
        if(tbClients.getSelectedRow() == -1)
            JOptionPane.showMessageDialog(null, "Please select a row to modify!");
        else{
            createConnection();
            int rowSelected = tbClients.getSelectedRow();
            //Getting the current values for a row
            String selectHCN = tbClients.getValueAt(rowSelected, 0).toString();
            String selectLname = tbClients.getValueAt(rowSelected, 1).toString();
            String selectFname = tbClients.getValueAt(rowSelected, 2).toString();
            String selectDOB = tbClients.getValueAt(rowSelected, 3).toString();       
            String selectCell = tbClients.getValueAt(rowSelected, 4).toString();
            String selectAddress = tbClients.getValueAt(rowSelected, 5).toString();
            
            //Creating field for a panel
            JTextField hcnField = new JTextField(selectHCN);
            JTextField clnameField = new JTextField(selectLname);
            JTextField cfnameField = new JTextField(selectFname);
            JTextField dobField = new JTextField(selectDOB);
            JTextField cellField = new JTextField(selectCell);
            JTextField addressField = new JTextField(selectAddress);
            String hcn, lname, fname, dob, cell, address;
            
            //Creating the panel that will appear for the user
            JPanel panel = new JPanel(new GridLayout(0, 1));
            panel.add(new JLabel("HCN:"));
            panel.add(hcnField);
            panel.add(new JLabel("Client Last Name:"));
            panel.add(clnameField);
            panel.add(new JLabel("Client First Name:"));
            panel.add(cfnameField);
            panel.add(new JLabel("Date Of Birth:"));
            panel.add(dobField);
            panel.add(new JLabel("Cellphone :"));
            panel.add(cellField);
            panel.add(new JLabel("Address:"));
            panel.add(addressField);

            int result = JOptionPane.showConfirmDialog(null, panel, "Modify Client Form",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            //When the user presses ok, the data on each field will be retrieved
            if (result == JOptionPane.OK_OPTION) {
                hcn = hcnField.getText();
                lname = clnameField.getText();
                fname = cfnameField.getText();
                dob = dobField.getText();
                cell = cellField.getText();
                address = addressField.getText();
                
                //The strategy for modifying a client is by first deleting the specific client from the database
                //Then add the client with the updated info
                String sql1 = "delete from clients where HCN = '" + selectHCN + "'";
                //SQL statement to read the client
                String sql2 = "INSERT INTO clients VALUES ('" + hcn + "', '"+ lname +
                        "', '" + fname + "', TO_DATE('" + dob.substring(0, 10) + "','yyyy/mm/dd'), " +
                        cell + "," + "'" + address + "')";
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
        if(tSearchBar.getText().equals("Search last name..."))
            tSearchBar.setText("");
    }//GEN-LAST:event_tSearchBarFocusGained

    //Function to set the default text back in the search bar when it is unfocused
    private void tSearchBarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tSearchBarFocusLost
        if(tSearchBar.getText().equals(""))
            tSearchBar.setText("Search last name...");
    }//GEN-LAST:event_tSearchBarFocusLost
    
    //Method to establish a connection to the database
    public void createConnection(){
        try{
                conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "ZEINAJK", "Welcome1");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "connection to database can't be esatblished!");
            System.out.println(e);
        }
    }
    
    //Method to close the connection
    public void closeConnection(){
        try{
            conn.close();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "connection error!");
            System.out.println(e);
        }
    }
    
    //Method to execute the SQL statement
    //Takes @sql a string containing the statement
    //Takes @errorMsg a string with an error message
    //Returns a ResultSet
    public ResultSet getResultSet(String sql, String errorMsg){
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            tbClients.setModel(DbUtils.resultSetToTableModel(rs));
            conn.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, errorMsg);
            System.out.println(e);
        }
        return rs;
    }
    
    //Method to update the table shown in the form to keep the data
    //shown in the application in sync with the database
    public void updateTable(){
        String sql = "select HCN, CLname, CFname, TO_CHAR(DOB, 'yyyy-mm-dd'), Cell, address  from clients";
        getResultSet(sql, "no clients found!");
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
            java.util.logging.Logger.getLogger(Clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clients().setVisible(true);
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
    private static javax.swing.JScrollPane spClientsList;
    private javax.swing.JTextField tSearchBar;
    private static javax.swing.JTable tbClients;
    // End of variables declaration//GEN-END:variables
}
