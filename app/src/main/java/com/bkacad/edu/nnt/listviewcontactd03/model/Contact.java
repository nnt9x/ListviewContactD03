package com.bkacad.edu.nnt.listviewcontactd03.model;

public class Contact {
    private String name;
    private String phone;
    private String image; // url

    private String email;

    public Contact() {
    }

    public Contact(String name, String phone, String image, String email) {
        this.name = name;
        this.phone = phone;
        this.image = image;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", image='" + image + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
