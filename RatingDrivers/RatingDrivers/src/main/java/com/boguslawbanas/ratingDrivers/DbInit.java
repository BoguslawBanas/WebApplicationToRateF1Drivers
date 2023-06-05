package com.boguslawbanas.ratingDrivers;

import com.boguslawbanas.ratingDrivers.Model.Driver;
import com.boguslawbanas.ratingDrivers.Repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DbInit implements CommandLineRunner {

    private final DriverRepository driverRepository;

    @Autowired
    public DbInit(DriverRepository driverRepository){
        this.driverRepository=driverRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        driverRepository.saveAll(List.of(
                new Driver("Max", "Verstappen", "The Netherlands"),
                new Driver("Fernando", "Alonso", "Spain"),
                new Driver("Charles", "Leclerc", "Monaco")
        ));
    }
}
