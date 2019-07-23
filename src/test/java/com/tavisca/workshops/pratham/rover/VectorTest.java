package com.tavisca.workshops.pratham.rover;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class VectorTest {
@Test
    void vectorInitalizeWithStartingPosition(){
    Vector v = new Vector(10,10,'N');
    assertEquals(10,v.x);
    assertEquals(10,v.y);
    assertEquals('N',v.direction);
}

}
