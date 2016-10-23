package com.example.ghisa.practiceadapter.user;

/**
 * Created by ghisa on 10/7/2016.
 */
import java.util.ArrayList;

public class Student {
    private int id; //private
    private String no_reg;
    private String name;
    private String email;
    private String phone; //private
    //variabel diatas gabisa diakses langsung makanya private


    public Student(int id, String no_reg, String name , String email, String phone) {
        this.id= id;
        this.no_reg= no_reg;
        this.name= name;
        this.email = email;
        this.phone =phone;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNo_reg() {
        return no_reg;
    }

    public void setNo_reg(String no_reg) {
        this.no_reg = no_reg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
