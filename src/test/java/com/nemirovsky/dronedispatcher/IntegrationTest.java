package com.nemirovsky.dronedispatcher;

import com.nemirovsky.dronedispatcher.model.Drone;
import com.nemirovsky.dronedispatcher.repository.DroneJpaRepository;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        assertEquals("1", d.getId(), "Max id should be 1");
        droneRepository.count();
    }

    // write test cases here
}