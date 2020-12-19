package com.techshard.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.techshard.graphql.dao.entity.Vehicle;
import com.techshard.graphql.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class VehicleMutation implements GraphQLMutationResolver {

    @Autowired
    private VehicleService vehicleService;

    public Vehicle createVehicle1(final String type, final String modelCode, final String brandName, final String launchDate) {
       
    	System.out.println("Enter into mutation");
    	
    	return this.vehicleService.createVehicle("Scooty", modelCode, brandName, launchDate);
    }
}
