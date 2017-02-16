package hei.tp06.core.entity;

import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by thiba on 14/02/2017.
 */
@Entity
public class Evenement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="start")
    private Timestamp start;

    @Column(name="end")
    private Timestamp end;

    @Column(name="title")
    private String title;

    @Column(name="color")
    private String color;

    @Column(name="description")
    private String description;

    public Evenement() {
    }

    public Evenement(Long id, Timestamp start, Timestamp end, String title, String color, String description) {
        this.id = id;
        this.start = start;
        this.end = end;
        this.title = title;
        this.color = color;
        this.description = description;
    }

    public Evenement(String title)
    {
        this.title = title;
    }


    public Long getId() {
        return id;
    }

    public Timestamp getStart() {
        return start;
    }

    public void setStart(Timestamp start) {
        this.start = start;
    }

    public Timestamp getEnd() {
        return end;
    }

    public void setEnd(Timestamp end) {
        this.end = end;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
