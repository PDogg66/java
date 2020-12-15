/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

/**
 *
 * @author khoa
 */
public class Phong {    
    public String room_Type,room_Price,room_Status,Room_number;

    public String getRoom_Type() {
        return room_Type;
    }

    public void setRoom_Type(String room_Type) {
        this.room_Type = room_Type;
    }

    public String getRoom_Price() {
        return room_Price;
    }

    public void setRoom_Price(String room_Price) {
        this.room_Price = room_Price;
    }

    public String getRoom_Status() {
        return room_Status;
    }

    public void setRoom_Status(String room_Status) {
        this.room_Status = room_Status;
    }

    public String getRoom_number() {
        return Room_number;
    }

    public void setRoom_number(String Room_number) {
        this.Room_number = Room_number;
    }

    public Phong() {
    }

    public Phong(String room_Type, String room_Price, String room_Status, String Room_number) {
        this.room_Type = room_Type;
        this.room_Price = room_Price;
        this.room_Status = room_Status;
        this.Room_number = Room_number;
    }
    


    
}
