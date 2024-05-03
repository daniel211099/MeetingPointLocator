package com.example.meetingpointlocatorv1.mapsApi;


import com.example.meetingpointlocatorv1.geography.GeoCoordinate;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class Geocoder {

    private static final String GEOCODING_RESOURCE = "https://nominatim.openstreetmap.org/reverse.php";

    public Location getCity(GeoCoordinate geoCoordinate)  {
        Location location = null;
        try {
            HttpClient httpClient = HttpClient.newHttpClient();

            String requestUrl = String.format("%s?lat=%f&lon=%f&zoom=10&format=jsonv2", GEOCODING_RESOURCE, geoCoordinate.getLatitude(), geoCoordinate.getLongitude());
            requestUrl = requestUrl.replace(",", ".");

            URI requestUri = URI.create(requestUrl);
            HttpRequest geocodingRequest = HttpRequest.newBuilder().GET().uri(requestUri)
                    .timeout(Duration.ofMillis(2000)).build();

            HttpResponse<String> geocodingResponse = httpClient.send(geocodingRequest,
                    HttpResponse.BodyHandlers.ofString());

            ObjectMapper objectMapper = new ObjectMapper();
            location = objectMapper.readValue(geocodingResponse.body(), Location.class);

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        return location;
    }

}