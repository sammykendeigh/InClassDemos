package edu.unl.raikes.day21;

// this is a class - a blueprint
public class Town {
    // public means anyone has access to read/modify
    // nothing is included means anyone in same package can read/modify
    // protected - ignore this for now
    // private - no one but "this" can modify
    private String name;
    private String mayorName;
    private double x;
    private double y;
    private boolean isElectionSeason = false;
    static int population = 12;

    public Town(String name, String mayorName, double x, double y) {
        this.name = name;
        this.mayorName = mayorName;
        this.x = x;
        this.y = y;
        System.out.println("makin a new town");
        population++;
    }

    // non static because it relies on town data - we need this.x and this.y to do this work
    public double distance(Town otherTown) {
        double deltaX = otherTown.x - this.x;
        double deltaY = otherTown.y - this.y;

        double squares = Math.pow(deltaX, 2) + Math.pow(deltaY, 2);

        return Math.sqrt(squares);
    }

    // this is static because it doesn't rely on "this" at all
    public static double distance(Town townA, Town townB) {
        return townA.x;
    }

    /**
     * Gets the object's name.
     *
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the object's name.
     *
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the object's mayorName.
     *
     * @return the mayorName
     */
    public String getMayorName() {
        return this.mayorName;
    }

    /**
     * Sets the object's mayorName.
     *
     * @param mayorName the mayorName to set
     */
    public void setMayorName(String mayorName) {
        if (this.isElectionSeason) {
            this.mayorName = mayorName;
        }
    }

    /**
     * Gets the object's x.
     *
     * @return the x
     */
    public double getX() {
        return this.x;
    }

    /**
     * Sets the object's x.
     *
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Gets the object's y.
     *
     * @return the y
     */
    public double getY() {
        return this.y;
    }

    /**
     * Sets the object's y.
     *
     * @param y the y to set
     */
    public void setY(double y) {
        this.y = y;
    }
}
