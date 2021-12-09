package com.example.estate.services;

import com.example.estate.domain.EstateModel;

import java.util.List;

public interface EstateServices {
    List<EstateModel> getAllEstate();
    EstateModel SaveEstate(EstateModel estates);
    void DeletEstate(long id);
    EstateModel FindEstate(long id);
    List<EstateModel> EstateIsntSale();

}
