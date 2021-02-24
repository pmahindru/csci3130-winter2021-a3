package ca.dal.cs.csci3130.a3;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Rule
    public ActivityScenarioRule<MainActivity> myRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testFactorialOperation() {
        onView(withId(R.id.numberBox)).perform(typeText("8"));
        onView(withId(R.id.factorialButton)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("40320")));
    }

    @Test
    public void testSquareOperation() {
        onView(withId(R.id.numberBox)).perform(typeText("8"));
        onView(withId(R.id.squareButton)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("64")));
    }
}