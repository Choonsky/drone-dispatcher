package com.nemirovsky.dronedispatcher;

import com.nemirovsky.dronedispatcher.model.Drone;
import com.nemirovsky.dronedispatcher.repository.DroneJpaRepository;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class IntegrationTest {

    @Mock
    DroneJpaRepository repo2;

    @MockBean
    private DroneJpaRepository droneRepository;

    @Test
    @Disabled
    public void loadServiceTest() {


        DroneJpaRepository repo1 = Mockito.mock(DroneJpaRepository.class);
        Mockito.when(repo1.count()).thenReturn(5L);
        Mockito.when(repo2.findById("1")).thenReturn(Optional.of(new Drone()));

        long userCount = repo1.count();

        assertEquals(5L, userCount);
        // Mockito.verify(repo1).count();

        Drone d = droneRepository.findMaxIdDrone();
        assert d != null;
        assert d.getId() != null;
        assert d.getId().equals("1");
        assertEquals("1", d.getId(), "Max id should be 1");
        droneRepository.count();
    }

    // write test cases here
}