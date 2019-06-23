package com.swufe.tripapplication;

public class PasswordItem {

    private String name;
    private String curName;
    private String curPassword;

    public PasswordItem(String name, String curName, String curPassword) {
        this.name = name;
        this.curName = curName;
        this.curPassword = curPassword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurName() {
        return curName;
    }

    public void setCurName(String curName) {
        this.curName = curName;
    }

    public String getCurPassword() {
        return curPassword;
    }

    public void setCurPassword(String curPassword) {
        this.curPassword = curPassword;
    }
    public String toString(){
        return "St{"+"Username="+name +",PhoneNumber="+curName +",Password="+curPassword +"}";
    }

    public void add(PasswordItem passwordItem) {

    }
}
