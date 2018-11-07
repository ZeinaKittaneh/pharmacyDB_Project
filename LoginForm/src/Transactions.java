/**
 *
 * @author Kenny
 */
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JLabel;
import net.proteanit.sql.DbUtils;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Transactions extends javax.swing.JFrame {
    //Variable used to connect to the database and retrieve data
    Connection conn;
    ResultSet rs;
    public Transactions() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bSearch = new javax.swing.JButton();
        bExit = new javax.swing.JButton();
        bLogout = new javax.swing.JButton();
        bBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tSearchBar = new javax.swing.JTextField();
        bAdd = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();
        bModify = new javax.swing.JButton();
        spTransList = new javax.swing.JScrollPane();
        tbTransact = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        bSearch.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        bSearch.setText("Search");
        bSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSearchActionPerformed(evt);
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
        jLabel1.setText("Transactions");

        tSearchBar.setText("Search medication id...");
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

        tbTransact.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        tbTransact.setModel(new javax.swing.table.DefaultTableModel(
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
                "TID", "HCN", "MID", "Employee ID", "Transaction DATE", "UNITS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        spTransList.setViewportView(tbTransact);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(spTransList)
                        .addGap(76, 76, 76))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(bAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bBack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(186, 186, 186)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bModify, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bExit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 72, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bLogout)
                                    .addComponent(bExit)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(bBack)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bSearch)
                            .addComponent(bModify)
                            .addComponent(bAdd)
                            .addComponent(bDelete))))
                .addGap(18, 18, 18)
                .addComponent(spTransList, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Method for the search button
    //The user can search for qualification in the search bar
    private void bSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSearchActionPerformed
        createConnection();
        String sql = "select * from transactions where to_char(MID) like '" + tSearchBar.getText() + "%'";
        getResultSet(sql, "no transactions found!");
        closeConnection();
    }//GEN-LAST:event_bSearchActionPerformed

    //When the user clicks the exit button, the program ends
    private void bExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bExitActionPerformed

    //Method for the logout button
    //When the user presses the logout button, the user will be returned to the login form
    private void bLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLogoutActionPerformed
        this.setVisible(false);
        Login l1 = new Login();
        l1.setVisible(true);
    }//GEN-LAST:event_bLogoutActionPerformed

    //Method for the back button
    //When the user clicks the back button, the main menu will be shown
    private void bBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBackActionPerformed
        this.setVisible(false);
        mainMenu m1 = new mainMenu();
        m1.setVisible(true);
    }//GEN-LAST:event_bBackActionPerformed

    //Method when this form loads
    //Updates the data shown in the table by connecting to the database
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        createConnection();
        updateTable();
        closeConnection();
    }//GEN-LAST:event_formWindowOpened
    
    //Method for the modify button
    //When user clicks on the modify button, the selected row will be modified
    //The logic to modify the table is by first deleting the row selected, then readding the row with new values
    private void bModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModifyActionPerformed
        //Checks which row is selected
        if(tbTransact.getSelectedRow() == -1)
            JOptionPane.showMessageDialog(null, "Please select a row to modify!");
        else{
            createConnection();            
            //Get the information needed from the rows
            int rowSelected = tbTransact.getSelectedRow();
            String selectTid = tbTransact.getValueAt(rowSelected, 0).toString();
            //Create text fields for a panel
            JTextField tidField = new JTextField(tbTransact.getValueAt(rowSelected, 0).toString());
            JTextField hcnField = new JTextField(tbTransact.getValueAt(rowSelected, 1).toString());
            JTextField midField = new JTextField(tbTransact.getValueAt(rowSelected, 2).toString());
            JTextField employeeIdField = new JTextField(tbTransact.getValueAt(rowSelected, 3).toString());
            JTextField tdateField = new JTextField(tbTransact.getValueAt(rowSelected, 4).toString());
            JTextField unitsField = new JTextField(tbTransact.getValueAt(rowSelected, 5).toString());
        
            //Creating a panel
            JPanel panel = new JPanel(new GridLayout(0, 1));
            panel.add(new JLabel("Transaction ID:"));
            panel.add(tidField);
            panel.add(new JLabel("HCN:"));
            panel.add(hcnField);
            panel.add(new JLabel("Medication Id:"));
            panel.add(midField);
            panel.add(new JLabel("Employee Id:"));
            panel.add(employeeIdField);
            panel.add(new JLabel("Transactions Date:"));
            panel.add(tdateField);
            panel.add(new JLabel("Units:"));
            panel.add(unitsField);
            
            int result = JOptionPane.showConfirmDialog(null, panel, "Modify Transactions Form",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            //When user clicks ok, the inputs will be stored
            if (result == JOptionPane.OK_OPTION) {
                 //SQL statement to delete and insert
                String sql1 = "delete from transactions where tid = "  + selectTid;
                String sql2 = "INSERT INTO transactions VALUES (" + tidField.getText() + ", '"+ hcnField.getText() +"', " +
                        midField.getText() + "," + employeeIdField.getText() + ", " +
                        "TO_DATE('" + tdateField.getText().substring(0, 10) + "','yyyy/mm/dd'), " + unitsField.getText() + ")";
                //Connecting to the database
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

     //Method for the delete button
     //When user presses the button, the selected row will be deleted
    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed
        if(tbTransact.getSelectedRow() == -1)
            JOptionPane.showMessageDialog(null, "Please select a row to delete!");
        else{
            createConnection();
            //Checking which row is selected
            int rowSelected = tbTransact.getSelectedRow();
            //Get the transaction ID from the row
            String selectTID = tbTransact.getValueAt(rowSelected, 0).toString();
            //SQL statement to delete a row by the transaction id
            String sql = "delete from Transactions where TID = " + selectTID;
             //Connect to the database and perform SQL statement
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

    //The add method when user clicks the add button
    private void bAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddActionPerformed
        createConnection();
        //Creating text field for a panel
        JTextField tidField = new JTextField("");
            JTextField hcnField = new JTextField("");
            JTextField midField = new JTextField("");
            JTextField employeeIdField = new JTextField("");
            JTextField tdateField = new JTextField("");
            JTextField unitsField = new JTextField("");
        
        //Variables that will be used to store user input
        String mid, mname, effect, dosage, generic, price, quantity;
        
        //Creating a panel
        JPanel panel = new JPanel(new GridLayout(0, 1));
            panel.add(new JLabel("Transaction ID:"));
            panel.add(tidField);
            panel.add(new JLabel("HCN:"));
            panel.add(hcnField);
            panel.add(new JLabel("Medication Id:"));
            panel.add(midField);
            panel.add(new JLabel("Employee Id:"));
            panel.add(employeeIdField);
            panel.add(new JLabel("Transactions Date:"));
            panel.add(tdateField);
            panel.add(new JLabel("Units:"));
            panel.add(unitsField);
        
        int result = JOptionPane.showConfirmDialog(null, panel, "Addition Transactions Form",
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        //When the user clicks the ok option
        if (result == JOptionPane.OK_OPTION) {
            //SQL statement to insert value
            String sql = "INSERT INTO transactions VALUES (" + tidField.getText() +
                    ", '"+ hcnField.getText() +"', " + midField.getText() + "," +
                    employeeIdField.getText() + ", " + "TO_DATE('" + 
                    tdateField.getText().substring(0, 10) + "','yyyy/mm/dd'), " +
                    unitsField.getText() + ")";
            //Connecting to the database and perform the statement
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

    //Method for when the user types something in the search bar
    //The table should be constantly updated each user enters a character
    private void tSearchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tSearchBarActionPerformed
        tSearchBar.addKeyListener(new KeyListener() { 
        public void keyTyped(KeyEvent event) {
            if(tSearchBar.getText().equals("")){
                createConnection();
                updateTable();
                closeConnection();
            }
            else{
                createConnection();
                String sql = "select * from transactions where to_char(MID) like '" + tSearchBar.getText() + "%'";
                getResultSet(sql, "no transactions found!");
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

    //Empties the text in the search bar
    private void tSearchBarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tSearchBarFocusGained
        if(tSearchBar.getText().equals("Search medication id..."))
            tSearchBar.setText("");
    }//GEN-LAST:event_tSearchBarFocusGained

    //Resets the text in the search bar to the default value
    private void tSearchBarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tSearchBarFocusLost
        if(tSearchBar.getText().equals(""))
            tSearchBar.setText("Search medication id...");
    }//GEN-LAST:event_tSearchBarFocusLost
    
    /*Method to get results from a SQL statement
    *@sql the SQL statement
    *@errorMSG the error message
    *returns a ResultSet
    */
    public ResultSet getResultSet(String sql, String errorMsg){
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            tbTransact.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, errorMsg);
            System.out.println(e);
        }
        return rs;
    }   
    
    //Method to create a connection to the oracle database
    public void createConnection(){
        try{
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "ZEINAJK", "Welcome1");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "connection to database can't be esatblished!");
            System.out.println(e);
        }
    }
    //Method to close connection
    public void closeConnection(){
        try{
            conn.close();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "connection error!");
            System.out.println(e);
        }
    }
    //Method to update the data shown in the Jtable
    public void updateTable(){
        String sql = "select tid, hcn, mid, employeeid, TO_CHAR(tdate, 'yyyy-mm-dd') transaction_date, units from transactions";
        getResultSet(sql, "no transactions found!");
    }
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
            java.util.logging.Logger.getLogger(Transactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transactions().setVisible(true);
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
    private javax.swing.JScrollPane spTransList;
    private javax.swing.JTextField tSearchBar;
    private javax.swing.JTable tbTransact;
    // End of variables declaration//GEN-END:variables
}
