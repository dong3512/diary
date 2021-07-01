package com.dong.diary.domain;

public class Member {
  private int no;
  private String name;
  private String email;
  private String tel;
  private String password;
  private String address;
  private boolean state;
  private String photo;

  @Override
  public String toString() {
    return "Member [no=" + no + ", name=" + name + ", email=" + email + ", tel=" + tel
        + ", address=" + address + ", state=" + state + ", photo=" + photo + "]";
  }

  public int getNo() {
    return no;
  }

  public void setNo(int no) {
    this.no = no;
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

  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public boolean isState() {
    return state;
  }

  public void setState(boolean state) {
    this.state = state;
  }

  public String getPhoto() {
    return photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
  }

}
