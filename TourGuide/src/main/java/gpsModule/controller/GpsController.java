package gpsModule.controller;

import gpsModule.service.IGpsService;
import gpsUtil.location.Attraction;
import gpsUtil.location.VisitedLocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class GpsController {

    @Autowired
    IGpsService gpsService;

    @RequestMapping("/getUserLocation")
    public VisitedLocation getUserLocation(@RequestParam UUID userId){
        VisitedLocation visitedLocation = gpsService.getUserLocation(userId);
        return visitedLocation;
    }

    @RequestMapping("/getAttractions")
    public List<Attraction> getAttractions() {
        List<Attraction> allAttractions = gpsService.getAttractions();
        return allAttractions;
    }
}
