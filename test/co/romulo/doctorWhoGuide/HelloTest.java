package co.romulo.doctorWhoGuide;

import android.app.Activity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(RobolectricTestRunner.class)
public class HelloTest {
    @Test
    public void testName() throws Exception {
        Activity activity = Robolectric.buildActivity(Hello.class).create().get();
        System.out.print(activity.getApplication());
        assertThat(true, is(true));
    }
}
