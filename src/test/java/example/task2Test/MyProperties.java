package example.task2Test;

import org.aeonbits.owner.Config;

public interface MyProperties extends Config {
    @DefaultValue("ca92798ed22edd169506048c77755169")
    String key();

    @DefaultValue("44962edeb80408666c4dd3ed952a463ad9b4555852c6f779c91f1a9536750777")
    String token();
}
