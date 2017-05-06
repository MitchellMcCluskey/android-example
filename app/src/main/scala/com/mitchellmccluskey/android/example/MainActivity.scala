package com.mitchellmccluskey.android.example

import android.content.Context
import android.os.Bundle
import android.support.multidex.MultiDex
import android.support.v7.app.AppCompatActivity

class MainActivity extends AppCompatActivity {

    override protected def onCreate(savedInstanceState: Bundle): Unit = {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        import android.widget.Toast
        Toast.makeText(getApplication, "Hello from Scala!", Toast.LENGTH_LONG).show()
    }

    override protected def attachBaseContext(newBase: Context): Unit = {
        super.attachBaseContext(newBase)
        MultiDex.install(this)
    }
}
