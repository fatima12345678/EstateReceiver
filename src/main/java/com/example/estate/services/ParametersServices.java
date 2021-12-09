package com.example.estate.services;


import com.example.estate.domain.Parameters;

import java.util.List;

public interface ParametersServices {
    Parameters findbyname(String name);
    List<Parameters>getAllParamter();
    Parameters SaveParameter(Parameters parameters);
    void DeleteParameter(Long id);
    Parameters FindParameter(long id);;
}
