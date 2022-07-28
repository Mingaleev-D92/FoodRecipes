package com.example.foodrecipes.db

import androidx.room.TypeConverter
import androidx.room.TypeConverters

@TypeConverters
class MealTypeConvector {

    @TypeConverter
    fun fromAnyToString(attribute:Any?):String {
        if (attribute == null)
            return ""
        return attribute as String
    }

    @TypeConverter
    fun fromStringToAny(attribute:String?):Any{
        if (attribute == null)
            return ""
        return attribute
    }
}