package io.ditclear.app.partial

import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableField

class PartialItemViewModel constructor(val data: String) {

    val count = ObservableField<String>(data)

    val liked = ObservableBoolean()

    val test = "1"

    fun toggle() {
        liked.set(!liked.get())

        count.set("$data ${if (liked.get()) "liked" else ""}")
    }
}

class PartialItem constructor(private val data: String) {

    var count = data

    var liked = false

    fun chageData() {
        liked = !liked

        count = "$data ${if (liked) "liked" else ""}"
    }
}