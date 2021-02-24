package entities;

import java.text.Format;

public class Student {
	public String name;
	public double av1; // grade 1
	public double av2; // grade 2
	public double av3; // grade 3
	public double average; // media
	public String result;
	public double missingPoint; // Pontos Perdidos
	
	public void calculationOfAverage() {
		average = av1 + av2 + av3;
	}
	
	public void finalGrade() {
		result = average >= 60.0? "PASS" : "FAILED";
	}

	public void missingPoints() {
		missingPoint = average < 60.0? 60 - average: 0;
	}
	
	public String toString() {
		return "Name: " + name + ", " +
				"AV1: " + String.format("%.2f", av1)  + ", " +
				"AV2: " + String.format("%.2f", av2)  + ", " +
				"AV3: " + String.format("%.2f", av3)  + ", " +
				"FINAL GRADE: " + String.format("%.2f", average) + ", " +
				"RESULT: " + result +
				( missingPoint != 0?", DIFFERENCE: " + String.format("%.2f", missingPoint):"" );
	}
}
