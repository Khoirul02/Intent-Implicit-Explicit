package com.huda.intent_implicit_explicit

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.explicit_intent_activity.*

class ExplicitIntentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.explicit_intent_activity)

        //Create Object to get Intent Data
        val i = intent.extras

        //get name Pass from MainActivity
        val myname = i.getString("name")


        //get Contact Number Pass from MainActivity
        val myContact = i.getInt("contact")

        /* You can set Text in TextView in both way as Shown Below*/
        name.setText(myname)

        number.text = myContact.toString()


    }

}