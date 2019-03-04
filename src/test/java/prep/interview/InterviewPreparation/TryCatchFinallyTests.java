package prep.interview.InterviewPreparation;

import org.junit.Assert;
import org.junit.Test;

public class TryCatchFinallyTests {

    @Test
    public void baseTest() {
        TryCatchFinally component = new TryCatchFinally();
        int result = component.run();
        Assert.assertEquals(10, result);
    }

}
