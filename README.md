# lwjgl-jg
wrapper for better LWJGL joystick/gamepad Input usage.

```java
package de.florianmichael.lwjgljg;

import de.florianmichael.lwjgljg.internal.Device;
import de.florianmichael.lwjgljg.internal.Direction;

public class Test {

    public static void main(String[] args) {
        for (Device jg_device : JG22C.devices()) {
            if (jg_device.isInDirection(Direction.UP)) {
                // 
            }

            if (jg_device.isKeyDown(JG22C.JG_GAMEPAD_BUTTON_A)) {
                System.out.println("A is pressed");
            }
        }

        //

        final Device joystick = JG22C.device(JG22C.JG_JOYSTICK_1);

        if (joystick == null) return;

        if (joystick.isInDirection(Direction.RIGHT))
            System.out.println("Joystick is right");
    }
}
```
