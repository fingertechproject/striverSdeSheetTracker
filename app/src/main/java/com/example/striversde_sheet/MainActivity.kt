package com.example.striversde_sheet

import android.R
import android.os.Bundle
import android.view.MenuItem
import androidx.annotation.NonNull
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.example.striversde_sheet.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
//    var drawerLayout: DrawerLayout? = null
//    var actionBarDrawerToggle: ActionBarDrawerToggle? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
//        drawerLayout = binding.myDrawerLayout
//        actionBarDrawerToggle = ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open,R.string.nav_close)
//        drawerLayout?.addDrawerListener(actionBarDrawerToggle!!);
//        actionBarDrawerToggle!!.syncState();
//        getSupportActionBar()?.setDisplayHomeAsUpEnabled( true);


    }

//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        if (actionBarDrawerToggle?.onOptionsItemSelected(item) == true) {
//            return true;
//        }
//        return super.onOptionsItemSelected(item)
//    }
}