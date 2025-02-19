package com.example.lemonade

import android.os.Bundle
import android.widget.Toolbar
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.luminance
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat
import com.example.lemonade.ui.theme.LemonadeTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContent {
            LemonadeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.primary
                ) {
                    SqueezTheLemon(modifier = Modifier)
                }
            }
        }
    }
}

@Composable
fun ActionBar(){

}

@Composable
fun SqueezTheLemon(modifier: Modifier = Modifier) {
    var count by remember {
        mutableStateOf(1)
    }

    val title = when(count){
        1-> "Tap on the lemon tree to select a lemon"
        2 -> "Keep tapping the lemon to squeeze it"
        3 -> "Tap the lemonade to drink it"
        else -> "Tap the empty glass to start again"
    }

    val srcs = when(count){
        1 -> R.drawable.lemon_tree
        2 -> R.drawable.lemon_squeeze
        3 -> R.drawable.lemon_drink
        else -> R.drawable.lemon_restart
    }

        Column(modifier = Modifier.fillMaxSize()) {
            Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
                .fillMaxWidth()
                .height(40.dp)
                .background(
                    color = colorResource(
                        id = R.color.teal_700
                    )
                ), verticalArrangement = Arrangement.Center) {
                Text(text = "Test", modifier = Modifier.align(alignment = Alignment.CenterHorizontally), textAlign = TextAlign.Center)
            }

            Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center,modifier = Modifier
                .fillMaxSize()
                .background(color = colorResource(id = R.color.white))) {
                Image(painter = painterResource(id = srcs), contentDescription = null,
                    Modifier
                        .width(150.dp)
                        .height(150.dp)
                        .clickable {
                            if (count == 4) {
                                count = 1
                            } else {
                                ++count
                            }
                        } )
                Spacer(modifier = Modifier.height(16.dp))
                Text(text = title)
            }
        }


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LemonadeTheme {
        SqueezTheLemon()
    }
}