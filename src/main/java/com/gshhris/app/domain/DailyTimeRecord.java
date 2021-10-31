package com.gshhris.app.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.time.Instant;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * A DailyTimeRecord.
 */
@Entity
@Table(name = "daily_time_record")
public class DailyTimeRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "date_time_in")
    private Instant dateTimeIn;

    @Column(name = "date_time_out")
    private Instant dateTimeOut;

    @ManyToOne(optional = false)
    @NotNull
    @JsonIgnoreProperties(
        value = {
            "user",
            "dutySchedules",
            "dailyTimeRecords",
            "benefits",
            "dependents",
            "educations",
            "trainingHistories",
            "leaves",
            "designations",
            "department",
        },
        allowSetters = true
    )
    private Employee employee;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public DailyTimeRecord id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getDateTimeIn() {
        return this.dateTimeIn;
    }

    public DailyTimeRecord dateTimeIn(Instant dateTimeIn) {
        this.setDateTimeIn(dateTimeIn);
        return this;
    }

    public void setDateTimeIn(Instant dateTimeIn) {
        this.dateTimeIn = dateTimeIn;
    }

    public Instant getDateTimeOut() {
        return this.dateTimeOut;
    }

    public DailyTimeRecord dateTimeOut(Instant dateTimeOut) {
        this.setDateTimeOut(dateTimeOut);
        return this;
    }

    public void setDateTimeOut(Instant dateTimeOut) {
        this.dateTimeOut = dateTimeOut;
    }

    public Employee getEmployee() {
        return this.employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public DailyTimeRecord employee(Employee employee) {
        this.setEmployee(employee);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DailyTimeRecord)) {
            return false;
        }
        return id != null && id.equals(((DailyTimeRecord) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DailyTimeRecord{" +
            "id=" + getId() +
            ", dateTimeIn='" + getDateTimeIn() + "'" +
            ", dateTimeOut='" + getDateTimeOut() + "'" +
            "}";
    }
}
