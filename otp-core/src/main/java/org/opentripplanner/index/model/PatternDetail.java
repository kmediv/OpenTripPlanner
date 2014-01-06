package org.opentripplanner.index.model;

import java.util.Collection;

import org.opentripplanner.routing.edgetype.TableTripPattern;

import com.beust.jcommander.internal.Lists;

public class PatternDetail extends PatternShort {

    public String routeId;
    public Collection<StopShort> stops = Lists.newArrayList();
    public Collection<TripShort> trips = Lists.newArrayList();
    
    // Include all known headsigns
    
    public PatternDetail(TableTripPattern pattern) {
        super (pattern);
        routeId = pattern.route.getId().getId();
        stops = StopShort.list(pattern.getStops());
        trips = TripShort.list(pattern.getTrips());
    }
    
}
