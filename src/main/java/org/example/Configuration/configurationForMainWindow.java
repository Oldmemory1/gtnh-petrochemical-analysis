package org.example.Configuration;

import org.apache.ibatis.io.Resources;
import org.example.window.MainWindow;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.util.Properties;

@Configuration
@ComponentScan("org.example.window")
public class configurationForMainWindow {
    @Bean
    public String mainWindowTitle() throws IOException {
        Properties properties=new Properties();
        properties.load(Resources.getResourceAsStream("mainWindowTitle.properties"));
        return properties.getProperty("title");
    }
    @Bean
    public MainWindow mainWindow(@Qualifier("mainWindowTitle") String title){
        return new MainWindow(title);
    }
}
