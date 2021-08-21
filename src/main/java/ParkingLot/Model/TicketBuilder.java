package ParkingLot.Model;

import ParkingLot.ParkingSlot;

public class TicketBuilder {
    private ParkingSlot parkingSlot;
    private Vehicle vehicle;
    private long startTime;
    private String ticketNumber;

    static TicketBuilder builder() {
        return new TicketBuilder();
    }

    public TicketBuilder parkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
        return this;
    }

    public TicketBuilder vehicle(Vehicle vehicle){
        this.vehicle = vehicle;
        return this;
    }


    public TicketBuilder startTime(long currentTimeMillis) {
        this.startTime = currentTimeMillis;
        return this;
    }

    public TicketBuilder ticketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
        return this;
    }

    public Ticket build() {
        Ticket ticket = new Ticket();
        ticket.setStartTime(startTime);
        ticket.setVehicle(vehicle);
        ticket.setParkingSlot(parkingSlot);
        ticket.setTicketNumber(ticketNumber);
        return ticket;
    }
}
