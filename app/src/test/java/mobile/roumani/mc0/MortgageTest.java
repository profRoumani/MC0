package mobile.roumani.mc0;

import org.hamcrest.core.StringStartsWith;
import org.hamcrest.number.IsCloseTo;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.hamcrest.core.StringStartsWith.startsWith;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class MortgageTest
{
    @Test
    public void getPaymentString_isCorrect() throws Exception
    {
        Mortgage m;
        String p, a, i;
        String result;

        p = "300000";
        a = "25";
        i = "3.5";
        m = new Mortgage(p, a, i);
        result = m.getPaymentString();
        System.out.printf("Testing p=%s, a=%s, i=%s yields %s\n", p, a, i, result);
        assertThat(result, startsWith("1500."));

/*
        p = "300000";
        a = "30";
        i = "1.25";
        m = new Mortgage(p, a, i);
        result = m.getPaymentString();
        System.out.printf("Testing p=%s, a=%s, i=%s yields %s\n", p, a, i, result);
        assertThat(m.getPaymentString(), startsWith("999."));
*/
    }

    @Test
    public void getPayment_isCorrect() throws Exception
    {
        Mortgage m;
        String p, a, i;
        double result;

        p = "300000";
        a = "25";
        i = "3.5";
        m = new Mortgage(p, a, i);
        result = m.getPayment();
        System.out.printf("Testing p=%s, a=%s, i=%s yields %s\n", p, a, i, result);
        assertThat(result, closeTo(1500, 1));
    }

}