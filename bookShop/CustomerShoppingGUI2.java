/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bookShop;

import javax.swing.table.DefaultTableModel;
import static bookShop.LinkedList.getData;
import static bookShop.ShoppingBasket.shopping_basket;

/**
 *
 * @author Cemre Şenyuva, Enes Pusa
 */
public class CustomerShoppingGUI2 extends javax.swing.JFrame {
     DefaultTableModel model;
    /**
     * Creates new form kullaniciAlisveris2GUI
     */
    public CustomerShoppingGUI2() {
        initComponents();
        model = (DefaultTableModel) shoppingBasketTable.getModel();
        Node node = shopping_basket.getHead();

        while ( node != null){
            System.out.println(node);
            model.addRow(getData(node));
            node = node.next;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        previous1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        confirmBasketButton = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        shoppingBasketTable = new javax.swing.JTable();
        previous = new javax.swing.JLabel();

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
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 70, 40));

        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("            Kitap Listesi");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 150, 30));

        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("            Alışveriş Sepetim");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 150, 30));

        previous1.setBackground(new java.awt.Color(186, 79, 84));
        previous1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        previous1.setForeground(new java.awt.Color(204, 204, 204));
        previous1.setText("   ←");
        previous1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                previous1MouseClicked(evt);
            }
        });
        jPanel2.add(previous1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

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
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 50, 40));

        confirmBasketButton.setBackground(new java.awt.Color(204, 204, 204));
        confirmBasketButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        confirmBasketButton.setText("Sepeti Onayla");
        confirmBasketButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmBasketButtonMouseClicked(evt);
            }
        });
        jPanel3.add(confirmBasketButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 150, 60));

        jLabel31.setBackground(new java.awt.Color(186, 79, 84));
        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(204, 204, 204));
        jLabel31.setText("SEPETİM");
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 260, 40));

        shoppingBasketTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kitap ID", "Kitap Adı", "Yazar Adı", "Sayfa Sayfası", "Fiyat"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
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
        jScrollPane1.setViewportView(shoppingBasketTable);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, 280));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 0, 610, 486));

        previous.setBackground(new java.awt.Color(186, 79, 84));
        previous.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        previous.setForeground(new java.awt.Color(204, 204, 204));
        previous.setText("   ←");
        previous.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                previousMouseClicked(evt);
            }
        });
        getContentPane().add(previous, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        dispose();
        MainGUI mainScreen = new MainGUI();
        mainScreen.show();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        dispose();
        CustomerShoppingGUI kullaniciEkrani = new CustomerShoppingGUI();
        kullaniciEkrani.show();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void confirmBasketButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmBasketButtonMouseClicked
        shopping_basket.confirmBasket();
	shopping_basket.emptyTheBasket();
    }//GEN-LAST:event_confirmBasketButtonMouseClicked

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked

    }//GEN-LAST:event_jLabel31MouseClicked

    private void previousMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousMouseClicked
        dispose();
        MainGUI mainScreen = new MainGUI();
        mainScreen.show();
    }//GEN-LAST:event_previousMouseClicked

    private void previous1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previous1MouseClicked
        dispose();
        MainGUI mainScreen = new MainGUI();
        mainScreen.show();
    }//GEN-LAST:event_previous1MouseClicked

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
            java.util.logging.Logger.getLogger(CustomerShoppingGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerShoppingGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerShoppingGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerShoppingGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerShoppingGUI2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmBasketButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel previous;
    private javax.swing.JLabel previous1;
    private javax.swing.JTable shoppingBasketTable;
    // End of variables declaration//GEN-END:variables
}
