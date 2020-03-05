import org.testng.Assert;
import org.testng.annotations.Test;

public class TC2_FailTestPentruDemo {

    @Test(description = "Fail test case pentru demo DAA?")
    public void failTestCase(){
        Assert.assertEquals(1,2,"unu nu ii egal cu doi asa ca o dat fail! mersi pa");
    }

}
