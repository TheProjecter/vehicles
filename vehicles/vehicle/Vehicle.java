package vehicles.vehicle;

import vehicles.simulation.SimulationLog;
import vehicles.environment.*;
import java.util.Vector;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.apache.xerces.parsers.DOMParser;
import java.util.Iterator;
import java.io.File;

/**
 * 
 *
 * A superclass for vehicle, which can be sub-classed for use in the vehicle editors 
 * or the simulation, while maintaining some common attributes
 * @author Karl, Shaun
 */
public class Vehicle implements Comparable{

	protected String xmlLocation; //location of the XML file representing this vehicle
	protected String fileName = null;
	/*Attributes of a vehicle*/
	protected String vehicleName = null; //the name of this vehicle
	protected String vehicleAuthor = null; //the author of this vehicle
	protected String vehicleDescription = null; //the description of this vehicle
	protected String lastModified = null;
	protected Vector<VehicleComponent> components; //components of the vehicle
	protected VehicleBattery battery = new VehicleBattery();
	protected int motorStrength = 0;
	protected int aggression = 0;
	protected VehicleColour vehicleColour = new VehicleColour();
	protected MemoryUnit mu = null;

	public Vehicle(Vehicle other){
		this.xmlLocation = other.xmlLocation;
		this.fileName = other.fileName;
		this.vehicleAuthor = other.vehicleAuthor;
		this.vehicleColour = other.vehicleColour;
		this.vehicleDescription = other.vehicleDescription;
		this.vehicleName = other.vehicleName;
		this.components = other.components;
		this.battery = other.battery;
		this.motorStrength = other.motorStrength;
		this.aggression = other.aggression;
		this.mu = other.mu;
	}


	/**
	 * Compare to method used to compare a vehicle with another vehicle in terms of 
	 * fitness
	 */
	public int compareTo(Object otherVehicle) throws ClassCastException {
		if (!(otherVehicle instanceof Vehicle)){
			throw new ClassCastException("A Vehicle object expected.");
		}
		double otherFitness = ((Vehicle) otherVehicle).getFitness();
		double this_fitness = this.getFitness();
		if(this_fitness < otherFitness){
			return -1;
		}
		else {
			return 1;
		}
	}

	public void add_n_memory(MemoryUnit other, int n){
		this.mu.add_N_Memory(other, n);
	}
	
	public MemoryUnit getMem(){
		return this.mu;
	}
	
	public void setMem(MemoryUnit m){
		this.mu = m;
		this.setMaxMem(m.getMaxMem());
		this.setLearningRate(m.getLearningRate());
	}
	
	public void addElementToMemory(EnvironmentElement e, SimulationLog s){
		this.mu.addElement(e, s);
	}

	public void printMemory(){
		this.mu.printMemory();
	}

	public void resetMemory(){
		this.mu.resetMem();
	}

	public boolean remembersElementAt(double x, double y){
		return this.mu.remembersElementAt(x, y);

	}

	public int getTypeOfElementAt(double xPos, double yPos){
		return this.mu.getTypeOfElementAt(xPos, yPos);
	}
	
	public int getIntesnityOfElementAt(double xPos, double yPos){
		return this.mu.getIntensityOfElementAt(xPos, yPos);
	}

	public void setMaxMem(int m){
		if(m >= 0) {
			this.mu.setMaxMem(m);
		}
		else{
			this.mu.setMaxMem(0);
		}
	}

	public void setLearningRate(int l){
		if(l >= 0) {
			this.mu.setLearningRate(l);
		}
		else{
			this.mu.setLearningRate(0);
		}
	}

	public int getMaxMem(){
		return this.mu.getMaxMem();
	}

	public int getLearningRate(){
		return this.mu.getLearningRate();
	}

	public String getAuthor() {
		return vehicleAuthor;
	}

	public void setAuthor(String vehicleAuthor) {
		this.vehicleAuthor = vehicleAuthor;
	}

