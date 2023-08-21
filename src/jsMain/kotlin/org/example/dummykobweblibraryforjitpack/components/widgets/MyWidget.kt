package org.example.dummykobweblibraryforjitpack.components.widgets

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.BoxScope
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.minSize
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.base
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.css.px

val MyWidgetStyle by ComponentStyle.base {
    Modifier
        .minSize(100.px)
        .fillMaxSize()
        .backgroundColor(Colors.Magenta)
}

@Composable
fun MyWidget(modifier: Modifier = Modifier, content: @Composable BoxScope.() -> Unit) {
    Box(MyWidgetStyle.toModifier().then(modifier), content = content)
}
