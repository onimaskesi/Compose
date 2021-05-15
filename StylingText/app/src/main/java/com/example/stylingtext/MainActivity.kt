package com.example.stylingtext

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import com.example.stylingtext.ui.theme.StylingTextTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val fontFamily = FontFamily(
            Font(R.font.indie_flower_regular)
        )

        setContent {

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black)
            ){
                Text(
                    modifier = Modifier
                        .align(Alignment.TopCenter)
                        .padding(16.dp),
                    text = MyAnnotatedString("o ", "n ") +
                            MyAnnotatedString("i ", "m ") +
                            MyAnnotatedString("a ", "s ") +
                            MyAnnotatedString("k ", "e ") +
                            MyAnnotatedString("s ", "i ") ,
                    color = Color(0xFFCFFF04),
                    fontSize = 30.sp,
                    fontFamily = fontFamily
                )
                Text(
                    text = "Erdem Onat KIRAL"
                )
            }
        }
    }
}

fun MyAnnotatedString(string1 : String, string2 : String): AnnotatedString {
    return buildAnnotatedString {

        withStyle(
            style = SpanStyle(
                color = Color(0xFF39FF14),
                fontSize = 50.sp
            )
        ){
            append(string1)
        }
        append(string2)

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {

}