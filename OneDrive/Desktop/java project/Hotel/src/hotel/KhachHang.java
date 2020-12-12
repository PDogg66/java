/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

/**
 *
 * @author team2
 */
public class KhachHang {
    private String id_guest;
    private String name_guest;
    private String dob_guest;
    private String pn_guest;
    private String address_guest;
    private int room_guest;

    public KhachHang(String name, String id, String pn, String address, String dob,int room) {
        this.id_guest = id;
        this.name_guest = name;
        this.dob_guest = dob;
        this.pn_guest = pn;
        this.address_guest = address;
        this.room_guest = room;
    }

    public KhachHang() {
    }

    KhachHang(String string, String string0, String string1, String string2, String string3, int aInt, String string4) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getId_guest() {
        return this.id_guest;
    }

    public void setId_guest(String id) {
        this.id_guest= id;
    }

    public String getName_guest() {
        return this.name_guest;
    }

    public void setName_guest(String TENKH) {
        this.name_guest = TENKH;
    }

    public String getPhone_guest() {
        return this.pn_guest;
    }

    public void setPhone_guest(String sdt) {
        this.pn_guest = sdt;
    }

    public String getAddres_guest() {
        return this.address_guest;
    }

    public void setAddress_guest(String add) {
        this.address_guest = add;
    }

    public String getDoB_guest() {
        return this.dob_guest;
    }
    
    public void setDoB_guest(String a) {
         this.dob_guest= a;
    }

    public void setRoom_guest(int room) {
        this.room_guest = room;
    }

    public int getRoom_guest() {
        return this.room_guest;
    }

    @Override
    public String toString() {
        return "guest{" + "ID=" + id_guest + ", Name=" + name_guest + ", PhoneNumber=" + pn_guest + ", Address=" + address_guest + ", DateOfBirth=" + dob_guest + ", Room=" + room_guest +'}';
    }
    
    
    
    
}
