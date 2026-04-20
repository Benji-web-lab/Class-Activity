package com.example.classactivity

import android.util.Log

// primary constructor takes all the variables
class Song (songName: String, songArtist: String, songYear: Int, songDuration: String) {
    //created variables to hold song object's attributes
    var name: String = ""
    var artist: String = ""
    var year: Int = 0
    var duration: String = ""

    // exception for if we only know the song name and artist
    constructor(songName: String, songArtist: String) : this(songName, songArtist, 0, "") {
    }
init{

}
    //function to play song
    fun Play() {
        Log.v("song", "$name is playing.")
    }


    //function to pause song
    fun Pause() {
        Log.v("song", "$name is paused.")
    }

    //function to stop song
    fun Stop() {
        Log.v("song", "$name is stopping")
    }

    fun Favourte(): Boolean {
        Log.v("song", "$name favourited now")
        return true
    }

    fun GetDisplayString(): String {
        return "$name - $artist ($duration)"
    }

}







