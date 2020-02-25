package com.uramnoil.ktform.element

import cn.nukkit.form.element.ElementButton
import cn.nukkit.form.element.ElementButtonImageData

open class KElementButton : ElementButton {
    constructor(text: String) : super(text)
    constructor(text: String, image: ElementButtonImageData) : super(text, image)
}