package entity;

import javax.persistence.*;

@Entity
public class Cohefficient{

	@Id
	@GeneratedValue
	@Column(name="ID")
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
