package com.saltsoftware.entity.patient;

import java.io.Serializable;
import java.util.Objects;

public class PatientNameId implements Serializable {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PatientNameId that = (PatientNameId) o;
        return patientID.equals(that.patientID) &&
                patientName.equals(that.patientName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patientID, patientName);
    }

    private String patientID, patientName;
}
