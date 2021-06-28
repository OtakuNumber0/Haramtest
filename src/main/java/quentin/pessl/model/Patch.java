package quentin.pessl.model;

import javax.persistence.Entity;

import javax.persistence.*;

@Entity
public class Patch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int patch_id;
    private String type;
    private String url;
    @JoinColumn(columnDefinition = "launch_id", nullable = false)
    private String launch_id;

    public int getPatch_id() {
        return patch_id;
    }

    public void setPatch_id(int patch_id) {
        this.patch_id = patch_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLaunch_id() {
        return launch_id;
    }

    public void setLaunch_id(String launch_id) {
        this.launch_id = launch_id;
    }
}