
class FirebaseResetPasswordCommand : ResetPasswordCommand {

	override fun reset(login: String): Single<Any> =
			FirebaseAuth
					.getInstance()
					.sendPasswordResetEmailAsync(login)
}