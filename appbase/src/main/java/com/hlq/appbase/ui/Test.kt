package com.hlq.appbase.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * @author：HuangLinqing
 * @date ：2022/4/18
 * @desc：
 */
@Composable
fun oneTest() {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Black)) {
        val modi = Modifier.padding(start = 10.dp)
        Text(text = "我是文字1",
            Modifier
                .background(Color.Red)
                .then(modi))
        Text(
            text = "我是文字2",
            Modifier
                .background(Color.Blue)
                .then(modi)
        )
        Text(
            text = "我是文字3",
            Modifier
                .background(Color.Green)
                .then(modi)
        )
    }
}

@Preview
@Composable
fun Testshow() {
    oneTest()
}