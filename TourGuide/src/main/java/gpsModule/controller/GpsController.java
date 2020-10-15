package gpsModule.controller;

import gpsModule.service.IGpsService;
import gpsUtil.location.Attraction;
import gpsUtil.location.VisitedLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

/**
 * Controller in charge of managing the endpoints for the GPS service.
 */
@RestController
public class GpsController {
    private Logger logger = LoggerFactory.getLogger(GpsController.class);

    private final IGpsService gpsService;

    public GpsController(IGpsService gpsService) {
        this.gpsService = gpsService;
    }

    /**
     * Method managing the GET "/getUserLocation" endpoint HTTP request to get the location of a user.
     *
     * @param userId The id of the user
     * @return The visited location of the user
     */
    @GetMapping("/getUserLocation")
    public VisitedLocation getUserLocation(@RequestParam String userId){
        logger.debug("Request getUserLocation");
        VisitedLocation visitedLocation = gpsService.getUserLocation(UUID.fromString(userId));
        logger.debug("Response : UUID=" + visitedLocation.userId +" Lat=" + visitedLocation.location.latitude + " Lon=" + visitedLocation.location.longitude + " Date=" + visitedLocation.timeVisited +"/n");
        return visitedLocation;
    }

    /**
     * Method managing the GET "/getAttractions" endpoint HTTP request to get the location of a user.
     *
     * @return The list of all locations
     */
    @GetMapping("/getAttractions")
    public List<Attraction> getAttractions() {
        logger.debug("Request getAttractions");
        List<Attraction> allAttractions = gpsService.getAttractions();
        logger.debug("Response : Nb Attractions=" + allAttractions.size());
        return allAttractions;
    }
}
