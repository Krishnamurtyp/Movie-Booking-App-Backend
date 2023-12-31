package com.example.demo.service;

import com.example.demo.model.Ticket;

import java.util.List;
import java.util.Set;

public interface TicketService {

    public Set<Ticket> getAllBooking(int movieId);

    public boolean BookMovie(Ticket ticket);

    public boolean deleteBooking(int movieId);

    public List<Ticket> getMovieBookingByName(String username);

    public int deleteBookingByTransactionID(int transactionId);
}
