package fr.sonique.composearch.screen1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
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
fun Screen1(navController: NavController, screen1ViewModel: Screen1ViewModel) {

    val title = screen1ViewModel.title.collectAsState(initial = "")

    Column(modifier = Modifier
        .fillMaxHeight()
        .background(Color.LightGray)) {
        MyScreenTitle(title = title.value)
//        Text(text = "Screen 1",
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(top = 16.dp, bottom = 16.dp),
//            textAlign = TextAlign.Center)

        NavigationButton(navController = navController, destination = NavigationScreen.SCREEN_2)
//        Button(onClick = {
//            Log.i(Screen.SCREEN_1.name, "Navigate to screen 2")
//            navController.navigate(Screen.SCREEN_2.name)
//        }, modifier = Modifier.fillMaxWidth()) {
//            Text(text = "Go to Screen 2")
//        }
    }
}

@Preview(showBackground = true)
@Composable
fun Screen1Preview() {
    ComposeTheme {
        val navController = rememberNavController()
        val screen1ViewModel = Screen1ViewModel()
        Screen1(navController, screen1ViewModel)
    }
}