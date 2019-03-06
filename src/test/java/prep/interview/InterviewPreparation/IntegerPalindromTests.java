package prep.interview.InterviewPreparation;

import org.junit.Assert;
import org.junit.Test;

public class IntegerPalindromTests {
    private IntegerPalindrom component = new IntegerPalindrom();

    @Test
    public void test1() {
        Assert.assertEquals(12321, component.run(12321));
    }

    @Test
    public void test2() {
        Assert.assertEquals(9876789, component.run(9876789));
    }

    @Test
    public void test3() {
        Assert.assertNotEquals(98765, component.run(98765));
    }

}
