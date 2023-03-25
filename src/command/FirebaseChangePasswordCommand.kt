
import com.google.firebase.auth.FirebaseAuth
import com.viseven.teva.domain.reset_password.command.ChangePasswordCommand
import io.reactivex.functions.Action
import timber.log.Timber.d


class FirebaseChangePasswordCommand : ChangePasswordCommand {

	override fun change(newPassword: String, success: Action, error: Action) {
		FirebaseAuth
				.getInstance()
				.currentUser?.updatePassword(newPassword)?.addOnCompleteListener {
			if (it.isComplete) {
				success.run()
			} else {
				error.run()
			}
		}
	}
}