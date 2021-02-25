package com.traffic.simulation.app;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import com.traffic.simulation.model.Input;
import com.traffic.simulation.util.FileUtil;

public class Application {

	public static final String IN_FOLDER = "C:\\Users\\bmbabu\\Desktop\\hashcode21\\strawhatpirates-hashcode21\\TrafficSimulation\\resource\\input\\";
	public static final String OUT_FOLDER = "C:\\Users\\bmbabu\\Desktop\\bmbabu\\!work\\wkspc\\hashcode2021\\strawHatPirates\\resource\\output\\";

	public static void main(String args[]) {
		String fileList = "a";
		for (String fileName : fileList.split(",")) {
			Input input = FileUtil.readInputFile(IN_FOLDER + fileName + ".txt");
			System.out.println("Completed " + fileName);
		}
	}

}
