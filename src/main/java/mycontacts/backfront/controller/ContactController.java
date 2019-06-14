package mycontacts.backfront.controller;

import mycontacts.backfront.model.dto.ContactDto;
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

}
