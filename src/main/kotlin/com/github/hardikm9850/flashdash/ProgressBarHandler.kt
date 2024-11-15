package com.github.hardikm9850.flashdash

import com.intellij.ide.PowerSaveMode
import javax.swing.JComponent
import javax.swing.plaf.ComponentUI
import javax.swing.plaf.basic.BasicProgressBarUI

class ProgressBarHandler : FlashDashProgressBar() {

    companion object {
        @JvmStatic
        fun createUI(c: JComponent?): ComponentUI {
            val powerMode = PowerSaveMode.isEnabled()
            return if (powerMode) {
                BasicProgressBarUI()
            } else {
                FlashDashProgressBar()
            }
        }
    }
}