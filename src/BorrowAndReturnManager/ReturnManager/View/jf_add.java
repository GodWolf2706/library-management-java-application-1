/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BorrowAndReturnManager.ReturnManager.View;

import BorrowAndReturnManager.ReturnManager.Model.mdl_phieumuonsach;
import LoginAndRegister.MyConnection;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Admin
 */
public class jf_add extends javax.swing.JFrame {

    public jf_add() {
        initComponents();
        getPHIEUMUONSACHList();
        setCurrentDate();
        jdcNgayTra.getJCalendar().setMaxSelectableDate(new Date());
        this.setLocationRelativeTo(null);
        this.setTitle("Return Manager - Add");
        setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtfMaPhieuTraSach = new javax.swing.JTextField();
        jtfMaPhieuMuonSach = new javax.swing.JTextField();
        jdcNgayTra = new com.toedter.calendar.JDateChooser();
        jScrollPane4 = new javax.swing.JScrollPane();
        classTableModel2 = new javax.swing.JTable();
        btnExit = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jtfSearchDocGia = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(24, 119, 242)));

        jPanel2.setBackground(new java.awt.Color(24, 119, 242));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Return Manager", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SF Pro Display", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mã phiếu trả sách:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mã phiếu mượn sách:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ngày trả:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, -1, -1));

        jtfMaPhieuTraSach.setEditable(false);
        jtfMaPhieuTraSach.setBackground(new java.awt.Color(204, 204, 204));
        jtfMaPhieuTraSach.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(jtfMaPhieuTraSach, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 120, 30));

        jtfMaPhieuMuonSach.setEditable(false);
        jtfMaPhieuMuonSach.setBackground(new java.awt.Color(204, 204, 204));
        jtfMaPhieuMuonSach.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(jtfMaPhieuMuonSach, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 120, 30));

        jdcNgayTra.setDateFormatString("dd/MM/yyyy");
        jdcNgayTra.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        jPanel2.add(jdcNgayTra, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 160, 30));

        classTableModel2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "      Mã phiếu mượn sách", "                   Độc giả"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        classTableModel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                classTableModel2MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(classTableModel2);

        btnExit.setBackground(new java.awt.Color(24, 119, 242));
        btnExit.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Exit");
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(24, 119, 242));
        btnSave.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSaveMouseExited(evt);
            }
        });
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(24, 119, 242));
        jLabel8.setText("Tìm kiếm tên độc giả:");

        jtfSearchDocGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSearchDocGiaActionPerformed(evt);
            }
        });
        jtfSearchDocGia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfSearchDocGiaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfSearchDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfSearchDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                            .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 621, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void classTableModel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classTableModel2MouseClicked
        int i = classTableModel2.getSelectedRow();
       TableModel model = classTableModel2.getModel();
       jtfMaPhieuMuonSach.setText(model.getValueAt(i, 0).toString());
    }//GEN-LAST:event_classTableModel2MouseClicked

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        btnExit.setBackground(new Color(79,110,133));
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        btnExit.setBackground(new Color(114,158,190));
    }//GEN-LAST:event_btnExitMouseExited

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int confirmed = JOptionPane.showConfirmDialog(null, 
            "Do you want to exit Add?", "Exit Add",
            JOptionPane.YES_NO_OPTION);

        if (confirmed == JOptionPane.YES_OPTION) {
            this.dispose();
        }
        else { setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE); }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseEntered
        btnSave.setBackground(new Color(79,110,133));
    }//GEN-LAST:event_btnSaveMouseEntered

    private void btnSaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseExited
        btnSave.setBackground(new Color(114,158,190));
    }//GEN-LAST:event_btnSaveMouseExited

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String sMaphieumuonsach = jtfMaPhieuMuonSach.getText().toString();
       Date ngaytra = jdcNgayTra.getDate();
       DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
       String sNgayTra = dateFormat.format(ngaytra);
       if(!sMaphieumuonsach.trim().equals("") && !sNgayTra.trim().equals("")) {
           int maphieumuonsach = Integer.parseInt(sMaphieumuonsach);
           Date ngaymuon = null;
           int songaymuon = 0;
           double tienphatkynay = 0;
           double tongnokynay = 0;
           double tongno = 0;
           
           PreparedStatement ps1;
           ResultSet rs1;
           String query1 = "Select P.NGAYMUON, T.TONGNODOCGIA from thedocgia T join phieumuonsach P on T.MADOCGIA = P.MADOCGIA where P.MAPHIEUMUONSACH = '" + maphieumuonsach + "';";
           
           PreparedStatement ps2;
           ResultSet rs2;
           String query2 = "Select MASACH from ctphieumuonsach where MAPHIEUMUONSACH = '" + maphieumuonsach + "';";
           
           PreparedStatement ps3;
           int rs3;
           String query3 = "INSERT INTO phieutrasach(NGAYTRA,MAPHIEUMUONSACH,TIENPHATKYNAY,TIENNOKYNAY,TONGNO) values(?,?,?,?,?);";
           
           PreparedStatement ps4;
           ResultSet rs4;
           String query4 = "Select MAPHIEUTRASACH from phieutrasach order by MAPHIEUTRASACH desc limit 1;";
           
           PreparedStatement ps5;
           int rs5;
           String query5 = "INSERT INTO ctphieutrasach(MAPHIEUTRASACH,SONGAYTRATRE,TIENPHAT) values(?,?,?);;";
           
           PreparedStatement ps6;
           int rs6;
           String query6 = "UPDATE thedocgia SET TONGNODOCGIA=? WHERE MADOCGIA = (Select MADOCGIA from phieumuonsach where MAPHIEUMUONSACH = '" + maphieumuonsach + "');";
          
           try {
                ps1 = MyConnection.getConnection().prepareStatement(query1);
                rs1 = ps1.executeQuery();
                while (rs1.next()) {
                   tongnokynay = rs1.getDouble("TONGNODOCGIA");
                   String sNgayMuon = rs1.getString("NGAYMUON");
                   ngaymuon = new SimpleDateFormat("dd/MM/yyyy").parse(sNgayMuon);
                   long lSongaymuon = ngaytra.getTime() - ngaymuon.getTime();
                   long lSONGAYMUON = TimeUnit.MILLISECONDS.toDays(lSongaymuon);
                   String sSongaymuon = Long.toString(lSONGAYMUON);
		   songaymuon = Integer.parseInt(sSongaymuon);
                }
                if(songaymuon > 4) {
                    tienphatkynay = (songaymuon - 4) * 1000;
                }
                tongno = tongnokynay + tienphatkynay;
                ps1.close();
                rs1.close();
                
                ps2 = MyConnection.getConnection().prepareStatement(query2);
                rs2 = ps2.executeQuery();
                while (rs2.next()) {
                   int MASACH = rs2.getInt("MASACH");
                   int rs;
                   String query = "UPDATE thongtinsach SET TRANGTHAI=? WHERE MASACH = '" + MASACH + "';";
                   PreparedStatement ps = MyConnection.getConnection().prepareStatement(query);
                   ps.setInt(1, 0);
                   rs = ps.executeUpdate();
                   ps.close();
                   if(rs > 0) {}
                   else JOptionPane.showMessageDialog(null, "Xảy ra lỗi khi cập nhật trạng thái sách trả lại!!!");
                }
                ps2.close();
                rs2.close();
                
                ps3 = MyConnection.getConnection().prepareStatement(query3);
                ps3.setString(1, sNgayTra);
                ps3.setInt(2, maphieumuonsach);
                ps3.setDouble(3, tienphatkynay);
                ps3.setDouble(4, tongnokynay);
                ps3.setDouble(5, tongno);
                rs3 = ps3.executeUpdate();
                ps3.close();
                if(rs3 > 0) {
                    ps4 = MyConnection.getConnection().prepareStatement(query4);
                    rs4 = ps4.executeQuery();
                    while (rs4.next()) {
                        int songaytratre = 0;
                        if(songaymuon > 4) songaytratre = songaymuon - 4;
                        int MAPHIEUTRASACH = rs4.getInt("MAPHIEUTRASACH");
                        ps5 = MyConnection.getConnection().prepareStatement(query5);
                        ps5.setInt(1, MAPHIEUTRASACH);
                        ps5.setInt(2, songaytratre);
                        ps5.setDouble(3, tienphatkynay);
                        rs5 = ps5.executeUpdate();
                        ps5.close();
                        if(rs5 > 0) { 
                            ps6 = MyConnection.getConnection().prepareStatement(query6);
                            ps6.setDouble(1, tongno);
                            rs6 = ps6.executeUpdate();
                            ps6.close();
                            if(rs6 > 0) {
                                DefaultTableModel model = (DefaultTableModel) classTableModel2.getModel();
                                model.setRowCount(0);
                                getPHIEUMUONSACHList();
                                jtfMaPhieuMuonSach.setText("");
                                Date today = Calendar.getInstance().getTime();
                                String temp =  dateFormat.format(today.getTime());
                                Date date1 = null;
                                try {
                                    date1 = new SimpleDateFormat("dd/MM/yyyy").parse(temp);
                                } catch (Exception e) {
                                }
                                jdcNgayTra.setDate(date1);
                                JOptionPane.showMessageDialog(null, "Tạo phiếu trả sách thành công!!!");
                            }
                            else JOptionPane.showMessageDialog(null, "Xảy ra lỗi khi cập nhật tổng nợ độc giả!!!");
                        }
                        else JOptionPane.showMessageDialog(null, "Xảy ra lỗi khi thêm chi tiết phiếu trả sách!!!");
                    }
                    ps4.close();
                    rs4.close();
                }
                else JOptionPane.showMessageDialog(null, "Xảy ra lỗi khi thêm phiếu trả sách!!!");
                
            } catch (Exception e) {
                e.printStackTrace();
            }
       }
       else if(sMaphieumuonsach.trim().equals("")) JOptionPane.showMessageDialog(null, "Vui lòng chọn phiếu mượn sách muốn trả!!!");
       else if(sNgayTra.trim().equals("")) JOptionPane.showMessageDialog(null, "Chưa chọn ngày! Vui lòng chọn!!!");
    }//GEN-LAST:event_btnSaveActionPerformed

    private void jtfSearchDocGiaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfSearchDocGiaKeyReleased
        String key_hoten = jtfSearchDocGia.getText().trim();
        DefaultTableModel model = (DefaultTableModel) classTableModel2.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        classTableModel2.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(key_hoten, 1));
    }//GEN-LAST:event_jtfSearchDocGiaKeyReleased

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        ImageIcon icon = new ImageIcon(this.getClass().getClassLoader().getResource("assets/borrow_and_return.png"));
        setIconImage(icon.getImage());
    }//GEN-LAST:event_formWindowActivated

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int confirmed = JOptionPane.showConfirmDialog(null, 
            "Do you want to exit Add?", "Exit Add",
        JOptionPane.YES_NO_OPTION);

        if (confirmed == JOptionPane.YES_OPTION) {
            this.dispose();
        }
        else { setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE); }
    }//GEN-LAST:event_formWindowClosing

    private void jtfSearchDocGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSearchDocGiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfSearchDocGiaActionPerformed

    public void getPHIEUMUONSACHList() {
        DefaultTableModel defaultTable = (DefaultTableModel) classTableModel2.getModel();
	List<mdl_phieumuonsach> phieumuonsachList = new ArrayList<>();
        PreparedStatement ps;
        ResultSet rs;
        String query = "Select T.HOTEN, P.MAPHIEUMUONSACH from thedocgia T join phieumuonsach P on T.MADOCGIA = P.MADOCGIA where MAPHIEUMUONSACH not in (Select MAPHIEUMUONSACH from phieutrasach);";
	try {
            ps = MyConnection.getConnection().prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
		int MAPHIEUMUONSACH = rs.getInt("MAPHIEUMUONSACH");
                String HOTEN = rs.getString("HOTEN");
                mdl_phieumuonsach phieumuonsach = new mdl_phieumuonsach(MAPHIEUMUONSACH, HOTEN);
		phieumuonsachList.add(phieumuonsach);
            }	
            Object[] row = new Object[2];
            for(int i = 0; i <phieumuonsachList.size(); i++) {
		row[0] = phieumuonsachList.get(i).getMAPHIEUMUONSACH();
                row[1] = phieumuonsachList.get(i).getHOTEN();
		defaultTable.addRow(row);
            }
            ps.close();
            rs.close();
	} catch (SQLException e) {
	}
    }
    
    public void setCurrentDate() {
        Date today = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String temp =  dateFormat.format(today.getTime());
        Date date = null;
        try {
             date = new SimpleDateFormat("dd/MM/yyyy").parse(temp);
        } catch (ParseException e) {
        }
        jdcNgayTra.setDate(date);
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
            java.util.logging.Logger.getLogger(jf_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jf_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jf_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jf_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jf_add().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSave;
    private javax.swing.JTable classTableModel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane4;
    public static com.toedter.calendar.JDateChooser jdcNgayTra;
    private javax.swing.JTextField jtfMaPhieuMuonSach;
    private javax.swing.JTextField jtfMaPhieuTraSach;
    private javax.swing.JTextField jtfSearchDocGia;
    // End of variables declaration//GEN-END:variables
}
