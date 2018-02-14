package com.example.jaeyoungpark.scrollviewplayground

import android.widget.SeekBar

/**
 * Created by jaeyoungpark on 14/02/2018.
 */

class KotlinOnSeekBarChangedListener {
    fun seek(s: SeekBar) {
        s.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            // For convert from java
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {

            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {

            }
        })
    }
}
