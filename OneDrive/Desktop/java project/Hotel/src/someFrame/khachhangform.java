/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package someFrame;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import hotel.KhachHang;
import static hotel.MyConnection.getConnection;
import javax.swing.JFrame;

/**
 *
 * @author team2
 */
public class khachhangform extends javax.swing.JFrame {

    /**
     * Creates new form 
     */
    public khachhangform() {
        initComponents();
        getConnection();
        hienThiDanhSachKhachHang();
    }
    Connection con=null;
    Statement st=null;
    
     public ArrayList<KhachHang> layDanhSachKhachHang() {
        ArrayList<KhachHang> dskh = new ArrayList<KhachHang>();
        Connection con = getConnection();
        try {
            st = (Statement) con.createStatement();
            String sql = "SELECT * FROM GUEST";
            // Thưcj thi câu lệnh truy vấn
            ResultSet rs = st.executeQuery(sql);

            KhachHang kh;
            while (rs.next()) {
                kh = new KhachHang(rs.getString("customer_Name"), rs.getString("customer_ID"), rs.getString("customer_Phone_number"), rs.getString("customer_Address"), rs.getString("customer_DateOfBirth"), rs.getInt("Room_Number"));
                //Thêm vào danh sách
                dskh.add(kh);
            }
        } catch (Exception ex) {
            ex.printStackTrace();

        }
        return dskh;
    }
     public void hienThiDanhSachKhachHang() {
        String colTieuDe1[] = new String[]{"ID Guest", "Name Guest", "Guest Phone Number", "Guest Address", "Guest Date of Birth", "Guest Room"};
        ArrayList<KhachHang> dskh = layDanhSachKhachHang();

        DefaultTableModel model = new DefaultTableModel(colTieuDe1, 0);

        Object[] row;

        for (int i = 0; i < dskh.size(); i++) {

            row = new Object[8];

            // GÁN GIÁ TRỊ
            row[0] = dskh.get(i).getId_guest();
            row[1] = dskh.get(i).getName_guest();
            row[2] = dskh.get(i).getPhone_guest();
            row[3] = dskh.get(i).getAddres_guest();
            row[4] = dskh.get(i).getDoB_guest();
            row[5] = dskh.get(i).getRoom_guest();

            model.addRow(row);
        }
        
        //    }catch(ArrayIndexOutOfBoundsException ex){

        jTableKhachhang.setModel(model);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jButtonclear2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabelAddress_guest = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldId_guest = new javax.swing.JTextField();
        jTextFieldName_guest = new javax.swing.JTextField();
        jTextFieldsdt = new javax.swing.JTextField();
        jTextFieldAddress_guest = new javax.swing.JTextField();
        jTextFieldDoB_guest = new javax.swing.JTextField();
        jTextFieldRoom_guest = new javax.swing.JTextField();
        them1 = new javax.swing.JButton();
        sua1 = new javax.swing.JButton();
        xoa1 = new javax.swing.JButton();
        thoat1 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableKhachhang = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông Tin Khách Hàng"));

        jButtonclear2.setBackground(new java.awt.Color(204, 204, 204));
        jButtonclear2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlksk57/Form/hinh/CLEAR.png"))); // NOI18N
        jButtonclear2.setText("Clear");
        jButtonclear2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jButtonclear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonclear2ActionPerformed(evt);
            }
        });

        jLabel10.setText("Mã Khách Hàng");

        jLabel11.setText("Tên Khách Hàng");

        jLabel12.setText("SDT");

        jLabelAddress_guest.setText("Địa chỉ");

        jLabel14.setText("Ngày sinh");

        jLabel15.setText("Số phòng");

        jTextFieldId_guest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldId_guestActionPerformed(evt);
            }
        });

        jTextFieldName_guest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldName_guestActionPerformed(evt);
            }
        });

        jTextFieldAddress_guest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAddress_guestActionPerformed(evt);
            }
        });

        them1.setBackground(new java.awt.Color(204, 204, 204));
        them1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlksk57/Form/hinh/THEM.png"))); // NOI18N
        them1.setText("Thêm");
        them1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        them1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                them1ActionPerformed(evt);
            }
        });

        sua1.setBackground(new java.awt.Color(204, 204, 204));
        sua1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlksk57/Form/hinh/SUA.png"))); // NOI18N
        sua1.setText("Sửa");
        sua1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        sua1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sua1ActionPerformed(evt);
            }
        });

        xoa1.setBackground(new java.awt.Color(204, 204, 204));
        xoa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlksk57/Form/hinh/XOA.png"))); // NOI18N
        xoa1.setText("Xóa");
        xoa1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xoa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoa1ActionPerformed(evt);
            }
        });

        thoat1.setBackground(new java.awt.Color(204, 204, 204));
        thoat1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlksk57/Form/hinh/THOAT.png"))); // NOI18N
        thoat1.setText("Thoát");
        thoat1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        thoat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thoat1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabelAddress_guest)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldAddress_guest, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldsdt, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldName_guest, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldId_guest, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldDoB_guest, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldRoom_guest, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(them1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(xoa1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(thoat1)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(sua1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addComponent(jButtonclear2)))))
                .addGap(22, 22, 22))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldId_guest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldName_guest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldsdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAddress_guest)
                    .addComponent(jTextFieldAddress_guest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextFieldDoB_guest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextFieldRoom_guest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(108, 108, 108)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(them1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sua1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonclear2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(thoat1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xoa1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("QUẢN LÝ KHÁCH HÀNG");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTableKhachhang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableKhachhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableKhachhangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableKhachhang);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(193, 193, 193))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2)
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("bill");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(308, 308, 308)
                .addComponent(jButton1)
                .addContainerGap(754, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(422, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(56, 56, 56))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(19, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(20, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldId_guestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldId_guestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldId_guestActionPerformed

    private void jTextFieldName_guestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldName_guestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldName_guestActionPerformed

    private void them1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_them1ActionPerformed
        // TODO add your handling code here:
        Connection con = getConnection();
        try {
            // Tạo một đối tượng để thực hiện công việc
            st = (Statement) con.createStatement();
            String query = "INSERT INTO Guest(customer_Name,customer_ID, customer_Phone_number, customer_Address, customer_DateOfBirth, Room_Number) VALUES('" + jTextFieldName_guest.getText() + "',"
            + "'" + jTextFieldId_guest.getText() + "','" + jTextFieldsdt.getText() + "', '" + jTextFieldAddress_guest.getText() + "', '" + jTextFieldDoB_guest.getText() + "', '" + jTextFieldRoom_guest.getText() + "')";

            st.execute(query);
            hienThiDanhSachKhachHang();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_them1ActionPerformed

    private void sua1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sua1ActionPerformed
        // TODO add your handling code here:
        if (jTableKhachhang.getSelectedRow()==-1) {
            if (jTableKhachhang.getRowCount()==0) {
                // lblError.setText("Table is empty");
            }
            else{
                //  lblError.setText("You must select a Tennis Player");
            }
        }
        else{
            DefaultTableModel model = (DefaultTableModel) jTableKhachhang.getModel();
            model.setValueAt(jTextFieldId_guest.getText(), jTableKhachhang.getSelectedRow(), 0);
            model.setValueAt(jTextFieldName_guest.getText().toString(), jTableKhachhang.getSelectedRow(), 1);
            model.setValueAt(jTextFieldsdt.getText(), jTableKhachhang.getSelectedRow(), 2);
            model.setValueAt(jTextFieldAddress_guest.getText(), jTableKhachhang.getSelectedRow(), 3);
            model.setValueAt(jTextFieldDoB_guest.getText(), jTableKhachhang.getSelectedRow(), 4);
            model.setValueAt(jTextFieldRoom_guest.getText(), jTableKhachhang.getSelectedRow(), 5);
           
        }
    }//GEN-LAST:event_sua1ActionPerformed

    private void xoa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoa1ActionPerformed
        // TODO add your handling code here:
        Connection con = getConnection();
        try {
            // Tạo một đối tượng để thực hiện công việc
            st = (Statement) con.createStatement();
            String query = "DELETE FROM Guest WHERE customer_ID = '" + jTextFieldId_guest.getText() + "'";
            st.executeUpdate(query);
            hienThiDanhSachKhachHang();

        } catch (Exception ex) {

            ex.printStackTrace();
        }
    }//GEN-LAST:event_xoa1ActionPerformed

    private void thoat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thoat1ActionPerformed
        // TODO add your handling code here:
        thoat1.setToolTipText("Click để thoát chương trình ");
        int selected = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn thoát chương"
            + " trình không", "Thông báo", JOptionPane.YES_NO_CANCEL_OPTION);
        if (selected == JOptionPane.YES_NO_OPTION) {
            this.dispose();

        }
    }//GEN-LAST:event_thoat1ActionPerformed

    private void jButtonclear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonclear2ActionPerformed
        // TODO add your handling code here:
        jTextFieldId_guest.setText("");
        jTextFieldName_guest.setText("");
        jTextFieldsdt.setText("");
        jTextFieldAddress_guest.setText("");
        jTextFieldDoB_guest.setText("");
        jTextFieldRoom_guest.setText("");
        jTextFieldId_guest.requestFocus();

    }//GEN-LAST:event_jButtonclear2ActionPerformed

    private void jTableKhachhangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableKhachhangMouseClicked
        // TODO add your handling code here:
        int i = jTableKhachhang.getSelectedRow();
        TableModel model = jTableKhachhang.getModel();
        jTextFieldId_guest.setText(model.getValueAt(i, 0).toString());
        jTextFieldName_guest.setText(model.getValueAt(i, 1).toString());
        jTextFieldsdt.setText(model.getValueAt(i, 2).toString());
        jTextFieldAddress_guest.setText(model.getValueAt(i, 3).toString());
        jTextFieldDoB_guest.setText(model.getValueAt(i, 4).toString());
        jTextFieldRoom_guest.setText(model.getValueAt(i, 5).toString());
      
    }//GEN-LAST:event_jTableKhachhangMouseClicked

    private void jTextFieldAddress_guestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAddress_guestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAddress_guestActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        billFrame khf=new billFrame();
        khf.setVisible(true);
        khf.pack();
        khf.setLocationRelativeTo(null);
        khf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(khachhangform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(khachhangform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(khachhangform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(khachhangform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new khachhangform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonclear2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAddress_guest;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableKhachhang;
    private javax.swing.JTextField jTextFieldAddress_guest;
    private javax.swing.JTextField jTextFieldDoB_guest;
    private javax.swing.JTextField jTextFieldId_guest;
    private javax.swing.JTextField jTextFieldName_guest;
    private javax.swing.JTextField jTextFieldRoom_guest;
    private javax.swing.JTextField jTextFieldsdt;
    private javax.swing.JButton sua1;
    private javax.swing.JButton them1;
    private javax.swing.JButton thoat1;
    private javax.swing.JButton xoa1;
    // End of variables declaration//GEN-END:variables
}
