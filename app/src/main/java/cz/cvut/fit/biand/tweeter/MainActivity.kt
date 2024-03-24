package cz.cvut.fit.biand.tweeter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import cz.cvut.fit.biand.tweeter.ui.screen.HomeScreen
import cz.cvut.fit.biand.tweeter.ui.theme.TweeterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TweeterTheme {
                HomeScreen()
            }
        }
    }

}