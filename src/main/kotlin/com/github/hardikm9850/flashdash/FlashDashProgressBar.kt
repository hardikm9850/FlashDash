package com.github.hardikm9850.flashdash

import java.awt.Graphics
import javax.swing.JComponent
import javax.swing.plaf.basic.BasicProgressBarUI

open class FlashDashProgressBar : BasicProgressBarUI() {
    override fun installDefaults() {
        super.installDefaults()
        // init stuff
    }

    override fun paintDeterminate(g: Graphics?, c: JComponent?) {
        super.paintDeterminate(g, c)
    }

    override fun paintIndeterminate(g: Graphics?, c: JComponent?) {
        super.paintIndeterminate(g, c)
    }
}
