package fr.sonique.composearch

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import fr.sonique.composearch.screen1.Screen1
import fr.sonique.composearch.screen1.Screen1ViewModel
import fr.sonique.composearch.screen2.Screen2
import fr.sonique.composearch.screen2.Screen2ViewModel
import fr.sonique.composearch.ui.navigation.EnterAnimation
import fr.sonique.composearch.ui.navigation.NavigationScreen
import fr.sonique.composearch.ui.theme.ComposeTheme

class MainActivity : ComponentActivity() {

    private val screen1ViewModel: Screen1ViewModel by viewModels()
    private val screen2ViewModel: Screen2ViewModel by viewModels()

    @ExperimentalAnimationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTheme {
                val navController = rememberNavController()

                NavHost(navController, startDestination = NavigationScreen.SCREEN_1.name) {
                    composable(NavigationScreen.SCREEN_1.name) {
                        EnterAnimation {
                            Screen1(navController, screen1ViewModel)
                        }
                    }

                    composable(NavigationScreen.SCREEN_2.name) {
                        EnterAnimation {
                            Screen2(navController, screen2ViewModel)
                        }
                    }
                }
            }
        }
    }
}

