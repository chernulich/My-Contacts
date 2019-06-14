package mycontacts.backfront.service;

import mycontacts.backfront.model.dto.ContactDto;
import mycontacts.backfront.model.entity.User;

import java.util.List;

public interface ContactService {

    void createContact(ContactDto contactDto);
    void deleteContact(Long id);
    void updateContact(ContactDto contactDto);
    List<ContactDto> getAllContacts();
    ContactDto getContactByPhoneNumber(String phoneNumber);
    ContactDto getContactByName(String name);
    List<String> getAllNames();

}
