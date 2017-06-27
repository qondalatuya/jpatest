package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;

/*esta clase representaria una practica, con un valor fijo*/

@Entity
public class Praxis extends Priceable{
	
	@Id
	@GeneratedValue
	@Column(name="ID")
	private long id;
	

	@Column(nullable = false)
	private String name;
	

	@Column(nullable = false)
	private int code;
	
	public long getId(){
		return this.id;
	}
	
	public void setId(long id){
		this.id = id;
	}
	
	public String getName(){
		return this.name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public int getCode(){
		return this.code;
	}
	
	public void setCode(int code){
		this.code=code;
	}

}

