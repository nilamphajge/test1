package com.selenium.express;

public class Batch {
private String batchName;
private String trainer;
public String getBatchName() {
	return batchName;
}
public void setBatchName(String batchName) {
	this.batchName = batchName;
}
public String getTrainer() {
	return trainer;
}
public void setTrainer(String trainer) {
	this.trainer = trainer;
}
@Override
public String toString() {
	return "Batch [batchName=" + batchName + ", trainer=" + trainer + "]";
}


}
