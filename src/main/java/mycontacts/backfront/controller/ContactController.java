package mycontacts.backfront.controller;

import mycontacts.backfront.model.dto.ContactDto;
import mycontacts.backfront.model.entity.User;
import mycontacts.backfront.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contacts")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @PostMapping("/addContact")
    public void addContact(@RequestBody ContactDto contactDto){
        contactService.createContact(contactDto);
    }

    @DeleteMapping("/deleteContact")
    public void deleteContact(@PathVariable(name = "id") Long id){
        contactService.deleteContact(id);
    }

    @GetMapping("/all")
    public List<ContactDto> getAllContacts(){
        return  contactService.getAllContacts();
    }

    @GetMapping("/byPhoneNumber")
    public ContactDto getContactByPhoneNumber(String phoneNumber){
        return  contactService.getContactByPhoneNumber(phoneNumber);
    }

    @GetMapping("/byName")
    public ContactDto getContactByName(String name){
        return  contactService.getContactByName(name);
    }

    @GetMapping("/allNames")
    public List<User> getAllNames(){
        return  contactService.getAllNames();
    }


}
