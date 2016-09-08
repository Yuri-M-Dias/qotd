package qotd

import static org.junit.Assert.*
import org.junit.*

class QuoteServiceIntegrationTests {

    def quoteService

    @Before
    void setUp() {
        // Setup logic here
    }

    @After
    void tearDown() {
        // Tear down logic here
    }

    @Test
    void testStationQuote(){
        def staticQuote = quoteService.getStaticQuote()
        assertEquals("Anonymous", staticQuote.author)
        assertEquals("Real Programmers Don't eat quiche", staticQuote.content)
    }

}
