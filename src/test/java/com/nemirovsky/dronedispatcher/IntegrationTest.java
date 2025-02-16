package com.nemirovsky.dronedispatcher;

import com.nemirovsky.dronedispatcher.model.Drone;
import com.nemirovsky.dronedispatcher.repository.DroneJpaRepository;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
public class IntegrationTest {

    @MockBean
    private DroneJpaRepository droneRepository;

    @Test
    @Disabled
    public void loadServiceTest() {
        Drone d = droneRepository.findMaxIdDrone();
        assert d != null;
        assert d.getId() != null;
        assert d.getId().equals("1");
        droneRepository.count();
    }

    // write test cases here
}