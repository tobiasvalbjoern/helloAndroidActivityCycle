package dk.tobias.activities.hellocallback


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

val TAG = MainActivity::class.java.name
class MainActivity : AppCompatActivity() {

    private val awesomeButton: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG,"onCreate called")

        val buttonClickListener = View.OnClickListener { view ->
            textBox.text=getString(R.string.newMessage)
        }

        textBox.setOnClickListener(buttonClickListener)
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "On Start .....")
    }
    override fun onResume() {
        super.onResume()
        Log.i(TAG, "On Resume .....")
    }
    override fun onPause() {
        super.onPause()
        Log.i(TAG, "On Pause .....")
    }
    override fun onStop() {
        super.onStop()
        Log.i(TAG, "On Stop .....")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "On Destroy .....")
    }
    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "On Restart .....")
    }
}

