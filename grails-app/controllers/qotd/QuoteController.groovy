package qotd

class QuoteController {
    def scaffold = true

    def quoteService

    def index() {
        redirect(action: random)
    }

    def random = {
        def randomQuote = quoteService.getRandomQuote()
        [quote: randomQuote]
    }

    def ajaxRandom = {
        def randomQuote = quoteService.getRandomQuote()
        render {
            q(randomQuote.content)
            p(randomQuote.author)
        }
    }

}
