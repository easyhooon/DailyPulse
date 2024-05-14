import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.CanvasBasedWindow
import com.easyhooon.dailypulse.di.initKoin
import com.easyhooon.dailypulse.ui.App

val koin = initKoin()

@OptIn(ExperimentalComposeUiApi::class)
fun main() {

    CanvasBasedWindow("DailyPulse") {

        Surface(modifier = Modifier.fillMaxSize()) {
            App(koin)
        }
    }
}