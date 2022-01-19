package com.javarush.task.task13.task1328;

import java.util.Random;

public abstract class AbstractRobot implements Attackable, Defensable  {

    private   static int hitCount;
    private String name;

    public AbstractRobot  ( ) {

    }

    public AbstractRobot  (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public BodyPart attack() {
        BodyPart attackedBodyPart = null;
        hitCount = 1 + new Random().nextInt(4);

        if (hitCount == 1) {
            attackedBodyPart = BodyPart.ARM;
        } else if (hitCount == 2) {
            attackedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 3) {
            hitCount = 0;
            attackedBodyPart = BodyPart.LEG;
        } else if (hitCount == 4) {

            attackedBodyPart = BodyPart.CHEST;
        }
        return attackedBodyPart;
    }

    public BodyPart defense() {
        BodyPart defencedBodyPart = null;
        hitCount = 2 +  new Random().nextInt(3);

        if (hitCount == 1) {
            defencedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 2) {
            defencedBodyPart = BodyPart.LEG;
        } else if (hitCount == 3) {
            hitCount = 0;
            defencedBodyPart = BodyPart.ARM;
        }else if (hitCount == 4) {

            defencedBodyPart = BodyPart.CHEST;
        }
        return defencedBodyPart;
    }
}
