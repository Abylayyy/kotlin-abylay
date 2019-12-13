package kdo.one.kotlinlivedataexample.ui.quotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import kdo.one.kotlinlivedataexample.R
import kdo.one.kotlinlivedataexample.callback.QuoteView
import kdo.one.kotlinlivedataexample.data.Quotes
import kdo.one.kotlinlivedataexample.utils.InjectorUtils
import kotlinx.android.synthetic.main.activity_quotes.*
import java.lang.StringBuilder

class QuotesActivity : AppCompatActivity(), QuoteView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quotes)
        initializeUi()
    }

    private fun initializeUi() {
        val factory = InjectorUtils.provideQuotesViewModelFactory(this)
        val viewModel = ViewModelProviders.of(this, factory).get(QuotesViewModel::class.java)

        viewModel.getQuotes().observe(this, Observer { quotes ->
            val builder = StringBuilder()
            quotes.forEach { quote ->
                builder.append("$quote\n\n")
            }
            tvQuote.text = builder.toString()
        })

        quoteBtn.setOnClickListener {
            val quote = Quotes(etQuote.text.toString().trim(), etAuthor.text.toString().trim())
            viewModel.addQuote(quote)
        }
    }

    override fun onError(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
