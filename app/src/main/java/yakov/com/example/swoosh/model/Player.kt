package yakov.com.example.swoosh.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Player constructor(var league: String?, var skill: String?) : Parcelable