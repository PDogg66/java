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
    private String id_employee;
    private String name_employee;
    private String room_number;
    private String check_in;
    private String check_out;
    private int number_night;
    private final double vat = 0.1;
    private int id_guest;
    public Bill(){
        this.check_in="";
        this.check_out="";
        this.id_bill="";
        this.id_employee="";
        this.number_night=0;
        this.room_number="";
    }
    public Bill(String id_bill, String id_employee, String name_employee, String room_number, String check_in, String check_out, int number_night, int id_guest) {
        this.id_bill = id_bill;
        this.id_employee = id_employee;
        this.name_employee = name_employee;
        this.room_number = room_number;
        this.check_in = check_in;
        this.check_out = check_out;
        this.number_night = number_night;
        this.id_guest = id_guest;
    }

    public String getId_bill() {
        return id_bill;
    }

    public String getId_employee() {
        return id_employee;
    }

    public String getName_employee() {
        return name_employee;
    }

    @Override
    public String toString() {
        return "Bill{" + "id_bill=" + id_bill + ", id_employee=" + id_employee + ", name_employee=" + name_employee + ", room_number=" + room_number + ", check_in=" + check_in + ", check_out=" + check_out + ", number_night=" + number_night + ", vat=" + vat + ", id_guest=" + id_guest + '}';
    }

    public String getRoom_number() {
        return room_number;
    }

    public String getCheck_in() {
        return check_in;
    }

    public String getCheck_out() {
        return check_out;
    }

    public int getNumber_night() {
        return number_night;
    }

    public double getVat() {
        return vat;
    }

    public int getId_guest() {
        return id_guest;
    }

    public void setId_bill(String id_bill) {
        this.id_bill = id_bill;
    }

    public void setId_employee(String id_employee) {
        this.id_employee = id_employee;
    }

    public void setName_employee(String name_employee) {
        this.name_employee = name_employee;
    }

    public void setRoom_number(String room_number) {
        this.room_number = room_number;
    }

    public void setCheck_in(String check_in) {
        this.check_in = check_in;
    }

    public void setCheck_out(String check_out) {
        this.check_out = check_out;
    }

    public void setNumber_night(int number_night) {
        this.number_night = number_night;
    }

    public void setId_guest(int id_guest) {
        this.id_guest = id_guest;
    }
    
}
