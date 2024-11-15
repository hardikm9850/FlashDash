package com.github.hardikm9850.flashdash.listeners

import com.github.hardikm9850.flashdash.ProgressBarHandler
import com.intellij.ide.ui.LafManager
import com.intellij.ide.ui.LafManagerListener
import com.intellij.openapi.application.ApplicationActivationListener
import com.intellij.openapi.diagnostic.thisLogger
import com.intellij.openapi.wm.IdeFrame
import javax.swing.UIManager

internal class ProgressBarListener : LafManagerListener, ApplicationActivationListener {

    override fun applicationActivated(ideFrame: IdeFrame) {
        drawUI()
    }

    override fun lookAndFeelChanged(p0: LafManager) {
        drawUI()
    }

    private fun drawUI() {
        UIManager.put("ProgressBarUI", ProgressBarHandler::class.java.name)
        UIManager.getDefaults()[ProgressBarHandler::class.java.name] = ProgressBarHandler::class.java
    }
}
