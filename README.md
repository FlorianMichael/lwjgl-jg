# lwjgl-jg
wrapper for better LWJGL joystick/gamepad Input usage.

```java
package de.florianmichael.lwjgljg;

import de.florianmichael.lwjgljg.internal.Device;
import de.florianmichael.lwjgljg.internal.Direction;

public class Test {

    public static void main(String[] args) {
        for (Device jg_device : JG22C.jg_devices()) {
            if (jg_device.isInDirection(Direction.LEFT))
                System.out.println("Joystick is to left");
            
            if (jg_device.isKeyDown(JG22C.JG_GAMEPAD_BUTTON_A))
                System.out.println("Gamepad button a is down");

            System.out.println("Joystick is Gamepad: " + jg_device.isGamepad());
        }
    }
}
```
