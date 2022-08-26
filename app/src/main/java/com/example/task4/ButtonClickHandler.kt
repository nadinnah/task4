package com.example.task4

import android.util.Log
import android.view.View

class ButtonClickHandler: View.OnClickListener {
    override fun onClick(p0: View?) {
        Log.d("ClickEvent", "button is clicked")
    }
}