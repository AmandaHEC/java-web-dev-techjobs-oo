//MINE
package org.launchcode.techjobs_oo.Tests;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import static org.junit.Assert.*;

public class JobTest {
    private Job jobOne, jobTwo, jobThree;


    @Before
    public void testJobObjects(){
        jobOne = new Job("Dog walker", new Employer("Purina" ), new Location("St. Louis"),
                new PositionType("entry level"), new CoreCompetency("Java"));
        jobTwo = new Job("Cat walker", new Employer("PetCo" ), new Location("St. Louis"),
                new PositionType("entry level"), new CoreCompetency("Java"));
        jobThree = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testSettingJobId() {
        Job aJob = new Job();
        Job bJob = new Job();
        assertNotEquals(aJob.getId(), bJob.getId());

    }
    @Test
    public void testJobConstructorSetsAllFields(){
        assertTrue(jobThree.getEmployer() instanceof Employer);
        assertTrue(jobThree.getLocation() instanceof Location);
        assertTrue(jobThree.getPositionType() instanceof PositionType);
        assertTrue(jobThree.getCoreCompetency() instanceof CoreCompetency);
    }
@Test
public void testJobsForEquality(){
        assertFalse(jobOne.equals(jobTwo));
        assertFalse(jobOne.equals(jobThree));

}


}
//^^MINE