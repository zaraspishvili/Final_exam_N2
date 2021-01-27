
import ge.edu.btu.Passenger;
import ge.edu.btu.Train;
import org.junit.Assert;
import org.junit.Test;

public class StationSquareTest {
    Train train = new Train();

    @Test
    public void trueticket() {
        Passenger passenger = new Passenger("Giorgi", true);
        train.addPassenger(passenger);
        Assert.assertEquals(true, train.getPassengerList().get(0).haveTicket());

    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void falseticket() {
        Passenger passenger = new Passenger("Nika", false);
        train.addPassenger(passenger);
        Assert.assertEquals(true, train.getPassengerList().get(0).haveTicket());

    }
}
