package kdo.one.kotlinlivedataexample.ui.quotes

import androidx.lifecycle.ViewModel
import kdo.one.kotlinlivedataexample.data.QuoteRepository
import kdo.one.kotlinlivedataexample.data.Quotes

class QuotesViewModel(private val quotesRepository: QuoteRepository): ViewModel() {
    fun getQuotes() = quotesRepository.getQuotes()
    fun addQuote(quotes: Quotes) = quotesRepository.addQuote(quotes)
}