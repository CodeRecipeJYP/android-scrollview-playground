package com.example.jaeyoungpark.scrollviewplayground

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

const val SEEKBAR_MAX = 10000
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listOf(
                tv1, tv2, tv3, tv4, tv5,
                tv6, tv7, tv8, tv9, tv10,
                tv11,
                tv12
        ).forEach { it.addOnLayoutChangeListener { v, left, top, right, bottom, oldLeft, oldTop, oldRight, oldBottom -> showItsDetails(it) } }



        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                btn_fling.text = "fling, velocity: ${progress2flingVelocity(seekBar.progress)}"
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {

            }
        })

        seekBar.max = SEEKBAR_MAX
        btn_fling.setOnClickListener {
            scrollview.fling(progress2flingVelocity(seekBar.progress))
        }

        btn_arrowScroll.setOnClickListener {
            scrollview.fullScroll(View.FOCUS_DOWN)
        }
    }

    fun showItsDetails(v: TextView) {
        v.text = "id=${v.id}, top=${v.top}, bottom=${v.bottom}"
    }

    fun progress2flingVelocity(progress: Int): Int {
        return progress - SEEKBAR_MAX / 2
    }
}
