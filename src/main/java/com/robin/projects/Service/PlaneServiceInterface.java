package com.robin.projects.Service;

import com.robin.projects.Model.PlanesModel;

import java.util.List;

public interface PlaneServiceInterface {


    PlanesModel createPlanes(PlanesModel planesModel);

    List<PlanesModel> getAllPlanes();

    PlanesModel findPlanesById(Long id);


}
