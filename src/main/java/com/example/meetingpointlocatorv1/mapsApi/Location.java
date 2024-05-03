package com.example.meetingpointlocatorv1.mapsApi;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;
@Getter
public class Location {
    @JsonProperty("place_id")
    private String placeId;

    private String licence;

    @JsonProperty("osm_type")
    private String osmType;

    @JsonProperty("osm_id")
    private String osmId;

    private String lat;
    private String lon;
    private String category;
    private String type;

    @JsonProperty("place_rank")
    private double placeRank;

    private double importance;

    @JsonProperty("addresstype")
    private String addressType;

    private String name;

    @JsonProperty("display_name")
    private String displayName;

    private Address address;

    private List<String> boundingbox;

    // Getter und Setter hier hinzufügen
}


