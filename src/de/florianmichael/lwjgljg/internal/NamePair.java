package de.florianmichael.lwjgljg.internal;

public class NamePair {

    private final String jn;
    private final String gn;

    public NamePair(final String jn, final String gn) {
        this.jn = jn;
        this.gn = gn;
    }

    public String joystickName() {
        return jn;
    }

    public String gamepadName() {
        return gn;
    }
}
