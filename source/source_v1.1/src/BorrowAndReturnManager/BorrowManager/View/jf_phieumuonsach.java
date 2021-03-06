/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BorrowAndReturnManager.BorrowManager.View;

import BorrowAndReturnManager.BorrowManager.Model.mdl_phieumuonsach;
import LoginAndRegister.MyConnection;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Admin
 */
public class jf_phieumuonsach extends javax.swing.JFrame {

    public jf_phieumuonsach() {
        initComponents();
        addPlaceholderStyle(jtfSearch);
        this.setLocationRelativeTo(null);
        this.setTitle("Borrow Manager");
        setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        
        getListPHIEUMUONSACH();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnRoot = new javax.swing.JPanel();
        jpnRoot1 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jtfSearch = new javax.swing.JTextField();
        jpnView = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        classTableModel = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnReload = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jpnRoot.setBackground(new java.awt.Color(251, 224, 196));
        jpnRoot.setForeground(new java.awt.Color(255, 255, 255));

        jpnRoot1.setBackground(new java.awt.Color(251, 224, 196));
        jpnRoot1.setPreferredSize(new java.awt.Dimension(475, 400));

        btnDelete.setBackground(new java.awt.Color(114, 158, 190));
        btnDelete.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteMouseExited(evt);
            }
        });
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(114, 158, 190));
        btnAdd.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddMouseExited(evt);
            }
        });
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jtfSearch.setFont(new java.awt.Font("SF Pro Display", 2, 12)); // NOI18N
        jtfSearch.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtfSearch.setText("Search");
        jtfSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfSearchFocusLost(evt);
            }
        });
        jtfSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSearchActionPerformed(evt);
            }
        });
        jtfSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfSearchKeyReleased(evt);
            }
        });

        classTableModel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "  M?? phi???u m?????n s??ch", "         Ng??y m?????n", "           M?? ?????c gi???"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(classTableModel);

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnViewLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnUpdate.setBackground(new java.awt.Color(114, 158, 190));
        btnUpdate.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdateMouseExited(evt);
            }
        });
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnReload.setBackground(new java.awt.Color(114, 158, 190));
        btnReload.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        btnReload.setText("Reload");
        btnReload.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReloadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReloadMouseExited(evt);
            }
        });
        btnReload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReloadActionPerformed(evt);
            }
        });

        btnPrint.setBackground(new java.awt.Color(114, 158, 190));
        btnPrint.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        btnPrint.setText("Print");
        btnPrint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPrintMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPrintMouseExited(evt);
            }
        });
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnRoot1Layout = new javax.swing.GroupLayout(jpnRoot1);
        jpnRoot1.setLayout(jpnRoot1Layout);
        jpnRoot1Layout.setHorizontalGroup(
            jpnRoot1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRoot1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnRoot1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpnRoot1Layout.createSequentialGroup()
                        .addComponent(jtfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jpnView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jpnRoot1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReload, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(btnPrint, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );
        jpnRoot1Layout.setVerticalGroup(
            jpnRoot1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRoot1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnRoot1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jpnRoot1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnRoot1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jpnView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnRoot1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnReload, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot1, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot1, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseEntered
        btnDelete.setBackground(new Color(79,110,133));
    }//GEN-LAST:event_btnDeleteMouseEntered

    private void btnDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseExited
        btnDelete.setBackground(new Color(114,158,190));
    }//GEN-LAST:event_btnDeleteMouseExited

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
                DefaultTableModel defaultTable = (DefaultTableModel) classTableModel.getModel();
        if(classTableModel.getSelectedRowCount() == 1) {
            int confirmed = JOptionPane.showConfirmDialog(null, 
                "Are you sure you want to delete it?", "Delete Message Box",
                JOptionPane.YES_NO_OPTION);

            if (confirmed == JOptionPane.YES_OPTION) {
                
                 List<Integer> MASACHList = new ArrayList<>();
                int count_MASACH_deleted = 0;
                int index = classTableModel.getSelectedRow();
                TableModel model = classTableModel.getModel();
                int MAPHIEUMUONSACH_selected = Integer.parseInt(model.getValueAt(index, 0).toString());
            
                
                PreparedStatement ps5;
                ResultSet rs5;
                String query5 = "SELECT MAPHIEUMUONSACH from phieutrasach where MAPHIEUMUONSACH = '" + MAPHIEUMUONSACH_selected + "';";
                boolean sign = false;
                
                PreparedStatement ps1;
                int rs1;
                String query1 = "Delete from phieumuonsach where MAPHIEUMUONSACH = '" + MAPHIEUMUONSACH_selected + "';";
            
                PreparedStatement ps2;
                int rs2;
                String query2 = "Delete from ctphieumuonsach where MAPHIEUMUONSACH = '" + MAPHIEUMUONSACH_selected + "';";
            
                PreparedStatement ps3;
                ResultSet rs3;
                String query3 = "SELECT MASACH from ctphieumuonsach where MAPHIEUMUONSACH = '" + MAPHIEUMUONSACH_selected + "';";
            
                try {
                    ps5 = MyConnection.getConnection().prepareStatement(query5);
                    rs5 = ps5.executeQuery();
                    while(rs5.next()) {
                       sign = true;
                    }
                    if(sign == false) {
                        ps3 = MyConnection.getConnection().prepareStatement(query3);
                        rs3 = ps3.executeQuery();
                        while(rs3.next()) {
                            int masach = rs3.getInt("MASACH");
                            MASACHList.add(masach);
                        }
                 
                        for(int i = 0; i < MASACHList.size(); i++) {
                            int masach = MASACHList.get(i);
                            PreparedStatement ps4;
                            int rs4;
                            String query4 = "UPDATE thongtinsach SET TRANGTHAI=? WHERE MASACH='" + masach + "';";
                            ps4 = MyConnection.getConnection().prepareStatement(query4);
                            ps4.setInt(1, 0);
                            rs4 = ps4.executeUpdate();
                            if(rs4 > 0) {
                            count_MASACH_deleted++;
                            }
                            else JOptionPane.showMessageDialog(null, "X???y ra l???i khi c???p nh???t l???i tr???ng th??i c??c s??ch ???? m?????n!!!");
                            ps4.close();
                        }
                        ps3.close();
                        rs3.close();
                        if(count_MASACH_deleted == MASACHList.size()) {
                            ps2 = MyConnection.getConnection().prepareStatement(query2);
                            rs2 = ps2.executeUpdate();
                            if(rs2 > 0) {
                                ps1 = MyConnection.getConnection().prepareStatement(query1);
                                rs1 = ps1.executeUpdate();
                                if(rs1 > 0) {
                                    defaultTable.removeRow(classTableModel.getSelectedRow());
                                    JOptionPane.showMessageDialog(null, "???? x??a phi???u m?????n s??ch th??nh c??ng!!!");
                                }
                                else JOptionPane.showMessageDialog(null, "X??a phi???u m?????n s??ch kh??ng th??nh c??ng!!!");
                                ps1.close();
                            }
                            else JOptionPane.showMessageDialog(null, "X???y ra l???i khi x??a c??c chi ti???t phi???u m?????n s??ch li??n quan!!!");
                            ps2.close();
                        }
                    
                    }
                    else JOptionPane.showMessageDialog(null, "Kh??ng th??? x??a phi???u n??y do ???? t???n t???i phi???u tr??? s??ch t????ng ???ng!!!");
                   
                } catch (SQLException e) {
                }
            }
            else { setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE); }
           
        }
        else {
            if(classTableModel.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Kh??ng c??n h??ng n??o ????? x??a!!!");
            }
            else JOptionPane.showMessageDialog(null, "Vui l??ng ch???n m???t h??ng ????? x??a!!!");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseEntered
        btnAdd.setBackground(new Color(79,110,133));
    }//GEN-LAST:event_btnAddMouseEntered

    private void btnAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseExited
        btnAdd.setBackground(new Color(114,158,190));
    }//GEN-LAST:event_btnAddMouseExited

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        jf_add frame = new jf_add();
        frame.setTitle("Borrow Manager - Add");
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void jtfSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfSearchFocusGained
        if(jtfSearch.getText().equals("Search")) {
            jtfSearch.setText(null);
            jtfSearch.requestFocus();
            removePlaceholderStyle(jtfSearch);
        }
    }//GEN-LAST:event_jtfSearchFocusGained

    private void jtfSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfSearchFocusLost
        if(jtfSearch.getText().length() == 0) {
            addPlaceholderStyle(jtfSearch);
            jtfSearch.setText("Search");
        }
    }//GEN-LAST:event_jtfSearchFocusLost

    private void jtfSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfSearchActionPerformed

    private void jtfSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfSearchKeyReleased
        String key = jtfSearch.getText().trim();
        DefaultTableModel model = (DefaultTableModel) classTableModel.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        classTableModel.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(key, 0));
    }//GEN-LAST:event_jtfSearchKeyReleased

    private void btnUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseEntered
        btnUpdate.setBackground(new Color(79,110,133));
    }//GEN-LAST:event_btnUpdateMouseEntered

    private void btnUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseExited
        btnUpdate.setBackground(new Color(114,158,190));
    }//GEN-LAST:event_btnUpdateMouseExited

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        DefaultTableModel defaultTable = (DefaultTableModel) classTableModel.getModel();
        if(classTableModel.getSelectedRowCount() == 1) {
             int i = classTableModel.getSelectedRow();
             TableModel model = classTableModel.getModel();
             int MAPHIEUMUONSACH_selected = Integer.parseInt(model.getValueAt(i, 0).toString());
             String NGAYMUON_selected = model.getValueAt(i, 1).toString();
             int MADOCGIA_selected = Integer.parseInt(model.getValueAt(i, 2).toString());
             jf_update frame = new jf_update(MAPHIEUMUONSACH_selected, NGAYMUON_selected, MADOCGIA_selected);
             frame.setTitle("Borrow Manager - Update");
             frame.setResizable(false);
             frame.setLocationRelativeTo(null);
             frame.setVisible(true);
             
        }
        else {
            if(classTableModel.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Kh??ng c??n h??ng n??o ????? c???p nh???t!!!");
            }
            else JOptionPane.showMessageDialog(null, "Vui l??ng ch???n m???t h??ng ????? c???p nh???t!!!");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnReloadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReloadMouseEntered
        btnReload.setBackground(new Color(79,110,133));
    }//GEN-LAST:event_btnReloadMouseEntered

    private void btnReloadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReloadMouseExited
        btnReload.setBackground(new Color(114,158,190));
    }//GEN-LAST:event_btnReloadMouseExited

    private void btnReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReloadActionPerformed
        DefaultTableModel model = (DefaultTableModel) classTableModel.getModel();
        model.setRowCount(0);
        getListPHIEUMUONSACH();
        JOptionPane.showMessageDialog(null, "???? l??m m???i l???i danh s??ch phi???u m?????n s??ch!!!");
    }//GEN-LAST:event_btnReloadActionPerformed

    private void btnPrintMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintMouseEntered
        btnPrint.setBackground(new Color(79,110,133));
    }//GEN-LAST:event_btnPrintMouseEntered

    private void btnPrintMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintMouseExited
        btnPrint.setBackground(new Color(114,158,190));
    }//GEN-LAST:event_btnPrintMouseExited

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        DefaultTableModel defaultTable = (DefaultTableModel) classTableModel.getModel();
        if(classTableModel.getSelectedRowCount() == 1) {
            int index = classTableModel.getSelectedRow();
            Print(index);
        }
        else {
            if(classTableModel.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Kh??ng c??n h??ng n??o ????? in!!!");
            }
            else JOptionPane.showMessageDialog(null, "Vui l??ng ch???n m???t h??ng ????? in!!!");
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        ImageIcon icon = new ImageIcon(this.getClass().getClassLoader().getResource("assets/borrow_and_return.png"));
        setIconImage(icon.getImage());
    }//GEN-LAST:event_formWindowActivated

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int confirmed = JOptionPane.showConfirmDialog(null, 
            "Do you want to exit Borrow Books?", "Exit Borrow Books",
        JOptionPane.YES_NO_OPTION);

        if (confirmed == JOptionPane.YES_OPTION) {
            this.dispose();
        }
        else { setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE); }
    }//GEN-LAST:event_formWindowClosing

    public void addPlaceholderStyle(JTextField textField){
        Font font = textField.getFont();
        font = font.deriveFont(Font.ITALIC);
        textField.setFont(font);
        textField.setForeground(Color.gray);
    }
    
    public void removePlaceholderStyle(JTextField textField){
        Font font = textField.getFont();
        font = font.deriveFont(Font.PLAIN|Font.BOLD);
        textField.setFont(font);
        textField.setForeground(Color.black);
    }
    
    public void getListPHIEUMUONSACH() {
	DefaultTableModel defaultTable = (DefaultTableModel) classTableModel.getModel();
	List<mdl_phieumuonsach> phieumuonsachList = new ArrayList<>();
        PreparedStatement ps;
        ResultSet rs;
        String query = "Select * from phieumuonsach;";
	try {
            ps = MyConnection.getConnection().prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
		int MAPHIEUMUONSACH = rs.getInt("MAPHIEUMUONSACH");
		String NGAYMUON = rs.getString("NGAYMUON");
                int MADOCGIA = rs.getInt("MADOCGIA");
		mdl_phieumuonsach phieumuonsach = new mdl_phieumuonsach(MAPHIEUMUONSACH, NGAYMUON, MADOCGIA);
		phieumuonsachList.add(phieumuonsach);
            }	
            Object[] row = new Object[3];
            for(int i = 0; i <phieumuonsachList.size(); i++) {
		row[0] = phieumuonsachList.get(i).getMAPHIEUMUONSACH();
		row[1] = phieumuonsachList.get(i).getNGAYMUON();
                row[2] = phieumuonsachList.get(i).getMADOCGIA();
		defaultTable.addRow(row);
            }
            ps.close();
            rs.close();
	} catch (SQLException e) {
	}
    }
    
