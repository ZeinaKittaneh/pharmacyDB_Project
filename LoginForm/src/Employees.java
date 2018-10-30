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

public class Employees extends javax.swing.JFrame {

    public Employees() {
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
        spEmployeesList = new javax.swing.JScrollPane();
        tbEmployees = new javax.swing.JTable();
        bSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        bExit.setText("Exit");
        bExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExitActionPerformed(evt);
            }
        });

        bLogout.setText("Logout");
        bLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLogoutActionPerformed(evt);
            }
        });

        bBack.setText("Back");
        bBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Employees");

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

        bAdd.setText("Add");
        bAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddActionPerformed(evt);
            }
        });

        bDelete.setText("Delete");
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });

        bModify.setText("Modify");
        bModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModifyActionPerformed(evt);
            }
        });

        tbEmployees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Employee Id", "Last Name", "First Name", "Position Id", "Cell", "Address", "Salary", "Qualifications Id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        spEmployeesList.setViewportView(tbEmployees);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(238, 238, 238)
                        .addComponent(bLogout)
                        .addGap(18, 18, 18)
                        .addComponent(bExit))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(spEmployeesList, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
                                .addGap(23, 23, 23))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bModify)
                            .addComponent(bDelete)
                            .addComponent(bAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bLogout)
                        .addComponent(bExit))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bBack)
                        .addComponent(jLabel1)))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(bAdd)
                        .addGap(28, 28, 28)
                        .addComponent(bModify)
                        .addGap(31, 31, 31)
                        .addComponent(bDelete)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bSearch))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(spEmployeesList, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Connection conn;
    ResultSet rs;
    
    //Exit button. Will exit the program
    private void bExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bExitActionPerformed
    
    //Add an employee to the database
    //A new window will appear for the user to fill
    private void bAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddActionPerformed
        createConnection();
        //create text fields and add them to panel:
        JTextField empIdField = new JTextField("");
        JTextField eLnameField = new JTextField("");
        JTextField eFnameField = new JTextField("");
        JTextField posIdField = new JTextField("");
        JTextField cellField = new JTextField("");
        JTextField addressField = new JTextField("");
        JTextField salaryField = new JTextField("");
        JTextField qualField = new JTextField("");
      
        JPanel panel = new JPanel(new GridLayout(0, 1));
        panel.add(new JLabel("Emplyee Id:"));
        panel.add(empIdField);
        panel.add(new JLabel("Last Name:"));
        panel.add(eLnameField);
        panel.add(new JLabel("First Name:"));
        panel.add(eFnameField);
        panel.add(new JLabel("Position Id:"));
        panel.add(posIdField);
        panel.add(new JLabel("Cellphone :"));
        panel.add(cellField);
        panel.add(new JLabel("Address:"));
        panel.add(addressField);
        panel.add(new JLabel("Salary:"));
        panel.add(salaryField);
        panel.add(new JLabel("Qualifications:"));
        panel.add(qualField);
        
        String empId, lName, fName, posId, cell, address, salary, qual;
        //show panel in a dialog "Add Employees Form":
        int result = JOptionPane.showConfirmDialog(null, panel, "Add Employees Form",
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        //When the user presses OK, get every text value and store each in a variable
        if (result == JOptionPane.OK_OPTION) {
            empId = empIdField.getText();
            lName = eLnameField.getText();
            fName = eFnameField.getText();
            posId = posIdField.getText();
            cell = cellField.getText();
            address = addressField.getText();
            salary = salaryField.getText();
            qual = qualField.getText();            
            
            //Insert new employee
            String sql = "INSERT INTO employee VALUES ("+ empId + ", '" + lName + "', '" + fName + "'," + posId +
                    "," + cell + ",'" + address + "'," + salary + ",'" + qual + "')";
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
    //when logout button is pressed, exit current form and open the login form
    private void bLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLogoutActionPerformed
        this.setVisible(false);
        Login l1 = new Login();
        l1.setVisible(true);        
    }//GEN-LAST:event_bLogoutActionPerformed

    //when back button is pressed, exit current form and go back to main menu form
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
        String sql = "select * from employee where lower(LNAME) = '" + tSearchBar.getText().toLowerCase() + "'";
        getResultSet(sql, "no employees found!");
        closeConnection();
    }//GEN-LAST:event_bSearchActionPerformed

    /* When "employees" form opened at start load table with all rows 
    from the employees column */
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        createConnection();
        updateTable();
        closeConnection();
    }//GEN-LAST:event_formWindowOpened

    //The event when search text field is changed
    private void tSearchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tSearchBarActionPerformed
        tSearchBar.addKeyListener(new KeyListener() { 
        //When user types in the search text bar start searching the employees table
        public void keyTyped(KeyEvent event) {
            //if search bar is empty load table with all rows from the employees column
            if(tSearchBar.getText().equals("")){
                createConnection();
                updateTable();
                closeConnection();
            }
            else{
            //lookfor the specified text of the search bar in the database 
            //and display the results in table                 
                createConnection();
                String sql = "select * from employee where lower(LNAME) = '" + tSearchBar.getText().toLowerCase() + "'";
                getResultSet(sql, "no employees found!");
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

    // When delete button is pressed, delete the selected row
    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed
        createConnection();
        int rowSelected = tbEmployees.getSelectedRow();
        String selectEmpId = tbEmployees.getValueAt(rowSelected, 0).toString();
        System.out.println(selectEmpId);
        //deletion from the employees according to the employee id
        String sql = "delete from employee where employeeid = '" + selectEmpId + "'";
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
    }//GEN-LAST:event_bDeleteActionPerformed

    // When the "modify" button is pressed, modify the selected row from the table
    private void bModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModifyActionPerformed
        if(tbEmployees.getSelectedRow() == -1)
            JOptionPane.showMessageDialog(null, "Please select a row to modify!");
        else{
            createConnection();
            int rowSelected = tbEmployees.getSelectedRow();
            //create text fields and add them to panel:
            String selectEmpId = tbEmployees.getValueAt(rowSelected, 0).toString();
            String selectELname = tbEmployees.getValueAt(rowSelected, 1).toString();
            String selectEFname = tbEmployees.getValueAt(rowSelected, 2).toString();
            String selectPosId = tbEmployees.getValueAt(rowSelected, 3).toString();       
            String selectCell = tbEmployees.getValueAt(rowSelected, 4).toString();
            String selectAddress = tbEmployees.getValueAt(rowSelected, 5).toString();
            String selectSalary = tbEmployees.getValueAt(rowSelected, 6).toString();
            String selectQual = tbEmployees.getValueAt(rowSelected, 7).toString();
            
            JTextField empIdField = new JTextField(selectEmpId);
            JTextField eLnameField = new JTextField(selectELname);
            JTextField eFnameField = new JTextField(selectEFname);
            JTextField posIdField = new JTextField(selectPosId);
            JTextField cellField = new JTextField(selectCell);
            JTextField addressField = new JTextField(selectAddress);
            JTextField salaryField = new JTextField(selectSalary);
            JTextField qualField = new JTextField(selectQual);

            String empId, lName, fName, posId, cell, address, salary, qual;

            JPanel panel = new JPanel(new GridLayout(0, 1));
            panel.add(new JLabel("Emplyee Id:"));
            panel.add(empIdField);
            panel.add(new JLabel("Last Name:"));
            panel.add(eLnameField);
            panel.add(new JLabel("First Name:"));
            panel.add(eFnameField);
            panel.add(new JLabel("Position Id:"));
            panel.add(posIdField);
            panel.add(new JLabel("Cellphone :"));
            panel.add(cellField);
            panel.add(new JLabel("Address:"));
            panel.add(addressField);
            panel.add(new JLabel("Salary:"));
            panel.add(salaryField);
            panel.add(new JLabel("Qualifications:"));
            panel.add(qualField);

            //show panel in a dialog "Add Employees Form":
            int result = JOptionPane.showConfirmDialog(null, panel, "Modify Employees Form",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            
            //When the user presses ok, the data on each field will be retrieved
            if (result == JOptionPane.OK_OPTION) {
                empId = empIdField.getText();
                lName = eLnameField.getText();
                fName = eFnameField.getText();
                posId = posIdField.getText();
                cell = cellField.getText();
                address = addressField.getText();
                salary = salaryField.getText();
                qual = qualField.getText();            

                //delete the previous record from the database then add the modified record instead 
                String sql1 = "delete from employee where employeeid = " + selectEmpId;
                String sql2 = "INSERT INTO employee VALUES ("+ empId + ", '" + lName + "', '" + fName + "'," + posId +
                        "," + cell + ",'" + address + "'," + salary + ",'" + qual + "')";
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

    //When the search bar loses focus, if it is empty fill it with the placeholder
    private void tSearchBarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tSearchBarFocusLost
        if(tSearchBar.getText().equals(""))
            tSearchBar.setText("Search last name...");
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
            tbEmployees.setModel(DbUtils.resultSetToTableModel(rs));
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
        String sql = "select * from employee";
        getResultSet(sql, "no employees found!");
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
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employees().setVisible(true);
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
    private static javax.swing.JScrollPane spEmployeesList;
    private javax.swing.JTextField tSearchBar;
    private static javax.swing.JTable tbEmployees;
    // End of variables declaration//GEN-END:variables
}
