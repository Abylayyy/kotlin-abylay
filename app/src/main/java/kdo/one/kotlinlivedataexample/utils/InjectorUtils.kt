package kdo.one.kotlinlivedataexample.utils

import kdo.one.kotlinlivedataexample.callback.QuoteView
import kdo.one.kotlinlivedataexample.data.FakeDatabase
import kdo.one.kotlinlivedataexample.data.QuoteRepository
import kdo.one.kotlinlivedataexample.ui.quotes.ViewModelFactory

object InjectorUtils {
    fun provideQuotesViewModelFactory(view: QuoteView): ViewModelFactory {
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return ViewModelFactory(quoteRepository, view)
    }
}