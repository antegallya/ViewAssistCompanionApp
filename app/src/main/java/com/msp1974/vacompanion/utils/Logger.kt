package com.msp1974.vacompanion.utils

import timber.log.Timber

class Logger {
    companion object {
        const val TAG = "ViewAssistCA"
    }
    fun d(message: String) {
        Timber.tag(TAG).d(message)
    }
    fun e(message: String) {
        Timber.tag(TAG).e(message)
    }
    fun i(message: String) {
        Timber.tag(TAG).i(message)
    }
    fun w(message: String) {
        Timber.tag(TAG).w(message)
    }
}
