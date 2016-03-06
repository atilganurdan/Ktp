package com.kutuphane;

import com.kutuphane.entity.CinsiyetEnum;
import com.kutuphane.entity.Kisi;
import com.kutuphane.framework.DbException;
import com.kutuphane.service.KisiService;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        KisiService ks = new KisiService();
        try {
            System.out.println("Hello World!");

            ks.save(new Kisi(Long.MIN_VALUE, "Utku", "Okutan", "okutan@gamil.com", null, "Koru Mah.", CinsiyetEnum.ERKEK));
            List<Kisi> kisiListe = ks.getAll();
            
           //Kisi k = ks.getById(2L);
           //System.out.println(k.toString());  
            
            for (Kisi kisi : kisiListe) {
                System.out.println(kisi.toString());
            }
         
        } catch (DbException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}
