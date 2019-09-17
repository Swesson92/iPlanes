package com.robin.projects.Service;

import com.robin.projects.Entity.Planes;
import com.robin.projects.Model.PlanesModel;
import com.robin.projects.Repository.PlaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlaneService implements PlaneServiceInterface {

    private final PlaneRepository planeRepository;

    @Autowired
    public PlaneService(PlaneRepository planeRepository) {
        this.planeRepository = planeRepository;
    }


    public PlanesModel createPlanes(PlanesModel planesModel) {
        Planes newPlane = new Planes(planesModel);
        return new PlanesModel(planeRepository.save(newPlane));
    }


    public List<PlanesModel> getAllPlanes() {
        List<Planes> PlaneList = planeRepository.findAll();
        return convertToModelList(PlaneList);
    }


    public PlanesModel findPlanesById(Long id) {
        Planes planes = planeRepository.getOne(id);
        return new PlanesModel(planes);
    }

    private List<PlanesModel> convertToModelList(List<Planes>planesList){
        List<PlanesModel> planesModelList = new ArrayList<>();
        for(Planes planes : planesList){
            planesModelList.add(new PlanesModel(planes));
        }
        return planesModelList;
    }


}
