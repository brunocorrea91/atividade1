/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author vasco
 */
public class GUICheckout extends javax.swing.JInternalFrame {

    /**
     * Creates new form GUICheckOut
     */
    public GUICheckout() {
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

        jpnlCheckout = new javax.swing.JPanel();
        jlblCheckout = new javax.swing.JLabel();
        jtfAddCheckout = new javax.swing.JTextField();
        jbtnCheckout2 = new javax.swing.JButton();
        jbtnVoltar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Checkout - Hotel Bruno Corrêa");

        jpnlCheckout.setBackground(new java.awt.Color(255, 255, 255));

        jlblCheckout.setForeground(new java.awt.Color(0, 0, 0));
        jlblCheckout.setText("Digite o nome do hóspede para Check-out:");

        jbtnCheckout2.setForeground(new java.awt.Color(0, 0, 0));
        jbtnCheckout2.setText("CheckOut");

        jbtnVoltar.setForeground(new java.awt.Color(0, 0, 0));
        jbtnVoltar.setText("Voltar");
        jbtnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnlCheckoutLayout = new javax.swing.GroupLayout(jpnlCheckout);
        jpnlCheckout.setLayout(jpnlCheckoutLayout);
        jpnlCheckoutLayout.setHorizontalGroup(
            jpnlCheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlCheckoutLayout.createSequentialGroup()
                .addGroup(jpnlCheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlCheckoutLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jbtnCheckout2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnVoltar))
                    .addGroup(jpnlCheckoutLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jtfAddCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnlCheckoutLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jlblCheckout)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jpnlCheckoutLayout.setVerticalGroup(
            jpnlCheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlCheckoutLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jlblCheckout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfAddCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(jpnlCheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnCheckout2)
                    .addComponent(jbtnVoltar))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlCheckout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlCheckout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnVoltarActionPerformed
       GUIPrincipal pr = new GUIPrincipal();
        pr.chamarMenu();
    }//GEN-LAST:event_jbtnVoltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnCheckout2;
    private javax.swing.JButton jbtnVoltar;
    private javax.swing.JLabel jlblCheckout;
    private javax.swing.JPanel jpnlCheckout;
    private javax.swing.JTextField jtfAddCheckout;
    // End of variables declaration//GEN-END:variables
}
