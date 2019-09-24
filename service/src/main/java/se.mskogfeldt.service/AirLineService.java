package se.mskogfeldt.service;

import se.mskogfeldt.domain.AirLine;

public interface AirLineService {

    String DEFAULT_BEAN_NAME = "airLineService";


    void createAirLine(AirLine airLine);
}
