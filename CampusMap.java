import java.util.ArrayList;

/** Creates a CampusMap object to add buildings to */
public class CampusMap {

    ArrayList<Building> buildings;

    /* Default constructor, initializes empty ArrayList */
    public CampusMap() {
        buildings = new ArrayList<Building>();
    }

    /**
     * Adds a Building to the map
     * @param b the Building to add
     */
    public void addBuilding(Building b) {
        System.out.println("Adding building...");
        buildings.add(b);
        System.out.println("-->Successfully added " + b.getName() + " to the map.");
    }

    /**
     * Removes a Building from the map
     * @param b the Building to remove
     * @return the removed Building
     */
    public Building removeBuilding(Building b) {
        System.out.println("Removing building...");
        buildings.remove(b);
        System.out.println("-->Successfully removed " + b.getName() + " to the map.");
        return b;
    }

    public String toString() {
        String mapString = "DIRECTORY of BUILDINGS";

        for (int i = 0; i < this.buildings.size(); i ++) {
            mapString += "\n  " + (i+1) + ". "+ this.buildings.get(i).getName() + " (" + this.buildings.get(i).getAddress() + ")";
        }
        return mapString;
    }

    public static void main(String[] args) {
        CampusMap myMap = new CampusMap();
        myMap.addBuilding(new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4));
        myMap.addBuilding(new Building("Bass Hall", "4 Tyler Court Northampton, MA 01063", 4));
        myMap.addBuilding(new Library("Josten Library"));
        myMap.addBuilding(new Cafe("Compass Cafe", 2));
        myMap.addBuilding(new House("Lamont House", "19 Prospect Street"));
        myMap.addBuilding(new Library("Neilson Library", "7 Neilson Drive", 5));
        myMap.addBuilding(new Cafe("Woodstar Cafe", "3 Main Street", 4, 200, 100, 100, 75));
        myMap.addBuilding(new House("7 Elm Street.", 3, true, false));
        myMap.addBuilding(new Library("Hilyer Library", 3));
        myMap.addBuilding(new Cafe("Campus Center Cafe", "10 Elm Street", 1, 300, 200, 200, 100));
        myMap.addBuilding(new House("Capen House", "26 Prospect Street", 4, false, true));
        myMap.addBuilding(new House("Northrop House", "49 Elm Street", 4, true, true));
        System.out.println(myMap);
    }
    
}
