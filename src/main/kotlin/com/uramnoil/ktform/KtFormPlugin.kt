package com.uramnoil.ktform

import cn.nukkit.plugin.PluginBase
import com.uramnoil.ktform.listener.KFormWindowRespondListener

class KtFormPlugin : PluginBase() {
    override fun onEnable() {
        server.pluginManager.registerEvents(KFormWindowRespondListener(), this)
    }
}