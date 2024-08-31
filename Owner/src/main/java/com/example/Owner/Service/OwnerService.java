package com.example.Owner.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Owner.Model.Owner;
import com.example.Owner.Repo.OwnerRepository;

import java.util.List;


@Service
public class OwnerService {
    @Autowired
    private OwnerRepository ownerRepository;

    public Owner saveOwner(Owner owner) {
        return ownerRepository.save(owner);
    }

    public Owner getOwnerById(Long id) {
        return ownerRepository.findById(id).orElse(null);
    }

    public List<Owner> getAllOwners() {
        return ownerRepository.findAll();
    }

    public void deleteOwner(Long id) {
        ownerRepository.deleteById(id);
    }
}
