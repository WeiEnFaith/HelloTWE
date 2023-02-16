package my.edu.tarc.hellotwe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

//Instant Name: Class Name
class MainActivity : AppCompatActivity() {
    //onCreate = main function
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Load UI to memory
        //R = resource class
        setContentView(R.layout.activity_main)

        //Write UI handler here
        //Variable declaration; 1. val = value, 2. var = variable
        val textViewName: TextView = findViewById(R.id.textViewName)  //option 1 (preferable)
        val imageViewQRCode = findViewById<ImageView>(R.id.imageViewQRCode) //option 2
        val buttonShow: Button = findViewById(R.id.buttonShow)
        val buttonHide: Button = findViewById(R.id.buttonHide)

        textViewName.visibility = View.INVISIBLE
        imageViewQRCode.visibility = View.INVISIBLE

        buttonShow.setOnClickListener{
            textViewName.visibility = View.VISIBLE
            imageViewQRCode.visibility = View.VISIBLE
        }

        buttonHide.setOnClickListener{
            textViewName.visibility = View.INVISIBLE
            imageViewQRCode.visibility = View.INVISIBLE
        }
    }
}