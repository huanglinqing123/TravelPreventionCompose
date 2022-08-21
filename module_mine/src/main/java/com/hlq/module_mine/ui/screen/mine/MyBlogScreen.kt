package com.hlq.module_mine.ui.screen.mine

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.google.accompanist.web.WebView
import com.google.accompanist.web.rememberWebViewState
import com.hlq.module_mine.intent.MineAction
import com.hlq.module_mine.ui.theme.lightGray

/**
 * @author：HuangLinqing
 * @date ：2022/4/14
 * @desc：我的博客
 */
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MyBlog(mineAction: MineAction){
    Scaffold(backgroundColor = lightGray, topBar = {
        TopAppBar(
            title = {
                Text(
                    text = "我的博客",
                    fontSize = 16.sp,
                    style = TextStyle(textAlign = TextAlign.Center)
                )
            },
            navigationIcon = {
                Icon(
                    imageVector = Icons.Default.ArrowBack, contentDescription = null,
                    modifier = Modifier
                        .clickable(onClick = {
                            mineAction.back()
                        }, indication = null, interactionSource = remember {
                            MutableInteractionSource()
                        })

                )
            })
    }) {
        val state = rememberWebViewState("https://huanglinqing.blog.csdn.net/")
        WebView(state)
    }
}