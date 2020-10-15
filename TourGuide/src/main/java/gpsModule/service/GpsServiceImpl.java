package gpsModule.service;

import gpsUtil.GpsUtil;
import gpsUtil.location.Attraction;
import gpsUtil.location.VisitedLocation;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Class in charge of managing the services for the GPS service.
 */
@Service
public class GpsServiceImpl implements IGpsService {

    private final GpsUtil gpsUtil;

    public GpsServiceImpl(GpsUtil gpsUtil) {
        this.gpsUtil = gpsUtil;
    }

    /**
     * Return the current visited location of a user.
     *
     * @param userId The id of the user
     * @return The current visited location of the user
     */
    @Override
    public VisitedLocation getUserLocation(UUID userId){
        VisitedLocation visitedLocation = gpsUtil.getUserLocation(userId);
        return visitedLocation;
    }

    /**
     * Return the list of all attractions.
     *
     * @return The list of all attractions
     */
    @Override
    public List<Attraction> getAttractions() {
        List<Attraction> allAttractions = gpsUtil.getAttractions();
        return allAttractions;
    }
}
