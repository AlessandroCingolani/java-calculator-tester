package ticket;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {


    @Test
    void getPriceTicket() {
        Ticket ticket = new Ticket(16,100);
        assertEquals(16.8, ticket.getPriceTicket());
    }
}