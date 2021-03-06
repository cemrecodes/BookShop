/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bookShop;

import static java.lang.Integer.parseInt;

/**
 *
 * @author Cemre Şenyuva, Enes Pusa
 */
public class AdminScreenGUI extends javax.swing.JFrame {
    
    
    /**
     * Creates new form adminEkranGUI
     */
    public AdminScreenGUI() {
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

        jSeparator22 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        previous = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        jSeparator20 = new javax.swing.JSeparator();
        bookName = new javax.swing.JTextField();
        author = new javax.swing.JTextField();
        pages = new javax.swing.JTextField();
        jSeparator21 = new javax.swing.JSeparator();
        jSeparator23 = new javax.swing.JSeparator();
        jSeparator24 = new javax.swing.JSeparator();
        jButton5 = new javax.swing.JButton();

        jSeparator22.setBackground(new java.awt.Color(204, 204, 204));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(74, 31, 61));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("       Çıkış");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 70, 40));

        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("               Kitap Ekle");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 150, 30));

        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("               Siparişler");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 150, 30));

        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("               Kitap Sil");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 150, 30));

        jLabel8.setBackground(new java.awt.Color(186, 79, 84));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("    X ");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 50, 40));

        jLabel11.setBackground(new java.awt.Color(186, 79, 84));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("    X ");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 15, 50, -1));

        previous.setBackground(new java.awt.Color(186, 79, 84));
        previous.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        previous.setForeground(new java.awt.Color(204, 204, 204));
        previous.setText("   ←");
        previous.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                previousMouseClicked(evt);
            }
        });
        jPanel2.add(previous, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 321, 486));

        jPanel3.setBackground(new java.awt.Color(186, 79, 84));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 0, 190, -1));

        jLabel6.setBackground(new java.awt.Color(186, 79, 84));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("    X ");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 50, 40));

        price.setBackground(new java.awt.Color(186, 79, 84));
        price.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        price.setForeground(new java.awt.Color(255, 255, 255));
        price.setText("Fiyat");
        price.setBorder(null);
        price.setCaretColor(new java.awt.Color(255, 255, 255));
        price.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                priceFocusGained(evt);
            }
        });
        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });
        jPanel3.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 240, 40));

        jSeparator20.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 240, 20));

        bookName.setBackground(new java.awt.Color(186, 79, 84));
        bookName.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        bookName.setForeground(new java.awt.Color(255, 255, 255));
        bookName.setText("Kitap Adı");
        bookName.setBorder(null);
        bookName.setCaretColor(new java.awt.Color(255, 255, 255));
        bookName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                bookNameFocusGained(evt);
            }
        });
        bookName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookNameActionPerformed(evt);
            }
        });
        jPanel3.add(bookName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 240, 40));

        author.setBackground(new java.awt.Color(186, 79, 84));
        author.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        author.setForeground(new java.awt.Color(255, 255, 255));
        author.setText("Yazar");
        author.setBorder(null);
        author.setCaretColor(new java.awt.Color(255, 255, 255));
        author.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                authorFocusGained(evt);
            }
        });
        author.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorActionPerformed(evt);
            }
        });
        jPanel3.add(author, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 240, 40));

        pages.setBackground(new java.awt.Color(186, 79, 84));
        pages.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        pages.setForeground(new java.awt.Color(255, 255, 255));
        pages.setText("Sayfa Sayısı");
        pages.setBorder(null);
        pages.setCaretColor(new java.awt.Color(255, 255, 255));
        pages.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pagesFocusGained(evt);
            }
        });
        pages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagesActionPerformed(evt);
            }
        });
        jPanel3.add(pages, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 240, 40));

        jSeparator21.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 240, 20));

        jSeparator23.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 240, 20));

        jSeparator24.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.add(jSeparator24, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 240, 20));

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("Kitap Ekle");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 160, 60));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 610, 486));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        dispose();
        MainGUI admin = new MainGUI();
        admin.show();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked

    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
      dispose();
      AdminScreen3GUI adminScreen3 = new AdminScreen3GUI();
      adminScreen3.show();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
      dispose();
      AdminScreen2GUI adminScreen2 = new AdminScreen2GUI();
      adminScreen2.show();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void priceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_priceFocusGained
        price.setText("");
    }//GEN-LAST:event_priceFocusGained

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void bookNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bookNameFocusGained
        bookName.setText("");
    }//GEN-LAST:event_bookNameFocusGained

    private void bookNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookNameActionPerformed

    private void authorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_authorFocusGained
        author.setText("");
    }//GEN-LAST:event_authorFocusGained

    private void authorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_authorActionPerformed

    private void pagesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pagesFocusGained
       pages.setText("");
    }//GEN-LAST:event_pagesFocusGained

    private void pagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pagesActionPerformed
    
    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
      Book book = new Book(bookName.getText(),author.getText(),parseInt(pages.getText()),parseInt(price.getText()) );
      book.addBook(book);     
    }//GEN-LAST:event_jButton5MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseClicked

    private void previousMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousMouseClicked
      dispose();
      MainGUI girisGUI = new MainGUI();
      girisGUI.show();        
    }//GEN-LAST:event_previousMouseClicked

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
            java.util.logging.Logger.getLogger(AdminScreenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminScreenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminScreenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminScreenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminScreenGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField author;
    private javax.swing.JTextField bookName;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JTextField pages;
    private javax.swing.JLabel previous;
    private javax.swing.JTextField price;
    // End of variables declaration//GEN-END:variables
}
