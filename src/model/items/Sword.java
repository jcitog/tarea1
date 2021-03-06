package model.items;

import model.units.SwordMaster;

/**
 * This class represents a sword type item.
 * <p>
 * Swords are strong against axes and weak against spears.
 *
 * @author Ignacio Slater Muñoz
 * @since 1.0
 */
public class Sword extends AbstractItem {

  /**
   * Creates a new Sword.
   *
   * @param name
   *     the name that identifies the weapon
   * @param power
   *     the base damage pf the weapon
   * @param minRange
   *     the minimum range of the weapon
   * @param maxRange
   *     the maximum range of the weapon
   */
  public Sword(final String name, final int power, final int minRange, final int maxRange) {
    super(name, power, minRange, maxRange);
  }

  public void equipToSwordMaster(SwordMaster swordmaster){this.equipTo(swordmaster);}

  @Override
  public void attack(IEquipableItem other){other.receiveSwordAttack(this);}

  @Override
  public void heal(IEquipableItem item){}

  //region Section receive TYPE attack

  @Override
  public void receiveSpearAttack(IEquipableItem other) {
    receiveStrongAttack(other);
  }

  @Override
  public void receiveAxeAttack(IEquipableItem other) {
    receiveWeakAttack(other);
  }

  @Override
  public void receiveMBOAttack(IEquipableItem other) {
    receiveStrongAttack(other);
  }

  @Override
  public void receiveMBLAttack(IEquipableItem other) {
    receiveStrongAttack(other);
  }

  @Override
  public void receiveMBAAttack(IEquipableItem other) {
    receiveStrongAttack(other);
  }

  //endregion
}
