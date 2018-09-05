package com.example.android.tourguide.Models

import android.app.Activity
import android.app.Instrumentation
import android.content.Intent
import android.net.Uri
import android.support.test.espresso.DataInteraction
import android.support.test.espresso.ViewInteraction
import android.support.test.espresso.action.KeyEventAction

import com.example.android.tourguide.R

import android.support.test.espresso.Espresso.onData
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.action.ViewActions.swipeUp
import android.support.test.espresso.intent.Intents.intended
import android.support.test.espresso.intent.Intents.intending
import android.support.test.espresso.intent.matcher.IntentMatchers.hasAction
import android.support.test.espresso.intent.matcher.IntentMatchers.hasData
import android.support.test.espresso.intent.matcher.IntentMatchers.isInternal
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.view.View
import org.hamcrest.Matchers.anything
import org.hamcrest.core.AllOf.allOf
import org.hamcrest.core.IsNot.not

class ArtActivityModel {

    private val visiblePhoneIcon = onView(allOf<View>(withId(R.id.phone_icon), isDisplayed()))
    private val visibleWebsiteIcon = onView(allOf<View>(withId(R.id.website_icon), isDisplayed()))
    private val visibleMapIcon = onView(allOf<View>(withId(R.id.map_icon), isDisplayed()))
    private val kellyArt = onData(anything()).inAdapterView(withId(R.id.list)).atPosition(0)
    private val list = onView(withId(R.id.list))

    // Test expanding Kelly Art and dialing phone
    @Throws(Exception::class)
    fun open0AndTapPhone() {
        // item 0 and click to expand
        kellyArt.perform(click())
        // click on phone icon
        visiblePhoneIcon.perform(click())
        intended(allOf(
                hasAction(Intent.ACTION_DIAL),
                hasData(INTENT_DATA_KELLY_PHONE)))
    }

    // Test expanding Kelly Art and tapping website
    @Throws(Exception::class)
    fun open0AndTapWebsite() {
        intending(not(isInternal())).respondWith(Instrumentation.ActivityResult(Activity.RESULT_OK, null))
        kellyArt.perform(click())
        // click on website icon
        visibleWebsiteIcon.perform(click())
        intended(allOf(
                hasAction(Intent.ACTION_VIEW),
                hasData(INTENT_DATA_KELLY_WEBSITE)))
    }

    // Test expanding Kelly Art and tapping map
    @Throws(Exception::class)
    fun open0AndTapMap() {
        intending(not(isInternal())).respondWith(Instrumentation.ActivityResult(Activity.RESULT_OK, null))
        kellyArt.perform(click())
        // click on website icon
        visibleMapIcon.perform(click())
        intended(allOf(
                hasAction(Intent.ACTION_VIEW),
                hasData(INTENT_DATA_KELLYART_MAP)))
    }

    companion object {

        // to test dialing intent
        private val KELLY_PHONE_NUMBER = "715-379-1248"
        private val INTENT_DATA_KELLY_PHONE = Uri.parse("tel:$KELLY_PHONE_NUMBER")
        //private static String PACKAGE_ANDROID_DIALER = "com.android.server.telecom";

        // to test website intent
        private val INTENT_DATA_KELLY_WEBSITE = "https://www.instagram.com/glassbykelly/"

        // to test maps intent
        private val INTENT_DATA_KELLYART_MAP = "geo:0,0?q=521+Buena+Fortuna+Circle+Atascadero+CA"
    }

}
