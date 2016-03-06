/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kutuphane.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author vektorel
 */
@Entity
@Table(name = "kitap")
public class Kitap implements Serializable{
    private Long id;
    private String isbn;
    private Integer sayfaSayisi;
    private String yazar;
    private String adi;

    @Id
    @Column(name = "kitap_id")
    @SequenceGenerator(allocationSize=1, name = "seq_kitap", sequenceName="seq_kitap")
    @GeneratedValue(generator="seq_kitap",strategy= GenerationType.SEQUENCE)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Column(name = "isbn", length = 100, nullable = false)
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getSayfaSayisi() {
        return sayfaSayisi;
    }

    public void setSayfaSayisi(Integer sayfaSayisi) {
        this.sayfaSayisi = sayfaSayisi;
    }
    @Column(name = "adi", length = 100, nullable = false)
    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }
    
    
}
