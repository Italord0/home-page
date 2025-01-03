package com.github.italord0.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.github.italord0.data.Projects
import home_page.composeapp.generated.resources.Res
import home_page.composeapp.generated.resources.spacemono_bold
import home_page.composeapp.generated.resources.spacemono_regular
import org.jetbrains.compose.resources.Font

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun ProjectsSection() {
    val uriHandler = LocalUriHandler.current
    Column {
        FlowRow(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 32.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Column(modifier = Modifier.width(1200.dp)) {
                Text(
                    text = "Projects", style = TextStyle(
                        fontFamily = FontFamily(Font(Res.font.spacemono_bold)),
                        fontSize = 20.sp
                    )
                )
                Text(
                    text = "Each project is a unique piece of development \uD83E\uDDE9\n", style = TextStyle(
                        fontFamily = FontFamily(Font(Res.font.spacemono_regular)),
                        fontSize = 18.sp
                    )
                )
            }
        }
        FlowRow(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 32.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Projects.data.forEach { project ->
                ProjectCell(project) {
                    uriHandler.openUri(it)
                }
            }
        }
    }
}