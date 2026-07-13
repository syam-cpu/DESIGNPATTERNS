package ParkingLot.src.models.Pricing;

import ParkingLot.src.models.Tickets.Ticket;

public interface PricingStrategy {
    int calculateCost(Ticket ticket);
}
