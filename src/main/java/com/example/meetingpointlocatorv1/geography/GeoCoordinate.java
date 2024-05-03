package com.example.meetingpointlocatorv1.geography;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class GeoCoordinate {
    private double latitude;
    private double longitude;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        GeoCoordinate other = (GeoCoordinate) obj;
        return Double.compare(other.latitude, latitude) == 0 &&
                Double.compare(other.longitude, longitude) == 0;
    }
}