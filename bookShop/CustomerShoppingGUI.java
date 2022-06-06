/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bookShop;

import javax.swing.table.DefaultTableModel;
import static bookShop.Book.bookList;
import static bookShop.Book.bookList_copy;
import static bookShop.LinkedList.getData;
import static bookShop.ShoppingBasket.shopping_basket;
import java.awt.event.KeyEvent;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Cemre Şenyuva, Enes Pusa
 */
public class CustomerShoppingGUI extends javax.swing.JFrame {
     DefaultTableModel model;   
    /**
     * Creates new form kullaniciAlisverisGUI
     */
    public CustomerShoppingGUI() {
        initComponents();
        model = (DefaultTableModel) bookTable.getModel();
        Node node = bookList.getHead();

        while ( node != null){
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
        previous = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        searchBook = new javax.swing.JTextField();
        jSeparator20 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookTable = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();

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

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 486));

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

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("Sepetime Ekle");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, 140, 60));

        searchBook.setBackground(new java.awt.Color(186, 79, 84));
        searchBook.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        searchBook.setForeground(new java.awt.Color(255, 255, 255));
        searchBook.setText("Kitap Ara");
        searchBook.setBorder(null);
        searchBook.setCaretColor(new java.awt.Color(255, 255, 255));
        searchBook.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchBookFocusGained(evt);
            }
        });
        searchBook.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchBookKeyReleased(evt);
            }
        });
        jPanel3.add(searchBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 450, 40));

        jSeparator20.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 450, 20));

        bookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kitap ID", "Kitap Adı", "Yazar Adı", "Sayfa Sayfası", "Fiyat"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class
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
        jScrollPane1.setViewportView(bookTable);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, 280));

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setText("Fiyata Göre Sırala");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 150, 60));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 0, 600, 486));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        dispose();
        CustomerShoppingGUI2 customerScreen = new CustomerShoppingGUI2();
        customerScreen.show();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked

    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        dispose();
        MainGUI mainScreen = new MainGUI();
        mainScreen.show();
    }//GEN-LAST:event_jLabel3MouseClicked
     
    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
       
        int row = bookTable.getSelectedRow();
        String selectedData = null;

        selectedData = (String) bookTable.getValueAt(row,1);
        System.out.println("Selected: " + selectedData);

        Book k = new Book(Integer.parseInt( bookTable.getValueAt(row, 0).toString() ),(String) bookTable.getValueAt(row,1),(String) bookTable.getValueAt(row, 2),Integer.parseInt( bookTable.getValueAt(row, 3).toString() ),Integer.parseInt( bookTable.getValueAt(row, 4).toString() ));
        shopping_basket.addToBasket(k);


    }//GEN-LAST:event_jButton5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void previousMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousMouseClicked
        dispose();
        MainGUI girisGUI = new MainGUI();
        girisGUI.show();
    }//GEN-LAST:event_previousMouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
  
            Node head = bookList_copy.getHead();
            Node node = bookList_copy.getHead();
        
            while (node.next != null){
                node = node.next;
            }

            bookList_copy.sort(head,node);

            // var olan liste temizlendi
            model.setRowCount(0);
            while ( head != null){
                model.addRow(getData(head));
                head = head.next;
            }
        
    
    
    }//GEN-LAST:event_jButton6MouseClicked

    private void searchBookKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBookKeyReleased
        String searchKey = searchBook.getText();
        TableRowSorter<DefaultTableModel> tableRowSorter=
                new TableRowSorter<>(model);
        bookTable.setRowSorter(tableRowSorter);
        tableRowSorter.setRowFilter(RowFilter.regexFilter(searchKey,1,2));// TODO add your handling code here:
    }//GEN-LAST:event_searchBookKeyReleased

    private void searchBookFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchBookFocusGained
        searchBook.setText("");
    }//GEN-LAST:event_searchBookFocusGained

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
            java.util.logging.Logger.getLogger(CustomerShoppingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerShoppingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerShoppingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerShoppingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerShoppingGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bookTable;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JLabel previous;
    private javax.swing.JTextField searchBook;
    // End of variables declaration//GEN-END:variables
}
