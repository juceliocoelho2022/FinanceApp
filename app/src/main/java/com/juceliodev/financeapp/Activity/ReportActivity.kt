package com.juceliodev.financeapp.Activity

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.juceliodev.financeapp.Adapter.ReportListAdapter
import com.juceliodev.financeapp.R
import com.juceliodev.financeapp.ViewModel.MainViewModel
import com.juceliodev.financeapp.databinding.ActivityReportBinding

class ReportActivity : AppCompatActivity() {
    lateinit var  binding: ActivityReportBinding
    private  val mainViewModel:MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityReportBinding.inflate(layoutInflater)
        setContentView(binding.root)


        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

        initRecyclerview()
        setVariable()

    }

    private fun setVariable() {
       binding.backBtn.setOnClickListener { finish() }
    }

    private fun initRecyclerview() {
        binding.view2.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.view2.adapter=ReportListAdapter(mainViewModel.loadBudget())
        binding.view2.isNestedScrollingEnabled=false
    }
}