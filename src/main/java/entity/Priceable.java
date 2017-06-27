package entity;

import javax.persistence.*;

/**

no es soportado por JPA una interfaz como entity. no sirve el enfoque. 
Se lo combirtió a clase
 */
@Entity
public class Priceable {
 
 @Id
 @GeneratedValue
 private long id;
 
 @Column
 private String name;
 
 public long getId(){
  return this.id;
 }
 
 public void setId(long id){
  this.id=id;
 }
 
 public String getName(){
  return this.name;
 }
 
 public void setName(String name){
  this.name=name;
 }
 
}
