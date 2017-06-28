package dataaccess;

public interface IDao<K>{
  
  public void save(K k);
  public void delete (K k);
  public void update (K k);
  public K getById(long id);
  
}
