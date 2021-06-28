package quentin.pessl.model;
import javax.persistence.*;

@Entity
public class Launch {

    @Id
    private String id;
    private String date_utc;
    @Column(length = 4096)
    private String details;
    private int flight_number;
    private String name;
    @JoinColumn(columnDefinition = "patch_id",nullable = false)
    private String patch_id;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate_utc() {
        return date_utc;
    }

    public void setDate_utc(String date_utc) {
        this.date_utc = date_utc;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getFlight_number() {
        return flight_number;
    }

    public void setFlight_number(int flight_number) {
        this.flight_number = flight_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatch_id() {
        return patch_id;
    }

    public void setPatch_id(String patch_id) {
        this.patch_id = patch_id;
    }
}