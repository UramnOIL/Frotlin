package com.github.uramnoil.ktform.form

import cn.nukkit.Player
import cn.nukkit.form.window.FormWindowSimple
import com.github.uramnoil.ktform.element.KElementButton

open class KFormWindowSimple(
    title: String,
    content: String,
    buttons: List<KElementButton>,
    val onSubmit: (player: Player, selected: KElementButton) -> Unit
) : FormWindowSimple(title, content, buttons) {
    override fun getButtons(): List<KElementButton> = super.getButtons().filterIsInstance<KElementButton>()

    var onCancel: ((player: Player) -> Unit)? = null
}