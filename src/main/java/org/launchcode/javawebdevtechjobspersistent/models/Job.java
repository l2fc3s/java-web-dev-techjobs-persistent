package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Job extends AbstractEntity{

    @ManyToOne
    private Employer employer;
    private String skills;

    public Job(int id, @NotBlank @Size(min = 3, max = 150, message = "Name must be between 3 and 150 characters.") String name, Employer employer, String skills) {
        super(id, name);
        this.employer = employer;
        this.skills = skills;
    }

    public Job() {
    }

    // Getters and setters.

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}
