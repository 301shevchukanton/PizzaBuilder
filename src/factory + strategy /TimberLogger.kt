import timber.log.Timber

class TimberLogger constructor(tree: Timber.Tree) : Logger {

	init {
		Timber.plant(tree)
	}

	override fun logD(tag: String, message: String) {
		Timber.d("%s %s", tag, message)
	}

	override fun logD(message: String?, t: Throwable?) {
		Timber.d(t, message)
	}

	override fun logI(tag: String, message: String) {
		Timber.i("%s %s", tag, message)
	}

	override fun logW(tag: String, message: String) {
		Timber.w("%s %s", tag, message)
	}

	override fun logW(message: String?, t: Throwable?) {
		Timber.w(t, message)
	}

	override fun logE(message: String?, t: Throwable?) {
		Timber.e(t, message)
	}

	override fun logE(tag: String, message: String) {
		Timber.e("%s %s", tag, message)
	}
}