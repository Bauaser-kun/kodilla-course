package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SettingsFileEngineTestSuite {
    private static SettingsFileEngine settingsFileEngine;

    @BeforeAll
    public static void openSettingsFile() {
        settingsFileEngine = SettingsFileEngine.INSTANCE;
        settingsFileEngine.open("myApp.settings");
    }

    @AfterAll
    public static void closeSettingsFile() {
        settingsFileEngine.close();
    }

    @Test
    void testGetFileNAme() {
        //Given

        //When
        String filename = settingsFileEngine.getFileName();
        System.out.println("Opened: " + filename);

        //Then
        assertEquals("myApp.settings", filename);
    }

    @Test
    void testLoadSettings() {
        //Given

        //When
        boolean result = settingsFileEngine.loadSettings();

        //Then
        assertTrue(result);
    }

    @Test
    void testSaveSettings() {
        //Given

        //When
        boolean result = settingsFileEngine.saveSettings();

        //Then
        assertTrue(result);
    }
}
