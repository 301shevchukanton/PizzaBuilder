import com.google.android.gms.tasks.Task
import io.reactivex.Single
import io.reactivex.functions.Action

interface ChangePasswordCommand {
	fun change(newPassword: String, success: Action, error: Action)
}