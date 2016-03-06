/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kutuphane.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author vektorel
 */
@Entity
@Table(name = "kitap_odunc")
public class KitapOdunc implements Serializable{
    private Long id;
    private Kitap verilenKitap;
    private Kisi oduncAlan;
    private Date verilisTarihi;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @ManyToOne(optional=false, fetch= FetchType.EAGER)
    @JoinColumn(name="")
    public Kitap getVerilenKitap() {
        return verilenKitap;
    }

    public void setVerilenKitap(Kitap verilenKitap) {
        this.verilenKitap = verilenKitap;
    }
     @ManyToOne(optional=false, fetch= FetchType.EAGER)
      @JoinColumn(name="odunc_alan_kisi_id")
    public Kisi getOduncAlan() {
        return oduncAlan;
    }

    public void setOduncAlan(Kisi oduncAlan) {
        this.oduncAlan = oduncAlan;
    }

    public Date getVerilisTarihi() {
        return verilisTarihi;
    }

    public void setVerilisTarihi(Date verilisTarihi) {
        this.verilisTarihi = verilisTarihi;
    }
    
    
    
    
    
    
}
