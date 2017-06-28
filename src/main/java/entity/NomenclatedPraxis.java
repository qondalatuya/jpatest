package entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
public class NomenclatedPraxis extends Praxis implements Serializable{
	
	@ManyToMany
	@JoinTable( name="NOMPRAX_COHEF",
		joinColumns=@JoinColumn(name="PRA_ID",referencedColumnName="ID"),
		inverseJoinColumns = @JoinColumn (name="COHEF_ID",referencedColumnName="ID")
		)
	private List<Priceable> units;
	
	public List<Priceable> getUnits(){
		return this.units;
	}
	
	public void setUnits( List<Priceable> units){
		this.units=units;
	}
}
