import com.saltsoftware.entity.PatientPaymentType;
import com.saltsoftware.factory.PatientPaymentTypeFactory;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatientPaymentTypeFactoryTest {

    @Test
    public void createPatientPaymentType() {
        PatientPaymentType type = PatientPaymentTypeFactory.createPaymentType("Credit Card");
        assertEquals(type.getPaymentDescrip(), "Credit Card");
    }
}