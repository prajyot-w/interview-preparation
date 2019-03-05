package prep.interview.InterviewPreparation;

import org.junit.Assert;
import org.junit.Test;

public class ArmstrongNumberTests {
    private ArmstrongNumber component = new ArmstrongNumber();

    @Test
    public void test1() {
        Assert.assertEquals(true, component.run(153L));
    }

    @Test
    public void test2() {
        Assert.assertEquals(true, component.run(370L));
    }

    @Test
    public void test3() {
        Assert.assertEquals(true, component.run(371L));
    }

    @Test
    public void test4() {
        Assert.assertEquals(true, component.run(407L));
    }

    @Test
    public void test5() {
        Assert.assertEquals(false, component.run(466L));
    }
}
