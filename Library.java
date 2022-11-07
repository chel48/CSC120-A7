import java.util.Hashtable;
/* Library class is a child class of Building */
public class Library extends Building{

  /** Hashtable containing the books in the library and a boolean
   * statement of if they are available to be checked out
   */
  private Hashtable <String, Boolean> collection;

  /**
   * Constructs a library object
   * @param name name of library 
   * @param address address of library
   * @param nFloors number of floors in the library
   */
    public Library(String name, String address, int nFloors) {
    super(name, address, nFloors); // first step of buiding a house is making a building
    this.collection = new Hashtable <String, Boolean>();
    System.out.println("You have built a library: 📖");
    }

    /**
    * Overloaded constructor with name and number of floors only
    * @param name name of library 
    * @param nFloors number of floors in the library
    */
    public Library(String name, int nFloors){
      this(name, "Address Unknown", nFloors);
    }

    /**
   * Overloaded constructor with name only and default number of floors
   * @param name name of library 
   */
    public Library(String name){
      this(name, "Address Unknown", 1);
    }

    /**
     * adds a book to the library
     * @param title title of book
     */
    public void addTitle(String title){
      this.collection.put(title, true);
    }

    /**
     * removes a book from the library
     * @param title title of book
     * @return title title of book removed
     */
    public String removeTitle(String title){
      this.collection.remove(title);
      return title;
    }

    /**
     * changes the value of the book being checked out to false
     * @param title title of book
     */
    public void checkOut(String title){
      this.collection.replace(title, false);
    }

    /**
     * changes the value of book being returned to true
     * @param title title of book
     */
    public void returnBook(String title){
      this.collection.replace(title, true);
    }

    /**
     * checks to see if a book is in the collection Hashtable
     * @param title title of book
     * @return true/false of whether book is in the collection Hashtable
     */
    public boolean containsTitle(String title){ // returns true if the title appears as a key in the Libary's collection, false otherwise
      return this.collection.containsKey(title);
      }

      /**
       * checks the value of a book in collections to see if it is available
       * @param title title of book
       * @return true/false of if book is available 
       */
    public boolean isAvailable(String title){ 
    return (this.collection.get(title));
    }

    /**prints out the entire collection in an easy-to-read way (including checkout status) */
    public void printCollection(){ 
      System.out.print(this.collection.toString()); 
    }

    /** Prints the interactive options available to the user */
    public void showOptions() {
      super.showOptions();
      System.out.println(" + addTitle(title)\n + removeTitle(title)\n + checkOut(title)\n + returnBook(title)\n + containsTitle(title)\n + isAvailable(title)\n + printCollection()");
  }

    /**main method (for testing) */
    public static void main(String[] args) {
      Library library = new Library("CH Booth", "4 Main Street", 3);
      library.addTitle("The Lorax by Dr. Seuss");
      library.addTitle("Hop on Pop by Dr. Seuss");
      library.checkOut("The Lorax by Dr. Seuss");
      System.out.println(library.isAvailable("The Lorax by Dr. Seuss"));
      library.printCollection();
      library.enter();
      library.goToFloor(-1);
    }
  
  }