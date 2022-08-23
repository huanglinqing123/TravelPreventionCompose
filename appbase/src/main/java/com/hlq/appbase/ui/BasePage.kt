package com.hlq.appbase.ui

import androidx.compose.runtime.Composable
import com.hlq.appbase.state.BaseViewState

/**
 * @author：HuangLinqing
 * @date ：2022/4/14
 * @desc：基础页面 统一处理正在加载、加载成功 和失败的状态
 */
@Composable
fun BasePage(
    baseViewState: BaseViewState,
    onErrorClick: () -> Unit,
    content: @Composable () -> Unit
) {
    when (baseViewState) {
        BaseViewState.IsLoading -> {
            Loading()
        }
        is BaseViewState.LoadError -> {
            //加载失败的页面 处理为无网络请求
            ErrorContent(onErrorClick)
        }
        is BaseViewState.LoadSuccess<*> -> {
            //加载成功 显示正常数据
            content()
        }
        else -> {
            //
        }
    }

}