package entity;

import javax.persistence.*;
import java.util.List;


@Entity
public class Nomenclature{

    @Id
    @GeneratedValue
    @Column(name="ID")
    private long id;

    @ManyToMany
    @JoinTable( name ="NOMEN_PRAX",
            joinColumns=@JoinColumn(name="NOMEN_ID", referencedColumnName="ID"),

            inverseJoinColumns=@JoinColumn(name="PRAX_ID", referencedColumnName="ID")
    )
    private List<Praxis> praxises;

    @OneToMany(mappedBy="nomen")
    private List<Tariff> tariffes;

    @OneToMany(mappedBy = "nomen")
    private List<Provider> providers;

    @Column
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Tariff> getTariffes() {
        return tariffes;
    }

    public void setTariffes(List<Tariff> tariffes) {
        this.tariffes = tariffes;
    }

    public List<Provider> getProviders() {
        return providers;
    }

    public void setProviders(List<Provider> providers) {
        this.providers = providers;
    }

    public long getId(){
        return this.id;
    }

    public void setId(long id){
         this.id=id;
    }

    public List<Praxis> getPraxises(){
        return this.praxises;
    }

    public void setPraxises(List<Praxis> praxises ){
        this.praxises = praxises;
    }

}