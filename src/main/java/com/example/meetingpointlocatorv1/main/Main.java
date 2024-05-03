package com.example.meetingpointlocatorv1.main;

import com.example.meetingpointlocatorv1.geography.GeoCoordinate;
import com.example.meetingpointlocatorv1.geography.GeoMidPointCalculator;
import com.example.meetingpointlocatorv1.mapsApi.Geocoder;

public class Main {

    public static void main(String[] args) {
       Geocoder gecoder = new Geocoder();

       System.out.println("Eingabedaten: ");
       GeoCoordinate coordinatePerson1 = new GeoCoordinate(47.67203,9.18348);
       GeoCoordinate coordinatePerson2 = new GeoCoordinate(48.2281,8.3845);
       System.out.println("Ort Person 1: " + gecoder.getCity(coordinatePerson1).getName());
       System.out.println("Ort Person 2: " + gecoder.getCity(coordinatePerson2).getName());

       System.out.println("Berechne Treffpunkt..................................................... ");
       GeoCoordinate point = GeoMidPointCalculator.calculateMidPoint(coordinatePerson1,coordinatePerson2);
       System.out.println("Berechneter Treffpunkt: "  + gecoder.getCity(point).getName());

    }
}