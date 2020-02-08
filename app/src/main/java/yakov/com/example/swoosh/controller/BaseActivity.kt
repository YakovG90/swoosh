package yakov.com.example.swoosh.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

open class BaseActivity : AppCompatActivity() {

    private val tag = "LifeCycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(tag, "${javaClass.simpleName} onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        Log.d(tag, "${javaClass.simpleName} onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d(tag, "${javaClass.simpleName} onResume")
        super.onResume()
    }

    override fun onRestart() {
        Log.d(tag, "${javaClass.simpleName} onRestart")
        super.onRestart()
    }

    override fun onPause() {
        Log.d(tag, "${javaClass.simpleName} onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(tag, "${javaClass.simpleName} onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(tag, "${javaClass.simpleName} onDestroy")
        super.onDestroy()
    }
}
