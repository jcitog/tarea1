package model.factories;

import model.map.Field;
import model.units.Cleric;
import model.units.IUnit;

public class factoryCleric implements IFactory {
    @Override
    public IUnit create(int hitPoints, int movement, Field map, int x, int y){
        return new Cleric(hitPoints,movement,map.getCell(x,y));
    }
}