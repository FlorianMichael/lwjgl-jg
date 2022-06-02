package de.florianmichael.lwjgljg;

import de.florianmichael.lwjgljg.internal.Device;
import org.lwjgl.glfw.GLFW;

import java.util.ArrayList;
import java.util.List;

public class JG22C {

    public static final int JG_JOYSTICK_1 = 0;
    public static final int JG_JOYSTICK_16 = 15;

    public static final int JG_GAMEPAD_BUTTON_A = 0;
    public static final int JG_GAMEPAD_BUTTON_B = 1;
    public static final int JG_GAMEPAD_BUTTON_X = 2;
    public static final int JG_GAMEPAD_BUTTON_Y = 3;
    public static final int JG_GAMEPAD_BUTTON_LEFT_BUMPER = 4;
    public static final int JG_GAMEPAD_BUTTON_RIGHT_BUMPER = 5;
    public static final int JG_GAMEPAD_BUTTON_BACK = 6;
    public static final int JG_GAMEPAD_BUTTON_START = 7;
    public static final int JG_GAMEPAD_BUTTON_GUIDE = 8;
    public static final int JG_GAMEPAD_BUTTON_LEFT_THUMB = 9;
    public static final int JG_GAMEPAD_BUTTON_RIGHT_THUMB = 10;
    public static final int JG_GAMEPAD_BUTTON_DPAD_UP = 11;
    public static final int JG_GAMEPAD_BUTTON_DPAD_RIGHT = 12;
    public static final int JG_GAMEPAD_BUTTON_DPAD_DOWN = 13;
    public static final int JG_GAMEPAD_BUTTON_DPAD_LEFT = 14;
    public static final int JG_GAMEPAD_BUTTON_LAST = 14;
    public static final int JG_GAMEPAD_BUTTON_CROSS = 0;
    public static final int JG_GAMEPAD_BUTTON_CIRCLE = 1;
    public static final int JG_GAMEPAD_BUTTON_SQUARE = 2;
    public static final int JG_GAMEPAD_BUTTON_TRIANGLE = 3;
    public static final int JG_GAMEPAD_AXIS_LEFT_X = 0;
    public static final int JG_GAMEPAD_AXIS_LEFT_Y = 1;
    public static final int JG_GAMEPAD_AXIS_RIGHT_X = 2;
    public static final int JG_GAMEPAD_AXIS_RIGHT_Y = 3;
    public static final int JG_GAMEPAD_AXIS_LEFT_TRIGGER = 4;
    public static final int JG_GAMEPAD_AXIS_RIGHT_TRIGGER = 5;
    public static final int JG_GAMEPAD_AXIS_LAST = 5;

    public static final int JG_SUCCESS = 1;

    public static List<Device> jg_devices() {
        List<Device> it = new ArrayList<>();
        
        for (int i = JG_JOYSTICK_1; i < JG_JOYSTICK_16; i++)
            if (GLFW.glfwJoystickPresent(i))
                it.add(new Device(GLFW.glfwGetJoystickName(i), GLFW.glfwJoystickIsGamepad(i), i));
        
        return it;
    }
}
