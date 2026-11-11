package ro.pub.cs.systems.eim.practicaltest01var06

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class PracticalTest01Var06MainActivity : AppCompatActivity() {

    private lateinit var numere1: EditText
    private lateinit var numere2: EditText
    private lateinit var numere3: EditText

    private lateinit var checkBox1: CheckBox
    private lateinit var checkBox2: CheckBox
    private lateinit var checkBox3: CheckBox


    private lateinit var playButton: Button
    private lateinit var randomButton: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_practical_test01_var06_main)

        numere1 = findViewById<EditText>(R.id.numere1)
        numere2 = findViewById<EditText>(R.id.numere2)
        numere3 = findViewById<EditText>(R.id.numere3)


        playButton = findViewById<Button>(R.id.playButton)
        randomButton = findViewById<Button>(R.id.randomButton)

        checkBox1 = findViewById<CheckBox>(R.id.checkBox1)
        checkBox2 = findViewById<CheckBox>(R.id.checkBox2)
        checkBox3 = findViewById<CheckBox>(R.id.checkBox3)

        val range = setOf("0", "1", "2" , "*")

        var firstRandom = range.random()
        var secondRandom = range.random()
        var thirdRandom = range.random()

        randomButton.setOnClickListener {

            firstRandom = range.random()
            secondRandom = range.random()
            thirdRandom = range.random()

            if(!checkBox1.isChecked) {
                numere1.setText(firstRandom)
            }
            if(!checkBox2.isChecked) {
                numere2.setText(secondRandom)
            }
            if(!checkBox3.isChecked) {
                numere3.setText(thirdRandom)
            }
        }

        playButton.setOnClickListener {
            Log.d(Constants.PRINT_NUMS, "Numerele sunt $firstRandom, $secondRandom, $thirdRandom")

            var intent = Intent(this, PracticalTest01Var06SecondaryActivity::class.java)
            intent.putExtra("numar1", numere1.text)
            intent.putExtra("numar2", numere2.text)
            intent.putExtra("numar3", numere3.text)


            startActivity(intent)
        }
    }
}