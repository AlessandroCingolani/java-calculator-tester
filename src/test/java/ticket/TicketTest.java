package ticket;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {


    @Test
    void getPriceTicket() {
        Ticket ticket1 = new Ticket(12,100);
        assertEquals(16.8, ticket1.getPriceTicket());
        Ticket ticket2 = new Ticket(20,100);
        assertEquals(21.0, ticket2.getPriceTicket());
        Ticket ticket3 = new Ticket(66,100);
        assertEquals(12.6, ticket3.getPriceTicket());
    }
}