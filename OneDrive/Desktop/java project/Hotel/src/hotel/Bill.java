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
public class Bill {
    private String id_bill;
    private String room_number;
    private String check_in;
    private String check_out;
    private int id_guest;
    private String name_Guest;
    public Bill(){
        this.check_in="";
        this.check_out="";
        this.id_bill="";
        this.room_number="";
        this.name_Guest="";
        this.id_guest=0;
    }

    public Bill(String id_bill, String room_number, String check_in, String check_out, int id_guest, String name_Guest) {
        this.id_bill = id_bill;
        this.room_number = room_number;
        this.check_in = check_in;
        this.check_out = check_out;
        this.id_guest = id_guest;
        this.name_Guest = name_Guest;
    }
    

    public String getId_bill() {
        return id_bill;
    }

    public void setId_bill(String id_bill) {
        this.id_bill = id_bill;
    }

    public String getRoom_number() {
        return room_number;
    }

    public void setRoom_number(String room_number) {
        this.room_number = room_number;
    }

    public String getCheck_in() {
        return check_in;
    }

    public void setCheck_in(String check_in) {
        this.check_in = check_in;
    }

    public String getCheck_out() {
        return check_out;
    }

    public void setCheck_out(String check_out) {
        this.check_out = check_out;
    }

    public int getId_guest() {
        return id_guest;
    }

    public void setId_guest(int id_guest) {
        this.id_guest = id_guest;
    }

    public String getName_Guest() {
        return name_Guest;
    }

    public void setName_Guest(String name_Guest) {
        this.name_Guest = name_Guest;
    }
    
}

