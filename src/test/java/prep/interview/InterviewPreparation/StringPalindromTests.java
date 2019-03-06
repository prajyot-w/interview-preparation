package prep.interview.InterviewPreparation;

import org.junit.Assert;
import org.junit.Test;

public class StringPalindromTests {
    private StringPalindrom component = new StringPalindrom();

    @Test
    public void test1() {
        Assert.assertEquals("madam", component.run("madam"));
    }

    @Test
    public void test2() {
        Assert.assertEquals("nursesrun", component.run("nursesrun"));
    }

    @Test
    public void test3() {
        Assert.assertEquals("jacob", component.run("jacob"));
    }

}
