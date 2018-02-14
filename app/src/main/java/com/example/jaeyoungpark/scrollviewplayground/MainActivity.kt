package com.example.jaeyoungpark.scrollviewplayground

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

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

        btn.setOnClickListener { scrollview.fling(1000) }
    }

    fun showItsDetails(v: TextView) {
        v.text = "id=${v.id}, top=${v.top}, bottom=${v.bottom}"
    }
}
