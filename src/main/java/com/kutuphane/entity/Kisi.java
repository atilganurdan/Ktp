/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kutuphane.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
@Table(name = "gnl_kisi")
public class Kisi implements Serializable {

    private Long id;
    private String ad;
    private String soyad;
    private String email;
    private Date dogumTarihi;
    private String adres;
    private CinsiyetEnum cinsiyet;

    public Kisi() {
    }

    public Kisi(Long id, String ad, String soyad, String email, Date dogumTarihi, String adres, CinsiyetEnum cinsiyet) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.email = email;
        this.dogumTarihi = dogumTarihi;
        this.adres = adres;
        this.cinsiyet = cinsiyet;
    }
    
    

    @Id
    @Column(name = "kisi_id")
    @SequenceGenerator(allocationSize=1, name = "seq_kisi", sequenceName="seq_kisi")
    @GeneratedValue(generator="seq_kisi",strategy= GenerationType.SEQUENCE)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "adi", length = 100, nullable = false)
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    @Column(name = "soyadi", length = 100, nullable = false)
    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    @Column(name = "eposta", length = 200)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "dogum_tarihi")
    @Temporal(TemporalType.DATE)
    public Date getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(Date dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    @Column(name = "adres", length = 400)
    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    @Column(name = "cinsiyet")
    @Enumerated(EnumType.ORDINAL)
    public CinsiyetEnum getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(CinsiyetEnum cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    @Override
    public String toString() {
        return "Kisi{" + "id=" + id + ", ad=" + ad + ", soyad=" + soyad + ", email=" + email + ", dogumTarihi=" + dogumTarihi + ", adres=" + adres + ", cinsiyet=" + cinsiyet + '}';
    }
    
}
