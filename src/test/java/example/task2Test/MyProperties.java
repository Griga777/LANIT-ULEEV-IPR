package example.task2Test;

import org.aeonbits.owner.Config;
@Config.LoadPolicy(Config.LoadType.FIRST)
@Config.Sources({
        "classpath:config/${nameConfig}.properties",
        "classpath:MyProperties.properties",
        "system:properties",
        "system:env"
})
public interface MyProperties extends Config {
    String key();
    String token();
}
