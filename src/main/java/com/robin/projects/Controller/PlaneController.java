package com.robin.projects.Controller;

import com.robin.projects.Model.PlanesModel;
import com.robin.projects.Service.PlaneServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PlaneController {

    private final PlaneServiceInterface planeService;


    @Autowired
    public PlaneController(PlaneServiceInterface planeService) {
        this.planeService = planeService;
    }

    @CrossOrigin
    @PostMapping("/planes")
    public ResponseEntity<PlanesModel> createPlanes(@RequestBody PlanesModel planesModel){
        PlanesModel newPlane = planeService.createPlanes(planesModel);
        return new ResponseEntity<>(newPlane, HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping("/planes")
    public ResponseEntity<List<PlanesModel>> getAllPlanes(){
        List<PlanesModel> resultList = planeService.getAllPlanes();
        return new ResponseEntity<>(resultList, HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping("/planes/{id}")
    public ResponseEntity<PlanesModel> findPlanesById(@PathVariable Long id){
        return new ResponseEntity<>(planeService.findPlanesById(id), HttpStatus.OK);
    }


}
