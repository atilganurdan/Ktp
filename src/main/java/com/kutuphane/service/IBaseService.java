/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kutuphane.service;

import com.kutuphane.framework.DbException;
import java.util.List;

/**
 *
 * @author vektorel
 */
public interface IBaseService<T> {

    public List<T> getAll();
    

    public T getById(Long id);

    public T save(T obj) throws DbException;

    public Boolean delete(T obj)throws DbException;

    public T update(T obj)throws DbException;
}
