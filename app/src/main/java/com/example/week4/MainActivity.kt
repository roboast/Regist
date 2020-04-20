package com.example.week4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        refreshClicked()
        updateClicked()
    }

    fun refreshClicked() {
        button_refresh.setOnClickListener {
            tvNama.setText("")
            tvAlamat.setText("")
            tvEmail.setText("")
            etNama.text.clear()
            etAlamat.text.clear()
            etEmail.text.clear()
        }
    }
    fun updateClicked(){
        button_update.setOnClickListener {
            tvNama.setText(etNama.text)
            tvAlamat.setText(etAlamat.text)
            tvEmail.setText(etEmail.text)
        }
    }
}
