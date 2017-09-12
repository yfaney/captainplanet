package com.yfaney.captainplanet.models;

import com.yfaney.captainplanet.models.parts.powertrain.Brake;
import com.yfaney.captainplanet.models.parts.powertrain.Engine;
import com.yfaney.captainplanet.models.parts.powertrain.PowerSource;
import com.yfaney.captainplanet.models.parts.powertrain.Transmission;
import com.yfaney.captainplanet.models.parts.powertrain.Wheel;
import com.yfaney.captainplanet.models.specs.Location;

import java.util.Map;

/**
 * Created by yfaney on 9/12/17.
 */

public class Car {
    private Map<Location, Engine> engines;
    private Map<Location, Transmission> transmissions;
    private Map<Location, Brake> brakes;
    private Map<Location, Wheel> wheels;
    private Map<Location, PowerSource> powersources;
}
