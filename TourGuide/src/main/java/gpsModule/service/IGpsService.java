package gpsModule.service;

import gpsUtil.location.Attraction;
import gpsUtil.location.VisitedLocation;

import java.util.List;
import java.util.UUID;

/**
 * Interface to be implemented for managing the services for the GPS service.
 */
public interface IGpsService {

    /**
     * Return the current visited location of a user.
     *
     * @param userId The id of the user
     * @return The current visited location of the user
     */
    VisitedLocation getUserLocation(UUID userId);

    /**
     * Return the list of all attractions.
     *
     * @return The list of all attractions
     */
    List<Attraction> getAttractions();
}
