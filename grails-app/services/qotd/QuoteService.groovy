package qotd

class QuoteService {

    def getStaticQuote(){
        return new Quote(author: "Anonymous", content: "Real Programmers Don't eat quiche")
    }

    def getRandomQuote = {
        def quoteList = Quote.list()
        def quoteListSize = quoteList.size()
        def randomQuote
        if (quoteListSize > 0) {
            def randomId = new Random().nextInt(quoteListSize)
            randomQuote = quoteList[randomId]
        } else {
            randomQuote = getStaticQuote()
        }
        [quote: randomQuote]
    }

    def serviceMethod() {

    }
}
