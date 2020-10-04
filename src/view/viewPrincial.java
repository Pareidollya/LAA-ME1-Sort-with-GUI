
package view;

import control.ordenaçãoControl;
import java.util.Set;

/**
 *
 * @author jjao
 */
public class viewPrincial extends javax.swing.JFrame {

    /**
     * Creates new form viewPrincial
     */
    public viewPrincial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        numeros = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        vetorInsertion = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        vetorBoubble = new javax.swing.JLabel();
        insertionCheck = new javax.swing.JLabel();
        boubbleCheck = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        limpar = new javax.swing.JButton();
        insertionB = new javax.swing.JRadioButton();
        boubbleB = new javax.swing.JRadioButton();
        selectionB = new javax.swing.JRadioButton();
        mergeB = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Conjunto de números:");
        jLabel1.setToolTipText("");

        numeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numerosActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("ORDENAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        vetorInsertion.setText("in");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel2.setText(" ORDENAÇÃO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        vetorBoubble.setText("bb");

        insertionCheck.setToolTipText("");

        boubbleCheck.setToolTipText("");

        limpar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        limpar.setText("LIMPAR");
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });

        insertionB.setText("Inserion");
        insertionB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertionBActionPerformed(evt);
            }
        });

        boubbleB.setText("Boubble");
        boubbleB.setToolTipText("");

        selectionB.setText("Selection");

        mergeB.setText("Inserion");
        mergeB.setActionCommand("Merge");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vetorBoubble)
                            .addComponent(vetorInsertion))
                        .addGap(0, 400, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(insertionB)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(106, 106, 106)
                                        .addComponent(insertionCheck))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(boubbleB)
                                        .addGap(19, 19, 19)
                                        .addComponent(boubbleCheck))
                                    .addComponent(selectionB)
                                    .addComponent(mergeB))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(75, 75, 75))
                            .addComponent(numeros))))
                .addContainerGap())
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(insertionCheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(insertionB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boubbleCheck)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(vetorInsertion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(vetorBoubble)
                        .addGap(139, 139, 139))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boubbleB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectionB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mergeB)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        

        double TempoInicial,TempoFinal;
        ordenaçãoControl o = new ordenaçãoControl();
        
        String[] n = this.numeros.getText().split(",");
        int[] nums = o.setVetorString(n);
    
        if (insertionB.isSelected() == true){ //INSERTION SORT
        
            TempoInicial = System.nanoTime();
            int [] resultado = o.oInsertion() ; //ORDENAÇÃO
            TempoFinal = (System.nanoTime()) - TempoInicial;
            
            StringBuilder stringArray = new StringBuilder();
            for (int k: resultado){
                stringArray.append(k+" ");
            }
            vetorInsertion.setText("Insertion: [ "+stringArray.toString()+"];"
                    + " Execução em: " +Double.toString(TempoFinal)+" nanossegundos. (On²)");
        }
        else if (insertionB.isSelected() == false){
            vetorInsertion.setText("");
        }
        
        //////////////////////////////////////////////////////////////////////////////////////////      
        if (boubbleB.isSelected() == true){ //BOUBBLE SORT
        
            TempoInicial = System.nanoTime();
            int [] resultado = o.oBoubble() ; //ORDENAÇÃO
            TempoFinal = (System.nanoTime()) - TempoInicial;
            
            StringBuilder stringArrayB = new StringBuilder();
            for (int k: resultado){
                stringArrayB.append(k+" ");
            }
            vetorBoubble.setText("Boubble: [ "+stringArrayB.toString()+"];"
                    + " Execução em: " +Double.toString(TempoFinal)+" nanossegundos. (On²)");
        }
        else if (boubbleB.isSelected() == false){
            vetorBoubble.setText("");
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void numerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numerosActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_numerosActionPerformed

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed

        vetorInsertion.setText("");
        vetorBoubble.setText("");
        insertionB.setSelected(false);
        boubbleB.setSelected(false);
        selectionB.setSelected(false);
        mergeB.setSelected(false);
                
    }//GEN-LAST:event_limparActionPerformed

    private void insertionBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertionBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertionBActionPerformed

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
            java.util.logging.Logger.getLogger(viewPrincial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewPrincial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewPrincial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewPrincial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewPrincial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton boubbleB;
    private javax.swing.JLabel boubbleCheck;
    private javax.swing.JRadioButton insertionB;
    private javax.swing.JLabel insertionCheck;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton limpar;
    private javax.swing.JRadioButton mergeB;
    private javax.swing.JTextField numeros;
    private javax.swing.JRadioButton selectionB;
    private javax.swing.JLabel vetorBoubble;
    private javax.swing.JLabel vetorInsertion;
    // End of variables declaration//GEN-END:variables
}
