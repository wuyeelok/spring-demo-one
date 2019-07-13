package com.luv2code.springdemo;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

import org.springframework.stereotype.Component;

@Component("summerProp")
public class SummerFortunePropService implements FortunePropService {

	private final Properties properties;

	public SummerFortunePropService() {
		properties = new Properties();

		InputStream iStream = null;
		try {
			iStream = getClass().getResourceAsStream("/randomFortune.properties");
			properties.load(iStream);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (iStream != null) {
					iStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public Map<String, String> getPropMap() {
		Map<String, String> propMap = new HashMap<>();

		this.properties.forEach((k, v) -> propMap.put(Objects.toString(k, ""), Objects.toString(v, "")));

		System.out.println("SummerFortunePropService getPropMap function map size : " + propMap.size());

		return propMap;
	}

}
