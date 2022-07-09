package com.hcdisat.usaevents.domain

sealed class Results<out R> {
    data class SUCCESS<out T>(val data: T): Results<T>()
    data class ERROR(val throwable: Throwable): Results<Nothing>()
}
