import org.junit.Assert;
import org.junit.Test;

public class InvoiceServiceTest {

    @Test
    public void givenDistanceAndTime_GeneratorShouldReturn_TotalFareForNormalRide() {
        double distance = 2.0;
        int time = 5;
        InvoiceService cabInvoiceGenerator = new InvoiceService(TypesOfCabs.NORMAL_RIDES);
        double fare = cabInvoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(25, fare, 0.0);
    }

    @Test
    public void givenDistanceAndTime_GeneratorShouldReturn_MinimumFareForNormalRide() {
        double distance = 0.1;
        int time = 1;
        InvoiceService cabInvoiceGenerator = new InvoiceService(TypesOfCabs.NORMAL_RIDES);
        double fare = cabInvoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(5, fare, 0.0);
    }

    @Test
    public void givenMultipleRides_ShouldReturn_TotalRide() {
        InvoiceService cabInvoiceGenerator = new InvoiceService(TypesOfCabs.NORMAL_RIDES);
        Rides[] rides = {new Rides(2.0, 5),
                new Rides(0.1, 1)};
        double[] result = cabInvoiceGenerator.calculateFare(rides);
        Assert.assertEquals(2, result[0], 0.0);
    }

    @Test
    public void givenMultipleRides_ShouldReturn_TotalFareRide() {
        InvoiceService cabInvoiceGenerator = new InvoiceService(TypesOfCabs.NORMAL_RIDES);
        Rides[] rides = {new Rides(2.0, 5),
                new Rides(0.1, 1)};
        double[] result = cabInvoiceGenerator.calculateFare(rides);
        Assert.assertEquals(30.0, result[1], 0.0);
    }

    @Test
    public void givenMultipleRides_ShouldReturn_TotalAggregateOfRide() {
        InvoiceService cabInvoiceGenerator = new InvoiceService(TypesOfCabs.NORMAL_RIDES);
        Rides[] rides = {new Rides(2.0, 5),
                         new Rides(0.1, 1)};
        double[] result = cabInvoiceGenerator.calculateFare(rides);
        Assert.assertEquals(15.0, result[2], 0.0);
    }

    @Test
    public void givenDistanceAndTime_GeneratorShouldReturn_TotalFareForPrimeRide() {
        double distance = 2.0;
        int time = 5;
        InvoiceService cabInvoiceGenerator = new InvoiceService(TypesOfCabs.PREMIUM_RIDES);
        double fare = cabInvoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(40, fare, 0.0);
    }

    @Test
    public void givenDistanceAndTime_GeneratorShouldReturn_MinimumForPrimeRide() {
        double distance = 0.1;
        int time = 1;
        InvoiceService cabInvoiceGenerator = new InvoiceService(TypesOfCabs.PREMIUM_RIDES);
        double fare = cabInvoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(20, fare, 0.0);
    }

    @Test
    public void givenMultipleRides_ShouldReturn_TotalPremiumRide() {
        InvoiceService cabInvoiceGenerator = new InvoiceService(TypesOfCabs.PREMIUM_RIDES);
        Rides[] rides = {new Rides(2.0, 5),
                new Rides(0.1, 1)};
        double[] result = cabInvoiceGenerator.calculateFare(rides);
        Assert.assertEquals(2, result[0], 0.0);
    }

    @Test
    public void givenMultipleRides_ShouldReturn_TotalFareOfPremiumRide() {
        InvoiceService cabInvoiceGenerator = new InvoiceService(TypesOfCabs.PREMIUM_RIDES);
        Rides[] rides = {new Rides(2.0, 5),
                new Rides(0.1, 1)};
        double[] result = cabInvoiceGenerator.calculateFare(rides);
        Assert.assertEquals(60.0, result[1], 0.0);
    }

    @Test
    public void givenMultipleRides_ShouldReturn_TotalAggregateOfPrimeRide() {
        InvoiceService cabInvoiceGenerator = new InvoiceService(TypesOfCabs.PREMIUM_RIDES);
        Rides[] rides = {new Rides(2.0, 5),
                new Rides(0.1, 1)};
        double[] result = cabInvoiceGenerator.calculateFare(rides);
        Assert.assertEquals(30.0, result[2], 0.0);
    }

}
