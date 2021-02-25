package com.traffic.simulation.util;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

import com.traffic.simulation.model.Input;

public class FileUtil {
	public static List<String> readFileInList(String fileName) {

		List<String> lines = Collections.emptyList();
		try {
			lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
		}

		catch (IOException e) {
			System.err.println("Unable to read input");
			e.printStackTrace();
		}
		return lines;
	}

	public static Input readInputFile(String filepath) {
		List<String> inputStrList = readFileInList(filepath);

		String[] line1 = inputStrList.get(0).split("\\s+");
		int simTime = Integer.valueOf(line1[0]);
		int intersections = Integer.valueOf(line1[1]);
		int streets = Integer.valueOf(line1[2]);
		int cars = Integer.valueOf(line1[3]);
		int points = Integer.valueOf(line1[4]);

		Input input = new Input(simTime, intersections, streets, cars, points);

		for (int i = 0; i < intersections; i++) {
			String str[] = inputStrList.get(i + 1).split("\\s+");
			int start = Integer.valueOf(str[0]);
			int end = Integer.valueOf(str[1]);
			String name = str[2];
			int time = Integer.valueOf(str[3]);
			input.addStreet(start, end, name, time);
		}
		return input;
	}
}
