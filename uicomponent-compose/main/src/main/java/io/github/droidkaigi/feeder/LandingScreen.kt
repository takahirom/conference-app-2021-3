package io.github.droidkaigi.feeder

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import io.github.droidkaigi.feeder.main.R
import kotlinx.coroutines.delay

private const val SplashWaitTime: Long = 2000

@Composable
fun LandingScreen(modifier: Modifier = Modifier, onTimeout: () -> Unit) {
    Box(modifier = modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        // FIXME Deprecated
        LaunchedEffect(Unit) {
            delay(SplashWaitTime)
            onTimeout()
        }
        Image(
            bitmap = ImageBitmap.imageResource(id = R.drawable.ic_logo_big),
            contentDescription = "landing",
            modifier = Modifier.fillMaxSize(0.5F)
        )
    }
}
