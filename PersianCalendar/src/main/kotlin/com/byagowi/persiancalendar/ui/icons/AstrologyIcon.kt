package com.byagowi.persiancalendar.ui.icons

import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

val AstrologyIcon by lazy(LazyThreadSafetyMode.NONE) {
    makeIconFromPath(
        // CC-by-SA 4.0, https://commons.wikimedia.org/wiki/File:Horoscope_Astrology_Icon.svg
        path = "m120,75c-25,0 -45,20 -45,45 0,25 20,45 45,45 25,0 45,-20 45,-45 0,-2 -0.2,-5 -0.5,-7 -5,7 -13,11 -22,11 -15,0 -27,-12 -27,-27 0,-9 4,-17 11,-22 -2,-0.3 -4,-0.5 -7,-0.5m62,107c2,-2 2,-5 0,-7l-14,-14c-2,-2 -5,-2 -7,0 -2,2 -2,5 0,7l14,14c1,1 2,1 4,1s3,-0.5 4,-1m-57,20v-20c0,-3 -2,-5 -5,-5 -3,0 -5,2 -5,5v20c0,3 2,5 5,5 3,0 5,-2 5,-5m-60,-20 l14,-14c2,-2 2,-5 0.01,-7 -2,-2 -5,-2 -7,-0.02l-14,14c-2,2 -2,5 -0.01,7 1,1 2,1 4,1s3,-0.5 4,-1m-2,-62c0,-3 -2,-5 -5,-5h-20c-3,0 -5,2 -5,5s2,5 5,5h20c3,0 5,-2 5,-5m17,-41c2,-2 2,-5 -0.01,-7l-14,-14c-2,-2 -5,-2 -7,0.01 -2,2 -2,5 0.01,7l14,14c1,1 2,1 4,1s3,-0.5 4,-1m46,-22v-20c0,-3 -2,-5 -5,-5 -3,0 -5,2 -5,5v20c0,3 2,5 5,5 3,0 5,-2 5,-5m43,22 l14,-14c2,-2 2,-5 0,-7 -2,-2 -5,-2 -7,0l-14,14c-2,2 -2,5 0,7 1,1 2,1 4,1 1,0 3,-0.5 4,-1m39,41c0,-3 -2,-5 -5,-5h-20c-3,0 -5,2 -5,5s2,5 5,5h20c3,0 5,-2 5,-5m-87,-100c55,0 100,45 100,100 0,55 -45,100 -100,100 -55,0 -100,-45 -100,-100 0,-55 45,-100 100,-100",
        viewportWidth = 240f,
        viewportHeight = 240f,
    )
}

@Preview
@Composable
fun AstrologyIconPreview() = Icon(AstrologyIcon, null, tint = Color.Gray)
