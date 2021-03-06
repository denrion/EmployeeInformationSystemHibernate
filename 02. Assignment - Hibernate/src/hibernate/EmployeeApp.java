/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Employee;
import model.HibernateActions;
import model.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Denrion
 */
public class EmployeeApp extends javax.swing.JFrame {

    Session session;
    Employee e;
    List<Employee> employees;

    /**
     * Creates new form EmployeeApp
     *
     */
    public EmployeeApp() {
        initComponents();
        this.setLocationRelativeTo(null);
        session = HibernateUtil.getSessionFactory().openSession();
        populateTable();
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        employees = HibernateActions.searchAll(session);

        if (employees != null) {
            for (Employee em : employees) {
                model.addRow(new Object[]{em.getId(), em.getName(), em.getAge(), em.getAddress(), em.getSalary()});
            }
        }
    }
    // CREATE HQL QUERIES FOR EVERYTHING BECAUSE METHODS DO NOT WORK

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        tfAge = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        tfAdress = new javax.swing.JTextField();
        lblSalary = new javax.swing.JLabel();
        tfSalary = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnShowAll = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        tfSearchId = new org.jdesktop.swingx.JXTextField();
        tfSearchName = new org.jdesktop.swingx.JXTextField();
        tfSearchAge = new org.jdesktop.swingx.JXTextField();
        tfSearchAddress = new org.jdesktop.swingx.JXTextField();
        tfSearchSalary = new org.jdesktop.swingx.JXTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblName.setText("Name");

        lblAge.setText("Age");

        lblAddress.setText("Adress");

