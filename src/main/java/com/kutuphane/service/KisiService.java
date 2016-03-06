/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kutuphane.service;

import com.kutuphane.entity.Kisi;
import com.kutuphane.service.BaseService;
import com.kutuphane.framework.DbException;
import java.util.List;

/**
 *
 * @author vektorel
 */
public class KisiService implements IBaseService<Kisi> {

    public List<Kisi> getAll() {
       return new BaseService().getAll(Kisi.class);
    }

    public Kisi getById(Long id) {
       return (Kisi) new BaseService().getById(Kisi.class, id);
    }

    public Kisi save(Kisi obj) throws DbException {
        if (obj == null) {
            throw new DbException("Kişi boş olmamalıdır");
        }
        if (obj.getAd() == null) {
            throw new DbException("Kişi adı boş olmamalıdır");
        }
        if (obj.getSoyad() == null) {
            throw new DbException("Kişi soyadı boş olmamalıdır");
        }

        return (Kisi) new BaseService().save(obj);

    }

    public Boolean delete(Kisi obj) throws DbException {
         return new BaseService().delete(obj);
    }

    public Kisi update(Kisi obj) throws DbException {
          if (obj == null) {
            throw new DbException("Kişi boş olmamalıdır");
        }
        if (obj.getAd() == null) {
            throw new DbException("Kişi adı boş olmamalıdır");
        }
        if (obj.getSoyad() == null) {
            throw new DbException("Kişi soyadı boş olmamalıdır");
        }

        return (Kisi) new BaseService().update(obj);
    }
}
