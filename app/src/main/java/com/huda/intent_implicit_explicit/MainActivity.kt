package com.huda.intent_implicit_explicit

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Find View By Id for Both Button

        val implicitIntent = findViewById(R.id.implicit) as Button
        val explicitIntent = findViewById(R.id.explicit) as Button

        /* Set On Click Listerner for both button Here we have implement OnClickListerner
            On Click is Handle in onClick Method.
        */

        implicitIntent.setOnClickListener(this)
        explicitIntent.setOnClickListener(this)
    }
    override fun onClick(v: View?) {

        //Get selected Button Id
        val selectedButtonId = v!!.id

        //Initialize Intent
        val intent: Intent

        when (selectedButtonId) {

            R.id.implicit -> {

                //This is Explicit Intent Without Passing Data
                intent = Intent(this@MainActivity, ImplicitIntentActivity::class.java)

                //StartActivity Open our Intent Activity.
                startActivity(intent)
            }

            R.id.explicit -> {

                //This Is Explicit Intent With Passing Data to Another Activity.

                intent = Intent(this@MainActivity, ExplicitIntentActivity::class.java)

                //Pass String Value
                intent.putExtra("name", "Khoirul Huda")

                //Pass Integer value
                intent.putExtra("contact", 12345678)


                //StartActivity Open our Intent Activity.
                startActivity(intent)
            }
        }

    }
}
