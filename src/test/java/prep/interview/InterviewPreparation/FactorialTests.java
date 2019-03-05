package prep.interview.InterviewPreparation;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTests {
    private Factorial component = new Factorial();

    @Test
    public void test1() {
        Assert.assertEquals(Long.valueOf(24), component.run(4L));
    }

    @Test
    public void test2() {
        Assert.assertEquals(Long.valueOf(87178291200L), component.run(14L));
    }

    @Test
    public void test3() {
        Assert.assertEquals(Long.valueOf(362880L), component.run(9L));
    }

    @Test
    public void test4() {
        Assert.assertEquals(Long.valueOf(39916800L), component.run(11L));
    }
}
