package mycontacts.backfront.model.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ContactDto {

    private String fullName;
    private String email;
    private List<String> phoneNumbers;
    private List<AddressDto> addresses;
}
