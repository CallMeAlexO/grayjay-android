package com.futo.platformplayer.animations

import android.animation.ObjectAnimator
import android.view.View

const val DEFAULT_DURATION: Long = 300

class ElementSelectionAnimation(
    private val view: View,
    private val duration: Long = DEFAULT_DURATION
) {
    fun animateAlpha(
        focused: Boolean,
        alphaWhenFocused: Int = 64,
        alphaWhenNotFocused: Int = 0
    ) {
        val alphaValue = if (focused) alphaWhenFocused else alphaWhenNotFocused
        val alphaAnimator = ObjectAnimator.ofInt(view.background, "alpha", alphaValue)
        alphaAnimator.duration = DEFAULT_DURATION
        alphaAnimator.start()
    }
}