package com.example.meetingpointlocatorv1.mapsApi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Address {
    private String town;
    private String municipality;
    private String county;
    private String state;

    @JsonProperty("ISO3166-2-lvl4")
    private String iso3166_2_lvl4;

    private String country;

    @JsonProperty("country_code")
    private String countryCode;
}