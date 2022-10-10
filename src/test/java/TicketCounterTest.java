import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;

public class TicketCounterTest {

    @Test
    public void shouldReturnTicket(){
        TicketCounter ticketCounter = new TicketCounter();
        Ticket ticket = ticketCounter.getTicket( "red", "MH5H1001");
        assertNull(ticket);
    }


}
