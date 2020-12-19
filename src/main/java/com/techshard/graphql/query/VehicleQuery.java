package com.techshard.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.techshard.graphql.dao.entity.Vehicle;
import com.techshard.graphql.service.VehicleService;

import graphql.schema.DataFetcher;

import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class VehicleQuery implements GraphQLQueryResolver {

	
	private static final String ROUTEURI="vechicleroute";
	
	@Produce(uri=ROUTEURI )
	protected ProducerTemplate routeuri;
	
    @Autowired
    private VehicleService vehicleService;

    public List<Vehicle> getVehicles(final int count) {
    	
    	DataFetcher fetcher=DataFetcherBuilder.
    	
        return this.vehicleService.getAllVehicles(count);
        
        
        
    }

    public Optional<Vehicle> getVehicle(final int id) {
        return this.vehicleService.getVehicle(id);
    }
}
