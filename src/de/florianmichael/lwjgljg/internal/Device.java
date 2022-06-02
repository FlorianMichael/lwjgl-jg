package de.florianmichael.lwjgljg.internal;

import de.florianmichael.lwjgljg.JG22C;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWGamepadState;

import java.nio.FloatBuffer;

public class Device {

    private final String name;
    private final NamePair namePair;
    private final boolean isGamepad;
    private final int id;

    private final GLFWGamepadState glfwGamepadState;

    public Device(final String name, final boolean isGamepad, final int id) {
        this.name = name;
        this.isGamepad = isGamepad;
        this.namePair = new NamePair(GLFW.glfwGetJoystickName(id), GLFW.glfwGetGamepadName(id));
        this.id = id;

        this.glfwGamepadState = GLFWGamepadState.calloc();
    }

    public boolean isKeyDown(final int key) {
        return this.glfwGamepadState.buttons().get(key) == JG22C.JG_SUCCESS;
    }

    public boolean isInDirection(final Direction direction) {
        final FloatBuffer state = GLFW.glfwGetJoystickAxes(this.id());

        if (state == null) return false;

        final float lrD = state.get();
        final float udD = state.get();

        return direction == Direction.LEFT && lrD == -1.0F ||
                direction == Direction.RIGHT && lrD == 1.0F ||
                direction == Direction.UP && udD == -1.0F ||
                direction == Direction.DOWN && udD == 1.0F;
    }

    public String name() {
        return name;
    }

    public boolean isGamepad() {
        return isGamepad;
    }

    public NamePair namePair() {
        return namePair;
    }

    public int id() {
        return id;
    }
}
