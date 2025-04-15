package com.in28minutes.microservices.currency_exchange_service.Repository;

import com.in28minutes.microservices.currency_exchange_service.Entity.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {

    CurrencyExchange findByFromAndTo(String from, String to);

}
