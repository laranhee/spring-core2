package com.nhnent.benjamin.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

// TODO : make Member as Entity
@Entity
@Table(name = "MEMBERS")
public class Member {
    @Id
    @Column(name = "MNO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int 		no;

    @Column(name = "MNAME")
    protected String 	name;

    @Column(name = "EMAIL")
    protected String 	email;

    @Column(name = "PWD")
    protected String 	password;

    @Temporal(TemporalType.DATE)
    @Column(name = "CRE_DATE")
    protected Date		createdDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "MOD_DATE")
    protected Date		modifiedDate;


    public int getNo() {
        return no;
    }
    public Member setNo(int no) {
        this.no = no;
        return this;
    }

    public String getName() {
        return name;
    }
    public Member setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }
    public Member setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }
    public Member setPassword(String password) {
        this.password = password;
        return this;
    }

    public Date getCreatedDate() {
        return createdDate;
    }
    public Member setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }
    public Member setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Member{");
        sb.append("no=").append(no);
        sb.append(", name='").append(name).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", createdDate=").append(createdDate);
        sb.append(", modifiedDate=").append(modifiedDate);
        sb.append('}');
        return sb.toString();
    }
}
