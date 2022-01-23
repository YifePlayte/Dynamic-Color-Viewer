package com.yifeplayte.dynamiccolorviewer

import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.border
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.util.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier
                .fillMaxSize()) {
                ColorTable()
            }
        }
        window.decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR)
    }
}

@Composable
fun ColorCircle(color: Color, name: String, size: Dp = 55.dp) {
    Row(modifier = Modifier
        .fillMaxSize()
        .padding(8.dp)) {
        Canvas(modifier = Modifier
            .size(size)
            .border(1.5.dp, Color(0xff888888), CircleShape)) {
            drawCircle(color = color)
        }
        Column(modifier = Modifier.padding(start = 14.dp)) {
            ProvideTextStyle(value = TextStyle(color = if (isSystemInDarkTheme()) Color(0xffffffff) else Color(0xff000000))) {
                Text(text = name, fontSize = 25.sp)
                Text(text = "#"+ Integer.toHexString(color.toArgb()).uppercase(Locale.getDefault()), fontSize = 15.sp)
            }
        }
    }
}

@Composable
@RequiresApi(31)
fun ColorTable() {
    LazyColumn(modifier = Modifier
        .padding(start = 10.dp, end = 10.dp)
        .fillMaxSize()) {
        items(1){
            ColorCircle(color = colorResource(android.R.color.system_accent1_0), name = "system_accent1_0")
            ColorCircle(color = colorResource(android.R.color.system_accent1_10), name = "system_accent1_10")
            ColorCircle(color = colorResource(android.R.color.system_accent1_50), name = "system_accent1_50")
            ColorCircle(color = colorResource(android.R.color.system_accent1_100), name = "system_accent1_100")
            ColorCircle(color = colorResource(android.R.color.system_accent1_200), name = "system_accent1_200")
            ColorCircle(color = colorResource(android.R.color.system_accent1_300), name = "system_accent1_300")
            ColorCircle(color = colorResource(android.R.color.system_accent1_400), name = "system_accent1_400")
            ColorCircle(color = colorResource(android.R.color.system_accent1_500), name = "system_accent1_500")
            ColorCircle(color = colorResource(android.R.color.system_accent1_600), name = "system_accent1_600")
            ColorCircle(color = colorResource(android.R.color.system_accent1_700), name = "system_accent1_700")
            ColorCircle(color = colorResource(android.R.color.system_accent1_800), name = "system_accent1_800")
            ColorCircle(color = colorResource(android.R.color.system_accent1_900), name = "system_accent1_900")
            ColorCircle(color = colorResource(android.R.color.system_accent1_1000), name = "system_accent1_1000")
            ColorCircle(color = colorResource(android.R.color.system_accent2_0), name = "system_accent2_0")
            ColorCircle(color = colorResource(android.R.color.system_accent2_10), name = "system_accent2_10")
            ColorCircle(color = colorResource(android.R.color.system_accent2_50), name = "system_accent2_50")
            ColorCircle(color = colorResource(android.R.color.system_accent2_100), name = "system_accent2_100")
            ColorCircle(color = colorResource(android.R.color.system_accent2_200), name = "system_accent2_200")
            ColorCircle(color = colorResource(android.R.color.system_accent2_300), name = "system_accent2_300")
            ColorCircle(color = colorResource(android.R.color.system_accent2_400), name = "system_accent2_400")
            ColorCircle(color = colorResource(android.R.color.system_accent2_500), name = "system_accent2_500")
            ColorCircle(color = colorResource(android.R.color.system_accent2_600), name = "system_accent2_600")
            ColorCircle(color = colorResource(android.R.color.system_accent2_700), name = "system_accent2_700")
            ColorCircle(color = colorResource(android.R.color.system_accent2_800), name = "system_accent2_800")
            ColorCircle(color = colorResource(android.R.color.system_accent2_900), name = "system_accent2_900")
            ColorCircle(color = colorResource(android.R.color.system_accent2_1000), name = "system_accent2_1000")
            ColorCircle(color = colorResource(android.R.color.system_accent3_0), name = "system_accent3_0")
            ColorCircle(color = colorResource(android.R.color.system_accent3_10), name = "system_accent3_10")
            ColorCircle(color = colorResource(android.R.color.system_accent3_50), name = "system_accent3_50")
            ColorCircle(color = colorResource(android.R.color.system_accent3_100), name = "system_accent3_100")
            ColorCircle(color = colorResource(android.R.color.system_accent3_200), name = "system_accent3_200")
            ColorCircle(color = colorResource(android.R.color.system_accent3_300), name = "system_accent3_300")
            ColorCircle(color = colorResource(android.R.color.system_accent3_400), name = "system_accent3_400")
            ColorCircle(color = colorResource(android.R.color.system_accent3_500), name = "system_accent3_500")
            ColorCircle(color = colorResource(android.R.color.system_accent3_600), name = "system_accent3_600")
            ColorCircle(color = colorResource(android.R.color.system_accent3_700), name = "system_accent3_700")
            ColorCircle(color = colorResource(android.R.color.system_accent3_800), name = "system_accent3_800")
            ColorCircle(color = colorResource(android.R.color.system_accent3_900), name = "system_accent3_900")
            ColorCircle(color = colorResource(android.R.color.system_accent3_1000), name = "system_accent3_1000")
            ColorCircle(color = colorResource(android.R.color.system_neutral1_0), name = "system_neutral1_0")
            ColorCircle(color = colorResource(android.R.color.system_neutral1_10), name = "system_neutral1_10")
            ColorCircle(color = colorResource(android.R.color.system_neutral1_50), name = "system_neutral1_50")
            ColorCircle(color = colorResource(android.R.color.system_neutral1_100), name = "system_neutral1_100")
            ColorCircle(color = colorResource(android.R.color.system_neutral1_200), name = "system_neutral1_200")
            ColorCircle(color = colorResource(android.R.color.system_neutral1_300), name = "system_neutral1_300")
            ColorCircle(color = colorResource(android.R.color.system_neutral1_400), name = "system_neutral1_400")
            ColorCircle(color = colorResource(android.R.color.system_neutral1_500), name = "system_neutral1_500")
            ColorCircle(color = colorResource(android.R.color.system_neutral1_600), name = "system_neutral1_600")
            ColorCircle(color = colorResource(android.R.color.system_neutral1_700), name = "system_neutral1_700")
            ColorCircle(color = colorResource(android.R.color.system_neutral1_800), name = "system_neutral1_800")
            ColorCircle(color = colorResource(android.R.color.system_neutral1_900), name = "system_neutral1_900")
            ColorCircle(color = colorResource(android.R.color.system_neutral1_1000), name = "system_neutral1_1000")
            ColorCircle(color = colorResource(android.R.color.system_neutral2_0), name = "system_neutral2_0")
            ColorCircle(color = colorResource(android.R.color.system_neutral2_10), name = "system_neutral2_10")
            ColorCircle(color = colorResource(android.R.color.system_neutral2_50), name = "system_neutral2_50")
            ColorCircle(color = colorResource(android.R.color.system_neutral2_100), name = "system_neutral2_100")
            ColorCircle(color = colorResource(android.R.color.system_neutral2_200), name = "system_neutral2_200")
            ColorCircle(color = colorResource(android.R.color.system_neutral2_300), name = "system_neutral2_300")
            ColorCircle(color = colorResource(android.R.color.system_neutral2_400), name = "system_neutral2_400")
            ColorCircle(color = colorResource(android.R.color.system_neutral2_500), name = "system_neutral2_500")
            ColorCircle(color = colorResource(android.R.color.system_neutral2_600), name = "system_neutral2_600")
            ColorCircle(color = colorResource(android.R.color.system_neutral2_700), name = "system_neutral2_700")
            ColorCircle(color = colorResource(android.R.color.system_neutral2_800), name = "system_neutral2_800")
            ColorCircle(color = colorResource(android.R.color.system_neutral2_900), name = "system_neutral2_900")
            ColorCircle(color = colorResource(android.R.color.system_neutral2_1000), name = "system_neutral2_1000")
            Spacer(modifier = Modifier.height(10.dp))
        }
    }
}
