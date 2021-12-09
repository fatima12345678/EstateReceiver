package com.example.estate.services;

import com.example.estate.domain.Tracing;

public interface TracingServices {

    Tracing save(Tracing tracing);
    Tracing find(long id);
}
