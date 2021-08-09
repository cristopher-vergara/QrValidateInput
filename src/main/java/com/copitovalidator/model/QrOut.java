package com.copitovalidator.model;
import com.sun.istack.internal.NotNull;
import javax.validation.constraints.Size;

public class QrOut {

    @NotNull
    @Size(min = 1 , max = 4 , message = "verifique el largo del nombre")
    private String nameOut ;

    @NotNull
    @Size(min = 1 , max = 4 , message = "verifique el largo del apellido")
    private String lastnameOut ;

    @NotNull
    @Size(min = 3 , max = 3)
    private String dateOut ;

    @NotNull
    private int phoneOut ;


//getters and setters
    public String getNameOut() {
        return nameOut;
    }

    public void setNameOut(String nameOut) {
        this.nameOut = nameOut;
    }

    public String getLastnameOut() {
        return lastnameOut;
    }

    public void setLastnameOut(String lastnameOut) {
        this.lastnameOut = lastnameOut;
    }

    public String getDateOut() {
        return dateOut;
    }

    public void setDateOut(String dateOut) {
        this.dateOut = dateOut;
    }

    public int getPhoneOut() {
        return phoneOut;
    }

    public void setPhoneOut(int phoneOut) {
        this.phoneOut = phoneOut;
    }
}
