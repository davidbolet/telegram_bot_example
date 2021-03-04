package org.telegram.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.telegram.telegrambots.meta.TelegramBotsApi;

@Configuration
public class TelegramApiConfig {

    @Bean
    TelegramBotsApi createLongPollingTelegramBotsApi() {
        return new TelegramBotsApi();
    }

}
