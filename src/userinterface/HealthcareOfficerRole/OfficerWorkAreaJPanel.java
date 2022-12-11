package userinterface.HealthcareOfficerRole;

import model.enterprise.Enterprise;
import model.organization.HealthCareOfficerOrganization;
import model.organization.Organization;
import model.userAccount.User;
import model.taskbuffer.AngelInvestFundRequest;
import model.taskbuffer.TaskRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class OfficerWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel jPanel;
    private User userAccount;
    private HealthCareOfficerOrganization healthCareOfficerOrganization;
    private Enterprise enterprise;

    /**
     * Creates new form OfficerWorkAreaJPanel1
     */
    public OfficerWorkAreaJPanel(JPanel jpanel, User userAccount, Organization organization, Enterprise enterprise) {
        initComponents();
        this.enterprise = enterprise;

        this.jPanel = jpanel;

        this.healthCareOfficerOrganization = (HealthCareOfficerOrganization) organization;
        this.userAccount = userAccount;

        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        processRequestBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("NGO Health Officer ");

        workRequestJTable.setBackground(new java.awt.Color(102, 102, 0));
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Sender", "Receiver", "Status", "Amount", "Location"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
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
        jScrollPane1.setViewportView(workRequestJTable);

        btnAssign.setBackground(new java.awt.Color(102, 102, 0));
        btnAssign.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAssign.setText("Allocate to me");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        processRequestBtn.setBackground(new java.awt.Color(102, 102, 0));
        processRequestBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        processRequestBtn.setText("Preoceed Further");
        processRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processRequestBtnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/healthofficer2.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(processRequestBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 931, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 139, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(processRequestBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row first from the table to view details");
            return;
        } else {
            TaskRequest request = (AngelInvestFundRequest) workRequestJTable.getValueAt(selectedRow, 0);
            if (request.getStatus().equals("Sent")) {
                request.setReceiver(userAccount);
                request.setStatus("Pending on " + request.getReceiver().getEmployee().getName());
                populateTable();
                JOptionPane.showMessageDialog(null, "Success !! Request is assigned to you ");
            } else {
                JOptionPane.showMessageDialog(null, "Can't assign this work request, as the work request is in " + request.getStatus() + " status", "Warning!", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    private void processRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processRequestBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        } else {

            AngelInvestFundRequest request = (AngelInvestFundRequest) workRequestJTable.getValueAt(selectedRow, 0);

            if (request.getStatus().equals("Rejected")) {
                JOptionPane.showMessageDialog(null, "Process is Rejected cannot go further", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (request.getStatus().equalsIgnoreCase("Sent to Secretary")) {
                JOptionPane.showMessageDialog(null, "Request already processed", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (request.getStatus().equalsIgnoreCase("Sent")) {
                JOptionPane.showMessageDialog(null, "Allocate the request first");
                return;
            }
            if (!userAccount.equals(request.getReceiver())) {
                JOptionPane.showMessageDialog(null, "Not Authorized", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (!userAccount.getEmployee().equals(request.getReceiver().getEmployee())) {
                JOptionPane.showMessageDialog(null, "Request allocate to other health Officer", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            } else {

                OfficerProcessWorkRequestJPanel panel = new OfficerProcessWorkRequestJPanel(jPanel, userAccount, request, enterprise);
                jPanel.add("OfficerProcessWorkRequestJPanel", panel);
                CardLayout layout = (CardLayout) jPanel.getLayout();
                layout.next(jPanel);

            }
    }//GEN-LAST:event_processRequestBtnActionPerformed
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processRequestBtn;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (TaskRequest request : healthCareOfficerOrganization.getWorkQueue().getWorkRequests()) {
            Object[] row = new Object[5];
            String status = request.getStatus();
            row[0] = ((AngelInvestFundRequest) request);
            row[1] = request.getSender().getEmployee().getName();
            if (status.equalsIgnoreCase("Sent to Angel Invester") || status.equalsIgnoreCase("Sent to Secretary")) {
                row[2] = null;
            } else {
                row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            }
            row[3] = request.getStatus();
            row[4] = ((AngelInvestFundRequest) request).getRequestAmount();

            model.addRow(row);
        }
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        workRequestJTable.setRowSorter(sorter);
    }
}
