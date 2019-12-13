package kdo.one.kotlinlivedataexample.utils

import kdo.one.kotlinlivedataexample.data.FakeDatabase
import kdo.one.kotlinlivedataexample.data.QuoteRepository
import kdo.one.kotlinlivedataexample.ui.quotes.ViewModelFactory

object InjectorUtils {
    fun provideQuotesViewModelFactory(): ViewModelFactory {
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return ViewModelFactory(quoteRepository)
    }
}