	public VehicleColour getVehicleColour() {
		return vehicleColour;
	}

	public int getVehicleColourRed() {
		return vehicleColour.getRed();
	}

	public int getVehicleColourGreen() {
		return vehicleColour.getGreen();
	}

	public int getVehicleColourBlue() {
		return vehicleColour.getBlue();
	}

	public int getLeftSensorLight() {
		int value;
		String stringValue = getComponent("LEFT").getVehicleComponentLeftSensorLight();
		value = Integer.parseInt(stringValue);
		return value;
	}

	public void setLeftSensorLight(int value) {
		Iterator<VehicleComponent> itr = components.iterator();
		VehicleComponent tempComp = null;
		while (itr.hasNext()) {
			tempComp = (VehicleComponent) itr.next();
			if (tempComp.getVehicleComponentType().equalsIgnoreCase("LEFT")) {
				tempComp.setVehicleComponentLeftSensorLight(Integer.toString(value));
			}
		}
	}

	public int getLeftSensorHeat() {
		int value;
		String stringValue = getComponent("LEFT").getVehicleComponentLeftSensorHeat();
		value = Integer.parseInt(stringValue);
		return value;
	}
	public void setLeftSensorHeat(int value) {
		Iterator<VehicleComponent> itr = components.iterator();
		VehicleComponent tempComp = null;
		while (itr.hasNext()) {
			tempComp = (VehicleComponent) itr.next();
			if (tempComp.getVehicleComponentType().equalsIgnoreCase("LEFT")) {
				tempComp.setVehicleComponentLeftSensorHeat(Integer.toString(value));
			}
		}
	}

	public int getLeftSensorWater() {
		int value;
		String stringValue = getComponent("LEFT").getVehicleComponentLeftSensorWater();
		value = Integer.parseInt(stringValue);
		return value;
	}
	public void setLeftSensorWater(int value) {
		Iterator<VehicleComponent> itr = components.iterator();
		VehicleComponent tempComp = null;
		while (itr.hasNext()) {
			tempComp = (VehicleComponent) itr.next();
			if (tempComp.getVehicleComponentType().equalsIgnoreCase("LEFT")) {
				tempComp.setVehicleComponentLeftSensorWater(Integer.toString(value));
			}
		}
	}

	public int getLeftSensorPower() {
		int value;
		String stringValue = getComponent("LEFT").getVehicleComponentLeftSensorPower();
		value = Integer.parseInt(stringValue);
		return value;
	}
	public void setLeftSensorPower(int value) {
		Iterator<VehicleComponent> itr = components.iterator();
		VehicleComponent tempComp = null;
		while (itr.hasNext()) {
			tempComp = (VehicleComponent) itr.next();
			if (tempComp.getVehicleComponentType().equalsIgnoreCase("LEFT")) {
				tempComp.setVehicleComponentLeftSensorPower(Integer.toString(value));
			}
		}
	}

	public int getRightSensorLight() {
		int value;
		String stringValue = getComponent("RIGHT").getVehicleComponentRightSensorLight();
		value = Integer.parseInt(stringValue);
		return value;
	}
	public void setRightSensorLight(int value) {
		Iterator<VehicleComponent> itr = components.iterator();
		VehicleComponent tempComp = null;
		while (itr.hasNext()) {
			tempComp = (VehicleComponent) itr.next();
			if (tempComp.getVehicleComponentType().equalsIgnoreCase("RIGHT")) {
				tempComp.setVehicleComponentRightSensorLight(Integer.toString(value));
			}
		}
	}

	public int getRightSensorHeat() {
		int value;
		String stringValue = getComponent("RIGHT").getVehicleComponentRightSensorHeat();
		value = Integer.parseInt(stringValue);
		return value;
	}
	public void setRightSensorHeat(int value) {
		Iterator<VehicleComponent> itr = components.iterator();
		VehicleComponent tempComp = null;
		while (itr.hasNext()) {
			tempComp = (VehicleComponent) itr.next();
			if (tempComp.getVehicleComponentType().equalsIgnoreCase("RIGHT")) {
				tempComp.setVehicleComponentRightSensorHeat(Integer.toString(value));
			}
		}
	}

