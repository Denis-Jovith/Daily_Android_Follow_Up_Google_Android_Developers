package com.example.daily_android_follow_up_kotlin.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(
    @StringRes val stringResourceId:Int,
    @DrawableRes val imageResourceId:Int
)
