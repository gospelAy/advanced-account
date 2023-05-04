//package myDairy;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class DairyTest {
//    Dairy dairy;
//
//    @BeforeEach
//    public void setUp(){
//        dairy = new Dairy("Spencer","12345");
//    }
//
//    @Test
//    public void assertThatObjectExist(){
//        assertNotNull(dairy);
//    }
//    @Test
//    public void testThatDairyCanBeUnlocked(){
//        assertTrue(dairy.isLocked());
//        dairy.unlockDiary("12345");
//        assertFalse(dairy.isLocked());
//    }
//
//    @Test
//    public void testThatDairyCanBeLocked(){
//        dairy.lo`ckDairy("12345");
//        assertTrue(dairy.isLocked());
//    }
//
//    @Test
//    public void testThatEntryCanBeCreated(){
//        dairy.unlockDiary("12345");
//        assertFalse(dairy.isLocked());
//        dairy.createEntry("My new home","December festival");
//
//    }
//
//
//
//}