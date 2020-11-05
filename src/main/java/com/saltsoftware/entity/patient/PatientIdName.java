package com.saltsoftware.entity.patient;
/* author: Bathi Ntshinga
/* std no:214198227
/* date: 2020/11/02
 */
/* Description: Adding HashCode
 */
import java.io.Serializable;
import java.util.Objects;

public class PatientIdName implements Serializable {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PatientIdName that = (PatientIdName) o;
        return patientID.equals(that.patientID) &&
                patientName.equals(that.patientName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patientID, patientName);
    }

    private String patientID, patientName;
}

