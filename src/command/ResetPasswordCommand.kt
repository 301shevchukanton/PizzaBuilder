
interface ResetPasswordCommand {
	fun reset(login: String): Single<Any>
}