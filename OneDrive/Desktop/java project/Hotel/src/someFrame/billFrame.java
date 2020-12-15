/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package someFrame;

import hotel.Bill;
import hotel.KhachHang;
import static hotel.MyConnection.getConnection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import org.joda.time.Days;

/**
 *
 * @author team2
 */
public class billFrame extends javax.swing.JFrame {

    /**
     * Creates new form billFrame
     */
    public billFrame(String s) {
        initComponents();
        getConnection();
        KhachHang a = getGuest(s);
        displayBill(a);
        
    }
    Connection con=null;    
    Statement st=null;
    
     public Bill getBill() {
        Connection con = getConnection();
        Bill kh= null;

        try {
            st = (Statement) con.createStatement();
            String sql = "SELECT * FROM bill";
            // Thưcj thi câu lệnh truy vấn
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                kh = new Bill(rs.getString("bill_ID"), rs.getString("Room_number"), rs.getString("Check_in"),
                        rs.getString("Check_out"),rs.getInt("ID_guest"), rs.getString("Name_guest"));
                //Thêm vào danh sách
            
            }
        } catch (Exception ex) {
            //ex.printStackTrace();
            System.out.println("Hong o getBill");

        }
        
        return kh;
    }
   
     public String getPrice(String room){
         Connection con = getConnection();
         String price = "";
        try {
            st = (Statement) con.createStatement();
            //String sql = "SELECT room_Price FROM room";
             String name = (String) room;
            String temp ="SELECT room_Price FROM bill,room where room.Room_number='"+room+"' group by room.room_Price;";
            // Thưcj thi câu lệnh truy vấn
            ResultSet rs = st.executeQuery(temp);
            while (rs.next()) {
                price = rs.getString("room_Price");
                System.out.println(price);
            }
        } catch (Exception ex) {
            //ex.printStackTrace();
            System.out.println("Hong o getprice");

        }
        return price;
     }
     public int calculatePrice(String priceString, int days){
         int i=Integer.parseInt(priceString);  
         return i*days;
     }
     public void displayBill(KhachHang a) {
        String colTieuDe1[] = new String[]{"Room", "Check-in", "Check-out", "Price","total"};
        try{
            jLabelID_guest.setText(a.getId_guest());
            jLabelName_guest.setText(a.getName_guest());
            jLabelPhone.setText(a.getPhone_guest());
            
        }catch(Exception ex){
            System.out.println("No obj");
        }
        
        
        Bill dskh = getBill();

        DefaultTableModel model = new DefaultTableModel(colTieuDe1, 0);

        Object[] row;
        row = new Object[8];
        // GÁN GIÁ TRỊ
        row[0] = dskh.getRoom_number();
        row[1] = dskh.getCheck_in();
        row[2] = dskh.getCheck_out(); 
        row[3] = getPrice((String) row[0]);
        LocalDate aa = convertToDate((String)row[1]);
        LocalDate bb = convertToDate((String)row[2]);
        long cc = ChronoUnit.DAYS.between(aa, bb);
        int i=(int)cc; 
         System.out.println(cc);
        //tinh tien
     
        int tien = calculatePrice((String)row[3], i);
        System.out.println("tong tien la"+tien);
     

        row[4]=""+tien+" VND";
        model.addRow(row);
        //tinh ngay
        
        
        
        
        jTable1.setModel(model);

    }
     public KhachHang getGuest(String s){
         Connection con = getConnection();
         Statement st=null;
         KhachHang guest = null;
            try {
                // Tạo một đối tượng để thực hiện công việc
                st = (Statement) con.createStatement();
                String query = "SELECT * FROM Guest WHERE customer_ID = " + s ;
                ResultSet rs = st.executeQuery(query);
                while(rs.next()){
                    guest = new KhachHang(rs.getString("customer_Name"), rs.getString("customer_ID"), rs.getString("customer_Phone_number"), rs.getString("customer_Address"), rs.getString("customer_DateOfBirth"), rs.getInt("Room_Number"));
                    
                }
                

            } catch (Exception ex) {
                System.out.println("Loi o getguest");
            }
            return guest;
     }
     public LocalDate convertToDate(String sDate1){
         LocalDate date1 = null;
         try{
              date1 = LocalDate.parse(sDate1);
         }
         catch(Exception ex){
             System.out.println("loi chuyen ngay");
         }  
         return date1;
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2Phone_number = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelID_guest = new javax.swing.JLabel();
        jLabelName_guest = new javax.swing.JLabel();
        jLabelPhone = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Hotel Bill");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(320, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(312, 312, 312))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jLabel3.setText("Phone Number:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Id:");

        jLabelID_guest.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jLabelID_guest.setText("jLabel5");

        jLabelName_guest.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jLabelName_guest.setText("jLabel6");

        jLabelPhone.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jLabelPhone.setText("jLabel7");

        javax.swing.GroupLayout jPanel2Phone_numberLayout = new javax.swing.GroupLayout(jPanel2Phone_number);
        jPanel2Phone_number.setLayout(jPanel2Phone_numberLayout);
        jPanel2Phone_numberLayout.setHorizontalGroup(
            jPanel2Phone_numberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Phone_numberLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabelID_guest)
                .addGap(123, 123, 123)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabelName_guest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabelPhone)
                .addGap(173, 173, 173))
        );
        jPanel2Phone_numberLayout.setVerticalGroup(
            jPanel2Phone_numberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Phone_numberLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Phone_numberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Phone_numberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabelID_guest)
                        .addComponent(jLabelPhone))
                    .addGroup(jPanel2Phone_numberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabelName_guest)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Room", "Check-in", "Check-out", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Thanks for your business ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2Phone_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1))
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(362, 362, 362)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2Phone_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(billFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(billFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(billFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(billFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
           
                //new billFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelID_guest;
    private javax.swing.JLabel jLabelName_guest;
    private javax.swing.JLabel jLabelPhone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2Phone_number;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
