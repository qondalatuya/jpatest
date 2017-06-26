package entity;

import javax.persistence.*;
import java.util.List;


@Entity
public class NomenclatedPraxis extends Praxis{
	
	@ManyToMany
	@JoinTable( name="NOMPRAX_COHEF",
		joinColumns=@JoinColumn(name="PRA_ID",referencedColumnName="ID"),
		inverseJoinColumns = @JoinColumn (name="COHEF_ID",referencedColumnName="ID")
		)
	private List<Cohefficient> units;
	
	public List<Cohefficient> getUnits(){
		return this.units;
	}
	
	public void setUnits( List<Cohefficient> units){
		this.units=units;
	}
}
