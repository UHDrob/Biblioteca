/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheCheckIn;

import java.awt.print.PrinterException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rob77
 */
public class CheckIn extends javax.swing.JInternalFrame {

    /**
     * Creates new form CheckIn
     */
    public CheckIn() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel_title = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panel_data = new javax.swing.JPanel();
        lbl_bookid = new javax.swing.JLabel();
        lbl_account = new javax.swing.JLabel();
        lbl_dayslate = new javax.swing.JLabel();
        lbl_latefees = new javax.swing.JLabel();
        txt_bookid = new javax.swing.JTextField();
        txt_account = new javax.swing.JTextField();
        txt_dayslate = new javax.swing.JTextField();
        txt_latefees = new javax.swing.JTextField();
        btn_return = new javax.swing.JButton();
        panel_receipt = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_ticket = new javax.swing.JTextArea();
        btn_print = new javax.swing.JButton();

        setClosable(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_title.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel1.setText("Check In");

        javax.swing.GroupLayout panel_titleLayout = new javax.swing.GroupLayout(panel_title);
        panel_title.setLayout(panel_titleLayout);
        panel_titleLayout.setHorizontalGroup(
            panel_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_titleLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(826, Short.MAX_VALUE))
        );
        panel_titleLayout.setVerticalGroup(
            panel_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_titleLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(panel_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 60));

        panel_data.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lbl_bookid.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lbl_bookid.setText("Book ID");

        lbl_account.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lbl_account.setText("Account");

        lbl_dayslate.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lbl_dayslate.setText("Days Late");

        lbl_latefees.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lbl_latefees.setText("Late Fees");

        txt_bookid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_bookidKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panel_dataLayout = new javax.swing.GroupLayout(panel_data);
        panel_data.setLayout(panel_dataLayout);
        panel_dataLayout.setHorizontalGroup(
            panel_dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dataLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(panel_dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_latefees)
                    .addGroup(panel_dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_bookid)
                        .addComponent(lbl_account)
                        .addComponent(lbl_dayslate)))
                .addGap(47, 47, 47)
                .addGroup(panel_dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_bookid)
                    .addComponent(txt_account)
                    .addComponent(txt_dayslate)
                    .addComponent(txt_latefees, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        panel_dataLayout.setVerticalGroup(
            panel_dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dataLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(panel_dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_bookid)
                    .addComponent(txt_bookid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(panel_dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_account)
                    .addComponent(txt_account, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(panel_dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_dayslate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_dayslate))
                .addGap(39, 39, 39)
                .addGroup(panel_dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_latefees)
                    .addComponent(txt_latefees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(123, Short.MAX_VALUE))
        );

        jPanel1.add(panel_data, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 380, 360));

        btn_return.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        btn_return.setText("RETURN");
        jPanel1.add(btn_return, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 370, 70));

        panel_receipt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txt_ticket.setColumns(20);
        txt_ticket.setRows(5);
        jScrollPane1.setViewportView(txt_ticket);

        javax.swing.GroupLayout panel_receiptLayout = new javax.swing.GroupLayout(panel_receipt);
        panel_receipt.setLayout(panel_receiptLayout);
        panel_receiptLayout.setHorizontalGroup(
            panel_receiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_receiptLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_receiptLayout.setVerticalGroup(
            panel_receiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_receiptLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(panel_receipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, 270, 360));

        btn_print.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        btn_print.setText("PRINT");
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });
        jPanel1.add(btn_print, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 440, 260, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_bookidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_bookidKeyReleased
        String r_date = null;
        LocalDate today = LocalDate.now();
        LocalDate rday = LocalDate.parse(r_date);
        
        Long day_gap = ChronoUnit.DAYS.between(rday, today);
        
        if (day_gap>0)
        {
            
        
        txt_dayslate.setText(day_gap.toString());
        
        long fine = 10*day_gap;
        txt_latefees.setText(String.valueOf(fine));
        }
        else
        {
            txt_dayslate.setText("0");
            txt_latefees.setText("0");
        }
    }//GEN-LAST:event_txt_bookidKeyReleased

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
        try {
            txt_ticket.print();
        } catch (PrinterException ex) {
            Logger.getLogger(CheckIn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_printActionPerformed


private void Ticket()
{
    txt_ticket.setText(LocalDate.now()
        + "\n" + "UHD Library" + "\n\n"
        + "Days Late:\t" + txt_dayslate.getText() + "\n"
        + "Late Fees:\t" + txt_latefees.getText() + "\n"
        + "___________________________");
}
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_print;
    private javax.swing.JButton btn_return;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_account;
    private javax.swing.JLabel lbl_bookid;
    private javax.swing.JLabel lbl_dayslate;
    private javax.swing.JLabel lbl_latefees;
    private javax.swing.JPanel panel_data;
    private javax.swing.JPanel panel_receipt;
    private javax.swing.JPanel panel_title;
    private javax.swing.JTextField txt_account;
    private javax.swing.JTextField txt_bookid;
    private javax.swing.JTextField txt_dayslate;
    private javax.swing.JTextField txt_latefees;
    private javax.swing.JTextArea txt_ticket;
    // End of variables declaration//GEN-END:variables
}
