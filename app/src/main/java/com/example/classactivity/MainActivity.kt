package com.example.classactivity

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.classactivity.Song

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val songShowtxt = findViewById<TextView>(R.id.SongsView)


        // accessing the song class to populate song objects  with specific attributes
        var song1 = Song("Pop Style","Drake", 2016,"4:24")
        var song2 = Song("We Paid", "Lil Baby", 2022,"3:35" )
        var song3 = Song("That's That", 'Sheff G', )

        //creating an array to hold the song objects
        var songs = arrayOf<Song>(song1, song2, song3)
        var songDisplay = ""
         for (song in songs){
             songDisplay += "${song.GetDisplayString()}\n\n"
         }

            songShowtxt.text = songDisplay


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}