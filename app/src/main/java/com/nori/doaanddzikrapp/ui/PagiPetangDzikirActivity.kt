package com.nori.doaanddzikrapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.cardview.widget.CardView
import com.nori.doaanddzikrapp.R
import com.nori.doaanddzikrapp.ui.detail.DzikirPagiActivity
import com.nori.doaanddzikrapp.ui.detail.DzikirPetangActivity

class PagiPetangDzikirActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        title = "Dzikir Pagi dan Petang"
        setContentView(R.layout.activity_pagi_petang_dzikir)

        val llDzikirPagi: LinearLayout = findViewById(R.id.ll_dzikir_pagi)
        llDzikirPagi.setOnClickListener(this)

        val llDzikirPetang: LinearLayout = findViewById(R.id.ll_dzikir_petang)
        llDzikirPetang.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.ll_dzikir_pagi -> startActivity(Intent(this, DzikirPagiActivity::class.java))
            R.id.ll_dzikir_petang -> startActivity(Intent(this, DzikirPetangActivity::class.java))
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}