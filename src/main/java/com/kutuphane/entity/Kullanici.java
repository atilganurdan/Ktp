/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kutuphane.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author vektorel
 */
@Entity
@Table(name = "gnl_kullanici")
public class Kullanici implements Serializable {

    private Long id;
    private String username;
    private String password;
    private Date uyelikTarihi;
    private String email;

    @Id
    @Column(name = "kullanici_id")
    @SequenceGenerator(allocationSize = 1, name = "seq_kullanici", sequenceName = "seq_kullanici")
    @GeneratedValue(generator = "seq_kullanici", strategy = GenerationType.SEQUENCE)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "uname", length = 100, unique=true, updatable=false, nullable = false)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "pwd", length = 100, nullable = false)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "uyelik_tarihi")
    @Temporal(TemporalType.DATE)
    public Date getUyelikTarihi() {
        return uyelikTarihi;
    }

    public void setUyelikTarihi(Date uyelikTarihi) {
        this.uyelikTarihi = uyelikTarihi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
