import Versions.compose_activity_version
import Versions.compose_navigation_version
import Versions.compose_version
import Versions.compose_viewmodel_version
import Versions.compose_webview_version
import Versions.lifecycle_version
import Versions.lifecylektx_version
import Versions.systemuicontroller_version

/**
 * @author：HuangLinqing
 * @date ：2022/4/11
 * @desc：版本管理
 */
object Versions {
    const val compileSdk = 31
    const val minSdk = 25
    const val targetSdk = 31

    const val systemuicontroller_version = "0.23.1"
    const val compose_version = "1.1.1"
    const val lifecylektx_version = "2.4.0"
    const val compose_activity_version = "1.4.0"
    const val compose_navigation_version = "2.4.1"

    const val retrofit_version = "2.9.0"
    const val logging_interceptor_version = "4.7.2"
    const val coroutines_version = "1.4.1"
    const val compose_viewmodel_version = "2.4.1"
    const val lifecycle_version = "2.3.1"

    const val compose_webview_version = "0.24.1-alpha"
}

object Libs {
    //系统栏控制
    const val systemuicontroller =
        "com.google.accompanist:accompanist-systemuicontroller:${systemuicontroller_version}"

    //compose相关
    const val composeUi = "androidx.compose.ui:ui:$compose_version"
    const val material = "androidx.compose.material:material:$compose_version"
    const val uitooling = "androidx.compose.ui:ui-tooling-preview:$compose_version"
    const val lifecyclektx = "androidx.lifecycle:lifecycle-runtime-ktx:$lifecylektx_version"
    const val compose_activity = "androidx.activity:activity-compose:$compose_activity_version"
    const val compose_navigation =
        "androidx.navigation:navigation-compose:$compose_navigation_version"
    const val compose_viewmodel =
        "androidx.lifecycle:lifecycle-viewmodel-compose:$compose_viewmodel_version"
    const val livedata_ktx =
        "androidx.lifecycle:lifecycle-livedata-ktx:${lifecycle_version}"
    const val compose_livedata = "androidx.compose.runtime:runtime-livedata:$compose_version"
    const val viewmodel_ktx =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${lifecycle_version}"

    //网络请求相关
    const val retofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit_version}"
    const val converter_gson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit_version}"
    const val logging_interceptor =
        "com.squareup.okhttp3:logging-interceptor:${Versions.logging_interceptor_version}"
    const val coroutines =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines_version}"
    const val coroutines_android =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines_version}"

    //webview
    const val compose_webview =
        "com.google.accompanist:accompanist-webview:$compose_webview_version"
}