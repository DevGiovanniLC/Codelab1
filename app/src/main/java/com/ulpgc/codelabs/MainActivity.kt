package com.ulpgc.codelabs

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ulpgc.codelabs.ui.theme.CodelabsTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CodelabsTheme {
                MainFrame()
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun MainFrame(){
    Surface(color = Color(0xffbfffd4)) {
        Column(Modifier.fillMaxSize(), Arrangement.Center, Alignment.CenterHorizontally) {
            Presenter()
            Contact()
        }
    }
}


@Composable
fun Presenter(){
    Column(modifier = Modifier.padding(20.dp), Arrangement.spacedBy(10.dp), Alignment.CenterHorizontally) {
        val image = painterResource(R.drawable.android_logo)
        Image(
            painter = image,
            contentDescription = null,
            Modifier.scale(0.6F),
            Alignment.Center
        )
        Text("Giovanni León Corujo", fontSize = 30.sp)
        Text("Desarrollador Android", fontSize = 16.sp,fontStyle = FontStyle.Italic)
    }
}

@Composable
fun Contact(){
    Column(Modifier.padding(30.dp), Arrangement.spacedBy(10.dp)){
        Text("☏   +45 622784513", fontSize = 16.sp)
        Text("☑   @ULPGC", fontSize = 16.sp)
        Text("✉   giovanni.leon101@alu.ulpgc.es", fontSize = 16.sp)
    }
}
