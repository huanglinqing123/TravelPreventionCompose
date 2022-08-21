package com.hlq.appbase.ui

import androidx.compose.animation.core.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hlq.appbase.R

/**
 * @author：HuangLinqing
 * @date ：2022/4/14
 * @desc：正在加载提示框
 */

@Composable
fun Loading() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(elevation = 10.dp) {

            val infiniteTransition = rememberInfiniteTransition()
            val rotate by infiniteTransition.animateFloat(
                initialValue = 0f,
                targetValue = 360f,
                animationSpec = infiniteRepeatable(
                    animation = tween(60, easing = LinearEasing),
                    repeatMode = RepeatMode.Restart
                )
            )
            Column(
                Modifier
                    .background(colorResource(id = R.color.loading_back))
                    .padding(20.dp)
            ) {
                Image(
                    painter = painterResource(id = R.mipmap.dialog_loading_img),
                    contentDescription = null,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                        .rotate(rotate)
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = stringResource(R.string.wait_please),
                    fontSize = 14.sp,
                    color = Color.White,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
            }
        }


    }
}


@Preview
@Composable
fun RedDotTest() {
    Loading()
}