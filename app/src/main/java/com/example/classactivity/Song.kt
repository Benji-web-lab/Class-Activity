package com.example.classactivity

import android.util.Log

// primary constructor takes all the variables
class Song (songName: String, songArtist: String, songYear: Int, songDuration: String) {
    //created variables to hold song object's attributes
    var name: String = ""
    var artist: String = ""
    var year: Int = 0
    var duration: String = ""

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
    // secondary constructor
    class song (songName: String, songArtist: String, songYear: Int, songDuration: String) {
        // Attributes
        var name: String = ""
        var artist: String = ""
        var year: Int = 0
        var duration: String = ""


        // NEW secondary constructor: only know the song name
        constructor(songName: String) : this(songName, "Unknown Artist", 0, "")


        // init block is used to set the values from the primary constructor into the attributes
        init {
            name = songName
            artist = songArtist
            year = songYear
            duration = songDuration



            fun Play() {
                Log.v( "Song", "$name is playing.")
            }

            fun Pause() {
                Log.v( "Song", "$name is paused.")
            }

            fun Stop() {
                Log.v("Song", "$name is stopping")
            }

            fun Favourte(): Boolean {
                Log.v("Song", "$name favourited now")
                return true
            }

            fun GetDisplayString(): String {
                return "$name - $artist ($duration)"
            }
        }
    }












