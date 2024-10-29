package com.futo.platformplayer.helpers

import android.app.UiModeManager
import android.content.Context
import android.content.res.Configuration
import android.view.View

class TVHelper {
    companion object {
        fun isRunningOnTV(context: Context): Boolean {
            val uiModeManager = context.getSystemService(Context.UI_MODE_SERVICE) as UiModeManager
            return uiModeManager.currentModeType == Configuration.UI_MODE_TYPE_TELEVISION
        }

        fun animateFocus(view: View, hasFocus: Boolean) {
            // Focus animation for TV
            if (isRunningOnTV(view.context)) {
                if (hasFocus) {
                    // Increase size (scale) when focused
                    view.animate().scaleX(1.1f).scaleY(1.1f).setDuration(100).start()
                } else {
                    // Reset size (scale) when focus is lost
                    view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100).start()

                }
            }
        }

    }

}