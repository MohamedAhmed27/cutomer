package `in`.techware.lataxi.model

class TripListBean : BaseBean() {

    var pagination: PaginationBean = PaginationBean()
    var trips: List<TripBean> = ArrayList()

}
