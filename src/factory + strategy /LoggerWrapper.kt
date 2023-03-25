package com.strato.hidrive.logger

import com.strato.hidrive.domain.logger.Logger
import com.strato.hidrive.domain.logger.LoggerUtil
import javax.inject.Inject

class LoggerWrapper @Inject constructor() : Logger {

	override fun logD(tag: String, message: String) {
		LoggerUtil.logD(tag, message)
	}

	override fun logD(message: String?, t: Throwable?) {
		LoggerUtil.logD(message ?: "", t)
	}

	override fun logI(tag: String, message: String) {
		LoggerUtil.logI(tag, message)
	}

	override fun logW(message: String?, t: Throwable?) {
		LoggerUtil.logW(message ?: "", t)
	}

	override fun logW(tag: String, message: String) {
		LoggerUtil.logW(tag, message)
	}

	override fun logE(message: String?, t: Throwable?) {
		LoggerUtil.logE(message ?: "", t)
	}

	override fun logE(tag: String, message: String) {
		LoggerUtil.logE(tag, message)
	}

}