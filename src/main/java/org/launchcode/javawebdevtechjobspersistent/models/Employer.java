package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @JoinColumn
    @OneToMany
    private List<Job> jobs = new ArrayList<>();

    @NotBlank
    @Size(min = 3, max = 150, message="Location must be between 3 and 150 characters.")
    private String location;

    public Employer(@NotBlank @Size(min = 3, max = 150, message = "Location must be between 3 and 150 characters.") String location) {
        this.location = location;
    }

    public Employer() {}

    //Getter + setter
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
