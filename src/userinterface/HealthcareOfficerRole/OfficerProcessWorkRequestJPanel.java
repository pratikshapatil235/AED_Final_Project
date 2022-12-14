package userinterface.HealthcareOfficerRole;

import model.enterprise.Enterprise;
import model.organization.Organization;
import model.organization.NGOHeadOrganization;
import model.userAccount.User;
import model.taskbuffer.AngelInvestFundRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class OfficerProcessWorkRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    private JPanel jPanel;
    private Enterprise enterprise;
    private User userAccount;
    private AngelInvestFundRequest governmentFundRequest;
    private OfficerWorkAreaJPanel officerWorkAreaJPanel;

    public OfficerProcessWorkRequestJPanel(JPanel jPanel, User userAccount, AngelInvestFundRequest fundRequest, Enterprise enterprise) {
        initComponents();

        this.jPanel = jPanel;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.governmentFundRequest = fundRequest;
        amountTxt.setText(String.valueOf(governmentFundRequest.getRequestAmount()));
        locationTxt.setText(governmentFundRequest.getLocation());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        amountTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        messageTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        sendRequestToSecretaryBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        locationTxt = new javax.swing.JTextField();
        btnReject = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        amountTxt.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Amount");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Message");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Health Officer");

        sendRequestToSecretaryBtn.setBackground(new java.awt.Color(102, 102, 0));
        sendRequestToSecretaryBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sendRequestToSecretaryBtn.setText("Message send to Secretary");
        sendRequestToSecretaryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendRequestToSecretaryBtnActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(102, 102, 0));
        backBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Location");

        locationTxt.setEnabled(false);

        btnReject.setBackground(new java.awt.Color(102, 102, 0));
        btnReject.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnReject.setText("Decline Request");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/healthofficer.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(201, 201, 201))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(locationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(messageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(amountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(backBtn)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sendRequestToSecretaryBtn)
                                .addGap(171, 171, 171)
                                .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel3)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(locationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(amountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(messageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(jLabel6)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sendRequestToSecretaryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        jPanel.remove(this);
        Component[] componentArray = jPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        OfficerWorkAreaJPanel owjp = (OfficerWorkAreaJPanel) component;
        owjp.populateTable();
        CardLayout layout = (CardLayout) jPanel.getLayout();
        layout.previous(jPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void sendRequestToSecretaryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendRequestToSecretaryBtnActionPerformed
        // TODO add your handling code here:

        String message = messageTxt.getText();
        if (message.equals("")) {
            JOptionPane.showMessageDialog(null, "Message is required!");
            return;
        } else {
            governmentFundRequest.setMessage(message);

            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to proceed further?");

            if (dialogResult == JOptionPane.YES_OPTION) {

                governmentFundRequest.setSender(userAccount);
                governmentFundRequest.setStatus("Sent Request to Secretary");

                Organization org = null;
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationsDirectory()) {
                    if (organization instanceof NGOHeadOrganization) {
                        org = organization;
                        break;
                    }
                }
                if (org != null) {
                    org.getWorkQueue().getWorkRequests().add(governmentFundRequest);
                    userAccount.getWorkQueue().getWorkRequests().add(governmentFundRequest);
                }
                JOptionPane.showMessageDialog(null, "Request to Secretary Successful!!!");
                messageTxt.setText("");
                btnReject.setEnabled(false);
                sendRequestToSecretaryBtn.setEnabled(false);
            }
            messageTxt.setText("");
        }

    }//GEN-LAST:event_sendRequestToSecretaryBtnActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        String message = messageTxt.getText();
        if (message.equals("")) {
            JOptionPane.showMessageDialog(null, "Message is required!");
            return;
        } else {
            governmentFundRequest.setMessage(message);
            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to proceed further?");

            if (dialogResult == JOptionPane.YES_OPTION) {
                governmentFundRequest.setStatus("Declined");
                messageTxt.setText("");
                btnReject.setEnabled(false);
                sendRequestToSecretaryBtn.setEnabled(false);
            }

            messageTxt.setText("");
        }
    }//GEN-LAST:event_btnRejectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountTxt;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnReject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField locationTxt;
    private javax.swing.JTextField messageTxt;
    private javax.swing.JButton sendRequestToSecretaryBtn;
    // End of variables declaration//GEN-END:variables
}
