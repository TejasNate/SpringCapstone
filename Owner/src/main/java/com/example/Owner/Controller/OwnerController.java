package com.example.Owner.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Owner.Model.Owner;
import com.example.Owner.Service.OwnerService;

@RestController
@RequestMapping("/owners")
public class OwnerController {
    @Autowired
    private OwnerService ownerService;

    @PostMapping
    public Owner createOwner(@RequestBody Owner owner) {
        return ownerService.saveOwner(owner);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Owner> getOwnerById(@PathVariable Long id) {
        Owner owner = ownerService.getOwnerById(id);
        return owner != null ? ResponseEntity.ok(owner) : ResponseEntity.notFound().build();
    }

    @GetMapping
    public List<Owner> getAllOwners() {
        return ownerService.getAllOwners();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOwner(@PathVariable Long id) {
        ownerService.deleteOwner(id);
        return ResponseEntity.noContent().build();
    }
}

