package tn.esprit.nascar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import tn.esprit.nascar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //TODO 11 Bind the toolbar to the activity

        //TODO 1 Implement the click on the 3 buttons (btnNews|btnEvents|btnProfile) to call changeFragment(...)

        //TODO 2 Implement the first call of the first fragment
    }

    private fun changeFragment(fragment: Fragment, tag: String) {

        //TODO 3 Check if tag is empty then replace the new fragment in the activity.
        //    If tag is not empty replace the new fragment in the activity and use addToBackStack

    }

    //TODO 12 Override the method onCreateOptionsMenu()

    //TODO 13 Override the method onOptionsItemSelected() and Implement info and logout behavior

}