package koschei.config;

import koschei.models.Death8;
import koschei.models.Island2;
import koschei.models.Needle7;
import koschei.models.Tree3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Bean
    public static Island2 getIsland(Tree3 tree) {
        return new Island2(tree);
    }
    @Bean
    public static Needle7 getNeedle(Death8 death) {
        return new Needle7(death);
    }
}
