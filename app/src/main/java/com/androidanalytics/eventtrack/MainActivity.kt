package com.androidanalytics.eventtrack

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import com.eventlibrary.EEvent
import com.eventlibrary.TrackerManager

class MainActivity : AppCompatActivity() {

    private var gaEvent: EEvent? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun dgtOnClick(v: View) {

        gaEvent = EEvent("Text", v.id.toString(), v.textAlignment.toString())
        gaEvent?.let { TrackerManager.instance!!.sendUserEvent(it) }
        Toast.makeText(this@MainActivity, "MainActivity", Toast.LENGTH_SHORT).show()

        when (v.id) {
            R.id.eButtonFirst -> {
                //you code here whatever the action of the click
                return
            }
            R.id.eButtonSec -> {
                //you code here whatever the action of the click
                return
            }
            R.id.eButtonThird -> {
                //you code here whatever the action of the click
                return
            }
        }


    }

}
