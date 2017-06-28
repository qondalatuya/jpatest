package dataaccess.hibernate4;


import dataaccess.IDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

@Repository
public abstract class AbstractHibernateDao <T extends Serializable>
{
  private Class<T> clazz;
  
  @Autowired
  private SessionFactory sessionFactory;
  
  public void setClazz (final Class<T> clazzToSet){
    clazz=clazzToSet;
  }
  
  public Session getCurrentSession(){
    return sessionFactory.getCurrentSession();
  }
  
  public T getById (long id){
    return (T) getCurrentSession().get (clazz,id);
   }

   @Transactional
   public void save (T t){
    getCurrentSession().persist(t);
   }
   
   public T update (T t){
    return (T) getCurrentSession().merge(t);
   }
   
   public void delete(T t){
    getCurrentSession().delete(t);
   }
   
   public void deleteById(long id){
    final T entity = getById(id);
    delete (entity);
   }

}
