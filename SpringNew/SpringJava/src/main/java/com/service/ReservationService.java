package com.service;

import java.util.List;

import com.beans.Reservation;

public interface ReservationService {

	List<Reservation> query(String courtName);

}
