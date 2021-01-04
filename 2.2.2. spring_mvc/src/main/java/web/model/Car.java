package web.model;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {
    public Car() {
    }

    public Car(String model, int series,String owner) {
        this.model = model;
        this.series = series;
        this.owner = owner;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "model")
    private String model;

    @Column(name = "series")
    private int series;

    @Column(name = "owner")
    private String owner;

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
