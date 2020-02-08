package yakov.com.example.swoosh.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_finish.*
import yakov.com.example.swoosh.R
import yakov.com.example.swoosh.utilities.EXTRA_LEAGUE
import yakov.com.example.swoosh.utilities.EXTRA_SKILL

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)
        searchLeaguesText.text = String.format(
            resources.getString(R.string.search_league_actual),
            league,
            skill)
    }
}
