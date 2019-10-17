package `in`.technowolf.superchargedlogger

import `in`.technowolf.supercharger.Log
import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Supercharged Log with just message")
        Log.d("Supercharged Log with message and throwable",RuntimeException("Supercharged Exception"))
    }
}
