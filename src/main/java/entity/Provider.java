package entity;

import javax.persistence.*;
/**
 Proveedor. cada proveedor puede tener un único nomenclador asociado. Parecio el diseño mas razonable
 */

@Entity
public class Provider {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NOMEN_ID")
    private Nomenclature nomen;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
