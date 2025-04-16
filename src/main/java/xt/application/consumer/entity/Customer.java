package xt.application.consumer.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

@Data
@Builder
@JsonInclude(value = NON_NULL)
public class Customer {

    @NonNull private Long customerId;
    @NonNull private String firstName;
    @NonNull private String lastName;
    @NonNull private Long mobileNumber;
    @NonNull private Address address;
    @NonNull private Metadata metadata;

}
