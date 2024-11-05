package com.demo.Airline_Reservation_System;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.demo.Airline_Reservation.entities.AirLine;
import com.demo.Airline_Reservation.entities.Booking;
import com.demo.Airline_Reservation.entities.Customer;
import com.demo.Airline_Reservation.entities.Payment;
import com.demo.Airline_Reservation.entities.Ticket;

public class HibernetUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            return new Configuration()
                    .configure() // This loads hibernate.cfg.xml from resources
                    .addAnnotatedClass(Customer.class)
                    .addAnnotatedClass(Booking.class)
                    .addAnnotatedClass(AirLine.class)
                    .addAnnotatedClass(Payment.class)
                    .addAnnotatedClass(Ticket.class)
                    .buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
