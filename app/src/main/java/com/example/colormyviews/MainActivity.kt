package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setClickListeners()
    }

    private fun setClickListeners() {
        val clickableViews: List<View> =
            listOf(box_1_tv, box_2_tv, box_3, box_4, box_5, constraint_layout)

        for (item in clickableViews) {
            item.setOnClickListener() { makeColored(item) }
        }
    }


    fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.box_1_tv -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_2_tv -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.box_3 -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_4 -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_5 -> view.setBackgroundResource(android.R.color.holo_green_light)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}
