package yakov.com.example.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skill.*
import yakov.com.example.swoosh.utilities.EXTRA_LEAGUE
import yakov.com.example.swoosh.R
import yakov.com.example.swoosh.utilities.EXTRA_SKILL

class SkillActivity : BaseActivity() {

    private var skill = ""
    private var league: String? = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
    }

    fun onBallerClick(view: View) {
        beginnerSkillBtn.isChecked = false
        skill = "baller"
    }

    fun onBeginnerClick(view: View) {
        ballerSkillBtn.isChecked = false
        skill = "beginner"
    }

    fun onSkillFinishClicked(view: View) {
        if (!skill.isBlank()) {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE, league)
            finishActivity.putExtra(EXTRA_SKILL, skill)
            startActivity(finishActivity)
        } else {
            Toast
                .makeText(this, "Please select a skill level", Toast.LENGTH_SHORT)
                .show()
        }
    }
}
