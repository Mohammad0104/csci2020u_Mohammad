/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package lab03;

import org.gradle.testfixtures.ProjectBuilder;
import org.gradle.api.Project;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * A simple unit test for the 'lab03.greeting' plugin.
 */
class Lab03PluginTest {
    @Test void pluginRegistersATask() {
        // Create a test project and apply the plugin
        Project project = ProjectBuilder.builder().build();
        project.getPlugins().apply("lab03.greeting");

        // Verify the result
        assertNotNull(project.getTasks().findByName("greeting"));
    }
}
