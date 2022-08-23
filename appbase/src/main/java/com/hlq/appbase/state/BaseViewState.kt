package com.hlq.appbase.state

/**
 * @author：HuangLinqing
 * @date ：2022/4/14
 * @desc：基类状态密封类
 */
sealed class BaseViewState {

    /**
     * 默认状态 需要加载等
     */
    object Default : BaseViewState()

    /**
     * 正在加载
     */
    object IsLoading : BaseViewState()

    /**
     * 加载成功
     * @param data 加载成功返回的数据
     */
    data class LoadSuccess<T>(val data: T) : BaseViewState()

    /**
     * 加载失败
     * @param e 加载失败的信息
     */
    data class LoadError(val e: String) : BaseViewState()
}
