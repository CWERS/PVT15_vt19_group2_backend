package WebbAppPVT15Grupp2.Models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Data
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(name = "sproc_get_all_badges",
        procedureName = "sproc_get_all_badges",
        resultClasses = Badge.class),
        @NamedStoredProcedureQuery(name = "sproc_get_one_badge",
                procedureName = "sproc_get_one_badge",
                resultClasses = Badge.class)
})
public class Badge {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String description;
    private String image;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}