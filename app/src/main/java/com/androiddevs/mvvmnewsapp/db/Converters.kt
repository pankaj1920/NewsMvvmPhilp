package com.androiddevs.mvvmnewsapp.db

import androidx.room.TypeConverter
import com.androiddevs.mvvmnewsapp.model.Source

class Converters {

    @TypeConverter
     fun fromSource(source: Source):String{
        // so whenever we get source we tell the room it convert source to string by taking name of the source
        return source.name
     }

    // whenever we will have string we will convert to Source class
    @TypeConverter
    fun toSource(name:String):Source{
        return Source(name,name)
    }
}