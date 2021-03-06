package model.factories;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import model.map.Field;
import model.map.Location;
import model.tacticians.Tactician;
import model.units.SwordMaster;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test set for the factory that makes SwordMasters.
 *
 *
 */
class factorySwordMasterTest {

  private Field field;
  @BeforeEach
  public void setUp(){
    field = new Field();
    for (int i = 0; i<10;i++){
      for (int j = 0; j<10;j++){
        this.field.addCells(false, new Location(i, j));
      }
    }
  }

  @Test
  public void Test(){
    Tactician t1 = new Tactician("",null,field);
    Tactician t2 = new Tactician("",null,field);
    factorySwordMaster factorySwordMaster = new factorySwordMaster();
    t1.changeFactory(factorySwordMaster);
    t1.addUnit(75,3,3,2);
    assertTrue(t1.getSelectedUnit() instanceof SwordMaster);
    t2.changeFactory(factorySwordMaster);
    t2.addUnit(75,3,7,3);
    assertEquals(t2.getUnitList().get(0),t2.getSelectedUnit());

  }

}
