package com.codetreatise.generic;

import java.util.List;

/**
 * @author Ram Alapure
 * @since 05-04-2017
 */

public interface GenericService<T extends Object> {

	T save(T entity);
    
    T update(T entity);
  
    void delete(T entity);
  
    void delete(Long id);
    
    void deleteInBatch(List<T> entities);
  
    T find(Long id);
  
    List<T> findAll();
}
