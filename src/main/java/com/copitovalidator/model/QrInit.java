package com.copitovalidator.model;

import com.sun.istack.internal.NotNull;

import javax.validation.constraints.Size;

public class QrInit {
    @NotNull
    @Size(min = 1 , max = 4)
    private String name ;

    @NotNull
    @Size(min = 1 , max = 4)
    private String lastname  ;

    @NotNull
    @Size(min = 1 , max= 4)

    private String date ;
    private int phone ;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
