
import timber.log.Timber

class LoggerFactoryImpl: LoggerFactory {

	override fun create(tree: Timber.Tree): TimberLogger {
		return TimberLogger(tree)
	}
}