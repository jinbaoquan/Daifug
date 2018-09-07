package com.xiaobao.domian;

import java.util.Date;

/**
 * @author JIN BAO QUAN
 * @version 1.0
 * @date 2018/9/6 18:54
 */
public class User {
    private String id;
    private String username;
    private String password;
    private String phone;
    private int flag;
    private Date createtime;
private String eamil;
private int statu;
    public String getId() {
        return id;
    }

    public String getEamil() {
        return eamil;
    }

    public void setEamil(String eamil) {
        this.eamil = eamil;
    }

    public int getStatu() {
        return statu;
    }

    public void setStatu(int statu) {
        this.statu = statu;
    }

    public void setId(String id) {
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public User(String id, String username, String password, String phone, int flag, Date createtime, String eamil, int statu) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.flag = flag;
        this.createtime = createtime;
        this.eamil = eamil;
        this.statu = statu;
    }



    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", flag=" + flag +
                ", createtime=" + createtime +
                ", eamil='" + eamil + '\'' +
                ", statu=" + statu +
                '}';
    }
}
