package app.aaps.core.interfaces.rx.events

import android.content.Context

// pass string to startup wizard
abstract class EventStatus : Event() {

    abstract fun getStatus(context: Context): String
}