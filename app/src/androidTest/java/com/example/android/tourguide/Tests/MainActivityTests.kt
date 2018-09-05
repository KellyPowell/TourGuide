package com.example.android.tourguide.Tests

import android.app.Instrumentation
import android.support.test.rule.ActivityTestRule

import com.example.android.tourguide.ArtActivity
import com.example.android.tourguide.DiningActivity
import com.example.android.tourguide.MainActivity
import com.example.android.tourguide.Models.MainActivityModel
import com.example.android.tourguide.OutdoorsActivity
import com.example.android.tourguide.ShoppingActivity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View

import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test

import android.support.test.InstrumentationRegistry.getInstrumentation

class MainActivityTests {

    private val mainActivityModel = MainActivityModel()

    @get:Rule
    var mActivityRule = ActivityTestRule<MainActivity>(
            MainActivity::class.java)


    @Before
    @Throws(Exception::class)
    fun setUp() {
        //Before Test case execution
    }

    @After
    @Throws(Exception::class)
    fun tearDown() {
        //After Test case Execution
    }

    @Test
    // check that all default elements are displayed on the page
    fun defaultElementsDisplayedOnStartup() {
        mainActivityModel.verifyAllDefaultElements()
    }

    @Test
    // click on Dining category, then click back to return to MainActivity
    fun clickDiningThenBack() {
        mainActivityModel.clickOnDiningAndBack()
    }

    @Test
    // click on Outdoors category, then click back to return to MainActivity
    fun clickOutdoorsThenBack() {
        mainActivityModel.clickOnOutdoorsAndBack()
    }

    @Test
    // click on Shopping category, then click back to return to MainActivity
    fun clickShoppingThenBack() {
        mainActivityModel.clickOnShoppingAndBack()
    }

    @Test
    // click on Art category, then click back to return to MainActivity
    fun clickArtThenBack() {
        mainActivityModel.clickOnArtAndBack()
    }
}
