package com.monofire.customemoji

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // 1
        happyButton.setOnClickListener {
            faceView.happinessState = FaceEmoji.HAPPY
        }
// 2
        sadButton.setOnClickListener {
            faceView.happinessState = FaceEmoji.SAD
        }

    }
}
