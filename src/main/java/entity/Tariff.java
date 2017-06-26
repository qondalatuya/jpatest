package entity;

import javax.persistence.*;
import java.util.Date;

/*
entidad debil para un precio en un momento determinado, para un nomenclador determiado
 */

@Entity
public class Tariff {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private long id;

    @Column
    private float value;

    @Column
    private Date date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NOMEN_ID")
    private Nomenclature nomen;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRICEABLE_ID")
    private Priceable priceable;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Nomenclature getNomen() {
        return nomen;
    }

    public void setNomen(Nomenclature nomen) {
        this.nomen = nomen;
    }

    public Priceable getPriceable() {
        return priceable;
    }

    public void setPriceable(Priceable priceable) {
        this.priceable = priceable;
    }
}