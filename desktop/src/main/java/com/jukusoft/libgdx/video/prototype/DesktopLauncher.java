package com.jukusoft.libgdx.video.prototype;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * Starts the application for the desktop-based builds.
 */
public class DesktopLauncher {

    /**
     * The start-method for the whole application which is creating a new
     * configuration for the stage and a new game so one could play.
     *
     * @param args
     *            The start arguments.
     */
    public static void main(String[] args) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "LibGDX Video Extension - Prototype";
        config.height = 720;
        config.width = 1280;

        try {
            // start game
            new LwjglApplication(new Game(), config);
        } catch (Exception e) {
            e.printStackTrace();

            System.exit(-1);
        }
    }

}
