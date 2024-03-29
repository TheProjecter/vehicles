package test.vehicle;

import vehicles.util.*;
import vehicles.vehicle.*;
//WARNING- hard-coded values
public class ListVehiclesTest {
	public static void main(String args[]){
		/*CREATE A NEW VEHICLE*/
		EditorVehicle veh = new EditorVehicle("xml/vehicles/angry.veh");
		veh.setName("Angry Vehicle");
		veh.setAuthor("Some sweaty angry guy");
		veh.setDescription("This is a very angry little vehicle, This is a very angry little vehicle, This is a very angry little vehicle, This is a very angry little vehicle");
		veh.setCurrentBatteryCapacity(65);
		veh.setMaxBatteryCapacity(100);
        veh.setColour(255, 255, 255);

		VehicleComponent vc = new VehicleComponent("weaksensor.xml"); //new object
			vc.setVehicleComponentName("Weak Sensor");//set object attributes
			vc.setVehicleComponentType("Left");
			vc.setVehicleComponentLeftSensorRadius(Integer.toString(22));
			vc.setVehicleComponentLeftSensorLight(Integer.toString(45));
			vc.setVehicleComponentLeftSensorHeat(Integer.toString(34));
			vc.setVehicleComponentLeftSensorPower(Integer.toString(67));
			vc.setVehicleComponentLeftSensorWater(Integer.toString(89));

			veh.addVehicleComponent(vc); //move xml in ram from component into vehicle
			
		vc = new VehicleComponent("weaksensor.xml"); //new object
			vc.setVehicleComponentName("Strong Sensor");//set object attributes
			vc.setVehicleComponentType("Right");
			vc.setVehicleComponentRightSensorRadius(Integer.toString(34));
			vc.setVehicleComponentRightSensorLight(Integer.toString(45));
			vc.setVehicleComponentRightSensorHeat(Integer.toString(12));
			vc.setVehicleComponentRightSensorPower(Integer.toString(9));
			vc.setVehicleComponentRightSensorWater(Integer.toString(-8));

			veh.addVehicleComponent(vc); //move xml in ram from component into vehicle
			
			
		veh.saveVehicle();
		/*GET LIST OF ALL VEHICLES IN FOLDER*/
		EditorVehicle[] array = UtilMethods.getVehiclesFromFolder("xml/vehicles");
		//System.out.println("Array Len: " + array.length);
		for(int i = 0; i<array.length;i++){
			System.out.println(array[i].getName()+"\n");
		}
	}

}
