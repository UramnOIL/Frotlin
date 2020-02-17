package com.github.uramnoil.ktform.listener

import cn.nukkit.event.EventHandler
import cn.nukkit.event.Listener
import cn.nukkit.event.player.PlayerFormRespondedEvent
import com.github.uramnoil.ktform.element.KElementButton
import com.github.uramnoil.ktform.form.KFormWindowSimple

class KFormWindowRespondListener : Listener {
    @EventHandler
    fun onKFormWindowSimpleRespond(event: PlayerFormRespondedEvent) {
        val window = event.window
        if (window is KFormWindowSimple) window.run {
            if (response != null) onSubmit.invoke(event.player, window.response.clickedButton as KElementButton)
            else onCancel?.invoke(event.player)
        }
    }
}