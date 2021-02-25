package com.traffic.simulation.model;

import java.util.ArrayList;
import java.util.List;

public class Input {
	int simulationTime;
	int noOfIntersections;
	int noOfStreets;
	List<Street> streets;
	int points;
	int carCount;

	public Input(int simTime, int intersecCount, int streetCount, int carCount, int points) {
		simulationTime = simTime;
		noOfIntersections = intersecCount;
		noOfStreets = streetCount;
		this.points = points;
		this.carCount = carCount;
		streets = new ArrayList<>();
	}

	public void addStreet(int start, int end, String name, int time) {
		Street s = new Street();
		s.setEnd(end);
		s.setName(name);
		s.setStart(start);
		s.setTimeTaken(time);
		streets.add(s);
	}

	public int getSimulationTime() {
		return simulationTime;
	}

	public int getNoOfStreets() {
		return noOfStreets;
	}

	public void setNoOfStreets(int noOfStreets) {
		this.noOfStreets = noOfStreets;
	}

	public void setSimulationTime(int simulationTime) {
		this.simulationTime = simulationTime;
	}

	public int getNoOfIntersections() {
		return noOfIntersections;
	}

	public void setNoOfIntersections(int noOfIntersections) {
		this.noOfIntersections = noOfIntersections;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

}
