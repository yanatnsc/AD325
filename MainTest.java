import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void countAnimalsWithFourLegs() {
        // Test 1: List is empty
        String[] animalsTest1 = {};
        assertEquals(0, Main.countAnimalsWithFourLegs(animalsTest1));

        // Test 2: No four leg animal
        String[] animalsTest2 = {"snake", "monkey", "bird"};
        assertEquals(0, Main.countAnimalsWithFourLegs(animalsTest2));

        // Test 3: Having repeated animals
        String[] animals3 = {"lion", "lion", "lion", "lion", "dog", "dog"};
        assertEquals(6, Main.countAnimalsWithFourLegs(animals3));
    }
}