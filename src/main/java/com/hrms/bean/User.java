package com.hrms.bean;


public class User {

  private long id;
  private String username;
  private String password;
  private long roleId;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public long getRoleId() {
    return roleId;
  }

  public void setRoleId(long roleId) {
    this.roleId = roleId;
  }

  public User() {
  }

  public User(String username, String password, long roleId) {
    this.username = username;
    this.password = password;
    this.roleId = roleId;
  }

  @Override
  public String toString() {
    return "User{" +
            ", username='" + username + '\'' +
            ", password='" + password + '\'' +
            ", roleId=" + roleId +
            '}';
  }
}
