package org.launchcode.techjobs_oo.Tests;


import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job tJob1;
    Job tJob2;
    Job tJob3;
    Job tJob4;
    Job tJob5;

    @Before
    public void tJobObject() {
        tJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        tJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        tJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        tJob4 = new Job("Mr. Sleepy", new Employer("Sandman"), new Location("Dreamland"), new PositionType("Dreamer"), new CoreCompetency("ZZZ"));
        tJob5 = new Job();
    }

    @Test
    public void testSettingJobId() {
        assertEquals(tJob1.getId(), (tJob2.getId() - 1));
        assertNotEquals(tJob1, tJob2);

    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertEquals("tJob3 name should be Product tester", "Product tester", tJob3.getName());
        assertEquals("tJob3 employer should be ACME", "ACME", tJob3.getEmployer().getValue());
        assertEquals("tJob3 location should be Desert", "Desert", tJob3.getLocation().getValue());
        assertEquals("tJob3 position should be Quality control", "Quality control", tJob3.getPositionType().getValue());
        assertEquals("tJob3 competency should be Persistence", "Persistence", tJob3.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        assertNotEquals(tJob2, tJob3);
    }

    @Test
    public void testToString() {
        int lastChar = (tJob4.toString().length() - 1);

        assertEquals('\n', tJob4.toString().charAt(0)); // checks break line before
        assertEquals('\n', tJob4.toString().charAt(lastChar)); // checks break line after

    }
}