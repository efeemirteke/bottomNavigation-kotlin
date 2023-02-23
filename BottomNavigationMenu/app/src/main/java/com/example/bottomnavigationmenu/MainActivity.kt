package com.example.bottomnavigationmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationBarItemView
import com.google.android.material.navigation.NavigationBarView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fragmentGoster(FragmentHome())
        bottomNavigationView.setOnItemSelectedListener(object:NavigationBarView.OnItemSelectedListener{
            override fun onNavigationItemSelected(item: MenuItem): Boolean {
                when(item.itemId){
                    R.id.home->fragmentGoster(FragmentHome())
                    R.id.save->fragmentGoster(FragmentSave())
                    R.id.settings->fragmentGoster(FragmentSettings())
                }
                return true
            }
        })
    }
    fun fragmentGoster(fragment:Fragment){
        val fragmentBegin=supportFragmentManager.beginTransaction()
        fragmentBegin.replace(R.id.frameLayout,fragment).commit()
    }
}