package com.example.meetingpointlocatorv1.geography;

public class GeoMidPointCalculator {

    public static GeoCoordinate calculateMidPoint(GeoCoordinate coord1, GeoCoordinate coord2) {
        double lat1 = coord1.getLatitude();
        double lon1 = coord1.getLongitude();
        double lat2 = coord2.getLatitude();
        double lon2 = coord2.getLongitude();

        double lat = (lat1 + lat2) / 2;
        double lon = (lon1 + lon2) / 2;

        return new GeoCoordinate(lat,lon);
    }
}