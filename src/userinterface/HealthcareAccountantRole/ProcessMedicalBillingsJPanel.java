package userinterface.HealthcareAccountantRole;

import model.PawcareSystem;
import model.enterprise.Enterprise;
import model.organization.BillingOrganization;
import model.userAccount.User;
import model.taskbuffer.AccountantBillingRequest;
import model.taskbuffer.InsuranceWorkRequest;
import model.taskbuffer.TaskRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class ProcessMedicalBillingsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private User userAccount;
    private Enterprise enterprise;
    private BillingOrganization accountantOrganization;
    private PawcareSystem ecoSystem;

    /**
     * Creates new form ProcessMedicalBillingsJPanel
     */
    public ProcessMedicalBillingsJPanel(JPanel userProcessContainer, User userAccount, Enterprise enterprise, BillingOrganization accountantOrganization, PawcareSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.accountantOrganization = accountantOrganization;
        this.ecoSystem = ecoSystem;
        populateTable();
        populateInsuranceClaimTable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnProceedFurther = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatientBilling = new javax.swing.JTable();
        btnAllocateToMe = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblInsurance = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        btnProceedFurther.setBackground(new java.awt.Color(102, 102, 0));
        btnProceedFurther.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnProceedFurther.setText("Proceed Further");
        btnProceedFurther.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProceedFurtherActionPerformed(evt);
            }
        });

        tblPatientBilling.setBackground(new java.awt.Color(102, 102, 0));
        tblPatientBilling.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "PatientId", "Patient Name", "Assigned Doctor", "Accountant ", "Status", "Billing Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPatientBilling);

        btnAllocateToMe.setBackground(new java.awt.Color(102, 102, 0));
        btnAllocateToMe.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAllocateToMe.setText("Accolate to Me");
        btnAllocateToMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllocateToMeActionPerformed(evt);
            }
        });

        backJButton.setBackground(new java.awt.Color(102, 102, 0));
        backJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Medicial Billing ");

        tblInsurance.setBackground(new java.awt.Color(102, 102, 0));
        tblInsurance.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Policy Number", "Accountant", "Insurance Agent", "Billing Amount", "Claim Amount", "Claim Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblInsurance);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Dog's Insurance Claim Status Table");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Dog's Patient Billing Table");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/doc5 (2)_1.jpeg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(backJButton))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(342, 342, 342)
                                    .addComponent(jLabel1))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(191, 191, 191)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(btnAllocateToMe)
                                        .addGap(69, 69, 69)
                                        .addComponent(btnProceedFurther))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addComponent(jLabel2)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAllocateToMe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnProceedFurther, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2)
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel4)))
                .addContainerGap(152, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProceedFurtherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProceedFurtherActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPatientBilling.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row !");
            return;
        } else {

            AccountantBillingRequest accountBillingRequest = (AccountantBillingRequest) tblPatientBilling.getValueAt(selectedRow, 5);

            if (accountBillingRequest.getReceiver() != null) {
                if (accountBillingRequest.getReceiver().equals(userAccount)) {
                    if (accountBillingRequest.getStatus().equalsIgnoreCase("Pending on " + accountBillingRequest.getReceiver().getEmployee().getName())) {
                        AccountantProcessRequestJPanel panel = new AccountantProcessRequestJPanel(userProcessContainer, userAccount, accountBillingRequest, enterprise, ecoSystem);
                        userProcessContainer.add("AccountantProcessRequestJPanel", panel);
                        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                        layout.next(userProcessContainer);
                    } else {
                        JOptionPane.showMessageDialog(null, "Cannot process Request as request is in " + accountBillingRequest.getStatus());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Not authorised!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please allocate the request first!");
            }
        }
//        }
    }//GEN-LAST:event_btnProceedFurtherActionPerformed

    private void btnAllocateToMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllocateToMeActionPerformed
        int selectedRow = tblPatientBilling.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row !");
            return;
        } else {
            TaskRequest request = (AccountantBillingRequest) tblPatientBilling.getValueAt(selectedRow, 5);
            if (request.getReceiver() == null) {

                request.setReceiver(userAccount);
                request.setStatus("Pending on " + request.getReceiver().getEmployee().getName());
                populateTable();
            } else {
                JOptionPane.showMessageDialog(null, "The request is already assigned ");
            }
        }
    }//GEN-LAST:event_btnAllocateToMeActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnAllocateToMe;
    private javax.swing.JButton btnProceedFurther;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblInsurance;
    private javax.swing.JTable tblPatientBilling;
    // End of variables declaration//GEN-END:variables

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblPatientBilling.getModel();

        model.setRowCount(0);

        for (TaskRequest request : accountantOrganization.getWorkQueue().getWorkRequests()) {
            Object[] row = new Object[6];
            String status = request.getStatus();
            row[0] = ((AccountantBillingRequest) request).getPatient();
            row[1] = ((AccountantBillingRequest) request).getPatient().getPatientFirstName() + " " + ((AccountantBillingRequest) request).getPatient().getPatientLastName();
            row[2] = request.getSender().getEmployee().getName();
            if (status.equalsIgnoreCase("Sent to Treasurer") || status.equalsIgnoreCase("Sent to Secretary")) {
                row[2] = null;
            } else {
                row[3] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            }
            //row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[4] = request.getStatus();
            row[5] = ((AccountantBillingRequest) request);

            model.addRow(row);
        }
        
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        tblPatientBilling.setRowSorter(sorter);

    }

    public void populateInsuranceClaimTable() {
        List<InsuranceWorkRequest> insuranceWorkRequests = new ArrayList<>();
        ArrayList<TaskRequest> workRequests = userAccount.getWorkQueue().getWorkRequests();
        for (TaskRequest workRequest : workRequests) {
            if (workRequest instanceof InsuranceWorkRequest) {
                insuranceWorkRequests.add((InsuranceWorkRequest) workRequest);
            }
        }

        DefaultTableModel model = (DefaultTableModel) tblInsurance.getModel();

        model.setRowCount(0);
        for (InsuranceWorkRequest insuranceWorkRequest : insuranceWorkRequests) {
            Object[] row = new Object[6];
            row[0] = insuranceWorkRequest;
            row[1] = userAccount.getEmployee().getName();
            row[2] = insuranceWorkRequest.getReceiver() == null ? "" : insuranceWorkRequest.getReceiver().getEmployee().getName();
            row[3] = insuranceWorkRequest.getBillAmount();
            row[4] = insuranceWorkRequest.getClaimAmount();
            row[5] = insuranceWorkRequest.getStatus();
            model.addRow(row);

        }
         TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        tblInsurance.setRowSorter(sorter);
    }
}