public static String removeVietnameseLetters(String str) {
    str = str.replaceAll("??|??|???|???|??|??|???|???|???|???|???|??|???|???|???|???|???", "a");
    str = str.replaceAll("??|??|???|???|???|??|???|???|???|???|???", "e");
    str = str.replaceAll("??|??|???|???|??", "i");
    str = str.replaceAll("??|??|???|???|??|??|???|???|???|???|???|??|???|???|???|???|???", "o");
    str = str.replaceAll("??|??|???|???|??|??|???|???|???|???|???", "u");
    str = str.replaceAll("???|??|???|???|???", "y");
    str = str.replaceAll("??", "d");
    str = str.replaceAll("??|??|???|???|??|??|???|???|???|???|???|??|???|???|???|???|???", "A");
    str = str.replaceAll("??|??|???|???|???|??|???|???|???|???|???", "E");
    str = str.replaceAll("??|??|???|???|??", "I");
    str = str.replaceAll("??|??|???|???|??|??|???|???|???|???|???|??|???|???|???|???|???", "O");
    str = str.replaceAll("??|??|???|???|??|??|???|???|???|???|???", "U");
    str = str.replaceAll("???|??|???|???|???", "Y");
    str = str.replaceAll("??", "D");
    return str;
}
    
    public void Print(int index) {
        TableModel model = classTableModel.getModel();
        String maphieumuonsach = model.getValueAt(index, 0).toString();
        String ngaymuon = model.getValueAt(index, 1).toString();
        String madocgia = model.getValueAt(index, 2).toString();
        
        String hoten = "";
        PreparedStatement ps1;
        ResultSet rs1;
        String query1 = "Select HOTEN from thedocgia T join phieumuonsach P on T.MADOCGIA = P.MADOCGIA where MAPHIEUMUONSACH = '" + maphieumuonsach + "';";
        try {
            ps1 = MyConnection.getConnection().prepareStatement(query1);
            rs1 = ps1.executeQuery();
            while (rs1.next()) {
		hoten = removeVietnameseLetters(rs1.getString("HOTEN").trim());
            }	
            ps1.close();
            rs1.close();
	} catch (SQLException e) {
	}
        
        List<String> nameBookList = new ArrayList<>();
        PreparedStatement ps2;
        ResultSet rs2;
        String query2 = "Select TENSACH from thongtinsach T join ctphieumuonsach C on T.MASACH = C.MASACH where MAPHIEUMUONSACH = '" + maphieumuonsach + "';";
        try {
            ps2 = MyConnection.getConnection().prepareStatement(query2);
            rs2 = ps2.executeQuery();
            while (rs2.next()) {
		String namebook = removeVietnameseLetters(rs2.getString("TENSACH"));
                nameBookList.add(namebook);
            }	
            ps2.close();
            rs2.close();
	} catch (SQLException e) {
	}
        
        String path = "E:\\";
        Document doc = new Document() {};
        try{
           PdfWriter.getInstance(doc, new FileOutputStream(path+"PHIEUMUONSACHSO"+maphieumuonsach+".pdf"));
           doc.open();
           Paragraph p1 = new Paragraph("                                           BOOK BORROW BILL\n");
           doc.add(p1);
           Paragraph p2 = new Paragraph("                      ****************************************************************************");
           doc.add(p2);
           Paragraph p3 = new Paragraph("\t    *General Information " + "\nName: " + hoten + "\nBorrrow Bill Id: " + maphieumuonsach);
           doc.add(p3);
           doc.add(p2);
           
           String namebook_print = "";
           for(int i = 0; i < nameBookList.size(); i++) {
               String namebook = nameBookList.get(i);
               removeVietnameseLetters(namebook);
               if(i == 0) namebook_print = "\n Book title: " + namebook;
               else namebook_print = namebook_print + "\n Book title: " + namebook;
           }
           Paragraph p5 = new Paragraph("\t    *Details " + namebook_print);
           doc.add(p5);
           doc.add(p2);
   
           doc.add(p2);

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        doc.close();
        int a = JOptionPane.showConfirmDialog(null, "Printed successfully! Do you want to read the bill?", "Info", JOptionPane.YES_NO_OPTION);
                        
        if (a == 0){
            try
            {
                if ((new File(path+"PHIEUMUONSACHSO"+maphieumuonsach+".pdf")).exists()){
                    Process p = Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler " + path + "PHIEUMUONSACHSO"+maphieumuonsach+".pdf");
                                    
                }else{
                    JOptionPane.showMessageDialog(null, "File isn't exist.");
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    
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
            java.util.logging.Logger.getLogger(jf_phieumuonsach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jf_phieumuonsach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jf_phieumuonsach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jf_phieumuonsach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jf_phieumuonsach().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnReload;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTable classTableModel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JPanel jpnRoot1;
    private javax.swing.JPanel jpnView;
    private javax.swing.JTextField jtfSearch;
    // End of variables declaration//GEN-END:variables
}
