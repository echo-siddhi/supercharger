package `in`.technowolf.supercharger

import android.text.TextUtils
import android.util.Log

class Log {

    companion object {

        // Just android.util.Log.d(tag: String, msg: String) but it spawns tag automatically for you
        fun d(message: String) {
            Log.d(spawnTag(), message)
        }

        fun d(tag: String, message: String) {
            Log.d(spawnTag(), message)
        }

        fun d(message: String, throwable: Throwable) {
            Log.d(spawnTag(), message, throwable)
        }

        fun d(tag: String, message: String, throwable: Throwable) {
            Log.d(spawnTag(), message, throwable)
        }

        // TODO: add more methods for rest of the scopes.

        // Spawns tag
        private fun spawnTag(): String {
            val tracerElem = Thread.currentThread().stackTrace[4]

            return spawnFileName(tracerElem.fileName) + "." + tracerElem.methodName
        }

        // Spawns file name
        private fun spawnFileName(fileName: String?): String? {
            return if (fileName == null || TextUtils.isEmpty(fileName) || !fileName.contains(".")) fileName else fileName.substring(
                0,
                fileName.lastIndexOf(".")
            )
        }

    }
}
