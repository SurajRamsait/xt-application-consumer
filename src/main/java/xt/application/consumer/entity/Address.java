package xt.application.consumer.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.annotation.Nullable;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.sql.Date;
import java.util.UUID;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

@Data
@Builder
@JsonInclude(NON_NULL)
public class Address {

    @NonNull Integer addressID;
    @NonNull String addressLine1;
    @Nullable String addressLine2;
    @Nullable String city;
    @Nullable String state;
    @Nullable String CountryRegion;
    @NonNull Integer postalCode;
    @NonNull UUID rowguid;
    @Nullable Date modifiedDate;

}

