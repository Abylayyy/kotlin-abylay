package kdo.one.kotlinlivedataexample.data

data class Quotes(val quoteTxt: String, val author: String) {
    override fun toString(): String {
        return "$quoteTxt - $author"
    }
}