/*   @Author: Bathi Ntshinga
 *   StudentNumber : 214198227
 *   Description: Test case for PatientFactory
 * Date: 13/07/2020
 * */

package com.saltsoftware.factory;

import com.saltsoftware.entity.Patient;
import org.junit.Before;
import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatientFactoryTest {

    @Test
    public void createPatient() {
        Patient patient1 = PatientFactory.createPatient("Bathi", "Ntshinga");
    }

}