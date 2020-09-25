package com.sreejesh.demo.route;


import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="camel-demo-route")
@Data
@EqualsAndHashCode(callSuper=true)

public class AutoShutdownDemoRoute extends RouteBuilder {


	
	@Override
	public void configure() {

		// @formatter:off



		from("timer://myTimer?period=10s&repeatCount=5")
		.routeId("AutoShutdownRoute")
		.log("*** About to Sleep for 10s ***")
		.delay(60000)
		.log("*** Woke up, completed! ***")
		;

		
		
		// @formatter:on

	}



}
