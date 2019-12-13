package kdo.one.kotlinlivedataexample.ui.quotes

import android.widget.Toast
import androidx.lifecycle.ViewModel
import kdo.one.kotlinlivedataexample.callback.QuoteView
import kdo.one.kotlinlivedataexample.data.QuoteRepository
import kdo.one.kotlinlivedataexample.data.Quotes

class QuotesViewModel(private val quotesRepository: QuoteRepository, private val view: QuoteView): ViewModel() {
    fun getQuotes() = quotesRepository.getQuotes()
    fun addQuote(quotes: Quotes) {
        if (quotes.check()) {
            quotesRepository.addQuote(quotes)
        } else {
            view.onError("All fields must be filled!!!")
        }
    }
}