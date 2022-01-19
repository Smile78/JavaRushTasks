package netology.hw321Shooter;

import java.util.Scanner;
import netology.hw321Shooter.weapon.*;

public class Player {
    // Указываем тип данных Weapon, который будет храниться в "слотах игрока"
    private Weapon[] weaponSlots;

    public Player() {
        // Снаряжаем нашего игрока
        weaponSlots = new Weapon[] {
                // TODO заполнить слоты оружием
                new RSZO(),
                new Gun(),
                new MachineGun(),
                new RPG(),
                new SlingShot(),
                new WaterGun(),
                };
    }

    public int getSlotsCount() {
        // length - позволяет узнать, сколько всего слотов с оружием у игрока
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        // TODO проверить на выход за границы
        // если значение slot некорректно, то
        // выйти из метода написав об этом в консоль

        if (slot<0||slot>= weaponSlots.length ) return;

        // Получаем оружие из выбранного слота
        Weapon weapon = weaponSlots[slot];
        // Огонь!
        weapon.shot();
    }

}
