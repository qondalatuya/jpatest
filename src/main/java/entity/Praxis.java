package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import java.io.Serializable;

/*esta clase representaria una practica, con un valor fijo*/

@Entity
public class Praxis extends Priceable implements Serializable{

	@Column(nullable = false)
	private int code;

	public int getCode(){
		return this.code;
	}
	
	public void setCode(int code){
		this.code=code;
	}

}

