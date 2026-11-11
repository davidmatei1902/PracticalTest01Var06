package ro.pub.cs.systems.eim.practicaltest01var06

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PracticalTest01Var06SecondaryActivity : AppCompatActivity() {
    private lateinit var statusText: TextView
    private lateinit var gainText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_practical_test01_var06_secondary)

        statusText = findViewById<TextView>(R.id.statusText)
        gainText = findViewById<TextView>(R.id.gainText)

        val status = intent?.getBooleanExtra("sameVal", false) ?: 0
        val gain = intent.getIntExtra("gain", 0)

        statusText.setText(status.toString())
        gainText.setText(gain.toString())
    }
}