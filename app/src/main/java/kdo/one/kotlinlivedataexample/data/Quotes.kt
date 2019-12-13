package kdo.one.kotlinlivedataexample.data

data class Quotes(val quoteTxt: String, val author: String) {
    fun check(): Boolean {
        if (quoteTxt.length < 3) {
            return false
        } else if (author.length < 3) {
            return false
        }
        return true
    }
    override fun toString(): String {
        return "$quoteTxt - $author"
    }
}