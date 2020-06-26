package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.text.TextUtils;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {
    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.udacity.gradle.builditbigger", appContext.getPackageName());
    }

    @Test
    public void testAsyncTaskJoke() throws Exception {
        EndpointsAsyncTask testAsyncTask = new EndpointsAsyncTask(activityTestRule.getActivity());
        testAsyncTask.execute();
        String result = testAsyncTask.get();
        assertFalse(TextUtils.isEmpty(result));
    }

}