	public int getRightSensorWater() {
		int value;
		String stringValue = getComponent("RIGHT").getVehicleComponentRightSensorWater();
		value = Integer.parseInt(stringValue);
		return value;
	}
	public void setRightSensorWater(int value) {
		Iterator<VehicleComponent> itr = components.iterator();
		VehicleComponent tempComp = null;
		while (itr.hasNext()) {
			tempComp = (VehicleComponent) itr.next();
			if (tempComp.getVehicleComponentType().equalsIgnoreCase("RIGHT")) {
				tempComp.setVehicleComponentRightSensorWater(Integer.toString(value));
			}
		}
	}

	public int getRightSensorPower() {
		int value;
		String stringValue = getComponent("RIGHT").getVehicleComponentRightSensorPower();
		value = Integer.parseInt(stringValue);
		return value;
	}
	public void setRightSensorPower(int value) {
		Iterator<VehicleComponent> itr = components.iterator();
		VehicleComponent tempComp = null;
		while (itr.hasNext()) {
			tempComp = (VehicleComponent) itr.next();
			if (tempComp.getVehicleComponentType().equalsIgnoreCase("RIGHT")) {
				tempComp.setVehicleComponentRightSensorPower(Integer.toString(value));
			}
		}
	}

	public VehicleComponent getComponent(String type) {
		Iterator itr = components.iterator();
		VehicleComponent toReturn = null;
		while (itr.hasNext()) {
			VehicleComponent tempComp = (VehicleComponent) itr.next();
			if (tempComp.getVehicleComponentType().equalsIgnoreCase(type)) {
				toReturn = tempComp;
			}
		}
		return toReturn;
	}

	public String getFileName(){
		return this.fileName;
	}

	public void setFileName(String f){
		this.fileName = f;
	}

	public void setFileName(){
		String filename = this.xmlLocation;
		String sep = File.separator;
		String[] parts = filename.split("\\" + sep);
		this.fileName = parts[parts.length - 1];
	}

	public void setVehicleColour(VehicleColour vehicleColour) {
		this.vehicleColour = vehicleColour;
	}

	public String getDescription(){
		this.vehicleDescription = this.vehicleDescription.replace('\n', ' ');
		return this.vehicleDescription;
	}

	public void setDescription(String vehicleDescription) {
		this.vehicleDescription = vehicleDescription;
	}

	public void setLastModified(String timeStamp){
		this.lastModified = timeStamp;
	}

	public String getLastModified(){
		return this.lastModified;
	}

	public int getAggression() {
		return aggression;
	}

	public void setAggression(int aggression) {
		this.aggression = aggression;
	}

	public int getMotorStrength() {
		return motorStrength;
	}

	public void setMotorStrength(int motorStrength) {
		this.motorStrength = motorStrength;
	}

	public int getMaxBatteryCapacity() {
		return this.battery.getMax_capacity();
	}

	public void setMaxBatteryCapacity(int max_battery_capacity) {
		this.battery.setMax_capacity(max_battery_capacity);
	}

	public int getCurrentBatteryCapacity() {
		return this.battery.getCurr_capacity();
	}

	public void setCurrentBatteryCapacity(int curr_battery_capacity) {
		this.battery.setCurr_capacity(curr_battery_capacity);
	}

	public void setColour(int r, int g, int b) {
		this.vehicleColour.setRed(r);
		this.vehicleColour.setGreen(g);
		this.vehicleColour.setBlue(b);
	}

