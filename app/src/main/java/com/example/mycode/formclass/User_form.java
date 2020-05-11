package com.example.mycode.formclass;

public class User_form {
    String name_text,email_text,address_text;
    public User_form(String email_text,String name_text,String address_text)
    {
        this.name_text=name_text;
        this.email_text=email_text;
        this.address_text=address_text;
    }
    public String getName_text(){
        return name_text;
    }
    public void setName_text(){
        this.name_text=name_text;
    }
    public String getEmail_text(){
        return email_text;
    }
    public void setEmail_text(){
        this.email_text=email_text;
    }
    public String getAddress_text(){
        return address_text;
    }
    public void setAddress_text(){
        this.address_text=address_text;
    }
}
