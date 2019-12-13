package kdo.one.kotlinlivedataexample.ui.quotes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import kdo.one.kotlinlivedataexample.callback.QuoteView
import kdo.one.kotlinlivedataexample.data.QuoteRepository

@Suppress("UNCHECKED_CAST")
class ViewModelFactory(private val quoteRepository: QuoteRepository, private val view: QuoteView): ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return QuotesViewModel(quoteRepository, view) as T
    }
}