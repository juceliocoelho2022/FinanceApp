package com.juceliodev.financeapp.Activity

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.juceliodev.financeapp.Adapter.ExpenseListAdapter
import com.juceliodev.financeapp.ViewModel.MainViewModel
import com.juceliodev.financeapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
        initRecyclerview()
    }

    private fun initRecyclerview() {
       binding.view1.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.view1.adapter=ExpenseListAdapter(mainViewModel.loadData())
        binding.view1.isNestedScrollingEnabled= false
    }
}