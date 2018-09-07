package com.xiaobao.domian;

import java.time.DateTimeException;
import java.util.Date;

/**
 * @author JIN BAO QUAN
 * @version 1.0
 * @date 2018/9/6 19:11
 */
public class Referral {
    private int id;
    private int rid;
    private int berrid;
    private Date createtmime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public int getBerrid() {
        return berrid;
    }

    public void setBerrid(int berrid) {
        this.berrid = berrid;
    }

    public Date getCreatetmime() {
        return createtmime;
    }

    public void setCreatetmime(Date createtmime) {
        this.createtmime = createtmime;
    }

    public Referral(int id, int rid, int berrid, Date createtmime) {
        this.id = id;
        this.rid = rid;
        this.berrid = berrid;
        this.createtmime = createtmime;
    }

    public Referral() {
    }

    @Override
    public String toString() {
        return "Referral{" +
                "id=" + id +
                ", rid=" + rid +
                ", berrid=" + berrid +
                ", createtmime=" + createtmime +
                '}';
    }
}
