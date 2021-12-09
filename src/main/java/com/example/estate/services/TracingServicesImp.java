package com.example.estate.services;

import com.example.estate.domain.Tracing;
import com.example.estate.repository.TracingRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service @Slf4j
public class TracingServicesImp implements TracingServices {
    @Autowired
    TracingRepository tracingRepository;

    @Override
    public Tracing save(Tracing tracing) {

        return tracingRepository.save(tracing);
    }

    @Override
    public Tracing find(long id) {
        log.info("find tracing {}",tracingRepository.findById(id).get());
           return tracingRepository.findById(id).get();
    }
}
