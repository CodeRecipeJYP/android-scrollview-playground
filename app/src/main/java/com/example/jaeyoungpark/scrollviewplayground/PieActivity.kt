package com.example.jaeyoungpark.scrollviewplayground

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_pie.*

class PieActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pie)

        val res = resources

        val pie = this.findViewById(R.id.Pie) as PieChart
        pie.addItem("Agamemnon", 2f, res.getColor(R.color.seafoam));
        pie.addItem("Bocephus", 3.5f, res.getColor(R.color.chartreuse));
        pie.addItem("Calliope", 2.5f, res.getColor(R.color.emerald));
        pie.addItem("Daedalus", 3f, res.getColor(R.color.bluegrass));
        pie.addItem("Euripides", 1f, res.getColor(R.color.turquoise));
        pie.addItem("Ganymede", 3f, res.getColor(R.color.slate));

        Reset.setOnClickListener(object: View.OnClickListener {
            override fun onClick(view: View) {
                pie.currentItem = 0
            }
        })
    }
}
