@file:JsModule("@tarojs/taro")
@file:JsNonModule

package taro.taro.navigation

external interface RouterInfo {
    val params: dynamic

    val path: String
    val onReady: String
    val onHide: String
    val onShow: String

    val shareTicket: String?
    val scene: Int?
}

external interface Current {
    val router: RouterInfo?

    val onReady: String
    val onHide: String
    val onShow: String
}

@JsName("getCurrentInstance")
external fun getCurrentInstance(): Current


