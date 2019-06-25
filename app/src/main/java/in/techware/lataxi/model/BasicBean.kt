package `in`.techware.lataxi.model


class BasicBean : BaseBean() {

    var id: String = ""
    var otpCode: String = ""
    var authToken: String = ""
    var requestStatus: Int = 0
    var isPhoneAvailable: Boolean = false
}
