package gpsModule.configuration;

import gpsUtil.GpsUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GpsConfiguration {
	
	@Bean
	public GpsUtil getGpsUtil() {
		return new GpsUtil();
	}

}