	/**
	 * Get the fitness of this vehicle, defined by it's current battery strength divided by it's maximum capacity
	 * plus 10 percent of the maximum capacity
	 * @return curr_battery_capacity/max_battery_capacity
	 */
	public double getFitness() {
		return ((double)this.battery.getCurr_capacity() / (double)this.battery.getMax_capacity()) + ((double)this.battery.getMax_capacity() * 0.10);
	}

	public Vehicle() {
		this.mu = new MemoryUnit(this.vehicleName);
		this.setMaxMem(100);
		this.setLearningRate(1);
		this.setMaxBatteryCapacity(100);
		this.setCurrentBatteryCapacity(100);
		this.components = new Vector<VehicleComponent>();
		VehicleComponent vc = new VehicleComponent();
		vc.setVehicleComponentType("LEFT");
		this.addVehicleComponent(vc);
		vc = new VehicleComponent();
		vc.setVehicleComponentType("RIGHT");
		this.addVehicleComponent(vc);


	}

	public Vehicle(String filename) {
		try {
			this.mu = new MemoryUnit(this.vehicleName);
			xmlLocation = filename;
			this.setFileName();
			components = new Vector<VehicleComponent>();
			DOMParser p = new DOMParser();
			p.parse(xmlLocation); //get a parsed version of the file into memory
			Document dom = p.getDocument();
			processVehicleComponents(dom.getElementsByTagName("VehicleComponent"));

			NodeList name = dom.getElementsByTagName("name");
			for (int i = 0; i < name.getLength(); i++) {
				if (name.item(i).getParentNode().getNodeName().equals("Vehicle")) {
					this.setName(name.item(i).getChildNodes().item(0).getNodeValue());
				}
			}

			NodeList lastModded = dom.getElementsByTagName("LastModified");
			this.setLastModified(lastModded.item(0).getChildNodes().item(0).getNodeValue());


			//if these entries are not in the xml file, default values will be kept
			try{
				NodeList memory_units = dom.getElementsByTagName("memory");
				//get the two entryies in this xml type
				Node firstEntry = memory_units.item(0).getChildNodes().item(1).getFirstChild();
				Node secondEntry = memory_units.item(0).getChildNodes().item(3).getFirstChild();

				if(firstEntry.getParentNode().getNodeName().contains("max")){
					this.mu.setMaxMem(Integer.parseInt(firstEntry.getNodeValue()));
					this.mu.setLearningRate(Integer.parseInt(secondEntry.getNodeValue()));
				}else{ //other node is the max
					this.mu.setMaxMem(Integer.parseInt(secondEntry.getNodeValue()));
					this.mu.setLearningRate(Integer.parseInt(firstEntry.getNodeValue()));
				}
			}
			catch(Exception e){e.printStackTrace();}

			NodeList batteries = dom.getElementsByTagName("battery");
			//get the two entryies in this xml type
			Node firstEntry = batteries.item(0).getChildNodes().item(1).getFirstChild();
			Node secondEntry = batteries.item(0).getChildNodes().item(3).getFirstChild();

			if(firstEntry.getParentNode().getNodeName().contains("max")){
				this.battery.setMax_capacity(Integer.parseInt(firstEntry.getNodeValue()));
				this.battery.setCurr_capacity(Integer.parseInt(secondEntry.getNodeValue()));
			}else{ //other node is the max
				this.battery.setMax_capacity(Integer.parseInt(secondEntry.getNodeValue()));
				this.battery.setCurr_capacity(Integer.parseInt(firstEntry.getNodeValue()));
			}

			NodeList motorStr = dom.getElementsByTagName("motorStrength");
			this.setMotorStrength(Integer.parseInt(motorStr.item(0).getChildNodes().item(0).getNodeValue()));

			NodeList aggr = dom.getElementsByTagName("aggression");
			this.setAggression(Integer.parseInt(aggr.item(0).getChildNodes().item(0).getNodeValue()));

			NodeList red = dom.getElementsByTagName("red");
			this.vehicleColour.setRed(Integer.parseInt(red.item(0).getChildNodes().item(0).getNodeValue()));

			NodeList blue = dom.getElementsByTagName("blue");
			this.vehicleColour.setBlue(Integer.parseInt(blue.item(0).getChildNodes().item(0).getNodeValue()));

			NodeList green = dom.getElementsByTagName("green");
			this.vehicleColour.setGreen(Integer.parseInt(green.item(0).getChildNodes().item(0).getNodeValue()));

			NodeList auth= dom.getElementsByTagName("author");
			this.setAuthor(auth.item(0).getChildNodes().item(0).getNodeValue());

			NodeList desc= dom.getElementsByTagName("description");
			this.setDescription(desc.item(0).getChildNodes().item(0).getNodeValue());

			//Node root = dom.getDocumentElement(); //get the root element from the document
			//handleNode(root); //recursive function to handle the nodes

		} catch (Exception e) {
			e.printStackTrace();
			//System.err.println("An error occurred while creating a vehicle from the file '" +
			//      filename + "'. Please check that this file exists.");
		}

	}

