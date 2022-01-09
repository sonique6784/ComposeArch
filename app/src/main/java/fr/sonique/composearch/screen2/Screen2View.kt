package fr.sonique.composearch.screen2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import fr.sonique.composearch.ui.common.MyScreenTitle
import fr.sonique.composearch.ui.common.NavigationButton
import fr.sonique.composearch.ui.navigation.NavigationScreen
import fr.sonique.composearch.ui.theme.ComposeTheme

@Composable
fun Screen2(navController: NavController, screen2ViewModel: Screen2ViewModel) {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .background(Color.LightGray),
        verticalArrangement = Arrangement.Bottom
    ) {
        NavigationButton(navController, NavigationScreen.SCREEN_1)
    }
    Column(
        modifier = Modifier.fillMaxHeight(),
        verticalArrangement = Arrangement.Top
    ) {
        MyScreenTitle(title = "Screen 2")
    }
}

@Preview(showBackground = true)
@Composable
fun Screen2Preview() {
    ComposeTheme {
        val navController = rememberNavController()
        val screen2ViewModel = Screen2ViewModel()

        Screen2(navController, screen2ViewModel)
    }
}