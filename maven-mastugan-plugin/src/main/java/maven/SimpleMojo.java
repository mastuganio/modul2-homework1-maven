package maven;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "simple")
public class SimpleMojo extends AbstractMojo {

    public void execute() throws MojoExecutionException, MojoFailureException {
       // getLog().info("Im super good!");
    }
}