	/**
	 * Take a NodeList representing components of a vehicle and instansiate the vehicle object accordingly
	 * @param componentList A NodeList of vehicle components taken from the XML file
	 */
	private void processVehicleComponents(NodeList componentList) {
		for (int i = 0; i < componentList.getLength(); i++) { //process component by component
			Node node = componentList.item(i); // get a single vehicle component
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				VehicleComponent vc = new VehicleComponent(); //set the attributes of this object as we go on
				NodeList children = node.getChildNodes();
				for (int j = 0; j < children.getLength(); j++) {

					//System.out.println(children.item(j).getNodeName() );
					NodeList values = children.item(j).getChildNodes();
					for (int k = 0; k < values.getLength(); k++) { //attribute by attribute
						/*PROCESS AN ATTRIBUTE OF AN ELEMENT OF A VEHICLECOMPONENT */
						String attributeType = values.item(k).getParentNode().getNodeName();
						if (attributeType.contains("name")) {
							//							System.out.println("This is a name node");
							//						System.out.println(values.item(k).getNodeValue());
							vc.setVehicleComponentName(values.item(k).getNodeValue());
						} else {
							if (attributeType.contains("type")) {
								//System.out.println("This is a type node");
								//System.out.println(values.item(k).getNodeValue());
								vc.setVehicleComponentType(values.item(k).getNodeValue());
							} else {
								if (attributeType.contains("LeftSensorRadius")) {
									vc.setVehicleComponentLeftSensorRadius(values.item(k).getNodeValue());
								} else {
									if (attributeType.contains("LeftSensorLight")) {
										vc.setVehicleComponentLeftSensorLight(values.item(k).getNodeValue());
									} else {
										if (attributeType.contains("LeftSensorHeat")) {
											vc.setVehicleComponentLeftSensorHeat(values.item(k).getNodeValue());
										} else {
											if (attributeType.contains("LeftSensorPower")) {
												vc.setVehicleComponentLeftSensorPower(values.item(k).getNodeValue());
											} else {
												if (attributeType.contains("LeftSensorWater")) {
													vc.setVehicleComponentLeftSensorWater(values.item(k).getNodeValue());
												} else {
													if (attributeType.contains("RightSensorRadius")) {
														vc.setVehicleComponentRightSensorRadius(values.item(k).getNodeValue());
													} else {
														if (attributeType.contains("RightSensorLight")) {
															vc.setVehicleComponentRightSensorLight(values.item(k).getNodeValue());
														} else {
															if (attributeType.contains("RightSensorHeat")) {
																vc.setVehicleComponentRightSensorHeat(values.item(k).getNodeValue());
															} else {
																if (attributeType.contains("RightSensorPower")) {
																	vc.setVehicleComponentRightSensorPower(values.item(k).getNodeValue());
																} else {
																	if (attributeType.contains("RightSensorWater")) {
																		vc.setVehicleComponentRightSensorWater(values.item(k).getNodeValue());

																	}
																}
															}
														}
													}
												}
											}
										}
									}

								}

							}
						}


					}//end values for loop

				}//end children for loop
				//System.out.println("END OF COMPONENT");
				components.add(vc);
			}
		}
	}

	public String getXmlLocation() {
		return xmlLocation;
	}

	public void setXmlLocation(String xmlLocation) {
		this.xmlLocation = xmlLocation;
		this.setFileName();
	}

	public String getName() {
		return vehicleName;
	}

	public void setName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public Vector<VehicleComponent> getComponents() {
		return components;
	}

	public void setComponents(Vector<VehicleComponent> vehicleComponent) {
		this.components = vehicleComponent;
	}

	public void addVehicleComponent(VehicleComponent vc) {
		components.add(vc);
	}

	public void saveVehicle(){
		EditorVehicle v = new EditorVehicle(this.xmlLocation);
		v.setName(this.getName()); //set object attributes
		v.setAuthor(this.getAuthor());
		v.setDescription(this.getDescription());

		v.setMotorStrength(this.getMotorStrength());
		v.setAggression(this.getAggression());

		v.setMaxBatteryCapacity(this.getMaxBatteryCapacity());
		v.setCurrentBatteryCapacity(this.getCurrentBatteryCapacity());

		v.setMaxMem(this.getMaxMem());
		v.setLearningRate(this.getLearningRate());

		v.setColour(this.getVehicleColourRed(), this.getVehicleColourGreen(), this.getVehicleColourBlue());

		v.setLeftSensorHeat(this.getLeftSensorHeat());
		v.setLeftSensorLight(this.getLeftSensorLight());
		v.setLeftSensorPower(this.getLeftSensorPower());
		v.setLeftSensorWater(this.getLeftSensorWater());

		v.setRightSensorHeat(this.getRightSensorHeat());
		v.setRightSensorLight(this.getRightSensorLight());
		v.setRightSensorPower(this.getRightSensorPower());
		v.setRightSensorWater(this.getRightSensorWater());
		v.saveVehicle();
	}

	public void printDetails(){
		System.out.println("File Path " + this.xmlLocation);
		System.out.println("File Name: " + this.fileName);
		System.out.println("Name\t" + this.vehicleName);
		System.out.println("Author\t" + this.vehicleAuthor);
		System.out.println("Description\t" + this.vehicleDescription);
		System.out.println("Aggression\t" + this.aggression);    
		System.out.println("Max Battery Capacity\t" + this.getMaxBatteryCapacity());
		System.out.println("Current Battery Capacity\t" + this.getCurrentBatteryCapacity());
		System.out.println("Motor Strength\t" + this.motorStrength);
		System.out.println("Maximum Memory\t" + this.getMaxMem());
		System.out.println("Learning rate\t" + this.getLearningRate());
		System.out.println("\tLeft Sensor");
		System.out.println("Power\t" + this.getLeftSensorPower());
		System.out.println("Heat\t" + this.getLeftSensorHeat());
		System.out.println("Light\t" + this.getLeftSensorLight());
		System.out.println("Water\t" + this.getLeftSensorWater());
		System.out.println("\tRight Sensor");
		System.out.println("Power\t" + this.getRightSensorPower());
		System.out.println("Heat\t" + this.getRightSensorHeat());
		System.out.println("Light\t" + this.getRightSensorLight());
		System.out.println("Water\t" + this.getRightSensorWater());
		System.out.println("\tColours");
		System.out.println("Red\t" + this.getVehicleColourRed());
		System.out.println("Green\t" + this.getVehicleColourGreen());
		System.out.println("Blue\t" + this.getVehicleColourBlue());
	}


	public String toString(){
		return this.vehicleName + " (" + this.fileName + ")";
	}
}