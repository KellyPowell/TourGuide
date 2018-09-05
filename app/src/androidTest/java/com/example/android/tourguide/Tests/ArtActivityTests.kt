package com.example.android.tourguide.Tests

import android.app.Activity
import android.app.Instrumentation
import android.content.Intent
import android.support.test.espresso.intent.rule.IntentsTestRule

import com.example.android.tourguide.ArtActivity
import com.example.android.tourguide.Models.ArtActivityModel
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test

import android.support.test.espresso.intent.Intents.intending
import android.support.test.espresso.intent.matcher.IntentMatchers.hasAction

class ArtActivityTests {
    private val artActivityModel = ArtActivityModel()

    @get:Rule
    var intentsTestRule = IntentsTestRule<ArtActivity>(ArtActivity::class.java)

    @Before
    @Throws(Exception::class)
    fun setUp() {
        //Before Test case execution
    }

    /**
     * By default, Espresso Intents won't stub your intents. Since we just want to verify that the
     * phone intent was started, let's just have all intents return {@value Activity#RESULT_OK}.
     */
    @Before
    fun stubAllExternalIntents() {
        intending(hasAction(Intent.ACTION_DIAL)).respondWith(
                Instrumentation.ActivityResult(Activity.RESULT_OK, null))
    }

    @After
    @Throws(Exception::class)
    fun tearDown() {
        //After Test case Execution
    }


    @Test
    @Throws(Exception::class)
    // click on Kelly Art from list, click phone, check intent
    fun clickOnKellyAndDialPhone() {
        artActivityModel.open0AndTapPhone()
    }

    @Test
    @Throws(Exception::class)
    // click on Kelly from list, click website, check intent
    fun clickOnKellyAndLaunchWebsite() {
        artActivityModel.open0AndTapWebsite()
    }

    @Test
    @Throws(Exception::class)
    // click on Kelly from list, click map, check intent
    fun clickOnKellyAndLaunchMap() {
        artActivityModel.open0AndTapMap()
    }

}