        lblSalary.setText("Salary");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setText("Clear ");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnShowAll.setText("Show All");
        btnShowAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSalary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(lblAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfName)
                            .addComponent(tfAge)
                            .addComponent(tfAdress)
                            .addComponent(tfSalary)))
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnShowAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnClear)
                .addGap(18, 18, 18)
                .addComponent(btnShowAll, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAdd)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate)
                .addGap(18, 18, 18)
                .addComponent(btnDelete)
                .addContainerGap())
        );

        tfSearchId.setPrompt("Search by ID");
        tfSearchId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfSearchIdKeyReleased(evt);
            }
        });

        tfSearchName.setPrompt("Search by name");
        tfSearchName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfSearchNameKeyReleased(evt);
            }
        });

        tfSearchAge.setPrompt("Search by age");
        tfSearchAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfSearchAgeKeyReleased(evt);
            }
        });

        tfSearchAddress.setPrompt("Search by adress");
        tfSearchAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfSearchAddressKeyReleased(evt);
            }
        });

        tfSearchSalary.setPrompt("Search by salary");
        tfSearchSalary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfSearchSalaryKeyReleased(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Age", "Address", "Salary"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable2MousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tfSearchId, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfSearchName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfSearchAge, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfSearchAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfSearchSalary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSearchId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSearchName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSearchAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSearchAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSearchSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        e = new Employee(tfName.getText(), Integer.parseInt(tfAge.getText()), tfAdress.getText(), Double.parseDouble(tfSalary.getText()));
        HibernateActions.addEmployee(session, e);
        Object rowData[] = {e.getId(), e.getName(), e.getAge(), e.getAddress(), e.getSalary()};
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.addRow(rowData);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (jTable2.getSelectedRow() != -1) {
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            int id = Integer.parseInt(jTable2.getValueAt(jTable2.getSelectedRow(), 0).toString());
            HibernateActions.deleteEmployee(session, id);
            model.removeRow(jTable2.getSelectedRow());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (jTable2.getSelectedRow() != -1) {
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            model.setValueAt(tfName.getText(), jTable2.getSelectedRow(), 1);
            model.setValueAt(Integer.parseInt(tfAge.getText()), jTable2.getSelectedRow(), 2);
            model.setValueAt(tfAdress.getText(), jTable2.getSelectedRow(), 3);
            model.setValueAt(Double.parseDouble(tfSalary.getText()), jTable2.getSelectedRow(), 4);
        }
        int id = Integer.parseInt(jTable2.getValueAt(jTable2.getSelectedRow(), 0).toString());
        HibernateActions.updateEmployee(session, id);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jTable2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MousePressed
        tfName.setText(jTable2.getValueAt(jTable2.getSelectedRow(), 1).toString());
        tfAge.setText(jTable2.getValueAt(jTable2.getSelectedRow(), 2).toString());
        tfAdress.setText(jTable2.getValueAt(jTable2.getSelectedRow(), 3).toString());
        tfSalary.setText(jTable2.getValueAt(jTable2.getSelectedRow(), 4).toString());
    }//GEN-LAST:event_jTable2MousePressed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        tfName.setText("");
        tfAge.setText("");
        tfAdress.setText("");
        tfSalary.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void tfSearchIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchIdKeyReleased
        if (!"".equals(tfSearchId.getText())) {
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            model.setRowCount(0);
            if (this.getFocusOwner() == tfSearchId) {
                tfSearchName.setText("");
                tfSearchAge.setText("");
                tfSearchAddress.setText("");
                tfSearchSalary.setText("");
            }
            boolean isNumeric = tfSearchId.getText().chars().allMatch(Character::isDigit);
            if (!isNumeric) {
                System.out.println("You must enter a number");
            } else {
                int id = Integer.parseInt(tfSearchId.getText());
                e = HibernateActions.searchById(session, id);
                if (e != null) {
                    model.addRow(new Object[]{e.getId(), e.getName(), e.getAge(), e.getAddress(), e.getSalary()});
                } else {
                    System.out.println("Employee with a requested id does not exist");
                }
            }
        }
    }//GEN-LAST:event_tfSearchIdKeyReleased

    private void tfSearchNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchNameKeyReleased
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);
        if (this.getFocusOwner() == tfSearchName) {
            tfSearchId.setText("");
            tfSearchAge.setText("");
            tfSearchAddress.setText("");
            tfSearchSalary.setText("");
        }
        String name = tfSearchName.getText();
        employees = HibernateActions.searchByName(session, name);
        for (Employee em : employees) {
            model.addRow(new Object[]{em.getId(), em.getName(), em.getAge(), em.getAddress(), em.getSalary()});
        }
    }//GEN-LAST:event_tfSearchNameKeyReleased

    private void tfSearchAgeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchAgeKeyReleased
        if (!"".equals(tfSearchAge.getText())) {
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            model.setRowCount(0);
            if (this.getFocusOwner() == tfSearchAge) {
                tfSearchId.setText("");
                tfSearchName.setText("");
                tfSearchAddress.setText("");
                tfSearchSalary.setText("");
            }
            boolean isNumeric = tfSearchAge.getText().chars().allMatch(Character::isDigit);
            if (!isNumeric) {
                System.out.println("You must enter a number");
            } else {
                int age = Integer.parseInt(tfSearchAge.getText());
                employees = HibernateActions.searchByAge(session, age);
                for (Employee em : employees) {
                    model.addRow(new Object[]{em.getId(), em.getName(), em.getAge(), em.getAddress(), em.getSalary()});
                }
            }
        }
    }//GEN-LAST:event_tfSearchAgeKeyReleased

    private void tfSearchAddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchAddressKeyReleased
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);
        if (this.getFocusOwner() == tfSearchAddress) {
            tfSearchId.setText("");
            tfSearchName.setText("");
            tfSearchAge.setText("");
            tfSearchSalary.setText("");
        }
        String address = tfSearchAddress.getText();
        employees = HibernateActions.searchByAddress(session, address);
        for (Employee em : employees) {
            model.addRow(new Object[]{em.getId(), em.getName(), em.getAge(), em.getAddress(), em.getSalary()});
        }
    }//GEN-LAST:event_tfSearchAddressKeyReleased

    private void tfSearchSalaryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchSalaryKeyReleased
        if (!"".equals(tfSearchSalary.getText())) {
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            model.setRowCount(0);
            if (this.getFocusOwner() == tfSearchSalary) {
                tfSearchId.setText("");
                tfSearchName.setText("");
                tfSearchAge.setText("");
                tfSearchAddress.setText("");
            }
            boolean isNumeric = tfSearchSalary.getText().chars().allMatch(Character::isDigit);
            if (!isNumeric) {
                System.out.println("You must enter a number");
            } else {
                double salary = Double.parseDouble(tfSearchSalary.getText());
                employees = HibernateActions.searchBySalary(session, salary);
                for (Employee em : employees) {
                    model.addRow(new Object[]{em.getId(), em.getName(), em.getAge(), em.getAddress(), em.getSalary()});
                }
            }
        }
    }//GEN-LAST:event_tfSearchSalaryKeyReleased

    private void btnShowAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAllActionPerformed
        populateTable();
    }//GEN-LAST:event_btnShowAllActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeApp.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new EmployeeApp().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnShowAll;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSalary;
    private javax.swing.JTextField tfAdress;
    private javax.swing.JTextField tfAge;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfSalary;
    private org.jdesktop.swingx.JXTextField tfSearchAddress;
    private org.jdesktop.swingx.JXTextField tfSearchAge;
    private org.jdesktop.swingx.JXTextField tfSearchId;
    private org.jdesktop.swingx.JXTextField tfSearchName;
    private org.jdesktop.swingx.JXTextField tfSearchSalary;
    // End of variables declaration//GEN-END:variables
}
