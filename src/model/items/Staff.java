package model.items;

import model.units.Cleric;

/**
 * This class represents a <i>Staff</i> type item.
 * <p>
 * A staff is an item that can heal other units nut cannot counter any attack
 *
 * @author Ignacio Slater Muñoz
 * @since 1.0
 */
public class Staff extends AbstractItem {

  /**
   * Creates a new Staff item.
   *
   * @param name
   *     the name of the staff
   * @param power
   *     the healing power of the staff
   * @param minRange
   *     the minimum range of the staff
   * @param maxRange
   *     the maximum range of the staff
   */
  public Staff(final String name, final int power, final int minRange, final int maxRange) {
    super(name, power, minRange, maxRange);
  }

  public void equipToCleric(Cleric cleric){this.equipTo(cleric);}

  public void heal(IEquipableItem item) {
    double power = this.getPower();
    double HPBeforeH = item.getOwner().getCurrentHitPoints();
    double HPAfterH = HPBeforeH + power;
    if(HPAfterH > item.getOwner().getHitPoints()){
      item.getOwner().setCurrentHitPoints(item.getOwner().getHitPoints());
    }
    else{
      item.getOwner().setCurrentHitPoints(HPAfterH);
    }
  }

  @Override
  public void attack(IEquipableItem item){}

}
