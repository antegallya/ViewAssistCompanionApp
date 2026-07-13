package com.msp1974.vacompanion.utils

import android.content.Context
import android.os.Bundle
import timber.log.Timber

class FirebaseManager private constructor(context: Context? = null) {

    companion object {
        @Volatile
        private var instance: FirebaseManager? = null

        fun getInstance(context: Context? = null): FirebaseManager {
            return instance ?: synchronized(this) {
                instance ?: FirebaseManager(context).also { instance = it }
            }
        }

        const val DIAGNOSTIC_POPUP_SHOWN = "diagnostic_popup_shown"
        const val WAKE_WORD_DETECTED = "wake_word_detected"
        const val SATELLITE_ALREADY_RUNNING_MAIN = "satellite_already_running_main"
        const val RENDER_PROCESS_KILLED = "render_process_killed"
        const val RENDER_PROCESS_CRASHED = "render_process_crashed"
        const val MAIN_ACTIVITY_BACKGROUND_TASK_ALREADY_RUNNING = "main_background_task_already_running"
        const val TRIM_MEMORY_UI_HIDDEN = "trim_memory_ui_hidden"
        const val TRIM_MEMORY_BACKGROUND = "trim_memory_background"
        const val LOST_NETWORK = "lost_network"

        const val TAG = Logger.TAG + "Firebase unavailable"
    }

    fun setCustomKeys(keys: Map<String, Any>) {
        Timber.tag(TAG).i("setCustomKeys: $keys")
    }
    fun logEvent(event: String, params: Map<String, String>) {
        Timber.tag(TAG).i("logEvent: $event, params: $params")
    }
    fun setUserProperty(key: String, value: String) {
        Timber.tag(TAG).i("setUserProperty: $key=$value")
    }
    fun addToCrashLog(message: String) {
        Timber.tag(TAG).i("addToCrashLog: $message")
    }
    fun logException(exception: Exception) {
        Timber.tag(TAG).i("logException: ${exception.message}", exception)
    }
}
