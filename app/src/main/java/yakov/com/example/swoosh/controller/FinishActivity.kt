package yakov.com.example.swoosh.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_finish.*
import yakov.com.example.swoosh.R
import yakov.com.example.swoosh.model.Player
import yakov.com.example.swoosh.utilities.EXTRA_PLAYER

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra(EXTRA_PLAYER) as Player
        searchLeaguesText.text = String.format(
            resources.getString(R.string.search_league_actual),
            player.league,
            player.skill)
    }
}
